import org.junit.Test;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/3/25
 */

public class night {

	public int JumpFloorII(int target) {
		if(target<=1){
			return 1;
		}
		java.util.List<Integer> list=new java.util.ArrayList<>();
		list.add(1);
		list.add(2);
		int sum=0;
		for(int i=1;i<target;i++){
			sum=0;
			for(int j=0;j<list.size();j++){
				sum+=list.get(j);
			}
			list.add(sum+1);
		}
		return list.get(target-1);
	}
	public int JumpFloorII2(int target) {
		if(target<=1){
			return 1;
		}
		int temp=1;
		int sum=1;
		for(int i=1;i<target;i++){
			temp=sum+1;
			sum=sum+temp;
		}
		return temp;
	}
	@Test
	public void test(){
		System.out.println(JumpFloorII(3));
	}
}
