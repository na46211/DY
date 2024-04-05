package chap3;
/*
 * 화면에서 3자리 자연수를 입력받아 100자리 미만으로 버리고 출력하기
 * 
 * 
 */
import java.util.Scanner;
public class Exam3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		String j = sc.next();
		
		sc.close();
		
		int x = (i / 100)*100;
		int y = j.charAt(0)-'0';
		//i-(i%100)
		System.out.println(x);
		System.out.println(y*100);
		
		
	}

}
