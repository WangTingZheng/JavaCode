interface  Washer 
{
	abstract void startUp();     //����  
    abstract void letWaterIn(); //��ˮ
    abstract void washClothes(); //ϴ��
    abstract void letWaterOut();//��ˮ
    abstract void stop();        //ֹͣ
}
class RoseBrand implements Washer
{   
	public  void startUp()
	{ 
		System.out.println("startUp");
	}
    public  void letWaterIn()
    {
    	System.out.println("letWaterIn");
    }
    public  void washClothes()
    {
    	System.out.println("washClothes");
    }
    public  void letWaterOut()
    {
    	System.out.println("letWaterOut");
    }
    public  void stop()
    {
    	System.out.println("stop");
    }
    public  void dehydrate () 
    {
    	System.out.println("dehydrate");
    }
}
public class Consumer 
{
	public static void main(String args[])
	{
		//�ӿ���������ʵ�ֽӿڵ�RoseBrand��Ķ���
		Washer  w = new RoseBrand();
		w.startUp();
		w.letWaterIn();
		w.washClothes();
		w.letWaterOut();
		w.stop();
		//w.dehydrate ();��ͨ���ӿڵ���õ��ϴ�»�����еģ�
		//�ӿ�δ����Ĺ��ܷ���������ᱨ��
	} 
}
