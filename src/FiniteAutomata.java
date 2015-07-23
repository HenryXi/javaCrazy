
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;

public class FiniteAutomata {

	private State start;

	private final static char[] inputs;

	static {
		inputs = new char[26];
		for (char i = 0; i < 26; i++) {
			inputs[i] = (char) ('a' + i);
		}
	}

	private final char episilon = 0;

	private char stateId;

	public void compile(String pattern) {
		this.stateId = 'A';
		State NFA = toNFA(pattern);
		this.start = convertToDFA(NFA);
	}

	private State convertToDFA(State NFA) {
		Map<Set<State>, State> cache = new HashMap<Set<State>, State>();
		Queue<Set<State>> queue = new LinkedList<Set<State>>();

		// start state of DFA
		Set<State> start = episilon(NFA);
		State starter = nextState();
		cache.put(start, starter);
		queue.offer(start);
		while (!queue.isEmpty()) {
			Set<State> currentEpisilon = queue.poll();
			State current = cache.get(currentEpisilon);
			// create new State
			for (char input : inputs) {
				Set<State> nextEpisilon = move(currentEpisilon, input);
				if (nextEpisilon.isEmpty()) {
					continue;
				}
				State next;
				if (!cache.containsKey(nextEpisilon)) {
					next = nextState();
					cache.put(nextEpisilon, next);
					queue.offer(nextEpisilon);
				} else {
					next = cache.get(nextEpisilon);
				}
				boolean isAccept = containsAcceptState(nextEpisilon);
				next.setAccept(isAccept);
				current.setTransition(input, next);
			}
		}
		return starter;
	}

	private Set<State> move(Set<State> currentEpisilon, char input) {
		Set<State> result = new HashSet<State>();
		for (State s : currentEpisilon) {
			State next = s.transit(input);
			if (next != null) {
				result.add(next);
			}
		}
		return episilon(result);
	}

	private boolean containsAcceptState(Set<State> nextEpisilon) {
		for (State state : nextEpisilon) {
			if (state.isAccept()) {
				return true;
			}
		}
		return false;
	}

	private Set<State> episilon(State s) {
		Set<State> cache = new HashSet<State>();
		cache.add(s);
		return episilon(s, cache);
	}

	private Set<State> episilon(Set<State> states) {
		Set<State> cache = new HashSet<State>();
		for (State s : states) {
			cache.add(s);
			cache.addAll(episilon(s, cache));
		}
		return cache;
	}

	private Set<State> episilon(State s, Set<State> cache) {
		State next = s.transit(episilon);
		if (next != null && !cache.contains(next)) {
			cache.add(next);
			cache.addAll(episilon(s, cache));
		}
		return cache;
	}

	private State toNFA(String pattern) {
		char[] expr = pattern.toCharArray();
		State currentState = nextState();
		State starter = currentState;
		for (char c : expr) {
			if (c == '.') {
				State nextState = nextState();
				// add each transition for all inputs
				for (char i : inputs) {
					currentState.setTransition(i, nextState);
				}
				currentState = nextState;
			} else if (c == '*') {
				State nextState = nextState();
				// add each transition for all inputs
				for (char i : inputs) {
					currentState.setTransition(i, nextState);
				}
				currentState.setTransition(episilon, nextState);
				nextState.setTransition(episilon, currentState);
				currentState = nextState;
			} else if (c >= 'a' && c <= 'z') {
				State nextState = nextState();
				currentState.setTransition(c, nextState);
				currentState = nextState;
			} else {
				throw new RuntimeException("Unrecognized expression");
			}
		}
		currentState.setAccept(true);
		return starter;
	}

	private State nextState() {
		return new State(stateId++);
	}

	public void constructDFA(Map<State, Map<Character, State>> mapping) {
		Iterator<Map.Entry<State, Map<Character, State>>> it = mapping
				.entrySet().iterator();
		while (it.hasNext()) {
			Entry<State, Map<Character, State>> entry = it.next();
			State state = entry.getKey();
			Map<Character, State> transition = entry.getValue();
			state.setTransition(transition);
		}
	}

	public boolean match(String c) {
		char[] candidate = c.toCharArray();
		for (char d : candidate) {
			start = start.transit(d);
			if (start == null) {
				return false;
			}
		}
		return start.isAccept();
	}

	public static String[] patterns = { "abc", "*", "*abc", "*abc", "a*bc",
			"a*bc", "a*", "a*", "a*", "a*", "*abc*", "*****", "...", ".*",
			".bc*", ".b*c*a", "*", "abc", "*a", "a", ".a*c", "a.*b", "..", "",
			"" };

	public static String[] candidates = { "abc", "abc", "abc", "aaabbbabc",
			"aaabbbabc", "abc", "abc", "a", "aa", "abcdef", "abc", "abc",
			"abc", "abc", "abc", "abca", "", "abcd", "abcd", "", "abc", "abc",
			"abc", "", "abc" };

	public static void main(String[] args) {
		FiniteAutomata fa = new FiniteAutomata();
		for (int i = 0; i < patterns.length; i++) {
			fa.compile(patterns[i]);
			System.out.println(fa.match(candidates[i]));
		}
	}
}
