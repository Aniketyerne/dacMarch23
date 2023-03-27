/*
F:\CPOS\Assignment\Aniket Yerne\Assignment1>javac Voter.java

F:\CPOS\Assignment\Aniket Yerne\Assignment1>java Voter
Enter Your Age
24
Yo are Eligible for Voting

*/
import java.util.*;
class Voter{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your Age");
int a1=sc.nextInt();
String a2=a1>=18?"Yo are Eligible for Voting":"You are not Eligible for Voting";
System.out.println(a2);
}
}
