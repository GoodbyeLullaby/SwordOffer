import org.junit.Test;

import java.util.ArrayList;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/4/8
 */

public class twentyseven {
	//牛客网过不了 但是leetcode 46t 能过
	private char[] str;
	private int len;
	private ArrayList<String> result=new ArrayList<>();
	public ArrayList<String> Permutation(String str) {
		if(str==null&&str.length()==0)
			return result;
		this.str=str.toCharArray();
		this.len=str.length();
		allSituation(0);
		return result;
	}

	private void allSituation( int i) {
		if(i>=len){
			StringBuilder sb=new StringBuilder();
			for(int j=0;j<len;j++){
				sb.append(str[j]);
			}
			result.add(sb.toString());
			return;
		}
		for(int j=i;j<len;j++){
			sawp(i,j);
			allSituation(i+1);
			sawp(i,j);
		}
	}

	private void sawp(int i, int j) {
		char temp=str[i];
		str[i]=str[j];
		str[j]=temp;
	}

	@Test
	public void test(){
		System.out.println(Permutation("123"));
	}
}
