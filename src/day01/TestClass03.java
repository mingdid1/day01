package day01;

public class TestClass03 {
	public static void main(String[] args) {
		System.out.println( 100 + 100 );
		System.out.println( 100.123 + 100.123 );
		
		System.out.println("안녕 " + "하세요");
		System.out.println( "100" + 100 );
		System.out.println( "백" + 100 );
		
		System.out.println( "안녕" + 100 + 300 );		// 문자연산이 이루어짐
		System.out.println( "안녕" + (100 + 300) );	// 먼저 계산 후 문자연산
	}
}
