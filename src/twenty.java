import java.util.Stack;

/**
 * @Author: GoodbyeLullaby
 * @Date: 2020/3/27
 */

public class twenty {

	Stack<Integer> stack=new Stack<>();
	Stack<Integer> minStack=new Stack<>();

	public void push(int node) {
		if(minStack.empty()||node<minStack.peek()){
			minStack.push(node);
		}
		stack.push(node);
	}

	public void pop() {
		if(!stack.empty()){
			int p = stack.pop();
			if(p==minStack.peek()){
				minStack.pop();
			}
		}

	}

	public int top() {
		if(!stack.empty()){
			return stack.peek();
		}
		return -1;
	}

	public int min() {
		if(!minStack.empty()){
			return minStack.peek();
		}
		return -1;
	}
}
