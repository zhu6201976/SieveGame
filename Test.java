/**
������Ͷע��ɸ����Ϸ
������
����	Ͷ�루Ԫ��	��Ͷ��	�ܻر���5���ر���	������
1		2			2		10					8
2		4			6		20					14
3		8			14		40					26
4		16			30		80					50
5		32			62		160					98
��Ҫ����5������
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
		
		// �����û��ı�Ͷ���룬������1-6������һ���ظ�����ֱ����ȷΪֹ
		System.out.println("������ҪͶע�ĺ��룺��1-6��");
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
					System.out.println("������ҪͶע�ĺ��룺��1-6��");
					choice = input.nextInt();
					break;
			}
		}
		
		
		int count = 1;//Ͷ����
		float next = 1;//��Ͷ��2�ı�����
		float inSum = 0;//��Ͷ��
		float out = 0;//���н�
		float income = 0;//������
		while(true){
			float nextFloat = random.nextInt(6)+1;
			System.out.print("�ڣ�"+count+"��Ͷע��Ͷע���룺"+choice+",�����н����룺"+nextFloat);
			next = next * 2f;// ÿͶһע2Ԫ�������н���ӱ�Ͷ��
			inSum += next;
			if(choice == nextFloat){
				out = next * 5f;// �н�����Ϊ5�����ɵ�
				income = out - inSum;
				System.out.println("���н��ˣ�\n��Ͷ�룺"+inSum+"Ԫ�����н���"+out+"Ԫ�������棺"+income+"Ԫ");
				break;
			}else{
				System.out.println("��û�н���");
			}
			count++;
		}
	}
		
}


