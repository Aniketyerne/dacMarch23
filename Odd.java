/*OUTPUT:-

F:\CPOS\Assignment\Aniket Yerne\Assignment1>javac Odd.java

F:\CPOS\Assignment\Aniket Yerne\Assignment1>java Odd
Odd number are
 1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49
Even Number are
 0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48
F:\CPOS\Assignment\Aniket Yerne\Assignment1>

*/
class Odd{
public static void main(String args[])
{
System.out.println("Odd number are");
for(int i=1;i<50;i=i+2)
{
System.out.print(" "+i);
}
System.out.println();
System.out.println("Even Number are");
for(int i=0;i<50;i=i+2)
{
System.out.print(" "+i);
}
}
}