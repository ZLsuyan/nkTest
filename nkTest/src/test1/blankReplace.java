package test1;
/**
 * @author zengli
 * @date 2016/4/5
 * ��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20�������磬���ַ���ΪWe Are Happy�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 */
public class blankReplace {
    public String replaceSpace(StringBuffer str) {
    	//��StringBuffer����ת��Ϊ�ַ�����
    	char[] ch = str.toString().toCharArray();
//    	System.out.println(ch);
    	//��ȡ�ַ������пո�ĸ�����
    	int blankNum = 0;
    	for(int i=0;i<ch.length;i++){
    		if(ch[i]==' '){
    			blankNum++;
    		}
    	}
//    	System.out.println(blankNum);
    	//ÿһ���ո��滻��'%' '2' '0'�����ַ������ÿ����һ���ո񶼻�����2����blankNum�ĳ���
    	int newLen = 2*blankNum+ch.length-1;
    	char[] ch1 = new char[newLen+1];
    	for(int i=ch.length-1;i>=0;i--){
    		if(ch[i]!=' '){
    			ch1[newLen--] = ch[i];
    		}else{
    			ch1[newLen--] = '0';
    			ch1[newLen--] = '2';
    			ch1[newLen--] = '%';
    		}
    	}
		return String.valueOf(ch1);
    	
    }
    
    public static void main(String[] args) {
		blankReplace s = new blankReplace();
		StringBuffer str = new StringBuffer("who are you ?");
		System.out.println(s.replaceSpace(str));
	}
}
