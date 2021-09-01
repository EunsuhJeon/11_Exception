package com.kh.exception.run;

import java.io.IOException;

import com.kh.exception.controller.A_UnCheckedException;
import com.kh.exception.controller.B_CheckedException;

public class ExceptionRun {

	public static void main(String[] args) throws IOException {

		/*
		 * * 에러 종류
		 * - 시스템에러: 컴퓨터의 오작동으로 발생하는 에러 => 소스코드로 해결 안 됨=> 심각한 에러
		 * - 컴파일에러: 소스코드 문법상 오류
		 * - 런타임에러: 코드 상으로 
		 * 
		 * - 논리에러: 문법적으로도 둔
		 */
		
		

		
		A_UnCheckedException a = new A_UnCheckedException();
		//a.method1();
		//a.method2();
		//a.method3();
		
		B_CheckedException b = new B_CheckedException();
		b.method1();
		
		
		
		
		
		
	}

}
