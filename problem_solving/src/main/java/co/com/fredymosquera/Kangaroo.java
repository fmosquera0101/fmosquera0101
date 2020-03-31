package co.com.fredymosquera;

public class Kangaroo {

	public static void main(String[] args) {
		System.out.println(kangaroo(43, 2, 70, 2));

	}

	static String kangaroo(int x1, int v1, int x2, int v2) {

		if (v1 <= v2 || (x2 - x1) % (v1 - v2) != 0) {
			return "NO";
		} else {
			return "YES";
		}


	}

}
