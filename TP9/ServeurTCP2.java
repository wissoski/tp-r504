import java.net.*;
import java.io.*;

public class ServeurTCP2 {
	public static void main(String[] args) throws Exception
	{
		ServerSocket socketserver = new ServerSocket(2016);
		while(true)
		{
			System.out.println("serveur en attente");
			Socket socket = socketserver.accept();
			System.out.println("Connexion d'un client");
			DataInputStream dIn = new DataInputStream(socket.getInputStream());
			System.out.println("Message : " + dIn.readUTF());
			socket.close();
		}
	}
}

