package test;
class IntClass {
    int value;  
    IntClass(int a){ //����һ�����췽������ʼ��value��ֵ
    	this.value=a;
    }
}
public class RunIntClass {
   public static void modifyValue(IntClass s,int val){ //����һ�������޸�ĳһ����ı�����ֵ
   s.value = val;
 } 
   public static void main(String args[]){
     IntClass  a = new IntClass(0);  //����һ��IntClass�Ķ���a�����ҳ�ʼ��value��ֵΪ0
     modifyValue(a,8);     //�޸�a��������µı���value��ֵΪ8
     System.out.println(a.value);    //��ӡ�����������ֵ 
   }
}
