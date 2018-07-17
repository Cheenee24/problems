
public class Stack {
	int top;
	int[] stack;
	int max;
	
	public Stack(int inputMax) {
		this.top = 0;
		this.max = inputMax;
		this.stack = new int[this.max];
	}
	
	public boolean isEmptyStack() {
		return (top == 0);
	}
	
	public boolean isFullStack() {
		return (top == max);
	}
	
	public void stackPush(int x) {
		if(isFullStack()) {
			return;
		}
		
		stack[top] = x;
		top++;
		
	}
	
	public int stackPop() {
		if(isEmptyStack()) {
			return -1;
		}
		
		top--;
		return stack[top];
	}
}
