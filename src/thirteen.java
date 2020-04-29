import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/3/25
 */

public class thirteen {

	public void reOrderArray(int [] array) {
		int len=array.length;
		int i=0;
		while(i<len){
			if(array[i]%2==1){
				i++;
			}else {
				move(array,i);
			}
		}
	}

	public void move(int[] array, int i) {
		int temp=array[i];
		for(int j=i;j<array.length-1;j++){
			array[j]=array[j+1];
		}
		array[array.length-1]=temp;
	}

	@Test
	public void test(){
		int[] arr={1,2,3,4,5,6,7};
		reOrderArray(arr);
		System.out.println(Arrays.toString(arr));
	}
}
