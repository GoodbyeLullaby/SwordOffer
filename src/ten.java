/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/3/25
 */

public class ten {
	public int RectCover(int target) {
		if(target<1){
			return 0;
		}
		if(target<2){
			return 1;
		}
		int f1=1;
		int f2=2;
		int sum=2;
		for(int i=2;i<target;i++){
			sum=f1+f2;
			f1=f2;
			f2=sum;
		}
		return sum;
	}
}
