package aamir;

class Aamir {
	void eat(StringBuffer a) {
		System.out.println("1");
	}

	void eat(String a) {
		System.out.println("2");
	}

	public static void main(String[] arg) {
		Aamir a = new Aamir();
		a.eat("10");
	}
}
