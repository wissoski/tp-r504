import java.net.*;
import java.io.*;

public class ServeurTCP3
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket socketserver = new ServerSocket(2016);
		while(true)
		{
			System.out.println("serveur en attente");
			Socket socket = socketserver.accept();
			System.out.println("connexion d'un client");
			DataInputStream dIn = new DataInputStream(socket.getInputStream());
			DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());
			String message = dIn.readUTF();
			System.out.println("message reçu : " + message);
			String rev = new StringBuilder(message).reverse().toString();
			dOut.writeUTF(rev);
			socket.close();
		}
	}
}

