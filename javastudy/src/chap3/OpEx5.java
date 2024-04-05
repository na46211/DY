package chap3;
import java.util.Scanner;
/*
 * 삼항연산자: 조건연산자 -> 조건문으로 변경 가능함
 * (조건문)? 참:거짓
 * 
 * 점수를 입력받아 60미만이면 불합격, 이상이면 합격 출력
 * 
 */
public class OpEx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		System.out.println("점수를 입력하세요.");
		sc.close();
		System.out.println((score>=60)?"합격":"불합격");
		//70점 이상이면 통과, 60점 이상이면 재시험, 60점 미만 탈락 출력
		System.out.println((score>=70)?"통과":((score>=60)?"재시험":"탈락"));
		
		
		System.out.println("----if----");
		if(score>=60 ) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		

	}

}
