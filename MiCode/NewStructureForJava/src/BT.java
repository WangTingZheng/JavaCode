/*
 typedef struct TNode *Position
 typedef Position BinTree;
 struct TNode{
 	ElementType Data;
 	BinTree Left;
 	BinTree Right;
 }
 */
public class BT {
	private Object data;
	private BT Left;
	private BT right;
	public void display(){
        System.out.println(data);
    }
	public interface Tree {
	    //���ҽڵ�
	    public BT find(Object key);
	    //�����½ڵ�
	    public boolean insert(Object key);
	    //ɾ���ڵ�
	    public boolean delete(Object key);
	    //Other Method......
	}
    //Other Method......
}
