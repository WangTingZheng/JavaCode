import java.io.*;
import java.net.*;
public class TalkServer {
	public static void main(String args[]){
		try {
			ServerSocket server=null; //创建一个服务器
			try {
				//创建一个ServerSocket在端口4700监听客户请求
				server =new ServerSocket(4700);
			}catch(Exception e) {
				System.out.println("can not listen to:"+e);
			}
			Socket socket=null; 
			try {
				socket =server.accept();
			}catch(Exception e) {
				System.out.println("error:"+e);
			}
			String line;
			BufferedReader is=new BufferedReader(new InputStreamReader(socket.getInputStream())); //设置服务端接收端缓存
			PrintWriter os=new PrintWriter(socket.getOutputStream()); //设置服务端发送缓存
			BufferedReader sin=new BufferedReader(new InputStreamReader(System.in));//设置键盘输入缓存
			System.out.println("Client:"+is.readLine()); //在窗口打印客户端打印客户端发送的数据
			line=sin.readLine();  //接收键盘输入信息
			while(!line.equals("bye")){  //如果键盘没有输入bye
				os.println(line);		 //从客户端发送数据
				os.flush();              //清除发送缓存
				System.out.println("Server:"+line);//在窗口打印服务端发送的数据
				System.out.println("Client:"+is.readLine()); //在窗口打印客户端数据
				line=sin.readLine(); //重新获取数据
			}
			os.close();
			is.close();
			socket.close();
			server.close();
		}catch(Exception e) {
			System.out.println("Error:"+e);
		}
	}
}
