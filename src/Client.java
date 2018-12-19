import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

import org.omg.CORBA.portable.UnknownException;

public class Client {
	static String hostName="localhost";
	static int port=6769;
	static Socket clientSocket=null;
	static DataOutputStream os=null;
	static BufferedReader is=null;
	
	public static void main(String[] args) {
		try
		{
			clientSocket=new Socket(hostName,port);
			os=new DataOutputStream(clientSocket.getOutputStream());
			is=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
		}catch(UnknownHostException io){
			System.out.println("No host found!");
		}catch(IOException e){
			System.out.println("Error!");
			
		}
		if(clientSocket==null || os==null||is==null){
			System.err.println("Something is wrong, a variable is null");
		}
	
	try{
	while(true)
	{
		System.out.println("Enter an integer(0 to stop connecttion and -1 to stop server)");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String keyBoardInput=br.readLine();
		os.writeBytes(keyBoardInput+"\n");
		int n=Integer.parseInt(keyBoardInput);
		if(n==0 || n==-1)
			break;
		String responseLine=is.readLine();
		System.out.println("Square ="+responseLine);
	}
	os.close();
	is.close();
	clientSocket.close();
	}
	catch(UnknownException ee){
		System.err.println("Trying to connect to unknown host!"+ee);
	}catch(IOException e){
		System.out.println(""+e);

	}
}
}
	
