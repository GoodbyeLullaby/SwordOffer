import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/3/27
 */

public class nighteen {

	public ArrayList<Integer> printMatrix(int [][] matrix) {
		ArrayList<Integer> list=new ArrayList<>();
		int right=matrix[0].length-1;
		int bottom=matrix.length-1;
		int left=0;
		int top=1;
		int i=0,j=0;
		int flag=1;
		int total=(right+1)*(bottom+1);
		for (int count=0;count<total;count++){
			System.out.println(i+" "+j);
			list.add(matrix[j][i]);
			switch (flag){
				case 1:
					if(i<right){
						i++;
					}else {
						right--;
						j++;
						flag=2;
					}
					break;
				case 2:
					if(j<bottom){
						j++;
					}else {
						bottom--;
						i--;
						flag=3;
					}
					break;
				case 3:
					if(i>left){
						i--;
					}else {
						left++;
						j--;
						flag=4;
					}
					break;
				case 4:
					if(j>top){
						j--;
					}else {
						top++;
						i++;
						flag=1;
					}
					break;
			}

		}
		return list;
	}
	@Test
	public void test(){
		int arr[][]={{1},{2},{3},{4},{5}};
		System.out.println(printMatrix(arr));
	}
}
