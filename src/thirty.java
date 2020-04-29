import org.junit.Test;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/4/9
 */

public class thirty {
	private int array[];
	private int result[];
	public int FindGreatestSumOfSubArray(int[] array) {
		if(array==null||array.length<=0)
			return 0;
		this.array=array;
		this.result=new int[array.length];
		maxEnd(array.length - 1);
		int temp=0;
		for(int i=0;i<array.length;i++){
			if(temp<result[i]){
				temp=result[i];
			}
		}
		if(temp==0){
			temp=array[0];
			for(int i=1;i<array.length;i++){
				if(temp<array[i]){
					temp=array[i];
				}
			}
		}
		return temp;
	}

	private int maxEnd( int i) {
		if (i <= 0) {
			result[0]=array[0] < 0 ? 0 : array[0];
			return result[0];
		}
		int temp=maxEnd(i-1)+array[i];
		result[i]= temp<0?0:temp;
		return result[i];
	}
	@Test
	public void test(){
		int arr[]={1,-2,3,10,-4,7,2,-5};
		System.out.println(FindGreatestSumOfSubArray(arr));
	}
}
