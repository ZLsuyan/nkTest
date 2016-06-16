package test1;
import java.io.*;

/**
 * 计算字符串最后一个单词的长度，单词以空格隔开
 * @author zengli
 * @date 2016/4/6
 */
public class lastWord {
	public int lastWordNum(String str){
//		System.out.println(str.length());
		char[] ch = new char[str.length()];
		ch = str.toCharArray();
//		System.out.println(ch.length);
		int num=0;
		for(int i = ch.length-1;i>=0;i--){
			if(ch[i]!=' '){
				num+=1;
			}else{
				break;
			}
		}
		
		return num;
	}
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入一串字符串：");
		String str = null;
		try{
			str = br.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		lastWord lw = new lastWord();
		System.out.println(lw.lastWordNum(str));
	}
	
}
