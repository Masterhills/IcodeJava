package com.datastructure;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Trasversal
		int count = 0;
		int[] arr = {0,4,12};
		for(int i: arr) {
			if(i==0) {
				count+=1;
			}
		}
//		System.out.println(count);
//		traversal(arr);
		traversal(permzero(arr));
//		System.out.println(permzeros(arr));
//		traversal(deletionUnsorted(arr,3));
		
//   Insertion
		
	}
	public static void traversal(int[] arr) {
		for(int i:arr) {
			System.out.println(i);
		}
	}
	public static int[] Insertion(int[] arr, int insert_n, int position) {
		position-=1;
		if(position<=0 || position>arr.length) {
			System.out.println("Invalid position");
		}
		for(int i = arr.length -1; i>=position; --i) {
			arr[i] = arr[i-1];
		}
		arr[position] = insert_n;
		return arr;
	}
	public static int[] Deletion(int[] arr,int position) {
		position-=1;
		if(position<=0 || position>arr.length) {
			System.out.println("Invalid position");
		}
		for(int i = position; i<arr.length-1; ++i) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = 0;
		return arr;
	}
	public static int[] deletionUnsorted(int[] arr, int position) {
		position-=1;
		arr[position] = arr[arr.length-1];
		arr[arr.length-1] = 0;
		return arr;
	}
	public static int permzeros(int[] arr) {
		int count = 0;
		int j = arr.length-1;
		for(int i: arr) {
			if(i == 0) {
				while(i<arr.length-1) {
					arr[i] = arr[i+1];
					++i;
				}
				count+=1;
			}
			continue;
			
		}
//		while(count!=0) {
//			arr[j] = 0;
//			j--;
//			count-=1;
//		}
		return count;
	}
	public static int[] permzero(int[] arr) {
		int count = 0;
		int j = arr.length-1;
		for(int i = 0; i<arr.length-1; ++i) {
			if(arr[i] == 0) {
				int k = i;
				while(k<arr.length-1) {
					arr[k]= arr[k+1];						//{1,2,0,5,3,0,4}
															//{1,0,0,0,4}
					k++;
				}
				count++;
			}
		}
		while(count!=0) {
			arr[j] = 0;
			j--;
			count-=1;
		}
		return arr;
	}
}

