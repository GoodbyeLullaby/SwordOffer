import org.junit.Test;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/3/25
 */

public class twelve {
	public double Power(double base, int exponent) {
		if(base==0)
			return 0;
		if(exponent==0)
			return 1;
		double res=1;
		if(exponent>0){
			for(int i=0;i<exponent;i++){
				res*=base;
			}
		}else {
			for(int i=0;i>exponent;i--){
				res/=base;
			}
		}
		return res;
	}
	@Test
	public void test(){
		System.out.println(Power(2, -3));
	}
}
