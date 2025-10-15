package DSASorting;

public class SelectionSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {5,9,4,2,3,1};
		int size=nums.length;
		int temp=0;
		int minIndex=-1;
		
		System.out.println("Before Sorting");
		for(int n1:nums) {
			System.out.println(n1);
		}
		for(int i=0;i<size;i++) {
			minIndex=i;
			for(int j=i+1;j<size;j++) {
				if(nums[minIndex]>nums[j]) {
					minIndex=j;
				}
				temp=nums[minIndex];
				nums[minIndex]=nums[i];
				nums[i]=temp;
				
			}
			
		}
		
		
		
		System.out.println();
		System.out.println("After Sorting");
		for(int n2:nums) {
			System.out.println(n2);
		}

	}

}
