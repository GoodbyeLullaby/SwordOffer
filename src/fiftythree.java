import org.junit.Test;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/4/27
 */

public class fiftythree {
	public boolean isNumeric(char[] str) {
		if(str.length==0)
			return false;
		int i=0;
		boolean e=true;//是否后面还可以有e
		boolean point=true;//是否后面还可以有小数点
		if(str[0]=='-'||str[0]=='+')
			i++;
		while (i<str.length){
			if(str[i]>='0'&&str[i]<='9'){
				i++;
			}else if(str[i]=='e'||str[i]=='E'){
				if(e){
					e=false;
					point=false;
				}else {
					return false;
				}
				if(i+1>=str.length){
					return false;
				}else if(str[i+1]=='-'||str[i+1]=='+'){
					i=i+2;
				}else {
					i++;
				}
			}else if(str[i]=='.'){
				if(point){
					point=false;
				}else {
					return false;
				}
				if(i+1>=str.length){
					return false;
				}else {
					i++;
				}
			}else {
				return false;
			}
		}
		return true;
	}
	@Test
	public void test(){
		char arr[]="12e1".toCharArray();
		System.out.println(isNumeric(arr));
	}
}
