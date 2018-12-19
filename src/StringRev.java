import java.util.Scanner;

public class StringRev {
	static Scanner sc=new Scanner(System.in);
	public static void main(String a[])
	{
		String s=new String();
		System.out.println("Enter a string to reverse!");
		s=sc.nextLine();
		char[] str=new char[s.length()];
		int i=s.length()-1;
		int j=0;
		while(i>=0)
		{
			str[j]=s.charAt(i);
			i--;
			j++;
		}
		System.out.println(""+str);
	}

}
