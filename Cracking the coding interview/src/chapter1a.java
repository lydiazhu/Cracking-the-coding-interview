import java.util.HashMap;
import java.util.Scanner;

//Choice 1
//O(1) run time
public class chapter1a {
	static Scanner userInput = new Scanner(System.in);
	//assuming string can contain space
	public static void main(String[] args)
	{
		System.out.print("Enter a string: ");
		//assume user type in 95 printable ASCII characters
		HashMap<Character,Integer> myhash= new HashMap<Character,Integer>(95);
		int uniqueCharacterFound = 0;
		if (userInput.hasNextLine()){
			String temp = userInput.nextLine();
			int length = temp.length();
			for (int i = 0; i<length;i++){
				if (uniqueCharacterFound<=128&&temp.charAt(i)!=' '){
					if (myhash.get(temp.charAt(i))==null){
						myhash.put(temp.charAt(i),1 );
						uniqueCharacterFound++;
					}else{
						System.out.println("string does not have all unique characters");
						return;
					}
				}
				
			}
			System.out.println("String has all unique characters");
		}
	}
}
//Book Solution
/*
public class chapter1a {
	static Scanner userInput = new Scanner(System.in);
	//assuming string can contain space
	public static void main(String[] args)
	{
		System.out.print("Enter a string: ");
		boolean[] char_set = new boolean[256];
		if (userInput.hasNextLine()){
			String temp = userInput.nextLine();
			for (int i=0; i <temp.length();i++){
				int val=temp.charAt(i);
				System.out.println("before put in"+val);
				if (char_set[val]){
					System.out.println("string does not have all unique characters");
					return;
				}
				
				char_set[val]=true;
				for (int p=0;p<256;p++){
					if(char_set[p]==true){
						System.out.println(char_set[p]);
						System.out.println(val);
						System.out.println(p);
					}
					
				}
				
			}
		}
		System.out.println("String has all unique characters");
	}
}*/

