package com.kh.exception.run;

import java.io.IOException;

import com.kh.exception.controller.A_UnCheckedException;
import com.kh.exception.controller.B_CheckedException;

public class ExceptionRun {

	public static void main(String[] args) throws IOException {

		/*
		 * * ���� ����
		 * - �ý��ۿ���: ��ǻ���� ���۵����� �߻��ϴ� ���� => �ҽ��ڵ�� �ذ� �� ��=> �ɰ��� ����
		 * - �����Ͽ���: �ҽ��ڵ� ������ ����
		 * - ��Ÿ�ӿ���: �ڵ� ������ 
		 * 
		 * - ������: ���������ε� ��
		 */
		
		

		
		A_UnCheckedException a = new A_UnCheckedException();
		//a.method1();
		//a.method2();
		//a.method3();
		
		B_CheckedException b = new B_CheckedException();
		b.method1();
		
		
		
		
		
		
	}

}
