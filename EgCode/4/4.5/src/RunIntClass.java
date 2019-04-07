class IntClass{
	int value;
}
public class RunIntClass {
	public static IntClass getInstance() {
		IntClass s= new IntClass();
		s.value=8;
		return s;
	}
	public static void main(String args[]) {
		IntClass a;
		a = getInstance();
		System.out.print(a.value);
	}
}
