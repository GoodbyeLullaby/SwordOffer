import org.junit.Test;

import java.util.ArrayList;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/4/23
 */

public class fortysix {
	public int LastRemaining_Solution(int n, int m) {
		if(n<=0)
			return -1;
		ArrayList<Integer> list=new ArrayList<>(n);
		for(int i=0;i<n;i++){
			list.add(i);
		}
		int index=0;
		while(n>1){
			index=(index+m-1)%n;
			list.remove(index);
			n--;
		}
		return list.get(0);
	}
	@Test
	public void test(){
		System.out.println(LastRemaining_Solution(5,3));
	}

}
