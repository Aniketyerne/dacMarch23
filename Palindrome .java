/*OUTPUT:-
F:\CPOS\Assignment\Aniket Yerne\Assignment1>javac Palindrome.java

F:\CPOS\Assignment\Aniket Yerne\Assignment1>java Palindrome
Enter a string/number to check if it is a palindrome
22354
Entered string/number isn't a palindrome.
*/


import java.util.*;   
class Palindrome 
{  
   public static void main(String args[])  
   {  
      String original, reverse = ""; // Objects of String class  
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string/number to check if it is a palindrome");  
      original = in.nextLine();   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number isn't a palindrome.");   
   }  
}  