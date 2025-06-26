package com_day13;

public class MergesortExample {
	public static void mergeSort(int []arr,int left,int right )
	{
	 if(left<right) {
		 //find middle
		 int mid=left+(right-left)/2;
		 mergeSort(arr,left,mid);
		 mergeSort(arr,mid+1, right);
		 merge(arr,left,mid,right);
		 
		 //merge the sorted halves
		 
	 }
	}
	public static void merge(int []arr,int left,int mid,int right) {
		
		int num1=mid-left+1;
		int num2=right-mid;
		
		int []leftarr= new int[num1];
		int [] rightarr= new int[num2];
		
		//copy data to temprory array
		for(int i=0;i<num1;i++)
		{
			leftarr[i] = arr[left+i];
		}
		for(int j=0;j<num2;j++)
		{
			rightarr[j]=arr[mid+1+j];
		}
		
		//merge the temp arrays
		int i=0,j=0;
		int k=left;
		while(i<num1 && j<num2) {
			if(leftarr[i]<=rightarr[j]) {
				arr[k]=leftarr[i];
				i++;
			}
			else
			{
				arr[k]=rightarr[j];
				j++;
			}
			k++;
		}
		while(i<num1)
		{
			arr[k]=leftarr[i];
			i++;
			k++;
		}
		while(j<num2)
		{
			arr[k]=rightarr[j];
			j++;
			k++;
		}
	}
	
	
	
	public static void printArray(int [] arr) {
		for(int value:arr) {
			System.out.print(value + " ");
			//
		}
		
	}
  public static void main(String[] args) {
	
	  int [] arr= {6,3,9,5,2,8};
	  System.out.println("Original Array");
	  printArray(arr);
	  mergeSort(arr,0,arr.length-1);
	  System.out.println();
	  System.out.println("sorted array");
	  printArray(arr);
	  
	  
}
}
