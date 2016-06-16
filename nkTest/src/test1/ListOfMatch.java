package test1;

/**
 * 这是恒生电子的一道简单地编程题：
 * 题目大意：两个队进行比赛，各出三人。甲队有a,b,c三人，乙队有x,y,z三人
 *          以抽签决定比赛名单。有人向队员大厅比赛的名单，a说他不跟x
 *          比，c说他不跟x,z比，请编程找出三队赛手的比赛名单。
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
