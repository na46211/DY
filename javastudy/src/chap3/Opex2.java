package chap3;
/*
 * 단항 연산자
 * 	- 논리부정연산자 : !
 * 	- 부호연산자 : +,-
 * 	- 형벼환 연산자
 * 		(자료형) 피연산자
 * 
 * 
 * 
 */
public class Opex2 {

	public static void main(String[] args) {
		System.out.println("true"+ !false);
		System.out.println("false"+ !true);
		System.out.println("!(3>5):" + !(3>5));
		
		int x = -10;
		
		System.out.println(+x);
		System.out.println(-x);
		
		x = +10;
		
		System.out.println(+x);
		System.out.println(-x);
		
		
	}

}
