/**
二倍法投注，筛子游戏
分析：
次数	投入（元）	总投入	总回报（5倍回报）	纯收益
1		2			2		10					8
2		4			6		20					14
3		8			14		40					26
4		16			30		80					50
5		32			62		160					98
需要定义5个变量
*/
import java.util.Scanner;
import java.util.Random;
public class Test{
	public static void main(String[] args){
		
		game();		
	}
	
	public static void game(){
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		// 接收用户的倍投输入，必须是1-6，其他一律重复输入直到正确为止
		System.out.println("请输入要投注的号码：（1-6）");
		int choice = input.nextInt();
		boolean flag = true;
		while(flag){
			switch(choice){
				case 1:
					flag = false;
					break;
				case 2:
					flag = false;
					break;
				case 3:
					flag = false;
					break;
				case 4:
					flag = false;
					break;
				case 5:
					flag = false;
					break;
				case 6:
					flag = false;
					break;
				default :
					flag = true;
					System.out.println("请输入要投注的号码：（1-6）");
					choice = input.nextInt();
					break;
			}
		}
		
		
		int count = 1;//投次数
		float next = 1;//倍投金额（2的倍数）
		float inSum = 0;//总投入
		float out = 0;//总中奖
		float income = 0;//纯收益
		while(true){
			float nextFloat = random.nextInt(6)+1;
			System.out.print("第："+count+"次投注，投注号码："+choice+",本期中奖号码："+nextFloat);
			next = next * 2f;// 每投一注2元，若不中奖则加倍投入
			inSum += next;
			if(choice == nextFloat){
				out = next * 5f;// 中奖倍率为5倍，可调
				income = out - inSum;
				System.out.println("，中奖了！\n总投入："+inSum+"元，总中奖："+out+"元，纯收益："+income+"元");
				break;
			}else{
				System.out.println("，没中奖！");
			}
			count++;
		}
	}
		
}


