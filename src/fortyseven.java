/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/4/27
 */

public class fortyseven {
	public int Sum_Solution(int n) {
		int sum=n;
		boolean flag=(sum>0)&&(sum+=Sum_Solution(n-1))>0;
		return sum;
	}
}
