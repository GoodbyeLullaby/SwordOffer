import org.junit.Test;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/4/27
 */

public class fortynine {
	public int StrToInt(String str) {
		if(str.length()==0)
			return 0;
		int i=0;
		while (str.charAt(i)==' '){
			i++;
		}
		str=str.substring(i);
		long sum=0;
		boolean flag=true;
		if(str.charAt(0)=='-'){
			flag=false;
			str=str.substring(1);
		}else if(str.charAt(0)=='+'){
			str=str.substring(1);
		}

		for(int j=0;j<str.length();j++){
			if(str.charAt(j)>='0'&&str.charAt(j)<='9'){
				sum=sum*10+(str.charAt(j)-'0');
			}else {
				return 0;
			}
		}
		if(!flag)
			return (int)sum;
		else
			return -1*(int)sum;
	}
	@Test
	public void test(){
		System.out.println(StrToInt("-2147483649"));
	}
}
