import java.io.*;
import java.net.*;

public class ClientUDP
{
	public static void main(String[] args) throws  Exception
	{
		String s = "Hello World";
		byte[] data = s.getBytes();
		InetAddress addr = InetAddress.getLocalHost ();
		DatagramPacket packet = new DatagramPacket(data, data.length, addr, 8080);
		DatagramSocket socket = new DatagramSocket();
		System.out.println("adresse=" +addr.getHostName () );
		socket.send(packet);
		socket.receive(packet);
		String response = new String(packet.getData(), 0, packet.getLength());
		System.out.println("Réponse reçue: " + response);
		socket.close();
	}
}
