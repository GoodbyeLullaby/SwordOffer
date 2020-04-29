import org.junit.Test;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/4/23
 */

public class fortyfour {
	public String ReverseSentence(String str) {
		if(str.length()==0)
			return str;
		StringBuilder sb=new StringBuilder(str);
		StringBuilder res=new StringBuilder("");
		int q=sb.length();
		int p=0;
		sb.append(' ');
		for(int i=sb.length()-2;i>=0;i--){
			if(sb.charAt(i)==' '){
				p=i;
				res.append(sb.substring(p+1,q+1));
				q=i;
			}
		}
		p=0;
		res.append(sb.substring(p,q));
		return res.toString();
	}
	@Test
	public void test(){
		System.out.println(ReverseSentence("I am a student."));
	}
}
