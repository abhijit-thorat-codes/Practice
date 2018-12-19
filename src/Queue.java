import java.util.Scanner;

public class Queue {
static int a[]=new int [10];
static Scanner sc=new Scanner(System.in);
static int front=-1;
static int rear=-1;
	public static void main(String args[])
	{
		int ch;
		do
		{
			System.out.println("Select the operation : \n 1. Enqueue\n 2.Dequeue\n 3. Empty\n 4. Full\n 5. Display");
			ch=sc.nextInt();
			switch(ch){
			case 1: if(fullOp()==1)
						System.out.println("Can't push, the queue is full!");
					else
						enqueueOp();
					break;
			case 2: if(emptyOp()==1)
						System.out.println("Can't pop, the queue is empty!");
					else
						dequeueOp();
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
		System.out.println("The queue elements are as follows :");
		for(int i=rear;i<=front;i++)
			System.out.println(""+a[i]);
		
	}
	private static int fullOp() {
		if(front==9)
			return 1;
		else
			return 0;
		
	}
	private static int emptyOp() 
	{
		if(rear==-1&&front==-1)
			return 1;
		else
			return 0;
	}
	private static void dequeueOp() 
	{
		System.out.println("The token"+a[rear]+"is popped!");
		rear++;
	}
	private static void enqueueOp() 
	{
		System.out.println("Enter the token to insert!");
		if(rear==front)
		{
			a[++front]=sc.nextInt();
			rear++;
		}
		else
			a[++front]=sc.nextInt();
		
	}

	}
