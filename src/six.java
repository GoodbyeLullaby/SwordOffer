/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/3/25
 */

public class six {
	public int minNumberInRotateArray(int [] array) {
		int len=array.length;
		for(int i=0;i<len-1;i++){
			if(array[i]>array[i+1]){
				return array[i+1];
			}
		}
		return array[0];
	}
}
