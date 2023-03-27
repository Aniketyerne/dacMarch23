/*OUTPUT:-
F:\CPOS\Assignment\Aniket Yerne\Assignment1>javac Maxmin3.java

F:\CPOS\Assignment\Aniket Yerne\Assignment1>java Maxmin3
Enter the First number =>
3
Enter the Second number =>
2
Enter the thired number =>
6
Form the given three number 2 in minimum and 6 is maximum..
*/

import java.util.*;
class Maxmin3{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the First number =>");
int a1=sc.nextInt();
System.out.println("Enter the Second number => ");
int a2=sc.nextInt();
System.out.println("Enter the thired number => ");
int a3=sc.nextInt();
int max=a1>a2?(a1>a3?a1:a3):(a2>a3?a2:a3);
int min=a1<a2?(a1<a3?a1:a3):(a2<a3?a2:a3);
System.out.println("Form the given three number "+min+" in minimum and "+max+" is maximum..");

}
}
/*Java Basics
Q)what is difference between JDK,JRE and JVM
Q)what is JIT compiler
Q)what is class loader
Q)Explain various memory logical partitions 
Q)what gives Java its "write once and run anywhere nature"
Q)Explain History of Java?who invented Java?
Q)what was original name of Java?why it was renamed?
Q)List features of Java
Q)List various Datatypes in Java 
Q)what is difference between 
System.out.print
System.out.println
System.err.print
Q)How is Java Platform independent 
Q)what is bytecode?How is it different from machine code
Q)what is difference between Jar file & Runnable jar file
Q)what is difference between Runnable jar file & exe file
Q)How is C platform dependent language
Q)what is differnce between path & classpath*/
