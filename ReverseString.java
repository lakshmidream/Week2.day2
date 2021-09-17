package week2.day2;

public class ReverseString {

	public static void main(String[] args) {
		
		String str1="This is good";
		int len = str1.length();
		for (int i = len-1; i >= 0; i--) {
			System.out.print(str1.charAt(i));
			
		}

	}

}
