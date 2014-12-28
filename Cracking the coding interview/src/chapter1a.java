import java.util.HashMap;
import java.util.Scanner;

public class chapter1a {
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.print("Enter a string: ");
		HashMap<Character,Integer> myhash= new HashMap<Character,Integer>(26);
		if (userInput.hasNext()){
			String temp = userInput.next();
			int length = temp.length();
			for (int i = 0; i<length;i++){
				int v = myhash.get(temp.charAt(i));
				if (v==0){
					v++;
					myhash.put(temp.charAt(i), v);
				}else{
					System.out.println("string does not have all unique characters");
					return;
				}
				
			}
			System.out.println("String has all unique characters");
		}
	}
}
