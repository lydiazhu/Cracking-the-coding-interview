import java.util.Scanner;


public class chapter1d {
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Enter a string and make sure the string has sufficient space at the end of the string to hold the additional character %20 for each sapce");
		if(userInput.hasNextLine()){
			String string1=userInput.nextLine();
			int length1=string1.length();
			String string2=string1.trim();
			int length2=string2.length();
			char[] string3=new char[length1];
			for (int i =0, j=0; i<length2;i++){
				char mychar =string2.charAt(i);
				if (mychar !=' '){
					string3[j]=mychar;
					j++;
				}else{
					string3[j]=37;
					string3[++j]='2';
					string3[++j]='0';
					j++;
				}
				
			}
			System.out.println(string3);
		}
		
	}
}

