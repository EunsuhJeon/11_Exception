package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UnCheckedException {

	private Scanner sc = new Scanner(System.in);
	
	public void method1() {
		// ArithmeticException: 나누기 연산 시 0으로 나눠질 때 발생되는 예외
		
		System.out.print("정수1: ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2: ");
		int num2 = sc.nextInt();
		
		//int result = num1 / num2; // 사용자가 두번째 정수를 0으로 입력하는 순간 예외 발생 => 비정상적으로 프로그램 종료
		
		// 애초에 예외 자체가 발생이 안되게끔 if문으로 조건 검사 => 예외처리 아님!
		/*
		int result = 0;
		if(num2 != 0) {
			result = num1 / num2;
		}
		
		System.out.println("안녕하세요. 반갑습니다. 당신의 결과를 알려드리겠습니다.");
		System.out.println("result: " + result);
		*/
		
		// 예외처리: 예외가 "발생했을 때" 실행할 내용을 밀 작성해놓는 방법
		/*
		 * * try catch 방법
		 * try{
		 * 		예외가 발생될 수 있는 구문;
		 * }catch(발생될예외클래스 매개변수) {
		 * 		해당 예외가 발생됐을 경우 실행할 구문;
		 * }
		 */
		
		try {
			int result = num1 / num2;
			System.out.println("result: " + result);
		}catch(ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
			//e.printStackTrace(); // 강제로 오류가 난 이력을 보고자 할 때 실행하는 구문
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	public void method2() {
		// NegativeArraySizeException: 배열 할당 과정에서 배열의 크기를 음수로 지정하는 경우 발생되는 예외
		// ArrayIndexOutOfBoundsException: 배열에서 부적절한 인덱스로 제시허면서 접근했을 때 발생되는 예외
		
		System.out.print("배열의 크기: ");
		int size = sc.nextInt();
		
		/* if문으로 아예 예외 자체가 발생이 안되도록 먼저 막는 방법
		if(size >= 101) {
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값: " + arr[100]);	
		}
		*/	
		
		try {
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값: " + arr[100]);
		}catch(NegativeArraySizeException e){
			System.out.println("배열의 크기로 음수를 제시할 수 없습니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("부적절한 인덱스로 접근했습니다.");
		}
		// 다중 catch블럭 작성 가능
		
		System.out.println("프로그램을 종료합니다.");
			
	}

	public void method3() {
		
		System.out.print("배열의 크기: ");
		
		/*
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값: " + arr[100]);
		}catch(NegativeArraySizeException e){
			System.out.println("배열의 크기로 음수를 제시할 수 없습니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("부적절한 인덱스로 접근했습니다.");
		}catch(InputMismatchException e) {
			System.out.println("정수만을 입력해야 합니다.");
		}
		*/
		
		/*
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값: " + arr[100]);
		}catch(RuntimeException e) {// 다형성 적용해서 부모타입예외클래스 작성 가능
									// 모든 자식 예외 발생시 다 받아서 처리할 수 있음
			System.out.println("예외가 발생됨.. 배열 크기나.. 부적절 인덱스나.. 정수 아닌걸 입력했어.. 뭔진 안알려줌");
		}
	
		System.out.println("프로그램을 종료합니다.");
		*/
		// 각각의 예외 발생 시 실행할 내용이 별개일 경우 세분화해서 다중 catch블럭으로 기술하는게 적절함!
		
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값: " + arr[100]);
		}catch(InputMismatchException e) {
			
		}catch(RuntimeException e) {
			System.out.println("예외가 발생됨.. 배열 크기나.. 부적절 인덱스나.. 정수 아닌걸 입력했어.. 뭔진 안알려줌");
			
		}
		// 부모예외클래스와 자식예외클래스를 가지고 catch블럭을 기술하고자 할 때는
		// 자식예외클래스 catch블럭이 위에 있어야만 함! (아니면 unreachable catch block 오류 발생)
	
		System.out.println("프로그램을 종료합니다.");	
		
	}
		
	/*
	 * * RuntimeException 관련은 UnChckedException(예외처리 구문이 필수는 아님)
	 * 	 if문: 애초에 예외자체가 발생되기 전에 소스코드로 핸들링하는 것(예외처리구문이 아님)
	 * 	 try-catch문: 예외가 발생했을 경우 처리해주는 구문을 작성해두는 것 (예외처리구문임)	
	 * 
	 * 	 예측 가능한 상황은 if문으로 조건검사해서 해결하는 것이 권장사항임!
	 * 	 부득이하게 조건문으로 핸들링이 안되는 구문은 예외처리구문으로 작성해둘 것!
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
}
