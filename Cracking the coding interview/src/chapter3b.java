import java.util.Stack;


public class chapter3b {
	static class StackWithMin extends Stack<NodeWithMin>{
		
		public void push(int value){
			int newMin = Math.min(value, min());
			push(new NodeWithMin(value, newMin));
		}
		
		public int min(){
			if (this.isEmpty()){
				return Integer.MAX_VALUE;
			}else{
				return peek().min;
			}
		}
	}
	static class NodeWithMin{
		public int value;
		public int min;
		public NodeWithMin(int v, int min){
			value=v;
			this.min=min;
		}
	}
	
	static class StackWithMin2 extends Stack<Integer>{
		Stack<Integer> s2;
		public StackWithMin2(){
			s2= new Stack<Integer>();
		}
		
		public void push(int value){
			if (value <= min()){
				s2.push(value);
			}
			super.push(value);
		}
		public Integer pop(){
			int value = super.pop();
			if (value == min()){
				s2.pop();
			}
			return value;
		}
		public int min(){
			if (s2.isEmpty()){
				return Integer.MAX_VALUE;
			}else{
				return s2.peek();
			}
		}
	}
	public static void main(String[] args){
		StackWithMin stack = new StackWithMin();
		stack.push(3);
		stack.push(4);
		stack.push(1);
		stack.push(8);
		stack.push(0);
		System.out.println(stack.min());
		StackWithMin2 stack2 = new StackWithMin2();
		stack2.push(3);
		stack2.push(4);
		stack2.push(1);
		stack2.push(8);
		stack2.push(0);
		System.out.println(stack2.min());
		stack2.pop();
		System.out.println(stack2.pop());
		
	}	
}