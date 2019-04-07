/*
 * 不采用循环，采用递归的方式来求解，方法Deliver一次能够判断一个母鸡数量是否合格
 * 只要知道母鸡的数量，就能知道公鸡的数量(参考CalChickenLessLoop.java里的注释)，就知道小鸡的数量，逐个判断是否合格就行了
 * 结果有两种，一种是三个数量合格，这样的话直接输出结果，一种是不合格，这样的话递归调用下一个母鸡数量的Deliver方法
 * 直到母鸡数量超过20停止，母鸡最多只能有20只
 */
public class CalChickenNoLoop {
	public static void Deliver(int FemaleNum) {
		if((100-4*FemaleNum)%7==0) {   //判断公鸡数量是否合格
			if((100-((100-4*FemaleNum)/7+FemaleNum))%3==0) { //判断小鸡数量是否合格
					System.out.println("公鸡"+((100-4*FemaleNum)/7)+"只，母鸡"+FemaleNum+"只，小鸡"+(100-((100-4*FemaleNum)/7+FemaleNum))+"只");
					//合格之后直接输出结果
			}
		}
		if(FemaleNum<20) {  //结束一个母鸡数量的判断，检查母鸡数量是否到了上限
			Deliver(++FemaleNum);  //没到上限继续递归
		}
		//能运行到这一步说明已经到上限了，方法就结束了
	}
	public static void main(String args[]) {
		Deliver(1);  //从1开始检索
	}
}
