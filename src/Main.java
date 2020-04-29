import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/4/28
 */

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		String s = bufferedReader.readLine();
		char a=bufferedReader.readLine().charAt(0);
		char b=a;
		if(a>='a'&&a<='z'){
			b=(char)(a+'A'-'a');
		}else if(a>='A'&&a<='Z'){
			b=(char)(a-'A'+'a');
		}
		int sum=0;
		for(int i=0;i<s.length();i++){
			if(a==s.charAt(i)||b==s.charAt(i)){
				sum++;
			}
		}
		System.out.println(sum);
	}
}
