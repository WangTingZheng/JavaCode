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
	    //查找节点
	    public BT find(Object key);
	    //插入新节点
	    public boolean insert(Object key);
	    //删除节点
	    public boolean delete(Object key);
	    //Other Method......
	}
    //Other Method......
}
