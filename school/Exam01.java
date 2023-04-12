package Text;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int max = 0;
		
		System.out.println("정수 5개를 입력해 주세요.");
		
		for(int i=0; i<5; i++)
		{
			System.out.print((i+1) + "번째 정수 입력 : ");
			num[i] = sc.nextInt();
			
			if(num[i] > max)
			{
				max = num[i];
			}
		}
		
		System.out.println("입력한 값들 중 최대값은 " + max + "입니다.");

	}

}
