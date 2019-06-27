package test;
class IntClass {
    int value;  
    IntClass(int a){ //定义一个构造方法来初始化value的值
    	this.value=a;
    }
}
public class RunIntClass {
   public static void modifyValue(IntClass s,int val){ //定义一个方法修改某一个类的变量的值
   s.value = val;
 } 
   public static void main(String args[]){
     IntClass  a = new IntClass(0);  //创立一个IntClass的对象a，并且初始化value的值为0
     modifyValue(a,8);     //修改a这个对象下的变量value的值为8
     System.out.println(a.value);    //打印出这个变量的值 
   }
}
