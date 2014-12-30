import java.util.Scanner;


public class chapter1h {
	
	public static boolean isSubstring (String s1, String s2){
		String longString;
		String shortString;
		if (s1.length()>=s2.length()){
			longString=s1;
			shortString=s2;
		}else{
			longString=s2;
			shortString=s1;
		}
		int index=0;
		for(int i=0; i<longString.length();i++){
			if(shortString.charAt(index)==longString.charAt(i)){
				index++;
				if(index==(shortString.length()-1)){
					return true;
				}
			}else if(index!=0){
				return false;
			}
		}
		return false;
	}
	
	public static boolean isRotation(String s1, String s2){
		String concat =s1+s1;
		int length1=s1.length();
		int length2=s2.length();
		if(length1!=length2){
			return false;
		}else{
			return isSubstring(concat,s2);
		}
	}
	
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Type two strings seperated by space to test if one is the rotaton of another");
		if(userInput.hasNextLine()){
			String s1=userInput.next();
			String s2=userInput.next();
			/*
			if(isSubstring(s1,s2)){
				System.out.println("is substring");
			}else{
				System.out.println("Not substring");
			}*/
			if(isRotation(s1,s2)){
				System.out.println("is rotation");
			}else{
				System.out.println("not rotation");
			}
			
		}
		
	}
	
}
