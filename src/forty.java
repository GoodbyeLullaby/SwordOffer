import java.util.ArrayList;
import java.util.HashSet;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/4/23
 */

public class forty {
	public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<array.length;i++){
			if(set.contains(array[i])){
				set.remove(array[i]);
			}else {
				set.add(array[i]);
			}
		}
		ArrayList<Integer> list=new ArrayList<>(set);
		num1[0]=list.get(0);
		num2[0]=list.get(1);
	}
}
