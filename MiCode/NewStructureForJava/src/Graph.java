public class  Graph{
	static final int MaxNum=20;         //ͼ����󶥵���
	static final int MaxValue=65535;    //���ֵ
	class GraphMaterix{
	    int GType;     //ͼ�����ͣ�0:����ͼ  1������ͼ��
	    int VertexNum;//��������
	    int EdgeNum;   //�ߵ�����
	    char[] Vertex=new char[MaxNum]; //���涥����Ϣ
	    int[][] EdgeWeight=new int[MaxNum][MaxNum];//����Ȩ
	}
}