package test1;
import java.io.IOException;
import java.util.Scanner;;

public class findNumberOf1 {
	public static int findNumOf1(int num){
		int remiander  = 0;
		StringBuilder sb = new StringBuilder("");
		/**
		 * ��ʮ������ת��Ϊ��������
		 * ÿ�ν�����õ���������Ϊ����������Ľ��
		 * ��num/2�õ�������Ϊ��һ�ε�num���ż���
		 */
		while(num!=0){
			remiander = num % 2;
			sb.insert(0, remiander);
			num/=2;
		}
		
		char[] ch = new char[sb.length()];
		ch = sb.toString().toCharArray();

		//������һƥ��
		int sum = 0;
		for(int i=0;i<ch.length;i++){
			if(ch[i]=='1'){
				sum++;
			}
		}
	
		return sum;
		
		
	}
	
	public static void main(String[] args) throws IOException {
		int num = 0;
		Scanner scan = new Scanner(System.in);
		//ѭ������
        while (scan.hasNextInt()){
            num = scan.nextInt();
            System.out.println(findNumOf1(num));
        }				
	}
}
