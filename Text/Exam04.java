package Text;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] name = new String[2];
		int[][] score = new int[2][3];
		int sum = 0;
		double avg = 0;
		
		for(int i=0; i<2; i++)
		{
			System.out.print("�л�" + (i+1) + "�̸��Է� : ");
			name[i] = sc.next();
					
			for(int j=0; j<3; j++)
			{
				System.out.print("����" + (i+1) + "�Է� : ");
				score[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("**************�Է¿Ϸ�*****************");
		
		for(int i=0; i<2; i++)
		{
			sum = 0;
			for(int j=0; j<3; j++)
				sum = score[i][j];
				
			System.out.print(name[i] + "�л��� ������ " + sum + "���̰�, ");
			avg = sum / 3.0;
			System.out.printf(name[i] + "�л��� ����� %.2f �� �Դϴ�.\n", avg);
			if(avg >= 90)
				System.out.println(name[i] + "�л��� ������ A�Դϴ�.");
			else if(avg >= 80)
				System.out.println(name[i] + "�л��� ������ B�Դϴ�.");
			else if(avg >= 70)
				System.out.println(name[i] + "�л��� ������ C�Դϴ�.");
			else if(avg >= 60)
				System.out.println(name[i] + "�л��� ������ D�Դϴ�.");
			else
				System.out.println(name[i] + "�л��� ������ F�Դϴ�.");

	}

}
