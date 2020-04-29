import org.junit.Test;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/4/10
 */

public class thirtyone {
	public int NumberOf1Between1AndN_Solution(int n) {
		int sum=0;
		for(int i=1;i<=n;i++){
			sum+=check(i);
		}
		return sum;
	}

	private int check(int i) {
		if(i==0)
			return 0;
		if(i%10==1){
			return check(i/10)+1;
		}else {
			return check(i/10);
		}

	}
	@Test
	public void test(){
		System.out.println(NumberOf1Between1AndN_Solution(55));
	}
}
