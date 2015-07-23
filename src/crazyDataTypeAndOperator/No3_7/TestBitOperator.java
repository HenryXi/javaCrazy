package crazyDataTypeAndOperator.No3_7;

public class TestBitOperator {
	public static void main(String[] args) {
		System.out.println(true & false);
		short a1=1;
		final StringBuffer a=new StringBuffer("asd");
		a.append("ddd");
		
		System.out.println();
		// 将输出1
		System.out.println(5 & 9);
		// 将输出13
		System.out.println(5 | 9);
		// 将输出4
		System.out.println(~-5);
		// 将输出12
		System.out.println(5 ^ 9);
		// 输出20
		System.out.println(5 << 2);
		// 输出-20
		System.out.println(-5 << 2);
		// 输出-2
		System.out.println(-5 >> 2);
		// 输出1073741822
		System.out.println(-5 >>> 2);
	}
}

