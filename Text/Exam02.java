package Text;

public class Exam02 {
	
	public static void main(String[] args) {
		int i, j;
		
		for(i=0; i<3; i++)
		{
			for(j=0; j<4; j++)
			{
				System.out.print(j+1);
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		
		for(i=0; i<4; i++)
		{
			for(j=0; j<3; j++)
			{
				System.out.print(i+1);
			}
			System.out.println();
		}

		
		System.out.println();

		
		for(i=0; i<4; i++)
		{
			for(j=0; j<=i; j++)
			{
				System.out.print(j+1);
			}
			System.out.println();
		}

		
		System.out.println();

		
		for(i=0; i<3; i++)
		{
			for(j=3; j>i; j--)
			{
				System.out.print(j+1);
			}
			System.out.println();
		}

		
		System.out.println();

		
		for(i=0; i<3; i++)
		{
			for(j=2; j<i; j--)
			{
				System.out.print(i+1);
			}
			System.out.println();
		}
		
	}

}
