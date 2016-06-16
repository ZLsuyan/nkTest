package sort;

import java.util.Random;

/**
 * 插入排序
 * @author zengli
 * @Date 2016/3/1
 */
public class InsertionSort {
	/**
	 * 直接插入排序
	 * @param sorted
	 */
	public void straightInsertionSort(double [] sorted) {
		int sortedLen  = sorted.length;
		for(int j = 2;j < sortedLen;j++) {
			if(sorted[j] < sorted[j-1]) {
				//将后面那个的数据备份到0位置当哨兵
				sorted[0] = sorted[j];
				//前面的那个后移
				sorted[j] = sorted[j-1];
				int insertPos = 0;
				for(int k = j-2;k >= 0;k--) {
					/*
					 * 若空余位置的前一个位置，即j-2位置及之前的位置的元素值比哨兵要大，
					 * 那么将前面的元素依次后移
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
	 * 希尔排序中的直接插入排序
	 * @param sorted
	 * @param inc
	 */
	public void shellInsertionSort(double [] sorted,int inc) {
		int sortedLen = sorted.length;
		for(int j = inc+1;j <sortedLen;j++) {
			if(sorted[j] < sorted[j-inc]) {
				//将后面那个的数据备份到0位置当哨兵
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
	 * 希尔排序（增量排序）
	 * 先将整个待排记录序列分割成若干个子序列分别进行直接插入排序，
	 * 待整个序列中的记录基本有序时，再对全体记录进行一次直接插入排序
	 * @param sorted
	 */
	public void shellInsertinSort(double [] sorted) {
		int[] incs = {7,5,3,1};
		int num = incs.length;
		
		int inc = 0;
		for(int j = 0;j < num;j++) {
			inc = incs[j];
			//调用希尔排序中的直接插入排序
			shellInsertionSort(sorted,inc);
		}
	}
	 
	/**
	 * 主函数
	 * @param args
	 */
	public static void main(String[] args) {
		Random random = new Random();
		//待排序列长度20+哨兵0位置=21
		int arraysize = 21;
		double [] sorted = new double [arraysize];
		System.out.println("排序之前：");
		for(int j = 1;j < arraysize;j++) {
			sorted[j] = (int)(random.nextDouble()*100);
			System.out.print((int)sorted[j]+" ");
		}
		System.out.println();
		
		InsertionSort sorter = new InsertionSort();
//		sorter.straightInsertionSort(sorted);
		sorter.shellInsertinSort(sorted);
		
		System.out.println("排序之后：");
		for(int j = 1;j < sorted.length;j++) {
			System.out.print((int)sorted[j]+" ");
		}
		System.out.println();
	}
	
}
