/*
F:\CPOS\Assignment\Aniket Yerne\Assignment1>javac Swap.java

F:\CPOS\Assignment\Aniket Yerne\Assignment1>java Swap
Enter the value of x and y
23
25
before swapping numbers: 23 25
After swapping: 25  23
*/
import java.util.*;  
class Swap   
{  
    public static void main(String a[])   
    {   
        System.out.println("Enter the value of x and y");  
        Scanner sc = new Scanner(System.in);  
    
        int x = sc.nextInt();  
        int y = sc.nextInt();  
        System.out.println("before swapping numbers: "+x +" "+ y);  
       
        x = x + y;   
        y = x - y;   
        x = x - y;   
        System.out.println("After swapping: "+x +"  " + y);   
    }   
}  