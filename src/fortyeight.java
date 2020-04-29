import org.junit.Test;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/4/27
 */

public class fortyeight {
	public int Add(int num1,int num2) {
		int a=0;
		int b=0;
		do{
			a=num1^num2;
			b=(num1&num2)<<1;
			num1=a;
			num2=b;
		}while (b!=0);
		return a;
	}
	@Test
	public void test(){
		System.out.println(Add(7,5));
	}
}
