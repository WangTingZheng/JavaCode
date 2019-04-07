class IntClass{
	int value;
}
public class RunClassDefault {
	public static IntClass getInstance() {
		IntClass s= new IntClass();
		s.value =8;
		return s;
	}
	public static void main(String args[]) {
	IntClass a=getInstance();
	System.out.println(a.value);
	}
}
