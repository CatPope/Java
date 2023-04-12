package Text;

import java.util.Scanner;

public class Exam03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month, day;
		
		System.out.print("달 입력 : ");
		month = sc.nextInt();
		switch(month) {
		case 2:
			day = 28;
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		default:
			day = 31;
			break;
		}
		
		System.out.println(month + "월은 " + day + "일 입니다.");
		
	}

}
