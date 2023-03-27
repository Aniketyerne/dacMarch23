/*Output :-
F:\CPOS\Assignment\Aniket Yerne\Assignment1>java AddOr
Enter First number
1
Enter Second number
2
1+2=3
*/

import java.util.*;
class AddOr{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter First number");
int a=sc.nextInt();
int c=a;
System.out.println("Enter Second number");
int b=sc.nextInt();
for(int i=1;i<=b;i++)
{ 
	c++;
}
System.out.println(a+"+"+b+"="+c);

}
}