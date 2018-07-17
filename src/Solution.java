import  java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inputMax = sc.nextInt();
		Stack stack = new Stack(inputMax);
		
		for(int i=0; i<inputMax; i++) {
			int v = sc.nextInt();
			
			stack.stackPush(v);
			System.out.println(stack.stack[i]);
			
		}
		sc.close();
		
		
		while(!stack.isEmptyStack()) {
			System.out.println(stack.stackPop());
		}
		
	}

}
