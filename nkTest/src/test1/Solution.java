package test1;

public class Solution{
	public static int[] mergeSort(int[] score1,int[] score2){
		int len = score1.length+score2.length;
		int[] score = new int[len];
		System.out.println(score1.toString());
		for(int i=0;i<score1.length;i++){
			score[i] = score1[i];
		}
		for(int j=score1.length;j<score.length;j++){
			score[j] = score2[j-score1.length];
		}
		quickSort(score,0,score.length-1);
		return score;
	}
	
	
	public static void quickSort(int[] score,int low,int high) {
		if(low < high) {
			//��score����һ��Ϊ��
			int middle = getMiddle(score,low,high);
			//�Ե��ֱ���еݹ�����
			quickSort(score,low,middle-1);
			//�Ը��ֱ���еݹ�����
			quickSort(score,middle+1,high);
		}
	
	}
	
	/**
	 * ���������λ��
	 * @param sorted
	 * @param low
	 * @param high
	 * @return
	 */
	public static int getMiddle(int[] score ,int low,int high) {
		//����ĵ�һ����Ϊ����
		int temp = score[low];
		while(low < high) {
			while(low < high && high >= temp) {
				high--;
			}
			//������С�ļ�¼�ƶ����Ͷ�
			score[low] = score[high];
			while(low < high && score[low] <= temp) {
				low++;
			}
			//���������ƶ����߶�
			score[high] = score[low];	
		}
		//�����¼��β
		score[low] = temp;
		//���������λ��
		return low;
	}
	
	
	public static void main(String[] args) {
		int[] score1={98,87,76,55,23};
		int[] score2={98,86,65,54,23};
		int[] score = new int[score1.length+score2.length];
		score = Solution.mergeSort(score1, score2);
		for(int i = 0;i<score.length;i++){
			System.out.print(score[i] +" ");
		}
	}
}