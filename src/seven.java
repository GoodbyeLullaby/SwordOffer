import org.junit.Test;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/3/25
 */

public class seven {
	public int Fibonacci(int n) {
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		int a=0,b=1;
		int sum=1;
		for(int i=1;i<n;i++){
			sum=a+b;
			a=b;
			b=sum;
		}
		return sum;
	}
	@Test
	public void test(){
		System.out.println(Fibonacci(3));
	}
}
