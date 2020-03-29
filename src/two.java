import org.junit.Test;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/3/24
 */

public class two {
	public String replaceSpace(StringBuffer str) {
		int len=str.length();
		char arr[]=str.toString().toCharArray();
		StringBuffer sb=new StringBuffer("");
		for(int i=0;i<len;i++){
			if(str.charAt(i)==' '){
				sb.append("%20");
			}else {
				sb.append(arr[i]);
			}
		}
		return sb.toString();
	}
	@Test
	public void test(){

	}
}
