	import java.io.*;
import java.net.*;
public class TalkClient {
	public static void main(String args[]) {
		try {
			Socket socket =new Socket("127.0.0.1",4700);
			BufferedReader sin= new BufferedReader(new InputStreamReader(System.in));  //���ü��̽��ջ���
			PrintWriter os= new PrintWriter(socket.getOutputStream());//����socket���ͻ���
			BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));//����socket���ջ���
			String readline;
			readline = sin.readLine();//�Ӽ��̽�����Ϣ
			while(!readline.equals("bye")) {  //����������벻��bye����ַ���
				os.println(readline);  //ͨ�����ͻ��淢�ͼ����������Ϣ
				os.flush();      //��ջ���
				System.out.println("Client:"+readline); //�ڴ��ڴ�ӡ�ͻ��˷��͵�����
				System.out.println("Server:"+is.readLine());//�ڴ��ڴ�ӡ�����
				readline = sin.readLine(); //���¶�ȡ��������
			}
			//���������bye����ֽ�
			os.close(); //�رշ��ͻ���
			is.close();	//�رս��ջ���
			socket.close(); //�ر�socketͨ��
		}catch(Exception e) {
				System.out.println("Error"+e);
		}
	}
}