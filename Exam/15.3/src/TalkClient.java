	import java.io.*;
import java.net.*;
public class TalkClient {
	public static void main(String args[]) {
		try {
			Socket socket =new Socket("127.0.0.1",4700);
			BufferedReader sin= new BufferedReader(new InputStreamReader(System.in));  //设置键盘接收缓存
			PrintWriter os= new PrintWriter(socket.getOutputStream());//设置socket发送缓存
			BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));//设置socket接收缓存
			String readline;
			readline = sin.readLine();//从键盘接收信息
			while(!readline.equals("bye")) {  //如果键盘输入不是bye这个字符串
				os.println(readline);  //通过发送缓存发送键盘输入的信息
				os.flush();      //晴空缓存
				System.out.println("Client:"+readline); //在窗口打印客户端发送的内容
				System.out.println("Server:"+is.readLine());//在窗口打印服务端
				readline = sin.readLine(); //重新读取键盘数据
			}
			//如果发送了bye这个字节
			os.close(); //关闭发送缓存
			is.close();	//关闭接收缓存
			socket.close(); //关闭socket通信
		}catch(Exception e) {
				System.out.println("Error"+e);
		}
	}
}