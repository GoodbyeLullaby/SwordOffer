import org.junit.Test;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/4/11
 */

public class thirtyfour {
	public int FirstNotRepeatingChar(String str) {
		if(str==null||str.length()<=0)
			return -1;
		int []arr=new int['z'+1];
		for(int i=0;i<str.length();i++){
			arr[str.charAt(i)]++;
		}
		for(int i=0;i<str.length();i++){
			if(arr[str.charAt(i)]==1){
				return i;
			}
		}
		return -1;
	}
	@Test
	public void test(){

		System.out.println('Z'-'z');
	}
}
