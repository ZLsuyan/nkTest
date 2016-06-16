package test1;

public class findTarget {
	public static boolean Find(int [][] array,int target) {
		boolean flag = false;
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[0].length;j++){
				if(array[i][j]==target){
					flag = true;
					return flag;
				}else{
								
				}
			}
		}
		
		return flag;
	}
	
	public static void main(String[] args) {
		int[][] array = {{1,2,3,4},{2,4,5,7},{3,5,6,9}};
		int target = 8;
		boolean flag = Find(array,target);
		System.out.println(flag);
	}
}
