package ������;

import java.lang.reflect.Array;
import java.util.Arrays;

public class E6_27 {
	public static void main(String[] args) {
		int[] arr= {9,8,3,5,2};
		System.out.print("����ǰ:");
		printArray(arr);
		Arrays.sort(arr);
		System.out.print("�����:");
		printArray(arr);
		int index=Arrays.binarySearch(arr,3);
		System.out.println("Ԫ��3��������:"+index);
		int[] copied=Arrays.copyOfRange(arr,1,7);
		for(int x=0;x<arr.length;x++) {
			System.out.print(copied[x]+" ");
		}
		Arrays.fill(arr,8);
		for(int x=0;x<arr.length;x++) {
			System.out.println(x+":"+arr[x]);
		}
}

	private static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0;x<arr.length;x++) {
			if(x !=arr.length-1) {
				System.out.print(arr[x]+",");
			}else {
				System.out.println(arr[x]+"]");
			}
		}
	}
	
}
