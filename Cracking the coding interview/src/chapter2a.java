import java.util.HashMap;
import java.util.LinkedList;


public class chapter2a {
	
	static void removeDuplicate(LinkedList<Integer> list){
		int size = list.size();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(size);
		for (int i=0;i<size;i++){
			if(map.get(list.get(i))==null){
				map.put(list.get(i),1);
			}else{
				list.remove(i);
				size--;
				i--;
			}
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
	}
	
}
