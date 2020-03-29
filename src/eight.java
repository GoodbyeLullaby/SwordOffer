/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/3/25
 */

public class eight {
	int sum=0;
	//递归
	public int JumpFloor(int target) {
		if(target==1){
			sum++;
		}else if(target==2){
			sum+=2;
		}else {
			JumpFloor(target-1);
			JumpFloor(target-2);
		}
		return sum;
	}
	//非递归
	public int JumpFloor2(int target) {
		if(target<=1){
			return 1;
		}
		int a=1,b=1;
		int sum=1;
		for(int i=1;i<target;i++){
			sum=a+b;
			a=b;
			b=sum;
		}
		return sum;
	}
}
