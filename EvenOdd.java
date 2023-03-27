/*OUTPUT:-

F:\CPOS\Assignment\Aniket Yerne\Assignment1>javac EvenOdd.java

F:\CPOS\Assignment\Aniket Yerne\Assignment1>java EvenOdd
Enter a number
5
Number is Odd

F:\CPOS\Assignment\Aniket Yerne\Assignment1>javac EvenOdd.java

F:\CPOS\Assignment\Aniket Yerne\Assignment1>java EvenOdd
Enter a number
4
the number is Even
*/



import java.util.Scanner;
class EvenOdd{
public static void main(String args[])
{
System.out.println("Enter a number");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if(a%2==0)
{
System.out.println("the number is Even");
}
else
System.out.println("Number is Odd");

}
}