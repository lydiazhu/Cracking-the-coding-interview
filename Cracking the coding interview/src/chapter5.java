
public class chapter5 {
	//check if the number has a bit
	static boolean getBit(int num, int i){
		System.out.println((num & (1<< i)));
		return ((num & (1<< i)) !=0);
	}
	
	//set the ith bit to 1
	static int setBit(int num, int i){
		return num|(1<<i);
	}
	
	//clear the ith bit to 0
	static int clearBit(int num, int i){
		int mask = ~(1 << i);
		return num & mask;
	}
	
	static int clearBitsMSBthroughI(int num, int i){
		int mask = (1 << i)-1;
		return num & mask;
	}
	
	static int clearBitsIthroug0(int num, int i){
		int mask = ~(-1 >>> (31 - i));
		return num&mask;
	}
	
	static int updateBit(int num, int i, int v){
		int mask = ~(1<<i);
		return (num&mask)|(v<<i);
	}
	public static void main(String[] args){
		if(getBit(2,1)){
			System.out.println("true");
		}
		int num = setBit(0,1);
		for (int i = 2;i<5;i++){
			num=setBit(num,i);
		}
		System.out.println("testing setbit "+num);
		System.out.println(clearBit(12,2));
		System.out.println(clearBitsMSBthroughI(15,0));
		System.out.println(clearBitsIthroug0(15,3));
		System.out.println(updateBit(7,1,3));
	}
}