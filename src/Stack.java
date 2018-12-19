import java.util.Scanner;

public class Stack 
{
	static int[] a=new int[10];
	static int top=-1;
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int ch;
		do
		{
			System.out.println("Select the operation : \n 1. Push\n 2.Pop\n 3. Empty\n 4. Full\n 5. Display");
			ch=sc.nextInt();
			switch(ch){
			case 1: if(fullOp()==1)
						System.out.println("Can't push, the stack is full!");
					else
						pushOp();
					break;
			case 2: if(emptyOp()==1)
						System.out.println("Can't pop, the stack is empty!");
					else
						popOp();
					break;
			case 3: emptyOp();
					break;
			case 4: fullOp();
					break;
			case 5: display();
					break;
			}	
		}while(ch!=6);
		
	}
	private static void display() {
		System.out.println("The Stack elements are as follows :");
		for(int i=0;i<=top;i++)
			System.out.println(""+a[i]);
		
	}
	private static int fullOp() {
		if(top==9)
			return 1;
		else
			return 0;
		
	}
	private static int emptyOp() 
	{
		if(top==-1)
			return 1;
		else
			return 0;
	}
	private static void popOp() 
	{
		System.out.println("The token"+a[top]+"is popped!");
		top--;
	}
	private static void pushOp() 
	{
		System.out.println("Enter the token to push!");
		a[++top]=sc.nextInt();
	}

}