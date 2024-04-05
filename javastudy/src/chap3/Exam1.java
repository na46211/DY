package chap3;
import java.util.Scanner;
public class Exam1 {

	public static void main(String[] args) {
		int x = 10;
		// ++연산자를 사용하여 x=10의 결과가 나오도록 코딩하기
		// --연산자를 사용하여 x=10의 결과가 나오도록 코딩하기
		System.out.println("x=" + x++);
		
		System.out.println("y=" + --x);
		
		//화면에서 정수를 입력 받아서 x= "입력받은 수로 나오도록 코딩"
		
		Scanner a = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		x = a.nextInt();// 정수형 값을 입력 받아, x에 저장
				
		System.out.println("x=" + x++);
		System.out.println("x=" + --x);
		
		a.close();
		
	}

}
