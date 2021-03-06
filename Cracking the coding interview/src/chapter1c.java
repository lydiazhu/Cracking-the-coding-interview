import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class chapter1c{
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Enter two strings in one line spearated by a space.");
		
		if(userInput.hasNextLine()){
			String string1= userInput.next();
			String string2= userInput.next();
			int length1 = string1.length();
			int length2 = string2.length();
			if (length1!=length2){
				System.out.println("Two strings are not permutation of another");
				return;
			}else{
				HashMap<Character,Integer> map = new HashMap<Character,Integer>(length1);
				for (int i=0;i<length1;i++){
					map.put(string1.charAt(i), 1);
				}
				for (int i=0;i<length2;i++){
					if(map.get(string2.charAt(i))==null ||map.get(string2.charAt(i))>2){
						System.out.println("Two strings are not permutation of another");
						return;
					}else {
						map.put(string2.charAt(i), 2);
					}
				}
				System.out.println("Two strings are permutation of another");
			}
		}


	}
}

//book solution

//book solution1
/*
public class chapter1c{
	static Scanner userInput = new Scanner(System.in);
	
	public static String sort(String s){
		char[] content=s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	
	public static boolean permutation(String s, String t){
		if (s.length() != t.length()){
			return false;
		}
		return sort(s).equals(sort(t));
	}
	
	public static void main(String[] args){
		System.out.println("Enter a string and make sure the string has sufficient space at the end of the string to hold the additional character %20 for each sapce");
		if(userInput.hasNextLine()){
			String string1=userInput.next();
			String string2=userInput.next();
			if(permutation(string1,string2)){
				System.out.println("Two strings are permutation of another");
			}else{
				System.out.println("Two strings are not permutation of another");
			}
			
			
		}
	}
}*/
//book solution 2

