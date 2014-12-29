import java.util.Scanner;


public class chapter1e {
	
	public static char[] compress(String s){
		int length = s.length();
		char[] sCompressed = new char[length*2];
		boolean charRepeated = false;
		for(int i=0,j=0;i<length;i++){
			char pivot=s.charAt(i);
			sCompressed[j]=pivot;
			j++;
			int count=1;
			while(i<(length-1)&&pivot==s.charAt(i+1)){
				if (!charRepeated){
					charRepeated=true;
				}
				i++;
				count++;				
			}
				sCompressed[j]=(char) (count+48);
				j++;
			
		}
		if (charRepeated){
			return sCompressed;
		}else{
			return s.toCharArray();
		}
	}
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main (String[] args){
		System.out.println("Enter a string.");
		if(userInput.hasNext()){
			String myString=userInput.next();
			System.out.println(compress(myString));
		}
		
	}
}
