import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String userName ;
		int number;
		
		System.out.println("What is your name? ");
		
		userName = scan.next();
		
		System.out.println("Hi " + userName + " please provide a number in the range of 1 an 100");
		number = scan.nextInt();
		
		if (number > 0 && number <101) {
			if (number % 2 == 0) {
				if (number >= 2 && number < 25) {
					System.out.println("Even and less than 25");	
				} else if (number >= 26 && number < 60) {
					System.out.println("Even");
				} else  System.out.println(number + " Even");
			} else if (number < 60 ) {
				System.out.println(number + " Odd");
			} else System.out.println(number + " Odd and over 60"); 
	    } else  {
	    	 System.out.println("Number not in the range");
	    }
		System.out.println("Thank you for playing, Adios ;-) ");
		
		scan.close();

	}

}
