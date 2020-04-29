import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/4/27
 */

public class fiftyfour {
	//Insert one char from stringstream
	Queue<Character> queue=new LinkedList<>();
	int[] charSet=new int[128];
	public void Insert(char ch)
	{
		if(charSet[ch]++ ==0){
			queue.add(ch);
		}
	}
	//return the first appearence once char in current stringstream
	public char FirstAppearingOnce()
	{
		Character character='#';
		while ((character=queue.peek())!=null){
			if(charSet[character]==1){
				return character;
			}else {
				queue.remove();
			}
		}
		return '#';
	}
	@Test
	public void test(){
		String str="google";
		char chs[]=str.toCharArray();
		for(int i=0;i<str.length();i++){
			Insert(chs[i]);
			System.out.println("i="+i+": "+FirstAppearingOnce());
		}
	}
}
