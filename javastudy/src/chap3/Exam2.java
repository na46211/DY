package chap3;
import java.util.*;
public class Exam2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sec = sc.nextInt();
		
		int h = sec/3600;
		int m = (sec%3600)/60;
		int s = (sec%60);
		
		
		
		System.out.println(h + "시간 " + m + "분 " + s + "초");
		
		
		
		
		

	}

}
