
public class chapter5a {
	static int clearBit(int num, int i){
		int mask = ~(1 << i);
		return num & mask;
	}
	static int updateBit(int n, int m, int i, int j){
		for (int start = i; start <=j ; start++){
			clearBit(n,start);
		}
		m = m << i;
		return n|m;
	}
	
	public static void main(String[] args){
		System.out.println(Integer.toBinaryString(updateBit(19,3,2,3)));	
	}
	
}
