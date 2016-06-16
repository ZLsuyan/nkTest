package sort;

import java.util.Random;

/**
 * 快速排序
 * @author zengli
 * @Date 2016/3/1
 */
public class QuickSort {
	/**
	 * 快速排序
	 * @param sorted
	 */
	public static void quickSort(int[] list,int low,int high) {
		if(low < high) {
			//将list数组一分为二
			int middle = getMiddle(list,low,high);
			//对低字表进行递归排序
			quickSort(list,low,middle-1);
			//对高字表进行递归排序
			quickSort(list,middle+1,high);
		}
	
	}
	
	/**
	 * 返回中轴的位置
	 * @param sorted
	 * @param low
	 * @param high
	 * @return
	 */
	public static int getMiddle(int[] list ,int low,int high) {
		//数组的第一个作为中轴
		int temp = list[low];
		while(low < high) {
			while(low < high && high >= temp) {
				high--;
			}
			//比中轴小的记录移动到低端
			list[low] = list[high];
			while(low < high && list[low] <= temp) {
				low++;
			}
			//比中轴大的移动到高端
			list[high] = list[low];	
		}
		//中轴记录到尾
		list[low] = temp;
		//返回中轴的位置
		return low;
	}
	
	
	/**
	 * 主函数
	 * @param args
	 */
	public static void main(String[] args) {
		Random random = new Random();
		int arraysize = 10;
		int[] list = new int[arraysize];
		for(int i = 0;i < list.length;i++) {
			list[i] = random.nextInt(100);
		}
		System.out.println("排序之前：");
		for(int i = 0;i < list.length;i++) {
			System.out.print(list[i]+" ");
		}
		
		quickSort(list,0,list.length-1);
		
		System.out.println();
		System.out.println("排序之后：");
		for(int i = 0;i < list.length;i++) {
			System.out.print(list[i]+" ");
		}
	}
}