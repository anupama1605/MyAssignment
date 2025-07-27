package week1.day2;

public class Fibonacciseries {
	
	
//	FN=0
//	SN=1
//	TN
//	TN=FN+SN
//	FN=SN
//	SN=TN

	public static void main(String[] args) {
		int firstNumber=0;
		int secondNumber=1;
		int thirdNumber;
		
		for(int i=1 ;i<=8;i++) {
			
			thirdNumber = firstNumber+secondNumber;
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
			System.out.println(thirdNumber);
			  
		}
				

	}

}
