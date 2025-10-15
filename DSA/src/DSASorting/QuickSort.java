package DSASorting;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,7,5,2,3,6};
		quickSort(arr,0,arr.length-1);
		for(int n : arr) {
			System.out.print(n+ " ");
		}

	}

	private static void quickSort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if(low<high) {
			int pi=partition(arr,low,high);
			quickSort(arr,0,pi-1);
			quickSort(arr,pi+1,high);
			
		}
		
	}

	private static int partition(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<=high;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
	}

}
