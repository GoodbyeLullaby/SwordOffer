import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/4/10
 */

public class thirtytwo2 {
	public String PrintMinNumber(int[] numbers) {
		return "";
	}

	public void quickSort(int[] numbers, int low, int high) {
		//x为临时存放值
		int key = numbers[low];
		int p = low;
		int q = high;
		while (p < q) {
			//需要找到一个小于x的时候，退出当前j--循环
			while (p < q && key <= numbers[q]) {
				q--;
			}
			if (p < q) {
				numbers[p] = numbers[q];
				p++;
			}
			//需要找到一个大于等于x的时候，退出当前i++循环
			while (p < q && key > numbers[p]) {
				p++;
			}
			if (p < q) {
				numbers[q] = numbers[p];
				q--;
			}
		}
		numbers[p] = key;
		//递归退出的条件
		if (p - 1 > low)
			quickSort(numbers, low, p - 1);
		if (p + 1 < high)
			quickSort(numbers, p + 1, high);
	}

	@Test
	public void test() {
		int arr[] = {1, 3, 9, 0, 14, 2};
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, 5);
		System.out.println(Arrays.toString(arr));
	}
}
