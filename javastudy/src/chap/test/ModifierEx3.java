package chap.test;

import chap7.Modifier3; // 클래스의 접근제한자가 default. => 같은 패키지에 속한 접근 허용

public class ModifierEx3 {
	public static void main(String[] args) {
		Modifier2 m2 = new Modifier2();
		m2.method();
		Modifier3 m3 = new Modifier3(); // default
		m3.method();
	}
}
