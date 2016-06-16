package sort;

import java.util.Random;

/**
 * ��������
 * @author zengli
 * @Date 2016/3/1
 */
public class QuickSort {
	/**
	 * ��������
	 * @param sorted
	 */
	public static void quickSort(int[] list,int low,int high) {
		if(low < high) {
			//��list����һ��Ϊ��
			int middle = getMiddle(list,low,high);
			//�Ե��ֱ���еݹ�����
			quickSort(list,low,middle-1);
			//�Ը��ֱ���еݹ�����
			quickSort(list,middle+1,high);
		}
	
	}
	
	/**
	 * ���������λ��
	 * @param sorted
	 * @param low
	 * @param high
	 * @return
	 */
	public static int getMiddle(int[] list ,int low,int high) {
		//����ĵ�һ����Ϊ����
		int temp = list[low];
		while(low < high) {
			while(low < high && high >= temp) {
				high--;
			}
			//������С�ļ�¼�ƶ����Ͷ�
			list[low] = list[high];
			while(low < high && list[low] <= temp) {
				low++;
			}
			//���������ƶ����߶�
			list[high] = list[low];	
		}
		//�����¼��β
		list[low] = temp;
		//���������λ��
		return low;
	}
	
	
	/**
	 * ������
	 * @param args
	 */
	public static void main(String[] args) {
		Random random = new Random();
		int arraysize = 10;
		int[] list = new int[arraysize];
		for(int i = 0;i < list.length;i++) {
			list[i] = random.nextInt(100);
		}
		System.out.println("����֮ǰ��");
		for(int i = 0;i < list.length;i++) {
			System.out.print(list[i]+" ");
		}
		
		quickSort(list,0,list.length-1);
		
		System.out.println();
		System.out.println("����֮��");
		for(int i = 0;i < list.length;i++) {
			System.out.print(list[i]+" ");
		}
	}
}