import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/4/10
 */

public class thirtytwo {
	public String PrintMinNumber(int[] numbers) {
		if(numbers==null||numbers.length<=0)
			return "";
		quickSort(numbers, 0, numbers.length-1);
		StringBuffer sb=new StringBuffer("");
		for(int i=0;i<numbers.length;i++){
			sb.append(numbers[i]);
		}
		return sb.toString();
	}

	public void quickSort(int[] numbers, int low, int high) {
		int p = low;
		int q = high;
		int key = numbers[low];
		while (p < q) {
			while (p < q && firstSmall(key,numbers[q])) {
				q--;
			}
			if (p < q) {
				numbers[p] = numbers[q];
				p++;
			}
			while (p < q && !firstSmall(key,numbers[p])) {
				p++;
			}
			if (p < q) {
				numbers[q] = numbers[p];
				q--;
			}
		}
		numbers[p] = key;
		if (p - 1 > low)
			quickSort(numbers, low, p - 1);
		if (p + 1 < high)
			quickSort(numbers, p + 1, high);
	}
	public boolean firstSmall(int a,int b){
		long minA=Long.parseLong(String.valueOf(a)+b);
		long minB=Long.parseLong(String.valueOf(b)+a);
		if(minA<=minB)
			return true;
		else
			return false;

	}
	@Test
	public void test() {
		int arr[] = {3334,3,3333332};
		System.out.println(Arrays.toString(arr));

		System.out.println(PrintMinNumber(arr));
	}
}
