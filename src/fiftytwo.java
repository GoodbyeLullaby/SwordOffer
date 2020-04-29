import org.junit.Test;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/4/27
 */

public class fiftytwo {
	public boolean match(char[] str, char[] pattern) {
		int i=0,j=0;
		return matchHelper(str,i,pattern,j);
	}

	public boolean matchHelper(char[] str, int i, char[] pattern, int j) {
		if(str.length==i&&pattern.length==j){
			return true;
		}else if(pattern.length==j) {
			return false;
		}

		boolean next=j+1<pattern.length&&pattern[j+1]=='*';
		if(next){
			if(i<str.length&&(str[i]==pattern[j]||pattern[j]=='.')){
				return matchHelper(str, i+1,pattern,j)||matchHelper(str, i, pattern, j+2);
			}else {
				return matchHelper(str, i, pattern, j+2);
			}
		}else {
			if(i<str.length&&(str[i]==pattern[j]||pattern[j]=='.')){
				return matchHelper(str,i+1,pattern,j+1);
			}else {
				return false;
			}
		}
	}

	@Test
	public void test(){
		char str[]="bcbbabab".toCharArray();
		char pattern[]=".*a*a".toCharArray();
		System.out.println(match(str, pattern));
	}
}
