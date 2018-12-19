import java.util.Scanner;

public class Doubly {
		static Scanner sc=new Scanner(System.in);
		static int size=0;
		static int data=0;
		
		public static Dnode start=null,head=null;
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
				System.out.print(" <- "+start.data+" -> ");
				start=start.next;
			}
			System.out.println();
		}
		private static void deletNode() {
			System.out.println("1. Delet First node\n2. Delet Last node\n 3. Delet intermediate node\n");
			int c=sc.nextInt();
			switch(c)
			{
			case 1:	start=start.next;
					start.prev=null;
					size--;
					break;
			case 2: deletLast();
					size--;	
					break;
				
			case 3: System.out.println("Enter the node data to delet!");
					deletMiddle(sc.nextInt());
					size--;
					break;
				
			}
			
		}
		private static void deletLast() {
			Dnode temp=new Dnode();
			temp=start;
			while(temp.next!=head)
				temp=temp.next;
			head=temp;
			head.next=null;
			
		}
		private static void deletMiddle(int data) {
			Dnode temp=new Dnode();
			temp=start;
			while(temp.next.data!=data)
				temp=temp.next;
			temp.next=temp.next.next;
			temp.next.prev=temp;
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
				Dnode baby=new Dnode();
				baby.data=data;
				head=baby;
				start=baby;
				size++;
			}
			else
			{
				Dnode baby=new Dnode();
				baby.data=data;
				head.setNext(baby);
				baby.setPrev(head);
				head=baby;
				size++;
			}
		}
	}
