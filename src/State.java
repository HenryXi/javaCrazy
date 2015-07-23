
import java.util.HashMap;
import java.util.Map;

public class State {

	private boolean accept = false;

	private char id;

	private Map<Character, State> mapping = new HashMap<Character, State>();

	public State(char c) {
		this.id = c;
	}

	public State(char c, boolean isAccept) {
		this.id = c;
		this.accept = isAccept;
	}

	public State transit(char input) {
		return mapping.get(input);
	}

	public void setTransition(char input, State next) {
		this.mapping.put(input, next);
	}

	public void setTransition(Map<Character, State> mapping) {
		this.mapping = mapping;
	}

	public boolean isAccept() {
		return this.accept;
	}

	public void setAccept(boolean b) {
		this.accept = b;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		State other = (State) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "State [id=" + id + "]";
	}
	
}
