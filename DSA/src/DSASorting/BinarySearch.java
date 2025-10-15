package DSASorting;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {5,7,9,11,13};
		int target=13;
		int result=BinarySearch(nums,target);
		if(result!=-1) {
			System.out.println("At index:"+result);
		}else {
			System.out.println("Element not found ");
		}
		
 
	}

	private static int BinarySearch(int[] nums, int target) {
		// TODO Auto-generated method stub
		int left=0;
		int right=nums.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(nums[mid]==target) {
				return mid;
			}else if(nums[mid]<target) {
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
		return -1;
	}

	

}
