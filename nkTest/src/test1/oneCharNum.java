package test1;
import java.io.*;

/**
 * д��һ�����򣬽���һ������ĸ�������Լ��ո���ɵ��ַ�������һ���ַ���
 * Ȼ����� ������ַ����к��и��ַ��ĸ����������ִ�Сд��
 * @author zengli
 * @date 2016/4/6
 */
public class oneCharNum {
	public int charNum(String str,char s){
		int num = 0;
		//��������ַ���ת��Ϊ����
		char[] ch = new char[str.length()];
		ch = str.toCharArray();

		//���ַ��������е����е�СдԪ��ȫ��ת��Ϊ��д
		for(int i = 0;i < ch.length;i++){
			if(ch[i]>=92&&ch[i]<=122){
				ch[i] = (char) (ch[i]-32);
			}				
		}
		
		//��������ĵ����ַ��Ĵ�Сд��ͳһ����ת��Ϊ��д
		if(s >= 97&&s <= 122){
			s = (char)(s-32);
//			System.out.println(s);
		}
		
		//��һƥ��
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
		//��������һ����ĸ�����֡��Լ��ո���ַ���
		try{
			System.out.println("����������һ����ĸ�����֡��Լ��ո���ַ�����");
			str = br.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		//����һ����ĸ
		try{
			System.out.println("������һ����ĸ��");
			s = (char) br.read();
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println(new oneCharNum().charNum(str,s));
		
 }
}
