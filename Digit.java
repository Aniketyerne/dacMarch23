/*OUTPUT:-
F:\CPOS\Assignment\Aniket Yerne\Assignment1>javac Digit.java

F:\CPOS\Assignment\Aniket Yerne\Assignment1>java Digit
Enter the number
1
1
*/


import java.util.*;
class Digit{
public static void main(String args[])
{
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
int a1=sc.nextInt();
String nstr="";
String str=Integer.toString(a1);
for (int i=0; i<str.length(); i++)
      {
       char ch= str.charAt(i); 
        nstr= ch+nstr; 
      }
int a=Integer.parseInt(nstr) ;	  
while(a!=0)
{
int b=a%10;
System.out.println(b);
a=a/10;
}
}
}