package test0404;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 화면에서 1부터 10까지의 숫자를 입력받아서 숫자만큼 * 가로로 출력하기
 * 99숫자가 입력되면 프로그램 종료하기
 * 입력값이 숫자가 아닌 경우 : InputMismatchException 예외가 발생고
                        숫자만 입력하세요 메세지 출력하고, 다시 입력받기
   입력값이 1~10의 범위가  아닌 경우 : MyInputNumberException 예외를 발생 시키고
                        1 ~ 10까지의 숫자만 입력하세요 메세지 출력하고, 다시 입력받기 
   구동클래스와 MyInputNumberException 예외 클래스 구현하기
 */

// Scanner, while(99가 입력 되면 종료), if , try catch 각 2개, 새로운 클래스 만들기
// scan.next() 
class MyInputNumberException extends Exception {
	MyInputNumberException(String msg){
		super(msg);
	}
}
public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1부터 10사이의 숫자를 입력하세요.");
		int cnt =0; // 횟수
		int num =0;
		while(true){
			try {
				num = scan.nextInt();// 숫자 입력 받기
				if(num == 99) {
					break;
				}
				++cnt;
				if(num<1||num>10) {
					try {
						throw new MyInputNumberException("1부터 10사이의 숫자를 입력하세요.");
					}catch (MyInputNumberException e) {
						System.out.println(e.getMessage());
					}
				} else {
					for(int i = 1; i<=num; i++) {
						System.out.print("*");
					}
					System.out.println();
				}
			} catch (InputMismatchException e) {
				System.out.println(scan.next()+ "는 숫자가 아닙니다.");
			}
	
		}
		System.out.println(cnt +"회 시도");
	}
}
