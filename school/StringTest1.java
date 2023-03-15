package data_type;

public class StringTest1 {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");
		
		if(str1 == str2)
			System.out.println("same");
		else
			System.out.println("different");

	}

}
