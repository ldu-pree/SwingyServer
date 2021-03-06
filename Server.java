import java.net.*;  
import java.io.*;  
class Server{
	static final int PORT = 3333;
	public static void main(String args[])throws Exception{ 
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
            serverSocket = new ServerSocket(PORT);
        } catch (IOException e) {
            e.printStackTrace();

        }
		while (true) {
            try {
                socket = serverSocket.accept();
            } catch (IOException e) {
                System.out.println("I/O error: " + e);
            }
			new EchoThread(socket).start();
        }
	}
}