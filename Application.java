import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence;
		Scanner scan = new Scanner( System.in );
		char answer='\0';
		
		while(answer!= 'n' || answer != 'N') 
		{
			System.out.println("Please enter a sentence to check if it is a palindrome.");
			sentence = scan.nextLine();
		
			Palindrome myStack = new Palindrome();
			System.out.println("Where the items compared? " + myStack.compare(sentence));
			System.out.println("Is the sentence a palindrome?: " + myStack.checkPalindrome(sentence));
		
			System.out.println("Do you wish to continue? ");
			answer = scan.nextLine().charAt(0);
		}
	}


}
