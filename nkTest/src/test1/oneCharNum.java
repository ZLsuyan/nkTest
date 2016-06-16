package test1;
import java.io.*;

/**
 * 写出一个程序，接受一个有字母和数字以及空格组成的字符串，和一个字符；
 * 然后输出 输入的字符串中含有该字符的个数。不区分大小写。
 * @author zengli
 * @date 2016/4/6
 */
public class oneCharNum {
	public int charNum(String str,char s){
		int num = 0;
		//将输入的字符串转换为数组
		char[] ch = new char[str.length()];
		ch = str.toCharArray();

		//将字符串数组中的所有的小写元素全部转换为大写
		for(int i = 0;i < ch.length;i++){
			if(ch[i]>=92&&ch[i]<=122){
				ch[i] = (char) (ch[i]-32);
			}				
		}
		
		//不管输入的单个字符的大小写，统一将它转换为大写
		if(s >= 97&&s <= 122){
			s = (char)(s-32);
//			System.out.println(s);
		}
		
		//逐一匹配
		for(int i=0;i<ch.length;i++){
			if(ch[i]==s){
				num++;
			}
		}
		
		return num;
	}
	
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		char s=0;
		//随意输入一串字母、数字、以及空格的字符串
		try{
			System.out.println("请随意输入一串字母、数字、以及空格的字符串：");
			str = br.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		//输入一个字母
		try{
			System.out.println("请输入一个字母：");
			s = (char) br.read();
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println(new oneCharNum().charNum(str,s));
		
 }
}
