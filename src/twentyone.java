import org.junit.Test;
import java.util.ArrayList;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/3/28
 */

public class twentyone {

	public boolean IsPopOrder(int [] pushA,int [] popA) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		int i=0,j=0;
		while(i<popA.length){
			if(!list.isEmpty()&&popA[i]==list.get(list.size()-1)){
				list.remove(list.size()-1);
				i++;
			}else {
				if(j>=pushA.length){
					break;
				}
				list.add(pushA[j]);
				j++;
			}
		}
		if(j>=pushA.length-1&&list.isEmpty()){
			return true;
		}else
			return false;
	}
	@Test
	public void test(){
		int []arr1={1,2,3,4,5};
		int []arr2={4,5,3,2,1};
		System.out.println(IsPopOrder(arr1,arr2));
	}
}
