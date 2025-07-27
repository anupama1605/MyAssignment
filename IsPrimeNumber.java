package week1.day2;

public class IsPrimeNumber {
	
	public static void main(String[] args) {
		
		int num = 30;
		for (int i=2;i<=num; i++) {
			
			if(i% 2!=0) {
				System.out.println("Prime Number is" +" " + i);
			}
			//else {
			//	System.out.println("Number isn't Prime Number" +" " +i);
			}
		System.out.println("----------------------");
		int j=5;
	for(j=0;j<=5;j++) {
		if(j==3 || j==4) {
			continue;
		}
		System.out.println(j);
	}
		
	}
				
	}

