
class IntClass{
	int value;
	public IntClass (int val) {
			value=val;
	}
}
public class IntClassContructor{
	public static IntClass getInstance() {
		IntClass s=new IntClass(8);
		return s;
	}
	public static void main(String args[]) {
		IntClass a= getInstance();
		System.out.println(a.value);
	}
}

