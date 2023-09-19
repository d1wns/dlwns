package chap12;

public class TestTest {
	private String text;
	public TestTest(String s) {
		this.text = s;
	}

	public static void main(String[] args) {
		TestTest test = new TestTest("ABC");
		System.out.println(test.text.toLowerCase());

	}

}

