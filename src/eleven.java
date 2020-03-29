/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/3/25
 */

public class eleven {
	//妈的，绝了
	public int NumberOf1(int n) {
		int count=0;
		while (n!=0){
			count++;
			n=n&(n-1);
		}
		return count;
	}
}
