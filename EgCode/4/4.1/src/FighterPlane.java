/*
 * ���ʷ�����;��һ��ֱ���ڱ������ڷ����е��� 
 */
class FighterPlane {   //����һ���࣬������ս����
	String name;        //���������ֺ͵�����
	int missileNum;
	void fire() {       //�����ǿ���
		if(missileNum>0) {
			missileNum -=1;
			System.out.println("now fire a missile!");
		}
		else {
			System.out.println("No missile left!");
		}
	}
	public void main(String []args) {   
		fire();  //ֱ���ڱ���������
	}
}
