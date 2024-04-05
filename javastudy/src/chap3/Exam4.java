package chap3;
import java.util.Scanner;
public class Exam4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int i = sc.nextInt();
		sc.close();
		System.out.println((i>0) ? i + ":양수":(i==0)?i + ":0":i + ":음수");
		
		
		

	}

}
