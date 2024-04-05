package test0403;
/*
 * 
 * LambdaInterface3 인터페이스의 함수 객체와 
 * 인터페이스를 사용한 calc 함수 구현하기
 * [결과]
 * 두수 (5,2)의 합:7
 * 두수 (5,2)의 곱:10
 * arr 배열의 최대값:10
 * arr 배열의 최소값:1
 */
interface LambdaInterface3 {
	int method(int x, int y);
}
public class Test3 {
	public static void main(String[] args) {
		LambdaInterface3 f;
		System.out.println("두수 (5,2)의 합:" + calc(5,2,(x,y) -> x+y);//7
		System.out.println("두수 (5,2)의 곱:" + calc(5,2,(x,y) -> x*y);//10
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("arr 배열의 최대값:" + calc(arr,(x,y)-> x>y?x:y);//10
		System.out.println("arr 배열의 최소값:" + calc(arr,f);//1
	}

	private static String calc(int[] arr, LambdaInterface3 f) { // f때문에 스트링으로 출력 -> int로 변경
		
		
	}

	private static String calc(int i, int j, LambdaInterface3 f) { // f때문에 스트링으로 출력 -> int로 변경 )
		return
		
	}
}
