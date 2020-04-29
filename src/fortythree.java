import org.junit.Test;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/4/23
 */

public class fortythree {
	public String LeftRotateString(String str,int n) {
		if(str.length()==0){
			return str;
		}
		n=n%str.length();
		return str.substring(n)+str.substring(0,n);
	}
	@Test
	public void test(){
		System.out.println(LeftRotateString("",2));
	}
}
