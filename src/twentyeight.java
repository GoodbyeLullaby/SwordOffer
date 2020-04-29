/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/4/9
 */

public class twentyeight {
	public int MoreThanHalfNum_Solution(int [] nums) {
		int flag=0,temp=0;
		for(int i=0;i<nums.length;i++){
			if(flag<=0){
				temp=i;
				flag++;
			}else {
				if(nums[temp]==nums[i]){
					flag++;
				}else {
					flag--;
				}
			}
		}
		flag=0;
		for(int i=0;i<nums.length;i++){
			if(nums[temp]==nums[i]){
				flag++;
			}
		}
		if(flag>nums.length/2){
			return nums[temp];
		}else {
			return 0;
		}
	}
}
