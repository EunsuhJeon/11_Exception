package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {

	/*
	 * CheckedException�� �ݵ�� ����ó���� �ؾߵǴ� ���ܵ���
	 * => ���ǹ��� �̸������� �� ����. (��? ������ �Ұ��� ������ ������ �߻��ϱ� ������ �̸� ����ó�������� �ۼ��صξ����)
	 * => �ܺ� �Ű�ü�� ������� �Ͼ �� �߻���! (IOException)
	 * 
	 */
	
	public void method1() throws IOException {
		method2();
	}
	
	public void method2() throws IOException{
		
		// Scanner�� ���� Ű����� ���� �Է¹��� �� �ִ� ��ü (��, ���ڿ��� �о�鿩��)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�ƹ��ų� �Է����ּ���: ");
		
		// 1. try~catch��: ���� �� �ڸ����� ��ٷ� ���ܸ� ó���ϰڴ�!
		// try{}: ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ带 �ۼ�
		// catch(�߻��ɿ���Ŭ���� �Ű�����){}: try���� ������ ���ܰ� �߻����� ��� ��� ó���� �������� ���� ���� �ۼ�
		/*
		try {
			String str = br.readLine();
			System.out.println(str);
		}catch(IOException e) {
			System.out.println("���ܰ� �߻��߽��ϴ�.");
		}
		*/
		
		// 2. throws: ���� �� �ڸ����� ���ܸ� ó������ �ʰ�, ���� �� �޼ҵ带 ȣ���ϴ� ������ ����ó���� ���ѱ�°� (�����ϰڴ�.)
		String str = br.readLine();
		System.out.println(str);	
	}
	
	/*
	 * 						����Ŭ����				���ܹ߻�����			����ó��
	 * UnCheckedException  RuntimeException		��Ÿ�ӿ���				 ����(�����ڰ� �ɹ��ɷ� ó�� => if���� ���� ���ʿ� ���ܰ� �߻��ȵǵ���/����ó������)
	 * CheckedException   RuntimeException ��	�����Ͽ���(������)		 �ʼ�
	 * 
	 */
	
}
