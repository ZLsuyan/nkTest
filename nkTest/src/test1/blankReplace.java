package test1;
/**
 * @author zengli
 * @date 2016/4/5
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy则经过替换之后的字符串为We%20Are%20Happy。
 */
public class blankReplace {
    public String replaceSpace(StringBuffer str) {
    	//将StringBuffer对象转换为字符数组
    	char[] ch = str.toString().toCharArray();
//    	System.out.println(ch);
    	//获取字符数组中空格的个数·
    	int blankNum = 0;
    	for(int i=0;i<ch.length;i++){
    		if(ch[i]==' '){
    			blankNum++;
    		}
    	}
//    	System.out.println(blankNum);
    	//每一个空格替换成'%' '2' '0'三个字符，因此每出现一个空格都会增加2倍的blankNum的长度
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
