import java.io.*;
import java.net.*;
public class TalkServer {
	public static void main(String args[]) {
		try {
			ServerSocket server =null;
			try {
				server =new ServerSocket(4700);
			}catch(Exception e) {
				System.out.println("can not listen to"+e);
			}
			Socket socket =null;
			try {
				socket=server.accept();
			}catch(Exception e) {
				System.out.println("error"+e);
			}
			String line;
			BufferedReader is=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter os=new PrintWriter(socket.getOutputStream());
			BufferedReader sin=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Client:"+is.readLine());
			line=sin.readLine();
			while(!line.equals("bye")) {
				os.println();
				os.flush();
				System.out.println("Server:"+line);
				System.out.println("Client:"+is.readLine());
				line=sin.readLine();
			}
			os.close();
			is.close();
			socket.close();
			server.close();
	}catch(Exception e) {
		System.out.println("error"+e);
	}
  }
}
