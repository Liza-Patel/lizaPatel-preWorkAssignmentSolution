import java.util.Scanner;
public class PreWorkAssignment {
	
	Scanner scan = new Scanner(System.in);

public static void main (String [] args) {
	
	
	
	PreWorkAssignment obj = new PreWorkAssignment();
	int choice;
	
	
	do {
		
		System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

        + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
		
		+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
		
		
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		
		choice = scanner.nextInt();
		
		switch (choice) {
			
			case 0:
			
			choice = 0;
			
			break;
			
			case 1:
			
			obj.checkPalindrome();
			
			break;
			
			case 2:
			
			obj.printPattern();
			
			break;
			
			case 3:
			
			obj.checkPrimeNumber();
			
			break;
			
			case 4:
			
			obj.printFibonacciSeries();
			
			break;
	
		} 

	} while (choice!=0);
	
	System.out.print("Exited Successfully");

}

public void checkPalindrome() {
		

		System.out.println("Enter a number: ");
		int number = scan.nextInt();
		int num = number;
		
		int reverse = 0;
		
		 
		if (number==0) {
			
			System.out.println("0");
			
		}
			
		else {
			
			do {
				
				int remainder = num%10;
				reverse = (reverse*10)+remainder;
				num = num/10;
					
			} while(num!=0);
			
		}
		
		if(number==reverse) {
			
			System.out.println("It is a palindrome");
			
		}
		else {
			System.out.println("It is not a palindrome");
		}
		
		
	}
	
	public void printPattern() {
		
		System.out.println("Enter a number: ");	
		int number = scan.nextInt();
		
		for(int i = 1; i<=number; i++) {
				
			for(int j = number; j>=i; j--) {
					
				System.out.print("*");
						
			}
		System.out.println();
		
	}
	}
	
	public void checkPrimeNumber() {
		
		System.out.println("Enter a number: ");
		int number = scan.nextInt();
		
	    boolean isPrime = false;
		
		if(number!=1) {
			
			for (int i = 2; i < number ; i++) {

           if (number % i == 0) {
              isPrime = true;
              break;
            }
        }
		
    if (isPrime) {
		
		System.out.println("It is not a prime number");
		
	}
		

    else {
		
		System.out.println("It is a prime number");
		
	    }
			
	}
	 else {
		 
		System.out.println("It is a prime number");
		
	 }
		
        
    
    
		
	}
	
	public void printFibonacciSeries() {
		
		int firstNo = 0;
		int secondNo = 1;
		
		System.out.println("Enter a number: ");	
		int count = scan.nextInt();
		
		System.out.print(firstNo + ", " + secondNo + ", ");
		
		
		
		for(int i = 1; i<=count; i++) {
			
			int sum = 0;
			sum = firstNo+secondNo;
			firstNo = secondNo;
			secondNo = sum;
			
			if(i==count) {
				System.out.println(sum);
			}
			else {
				System.out.print(sum + ", ");
			}
			
			
			
		

		}
	
	}
	 
}