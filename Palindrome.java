/**
 * Class to check a string character by character to see if it is a palindrome using a Stack.
 * @author Jonathan Moreira Alsina
 * @version 9/29/2022
 */
import java.util.Stack;

public class Palindrome
{
	
	Stack <Character> palStack;
	String words;
	
	/**
	 * Default palindrome
	 */
	public Palindrome() 
	{
		palStack= new Stack <Character>();
	}
	
	/**
	 * Checks if the string given by the user is a palindrome
	 * @param words of String type
	 * @return true if it is a palindrome
	 */
	boolean checkPalindrome(String words) 
	{
		boolean check= false;
		
		Palindrome palStack= new Palindrome();
		
			System.out.println("Was the stack successufully filled? " +   palStack.fillStack(words));
			
			System.out.println("Are the two sentences equal? " + palStack.compare(words));
			if(palStack.compare(words)== true )
				check = true;
		return check;
	}
	
	/**
	 * Uses a String to fill up a stack
	 * @param words of String type
	 * @return palStack filled with the string characters
	 */
	public Stack<Character> fillStack(String words)
	{
		
		while(palStack.isEmpty())
		{
			for(int count=0; count < words.length(); count++)
				palStack.push(words.charAt(count));
		}
		return  palStack ;
	}
	
	/**
	 * Checks character by character if the two strings are the same 
	 * @param words of String type
	 * @return true if they are equal 
	 */
	public boolean compare(String words) {
	
		
		boolean same= true;
		char [] copy = words.toCharArray() ;
		
			for( int count = 0; count < copy.length ; count++) 
				palStack.push(copy[count]);
			
			for( int count = 0; count < copy.length && same; count++) {
				if(copy[count]!= palStack.pop())
					same = false;
			}
			


		return same;
	
	}
	
}



