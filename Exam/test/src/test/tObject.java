package test;
public class tObject {
    private static  int i=0;
    tObject(){  //����һ�����췽����ʵ��i�Լ�
    	i++;
    }
	public int getI(){
		return i;
	};		
    public static void main(String args[]){
       tObject t = new tObject();  //����ÿ����һ�����󣬾ͻ�ִ��һ�ι��췽�����������Լ�
       t = new tObject();
       t =new tObject();
	   System.out.println(t.getI());	  
    }
}
