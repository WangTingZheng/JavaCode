class ParentDog{	
	public String dogName;
	public ParentDog(String dogName){
		this.dogName = dogName;		
	}	
}
class SonDog extends ParentDog{	
	public  String dogName;
	public SonDog(String dogName,String parentDogName){
		super(parentDogName);
		this.dogName = dogName;		
	}	
} 
public class RunDog{
	   public static void main(String args[]){
		ParentDog  pDog; //��
		SonDog  sDogA,sDogB; //��
		pDog = new ParentDog("Jack");	//��
	    System.out.println("pDog��������:"+pDog.dogName);
		sDogA = new SonDog("sonA","JackA");
		sDogB = new SonDog("sonB","JackB");//��
	    pDog = sDogA;//�� 
	    System.out.println("pDog��������:"+pDog.dogName);       
		System.out.println("sDogA��������:"+sDogA.dogName);
		System.out.println("sDogB��������:"+sDogB.dogName);
		pDog = sDogB;//��
		System.out.println("pDog��������:"+pDog.dogName);
		System.out.println("sDogA��������:"+sDogA.dogName);
		System.out.println("sDogB��������:"+sDogB.dogName);   
	  }
	}