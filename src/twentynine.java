import org.junit.Test;

import java.util.ArrayList;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/4/9
 */

public class twentynine {
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		ArrayList<Integer> result=new ArrayList<Integer>();
		if(input==null||input.length>k){
			return result;
		}

		for(int i=0;i<k;i++){
			result.add(Integer.MAX_VALUE);
		}
		for(int i=0;i<input.length;i++){
			if(input[i]<result.get(k-1)){
				for(int j=0;j<k;j++){
					if(input[i]<result.get(j)){
						result.add(j,input[i]);
						result.remove(k);
						break;
					}
				}
			}
		}
		return result;
	}
	@Test
	public void test(){
		int arr[]={4,5,1,6,2,7,3,8};
		System.out.println(GetLeastNumbers_Solution(arr, 0));
	}
}
