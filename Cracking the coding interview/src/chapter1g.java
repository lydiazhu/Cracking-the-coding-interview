import java.util.Scanner;


public class chapter1g {
	public static void changeMatrix(int[][] matrix,int m,int n,int M, int N){
		for (int i=0;i<M;i++){
			matrix[i][n]=0;
		}
		for (int i=0;i<N;i++){
			matrix[m][i]=0;
		}
	}
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Enter two integer numbers for M and N for an M*N Matrix in one line seperated by space," +
				" and each element of the matrix will be filled with integer 1: ");
		if (userInput.hasNextLine()){
			int M=userInput.nextInt();
			int N=userInput.nextInt();
			int[][] matrix = new int[M][N];
			for (int i=0; i<M;i++){
				for (int j=0;j<N;j++){
					matrix[i][j]=1;
				}
			}
			System.out.println("Enter two integer numbers m and n for a particular element in the M*N matrix that you want to turn it to 0 " +
					"speparated by space: ");
			if (userInput.hasNextLine()){
				int m=userInput.nextInt();
				int n=userInput.nextInt();
				changeMatrix(matrix,m,n,M,N);
				for (int i=0; i<M;i++){
					for (int j=0;j<N;j++){
						System.out.print(matrix[i][j]);
					}
					System.out.println();
				}
				
			}
		}
	}
}
