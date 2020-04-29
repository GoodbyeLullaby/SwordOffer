import java.util.ArrayList;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/4/23
 */

public class fortytwo {
	public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
		int p=0,q=array.length-1;
		ArrayList<Integer> list=new ArrayList<>();
		while (p<q){
			if(array[p]+array[q]==sum){
				list.add(array[p]);
				list.add(array[q]);
				return list;
			}else if(array[p]+array[q]<sum){
				p++;
			}else{
				q--;
			}

		}
		return list;
	}
}
