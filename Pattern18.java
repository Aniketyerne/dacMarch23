 /*
A B C D E
A B C D
A B C
A B
A
*/
 class Pattern18{
  public static void main(String args[]){
    for(char i=69;i>=65;i--)
	{
		for(char j=65;j<=i;j++)
		{
			System.out.print(j+ " ");
		}
		System.out.println();
	}
  }
}

