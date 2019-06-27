import java.io.*;
import java.net.*;
public class TalkServer {
	public static void main(String args[]){
		try {
			ServerSocket server=null; //����һ��������
			try {
				//����һ��ServerSocket�ڶ˿�4700�����ͻ�����
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
			BufferedReader is=new BufferedReader(new InputStreamReader(socket.getInputStream())); //���÷���˽��ն˻���
			PrintWriter os=new PrintWriter(socket.getOutputStream()); //���÷���˷��ͻ���
			BufferedReader sin=new BufferedReader(new InputStreamReader(System.in));//���ü������뻺��
			System.out.println("Client:"+is.readLine()); //�ڴ��ڴ�ӡ�ͻ��˴�ӡ�ͻ��˷��͵�����
			line=sin.readLine();  //���ռ���������Ϣ
			while(!line.equals("bye")){  //�������û������bye
				os.println(line);		 //�ӿͻ��˷�������
				os.flush();              //������ͻ���
				System.out.println("Server:"+line);//�ڴ��ڴ�ӡ����˷��͵�����
				System.out.println("Client:"+is.readLine()); //�ڴ��ڴ�ӡ�ͻ�������
				line=sin.readLine(); //���»�ȡ����
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
