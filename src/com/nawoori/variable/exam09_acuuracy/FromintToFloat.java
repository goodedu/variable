package com.nawoori.variable.exam09_acuuracy;

public class FromintToFloat {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2;
		num2 = (int) num3;
		
		int result = num1- num2;
		System.out.println(result);

	}

}

//floatŸ���� ������ 23��Ʈ�ۿ� ����������� �ʰ��ϸ� �����Ⱚ����.
//�����ϸ� ������ doubleŸ������ ��ȯ. �����Ⱚ ����.