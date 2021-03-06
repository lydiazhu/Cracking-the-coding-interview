//assume user will never enter a k such that its out of bound
public class chapter2b {
	static Node kthToLast(Node n, int k){
		if (n==null && k<=0) return null;
		int length=0;
		Node forLength = n;
		Node findKth = n;
		while (forLength != null){
			forLength = forLength.next;
			length++;
		}
		if (k<length){
			for (int i=0; i<(length-k); i++){
				findKth = findKth.next;
			}
			return findKth;
		}else{
			return null;
		}
		
	}
	static class IntWrapper{
		public int value=0;
	}
	
	static Node nthToLastR2(Node head, int k, IntWrapper i){
		if (head == null){
			return null;
		}
		
		Node node = nthToLastR2(head.next, k,i);
		i.value=i.value+1;
//		System.out.println("i is "+i.value);
	//	System.out.println("data is "+head.data);
		if(i.value==k){
			//System.out.println("final i is "+i.value);
			return head;
		}
		return node;
		
	}
	public static void main(String[] args){
		Node node = new Node(6);
		node.appendToTail(4);
		node.appendToTail(4);
		node.appendToTail(5);
		node.appendToTail(3);
		Node kthToLastNode=kthToLast(node,1);
		while(kthToLastNode!=null){
			System.out.println(kthToLastNode.data);
			kthToLastNode=kthToLastNode.next;
		}
		Node node2 = new Node(6);
		node2.appendToTail(4);
		node2.appendToTail(4);
		node2.appendToTail(5);
		node2.appendToTail(3);
		IntWrapper i = new IntWrapper();
		Node kthToLastR2=nthToLastR2(node,1,i);
		while(kthToLastR2!=null){
			System.out.println(kthToLastR2.data);
			kthToLastR2=kthToLastR2.next;
		}
	}
}
