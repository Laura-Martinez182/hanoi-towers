import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedWriter objWriter;
	static BufferedReader objReader;

	public static void main(String[] args) throws IOException {
		objReader = new BufferedReader(new InputStreamReader(System.in));
		objWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		//m = total of problems
		//n = number of disks for each problem
		int m = Integer.parseInt(objReader.readLine());

		for (int i=1;i<=m;i++) {
			int n = Integer.parseInt(objReader.readLine());	
		}
		
	}

	public static void organizeDisks(int n, int firstPivot, int secondPivot, int lastPivot) throws IOException {
		if(n == 1) {
			
		}
	}
}
