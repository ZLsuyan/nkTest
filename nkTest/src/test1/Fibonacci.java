package test1;
import java.util.Scanner;

/**
 * ���õݹ����Fibonacci���ĵڼ�λ���Ƕ���
 * @author zengli
 * @date 2016/4/12
 */
public class Fibonacci {
	public int f(int n){
		if(n==1||n==2){
			return 1;
		}else{
			return f(n-1)+f(n-2);
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Fibonacci fb = new Fibonacci();
		while(s.hasNextInt()){
			int n = s.nextInt();
			System.out.println(fb.f(n));
		}
	}
}
