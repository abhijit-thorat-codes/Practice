import java.util.Scanner;

public class Singly 
{
	static Scanner sc=new Scanner(System.in);
	static int size=0;
	static int data=0;
	
	public static Node start=null,head=null;
	public static void main(String[] args) 
	{

		int ch;
		do
		{
			System.out.println("Select the operation : \n 1. Insert Node\n 2.Delet Node\n 3. Empty\n 4. getSize\n 5. Display");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1: insertNode();
					break;
			case 2: if(emptyOp()==1)
						System.out.println("Can't pop, the list is empty!");
					else
						deletNode();
					break;
			case 3: emptyOp();
					break;
			case 4: System.out.println("Size :"+size);
					break;
			case 5: display();
					break;
			}	
		}while(ch!=6);
		
	}
	private static void display() {
		while(start!=null){
			System.out.print(start.data+" -> ");
			start=start.link;
		}
		System.out.println();
	}
	private static void deletNode() {
		System.out.println("1. Delet First node/n2. Delet Last node 3. Delet intermediate node");
		int c=sc.nextInt();
		switch(c)
		{
		case 1:	start=start.link;
				break;
		case 2: deletLast();
				break;
			
		case 3: System.out.println("Enter the node data to delet!");
				deletMiddle(sc.nextInt());
				break;
			
		}
		
	}
	private static void deletLast() {
		Node temp=new Node();
		temp=start;
		while(temp.link!=head)
			temp=temp.link;
		head=temp;
		head.link=null;
		
	}
	private static void deletMiddle(int data) {
		Node temp=new Node();
		temp=start;
		while(temp.link.data!=data)
			temp=temp.link;
		temp.link=temp.link.link;
	}
	private static int emptyOp() {
		if(head==null)
			return 1;
		else 
			return 0;
	}
	private static void insertNode() 
	{
		System.out.println("Enter the node data!");
		data=sc.nextInt();
		if(head==null && start==null)
		{
			Node baby=new Node();
			baby.data=data;
			head=baby;
			start=baby;
			size++;
		}
		else
		{
			Node baby=new Node();
			baby.data=data;
			head.setink(baby);
			head=baby;
			size++;
		}
	}
}
