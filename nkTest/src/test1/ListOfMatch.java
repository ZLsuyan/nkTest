package test1;

/**
 * ���Ǻ������ӵ�һ���򵥵ر���⣺
 * ��Ŀ���⣺�����ӽ��б������������ˡ��׶���a,b,c���ˣ��Ҷ���x,y,z����
 *          �Գ�ǩ���������������������Ա����������������a˵������x
 *          �ȣ�c˵������x,z�ȣ������ҳ��������ֵı���������
 * @author zengli
 * @date 2016/5/14
 */
public class ListOfMatch {
	public static void main(String[] args) {
		for(char i = 'x';i <= 'z';i++){
			for(char j = 'x';j <= 'z';j++){
				if(i!=j){
					for(char k = 'x';k <= 'z';k++){
						if(i!=k&&j!=k){
							if(i!='x'&&k!='x'&&k!='z'){
								System.out.println("Order is a--"+i+", b--"+j+", c--"+k);
							}
						}
					}
				}
			}
		}
	}
}
