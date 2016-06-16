package sort;

import java.util.Random;

/**
 * ��������
 * @author zengli
 * @Date 2016/3/1
 */
public class InsertionSort {
	/**
	 * ֱ�Ӳ�������
	 * @param sorted
	 */
	public void straightInsertionSort(double [] sorted) {
		int sortedLen  = sorted.length;
		for(int j = 2;j < sortedLen;j++) {
			if(sorted[j] < sorted[j-1]) {
				//�������Ǹ������ݱ��ݵ�0λ�õ��ڱ�
				sorted[0] = sorted[j];
				//ǰ����Ǹ�����
				sorted[j] = sorted[j-1];
				int insertPos = 0;
				for(int k = j-2;k >= 0;k--) {
					/*
					 * ������λ�õ�ǰһ��λ�ã���j-2λ�ü�֮ǰ��λ�õ�Ԫ��ֵ���ڱ�Ҫ��
					 * ��ô��ǰ���Ԫ�����κ���
					 */
					if(sorted[k] > sorted[0]) {
						sorted[k+1] = sorted[k];
					}else {
						insertPos = k+1;
						break;
					}
				}
				sorted[insertPos] = sorted[0];
			}
		}
	}
	
	/**
	 * ϣ�������е�ֱ�Ӳ�������
	 * @param sorted
	 * @param inc
	 */
	public void shellInsertionSort(double [] sorted,int inc) {
		int sortedLen = sorted.length;
		for(int j = inc+1;j <sortedLen;j++) {
			if(sorted[j] < sorted[j-inc]) {
				//�������Ǹ������ݱ��ݵ�0λ�õ��ڱ�
				sorted[0] = sorted[j];
				int insertPos = j;
				for(int k = j-inc;k >= 0;k-=inc) {
					if(sorted[k] > sorted[0]) {
						sorted[k+inc] = sorted[k];
						if(k-inc <= 0) {
							insertPos = k;
						}
					}else {
						insertPos = k+inc;
						break;
					}
				}
				sorted[insertPos] = sorted[0];
			}
		}
	}
	
	/**
	 * ϣ��������������
	 * �Ƚ��������ż�¼���зָ�����ɸ������зֱ����ֱ�Ӳ�������
	 * �����������еļ�¼��������ʱ���ٶ�ȫ���¼����һ��ֱ�Ӳ�������
	 * @param sorted
	 */
	public void shellInsertinSort(double [] sorted) {
		int[] incs = {7,5,3,1};
		int num = incs.length;
		
		int inc = 0;
		for(int j = 0;j < num;j++) {
			inc = incs[j];
			//����ϣ�������е�ֱ�Ӳ�������
			shellInsertionSort(sorted,inc);
		}
	}
	 
	/**
	 * ������
	 * @param args
	 */
	public static void main(String[] args) {
		Random random = new Random();
		//�������г���20+�ڱ�0λ��=21
		int arraysize = 21;
		double [] sorted = new double [arraysize];
		System.out.println("����֮ǰ��");
		for(int j = 1;j < arraysize;j++) {
			sorted[j] = (int)(random.nextDouble()*100);
			System.out.print((int)sorted[j]+" ");
		}
		System.out.println();
		
		InsertionSort sorter = new InsertionSort();
//		sorter.straightInsertionSort(sorted);
		sorter.shellInsertinSort(sorted);
		
		System.out.println("����֮��");
		for(int j = 1;j < sorted.length;j++) {
			System.out.print((int)sorted[j]+" ");
		}
		System.out.println();
	}
	
}
