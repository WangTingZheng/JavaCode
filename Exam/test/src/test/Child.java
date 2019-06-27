package test;
class Course{
	private String cNumber;
	private String cName;
	private int cUnit;
	
	public Course(String number,String name,int unit) {
		cNumber=number;
		cName=name;
		cUnit=unit;
	}
	
	public void printCourseInfo() {
		System.out.println("课程号:"+cNumber+" 课程名:"+ cName+" 学分:"+cUnit);
	}
}
public class Child{
	public static void main(String []args) {
		Course c;
		c=new Course("101","ASP",3);
		c.printCourseInfo();
	}
}