import java.util.HashMap;
import java.util.Scanner;

public class chapter1a {
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.print("Enter a string: ");
		HashMap<Character,Integer> myhash= new HashMap<Character,Integer>(128);
		if (userInput.hasNextLine()){
			String temp = userInput.nextLine();
			int length = temp.length();
			for (int i = 0; i<length;i++){
				if (temp.charAt(i)!=' '){
					if (myhash.get(temp.charAt(i))==null){
						System.out.println(temp.charAt(i));
						myhash.put(temp.charAt(i),1 );
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
