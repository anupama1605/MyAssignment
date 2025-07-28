package week2.day1.Assignment1;

public class PalindromeAss {

	public static void main(String[] args) {

		int input=12121;
		int temp=input;
		int output=0;
		int remainder;
		
		while(input>0) {
			remainder= input%10;
			output= (output*10)+remainder;
			input=input/10;
		}
		if(temp==output) {
			System.out.println("Its Palindrome");

		}
		else{
			System.out.println("Its not a Palindrome");
		}
		
	}

}
