import java.util.Scanner;

//O(n)
public class chapter1e {
	
	public static String compress(String s){
		int length = s.length();
		//char[] sCompressed = new char[length];will not work because cannot convert integer two digit and above int to char
		StringBuffer sCompressed = new StringBuffer();
		char pivot=s.charAt(0);
		sCompressed.append(pivot);
		int count=1;
		int sCindex=1;
		for(int i=1;i<length;i++){
			if (sCompressed.length()>=length-1&&count==1){
				//System.out.println("here");
				return s;
			}
			if(pivot==s.charAt(i)){
				count++;				
			}else{
				pivot=s.charAt(i);
				sCompressed.append(count);
				sCompressed.append(pivot);
				//System.out.println(count);
				count=1;
			}
		}
		//System.out.println(count);
		if (length>1&&sCindex<length) {
			sCompressed.append(count);
			return sCompressed.toString();
		}else{
			return s;
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
