import java.util.Scanner;

//O(n)
public class chapter1e {
	
	public static String compress(String s){
		int length = s.length();
		if(length<=1){
			return s;
		}else{
			//char[] sCompressed = new char[length];will not work because cannot convert integer two digit and above int to char
			StringBuffer sCompressed = new StringBuffer();
			char pivot=s.charAt(0);
			int count=1;
			for(int i=1;i<length;i++){
				if (sCompressed.length()>=length-1){
					return s;
				}
				if(pivot==s.charAt(i)){
					count++;				
				}else{
					sCompressed.append(pivot);
					sCompressed.append(count);
					pivot=s.charAt(i);
					count=1;
				}
			}
			
			//if the length is greater than one and the compressed version with the last character + count is smaller than the original length
			//then return the compressed version
			if (length>1&&sCompressed.length()<length-2) {
				sCompressed.append(pivot);
				sCompressed.append(count);
				return sCompressed.toString();
			}else{
				return s;
			}
		}
		
		
	}
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main (String[] args){
		System.out.println("Enter a string containing letter from a to z.");
		if(userInput.hasNext()){
			String myString=userInput.next();
			System.out.println(compress(myString));
		}
		
	}
}
