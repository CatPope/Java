package Text;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		int sum = 0 ;
		for(int i=1; i<=num; i++)
		{
			if(i%2 == 0)
			{
				System.out.print("-"+i);
				sum -= i;
				
			}
			else
			{
				System.out.print("+"+i);
				sum += i;
			}
		}
		System.out.println("=" + sum);
	}
	
}
