import org.junit.Test;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/4/23
 */

public class thirtyseven {
	public int GetNumberOfK(int [] array , int k) {
		if(array.length==0)
			return 0;
		int left=0;
		int right=array.length-1;
		int mid=(left+right)>>>1;
		int sum=-1;
		while(left<=right){
			mid=(left+right)>>>1;
			if(array[mid]==k){
				break;
			}else if(array[mid]<k){
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
		int mid2=mid;
		while (mid>=0&&array[mid]==k){
			sum++;
			mid--;
		}
		while (mid2<array.length&&array[mid2]==k){
			sum++;
			mid2++;
		}

		return sum==-1?0:sum;
	}
	@Test
	public void test(){
		int arr[]={3,3,3,3,4,5};
		System.out.println(GetNumberOfK(arr,3));
	}
}
