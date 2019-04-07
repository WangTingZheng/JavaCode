/*
 * 遍历2以上N以下的每一个奇数，看是否能被该奇数平方根以内的非1整数整除
 */
public class CountPrime {
	public static void main(String[] args) {
		int n=1,m,j,i,N;
		boolean h;
		N=100;
		System.out.print(2+"\t");  //2单独列出来，不用计算，直接是素数 \t相当于按下tab键
		for(i=3;i<=N;i+=2) {     //从3开始到100遍历每个要检查的数，加2使得每一个数是奇数，偶数肯定不是素数
			m = (int)Math.sqrt(i); //算出要检查的数的平方根，赋值给m
			h = true;			   //定义的布尔型变量来标记是否是素数
			for(j=2;j<=m;j++) {    //创造一个从2到平方根以内的全部数
				if(i%j==0) {       //检查要检查的数是否能被该奇数平方根以内的非1整数整除
					h=false;       //能被整除，说明不是素数，h置false
					break;         //证明不是素数就直接跳出
				}
			}
			if(h) {				   //如果h的值是true，代表该数是素数
				if(n%6==0) {       //n代表找出素数的数目，n能整除6代表一行已经满了，要换行，这样打印出的结果好看
						System.out.println("");// println与print相比的不同是前者要换行，后者不用
				}
					System.out.print(i+"\t");  //输出素数，后面加tab与后面的素数隔开
					n++;					   //素数的个数增加
				}
			}
		}
	}