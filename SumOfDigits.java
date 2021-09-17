package week2.day2;

public class SumOfDigits {

	public static void main(String[] args) {
	
		String input="Tes12Le79af65";
		String rall = input.replaceAll("\\D", "");
		System.out.println(rall);
		int sum=0;
		char[] charArray = rall.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			Character ch1=charArray[i];
				int result = ch1.getNumericValue(ch1);
				sum=sum+result;
				
				
		}
		System.out.println(sum);

	}

}
