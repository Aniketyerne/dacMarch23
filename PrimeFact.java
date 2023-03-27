
import java.util.*;

class PrimeFact {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		
		int arr[]={ 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		while(a>0||a>2||a>3||a>5||a>7||a>0)
		{
			for(int i=0;i<arr.length;i++)
			{
				if(a%arr[i]==0)
				{
					System.out.print(arr[i]+" ");
					a=a/arr[i];
				}
					
				
			}			
		}		
	}
}