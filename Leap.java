/*
OUTPUT:-

F:\CPOS\Assignment\Aniket Yerne\Assignment1>javac Leap.java

F:\CPOS\Assignment\Aniket Yerne\Assignment1>java Leap
Enter Year
2017
 Year is not leap year
 */
 
 import java.util.Scanner;
class Leap{
public static void main(String args[])
{
System.out.println("Enter Year");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n%4==0)
{
System.out.println("The given Year is Leap Year");
}else
{
System.out.println(" Year is not leap year");
}
}


}
