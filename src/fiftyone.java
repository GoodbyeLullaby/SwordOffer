import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/4/27
 */

public class fiftyone {
	public int[] multiply(int[] A) {

		int B[]=new int[A.length];
		if(A.length==0)
			return B;
		int temp=1;
		B[0]=1;
		for(int i=1;i<A.length;i++){
			temp*=A[i-1];
			B[i]=temp;
		}
		temp=1;
		for(int i=A.length-2;i>=0;i--){
			temp*=A[i+1];
			B[i]=B[i]*temp;
		}
		return B;
	}
	@Test
	public void test(){
		int arr[]={};
		System.out.println(Arrays.toString(multiply(arr)));
	}
}
