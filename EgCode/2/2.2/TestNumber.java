class TestNumber{
	public static void main(String[] args){
		System.out.print("ceil : ");
		System.out.print(Math.ceil(5.2)+" ");  //Math.ceil(x)表示取不小于x的最小整数
		System.out.print(Math.ceil(5.6)+" ");
		System.out.print(Math.ceil(-5.2)+" ");
		System.out.print(Math.ceil(-5.6)+"\n");
		System.out.print("floor: ");
		System.out.print(Math.floor(5.2)+" "); //Math.floor(x)表示取不大于x的最大整数
		System.out.print(Math.floor(5.6)+" ");
		System.out.print(Math.floor(-5.2)+" ");
		System.out.print(Math.floor(-5.6)+"\n");
		System.out.print("round: ");
		System.out.print(Math.round(5.2)+"   "); //Math.round(x)表示取x的四舍五入
		System.out.print(Math.round(5.6)+"   ");
		System.out.print(Math.round(-5.2)+"   ");
		System.out.print(Math.round(-5.6)+"   ");	
		//这里的四舍五入规则和我们学过的不太一样，这里的四舍五入的原理是在参数上加0.5然后进行下取整。
	}
}	