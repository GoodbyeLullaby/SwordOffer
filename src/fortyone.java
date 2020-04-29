import org.junit.Test;

import java.util.ArrayList;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/4/23
 */

public class fortyone {
	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		int p=1,q=1;
		int temp=1;
		ArrayList<ArrayList<Integer>> result=new ArrayList<>();
		while (q<sum){
			if(temp<sum){
				q++;
				temp+=q;
			}else if(temp>sum){
				temp-=p;
				p++;

			}else {
				ArrayList<Integer> l=new ArrayList<>();
				for(int i=p;i<=q;i++){
					l.add(i);
				}
				result.add(l);
				temp-=p;
				p++;
			}
		}
		return result;
	}
	@Test
	public void test(){
		System.out.println(FindContinuousSequence(9));
	}
}
