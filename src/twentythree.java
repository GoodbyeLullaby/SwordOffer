import org.junit.Test;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/3/28
 */

public class twentythree {
	public boolean VerifySquenceOfBST(int [] sequence) {
		if(sequence==null||sequence.length==0)
			return false;
		return check(sequence, sequence.length-1,0);
	}

	public boolean check(int[] sequence, int end,int front) {
		if(end<=front)
			return true;
		int index=-1;
		for(int i=end-1;i>=front;i--){
			if(sequence[end]>sequence[i]){
				index=i;
				break;
			}
		}
		if(index==-1)
			return check(sequence,end-1,front);
		else{
			for(int i=index;i>=front;i--){
				if(sequence[end]<sequence[i]){
					return false;
				}
			}
			return check(sequence, index,front)&&check(sequence, end-1,index+1);
		}

	}
	@Test
	public void test(){
		int arr[]={4,8,6,12,16,14,10};
		System.out.println(VerifySquenceOfBST(arr));
	}
}
