import java.net.*;
import java.io.*;

public class ClientTCP2
{
	public static void main(String[] args) throws Exception
	{
		Socket socket = new Socket("localhost", 2016);
		DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());
		dOut.writeUTF(args[0]);
		socket.close();
	}
}
