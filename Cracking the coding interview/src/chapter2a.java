import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;


public class chapter2a {
	
	static void removeDuplicate(LinkedList<Integer> list){
		int size = list.size();
		HashSet<Integer> set = new HashSet<Integer>(size);
		for (int i=0;i<size;i++){
			if(set.contains(list.get(i))){
				set.add(list.get(i));
			}else{
				list.remove(i);
				size--;
				i--;
			}
		} 
	}
	
	static void removeDuplicate(Node dups){
		if (dups == null) return;
		HashSet<Integer> unique = new HashSet<Integer>();
		Node temp = null;
		while (dups != null){
			if(unique.contains(dups.data)){
				temp.next=dups.next;
			}else{
				unique.add(dups.data);
				temp=dups;
			}
			dups=dups.next;
		}
		dups=temp;
	}
	
	static void removeDuplicate2(Node dups){
		if (dups == null) return;
		Node current = dups;
		while (current != null){
			Node runner = current;
			while(runner.next!=null){
				if(runner.next.data==current.data){
					runner.next=runner.next.next;
				}else{
					runner=runner.next;
				}
			}
			current= current.next;
		}
	}
	public static void main(String[] args){
		LinkedList<Integer> mylist = new LinkedList<Integer>();
		
		mylist.add(5);
		mylist.add(3);
		mylist.add(4);
		mylist.add(4);
		mylist.add(5);
		mylist.add(5);
		removeDuplicate(mylist);
		System.out.println(mylist);
		
		Node duplicatedNode = new Node(3);
		duplicatedNode.appendToTail(4);
		duplicatedNode.appendToTail(4);
		duplicatedNode.appendToTail(5);
		duplicatedNode.appendToTail(3);
		removeDuplicate(duplicatedNode);
		while(duplicatedNode!=null){
			System.out.println(duplicatedNode.data);
			duplicatedNode=duplicatedNode.next;
		}
		Node duplicatedNode2 = new Node(3);
		duplicatedNode2.appendToTail(4);
		duplicatedNode2.appendToTail(4);
		duplicatedNode2.appendToTail(5);
		duplicatedNode2.appendToTail(3);
		removeDuplicate2(duplicatedNode2);
		while(duplicatedNode2!=null){
			System.out.println(duplicatedNode2.data);
			duplicatedNode2=duplicatedNode2.next;
		}
	}
	
}
