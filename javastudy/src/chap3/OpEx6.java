package chap3;
/*
 * 대입 연산자 : =, +=, -=, *=, /=
 * 
 * lvalue(좌측변수) = rvalue(우측값: 변수, 값, 수식)
 * x + y = 100 ---> 오류
 * x = 100 - y ---> 정상
 */
public class OpEx6 {

	public static void main(String[] args) {
		int num = 100;
		// int num +1 = 100; ---> 오류
		System.out.println(num);
		num = num + 10; // num 변수값에 10을 더한 후 num에 대입
		num += 10; // 위와 의미가 같다, 그러나 과정은 다르다
		num -= 10; // num 변수값에 10을 뺀 후 num에 대입
		num *= 2; // num 변수값에 2를 곱한 후 num에 대입
		num /= 10; // num 변수값을 10으로 나눈 후 몫을 num에 대입
		num %= 2; // num 변수값을 3으로 나눈 후 나머지를 num에 대입
		num += 10 + 5; // num 변수값에 (10+5)더한 후 num에 대입
		num *= 2 * 3; // num 변수값을 (2*3)를 곱하여 다시 num에 대입
		
		byte b = 1;
		b = (byte)(b * 2); // 변수 b를 가지고 연산하기에 강제형변환이 필요. jvm이 연산
		System.out.println(b);
		b *= 2; // 이 경우 강제 형변환이 필요없는 이유는 이 경우 컴파일 과정에서 연산
		
		
		

		

	}

}
