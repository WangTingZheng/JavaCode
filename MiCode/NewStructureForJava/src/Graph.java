public class  Graph{
	static final int MaxNum=20;         //图的最大顶点数
	static final int MaxValue=65535;    //最大值
	class GraphMaterix{
	    int GType;     //图的类型（0:无向图  1：有向图）
	    int VertexNum;//顶点数量
	    int EdgeNum;   //边的数量
	    char[] Vertex=new char[MaxNum]; //保存顶点信息
	    int[][] EdgeWeight=new int[MaxNum][MaxNum];//保存权
	}
}