
public class chapter5c {
	static int numBits(int num){
		int numOne =0;
		for (int half = num; half!=0;half=half/2){
			if(half%2!=0){
				//System.out.println(num+" half "+half+" has a reminder");
				numOne++;
			}
		}
		return numOne;
	}
	
	static void printSmallBig(int num){
		int small=num-1;
		int big = num+1;
		int numOne=numBits(num);
		System.out.println(num+" has "+numOne+" number of 1s");
		if(num>3){
			int smallOne=numBits(small);
			while(numOne !=smallOne){
				small--;
				smallOne=numBits(small);
			}
			System.out.println(
					"next smallest number that has the same number of 1 bits is " 
			+small);
			System.out.println(small+" has "+smallOne+" number of 1s");
			
		}
		int bigOne=numBits(big);
		while(numOne!=bigOne){
			++big;
			bigOne=numBits(big);
			
		}
		System.out.println("next biggest number that has the same number of 1 bits is "
				+big);
		System.out.println(big+" has "+bigOne+" number of 1s");
	}
	public static void main(String[] args){
		printSmallBig(32);
	}
}
