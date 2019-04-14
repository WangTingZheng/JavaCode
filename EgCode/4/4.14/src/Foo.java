/*
 * 如果main之前修饰符不是static，就不能作为入口方法，但是编译能够通过
 */
public class Foo {
	public void main(String []args) {
		System.out.println("Hello"+args[0]);
	}

}
