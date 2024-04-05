package chap3;
/*
 * 1. 증감연산자: ++, --
 * 	++: 변수값을 1증가 --: 변수값 1 감소
 *  
 * 
 * 
 * 
 */
public class OpEx1 {

	public static void main(String[] args) {
		
		int x = 5, y = 5;
		x++; 
		y--; 
		System.out.println("1. x="+x+",y="+y);
		
		++x; 
		--y; 
		System.out.println("2. x="+x+",y="+y);
		
		x=y=5; 
		y= ++x; 
		System.out.println("3. x="+x+",y="+y);
		
		x=y=5;
		y= x++;  
		System.out.println("4. x="+x+",y="+y);
		
		x=y=5;
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(y--);
		System.out.println(--y);
		

	}

}
