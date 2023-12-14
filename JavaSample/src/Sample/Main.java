package Sample;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s1 = "Java and Javascript";
		if (s1.contains("Java")) {
			System.out.println("文字列s1はJavaを含んでいます");
		}
		if (s1.endsWith("Java")) {
			System.out.println("文字列s1はJavaが末尾にあります");
		}
		System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
	}
}
