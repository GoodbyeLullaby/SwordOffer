import java.util.Arrays;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/4/23
 */

public class fortyfive {
	public boolean isContinuous(int [] numbers) {
		if(numbers.length<5){
			return false;
		}
		Arrays.sort(numbers);
		int i=0;
		for(int j=0;j<4;j++){
			if(numbers[i]==0)
				i++;
		}
		int j=i;
		while (j<numbers.length-1&&i>=0){
			if(numbers[j]+1==numbers[j+1]){
				j++;
			}else {
				i--;
				numbers[j]++;
			}
			if(i<0){
				return false;
			}
		}
		return true;
	}
}
