import java.io.*;
import java.net.*;

public class client
{
	public static void main(String args[]) throws IOException
	{
	System.out.println("Enter Message :");
	Socket myclient=new Socket("192.168.111.129",1234);
	DataOutputStream outtoserver=new DataOutputStream(myclient.getOutputStream());
	BufferedReader infromuser=new BufferedReader(new InputStreamReader(System.in));
	String sentence=infromuser.readLine();
	outtoserver.writeBytes(sentence);
	myclient.close();
	}
}
