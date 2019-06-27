package test;
public class tObject {
    private static  int i=0;
    tObject(){  //创立一个构造方法，实现i自加
    	i++;
    }
	public int getI(){
		return i;
	};		
    public static void main(String args[]){
       tObject t = new tObject();  //利用每产生一个对象，就会执行一次构造方法的特性来自加
       t = new tObject();
       t =new tObject();
	   System.out.println(t.getI());	  
    }
}
