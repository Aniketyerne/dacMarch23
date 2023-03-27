/*OUTPUT:-
F:\CPOS\Assignment\Aniket Yerne\Assignment1>java Fact
Enter a Number
3
6.0
*/

import java.util.Scanner;
class Fact{
public static void main(String args[])
{
System.out.println("Enter a Number");
Scanner sc=new Scanner(System.in);
double a=sc.nextDouble();
double fact=1;
for(double i=a;i>0;i--)
{
fact=i*fact;
}
System.out.println(fact);
}
}
