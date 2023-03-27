/*OUTPUT:-
F:\CPOS\Assignment\Aniket Yerne\Assignment1>java FindGCDExample
Enter the First Number: 10
Enter the Second Number: 4
GCD of 10 and 4 =  2
*/

import java.util.Scanner;  
public class FindGCDExample 
{  
public static void main(String[] args)   
{  
int a, b, gcd = 0;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the First Number: ");  
a = sc.nextInt();     
System.out.print("Enter the Second Number: ");  
b = sc.nextInt();  
gcd = findGCD(a, b);  
System.out.println("GCD of " + a + " and " + b + " =  " + gcd);  
}  
public static int findGCD(int a, int b)  
{  
while(b != 0)  
{  
if(a > b)  
{  
a = a - b;  
}  
else  
{  
b = b - a;  
}  
}  
return a;  
}  
}  