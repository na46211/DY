package chap3;

public class OpEx7 {

	public static void main(String[] args) {
		int num = 100;
		// %d : 10진 정수의 형태로 출력
		System.out.printf("%d,%d\n",num,12345);
		
		// %10d :  10진 정수를 최소 10자리로 출력
		System.out.printf("%10d,%10d\n",num,12345);
		
		// %-10d :  10진 정수를 최소 10자리로 왼쪽 정렬 출력
		System.out.printf("-%10d,%-10d\n",num,12345);
		
		// %-,10d :  10진 정수를 최소 10자리로 왼쪽 정렬과 ,도 출력
		System.out.printf("-%10d,%-10d\n",num,12345);
		
		// %-,010d :  10진 정수를 최소 10자리로 왼쪽 정렬과 ,도 출력 / 빈자리는 0채운다
		System.out.printf("-%10d,%-10d\n",num,12345);
		
		//%f : 실수(부동소숫점) 형태로 출력
		System.out.printf("%d,%f\n",num,12345.145);
		
		//%10.2f : 실수(부동소숫점) 10자리를 확보하고, 소숫점이하 2자리로 출력
		System.out.printf("%10.2f\n",12345.145);
		
		//%,10.2f : 실수(부동소숫점) 10자리를 확보하고, 소숫점이하 2자리로 세자리마다, 출력
		System.out.printf("%,10.2f\n",12345.145);
		
		//%,10.2f : 실수(부동소숫점) 10자리를 확보하고, 소숫점이하 2자리로 세자리마다, 출력
		System.out.printf("%,10.2f\n",12345.145);
		
		//%-,10.2f : 실수(부동소숫점) 10자리를 확보하고, 소숫점이하 2자리로 세자리마다, 왼쪽 정렬 출력
		System.out.printf("%-,10.2f\n",12345.145);
		
		
	}
	
}
