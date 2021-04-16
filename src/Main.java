import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class Main {
	
	public int[] moves = new int[3];
	
	public static void main(String[] args) throws IOException {

		BufferedWriter objWriter = new BufferedWriter(new PrintWriter("Output"));

		BufferedReader objReader = new BufferedReader(new FileReader("Input"));
		//m = total of problems
		int m = Integer.parseInt(objReader.readLine());
		//n = number of disks for each problem
		for (int i=1;i<=m;i++) {
			int n = Integer.parseInt(objReader.readLine());	
			//organizeDisks(n, firstPivot, secondPivot, lastPivot);
		}
		objReader.close();
	}
		
}	
	
		
	
	
public static void organizeDisks(int n, int firstPivot, int tempPivot, int lastPivot) throws IOException {
	if(n == 1) {

	}//imprimir
	
	 organizeDisks(n-1, firstPivot, tempPivot, lastPivot); 
}

public static void print() {
	
	
}
}