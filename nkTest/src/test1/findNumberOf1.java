package test1;
import java.io.IOException;
import java.util.Scanner;;

public class findNumberOf1 {
	public static int findNumOf1(int num){
		int remiander  = 0;
		StringBuilder sb = new StringBuilder("");
		/**
		 * 将十进制数转换为二进制数
		 * 每次将计算得到的余数作为二进制逆序的结果
		 * 将num/2得到的商作为下一次的num接着计算
		 */
		while(num!=0){
			remiander = num % 2;
			sb.insert(0, remiander);
			num/=2;
		}
		
		char[] ch = new char[sb.length()];
		ch = sb.toString().toCharArray();

		//进行逐一匹配
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
		//循环测试
        while (scan.hasNextInt()){
            num = scan.nextInt();
            System.out.println(findNumOf1(num));
        }				
	}
}
