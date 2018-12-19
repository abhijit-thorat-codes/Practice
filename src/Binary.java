import java.util.Scanner;

public class Binary {
	static int a[]={1,2,3,5,8,13,17,85,88,92};
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to search!");
		int token=sc.nextInt();
		binarySearch(0,9,token);
	}

	private static void binarySearch(int low,int high,int token) {
		int mid=(high+low)/2;
		if(token==a[mid])
			System.out.println("The token is found at :"+mid);
		else if(token<a[mid])
			binarySearch(0,mid-1,token);
		else
			binarySearch(mid+1,9,token);
	}

}
