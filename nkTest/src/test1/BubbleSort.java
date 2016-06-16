package sort;

import java.util.Random;

/**
 * 冒泡排序
 * @author zengli
 * @Date 2016/3/1
 */
public class BubbleSort {
	/**
	 *  冒泡排序
     * 该算法专门针对已部分排序的序列
     * 交换相邻元素
	 * @param sorted
	 */
	public static void bubbleSort(double[] sorted){
		int temp = 0;
		for(int i = 0;i < sorted.length-1;i++) {
			for(int j = 0;j <sorted.length-1-i;j++) {
				if(sorted[j] > sorted[j+1]) {
					temp = (int)sorted[j];
					sorted[j] = sorted[j+1];
					sorted[j+1] = temp;
				}
			}
		}
	}
	
	/**
	 * 主函数
	 * @param args
	 */
	public static void main(String[] args) {
		Random random = new Random();
		int arraysize = 10;
		double[] sorted = new double[arraysize];
		for(int i = 0;i < arraysize;i++) {
			sorted[i] = (int)(random.nextDouble()*100);
		}
		System.out.println("排序之前：");
		for(int i = 0;i < sorted.length;i++) {
			System.out.print((int)sorted[i]+" ");
		}
		bubbleSort(sorted);
		System.out.println();
		System.out.println("排序之后：");
		for(int i = 0;i < sorted.length;i++) {
			System.out.print((int)sorted[i]+" ");
		}
	}
}