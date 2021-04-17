import java.io.BufferedReader;
import java.io.PrintWriter;

import java.io.FileReader;
import java.io.IOException;



public class Main {

	static BufferedReader objReader;
	static PrintWriter objWriter;
	public static final int EXAMPLE = 0;
	public static final int FILE = 1;

	public static int n; 
	public static int firstPivot = 1; 
	public static int tempPivot = 2; 
	public static int lastPivot = 3;
	public static int[] moves = new int[3];

	public static void main(String[] args) throws IOException {

		//Cambie el valor de la variable option: EXAMPLE para resolver el ejemplo y FILE para resolver los casos de prueba
		int option = FILE;
		String input = "";
		String output = "";
		switch(option) {
		case EXAMPLE:
			input = "textFiles\\exampleCases-input.txt";
			output = "textFiles\\exampleCases-output.txt";
			break;
		case FILE: 
			input = "textFiles\\fileCases-input.txt";
			output = "textFiles\\fileCases-output.txt";
			break;
		default: 
			System.out.println("Opción inválida");
			return;
		}

		objReader = new BufferedReader(new FileReader(input));
		objWriter = new PrintWriter(new PrintWriter(output));

		//m = total of problems
		int m = Integer.parseInt(objReader.readLine());


		//n = number of disks for each problem
		int count = 0;
		for (int i = 0; i < m; i++) {
			int n = Integer.parseInt(objReader.readLine());
			moves[0]= n;
			System.out.println(moves[0]+ " "+moves[1]+ " "+moves[2]);
			objWriter.println(moves[0]+ " "+moves[1]+ " "+moves[2]);
			count++;

			organizeDisks(n, firstPivot, lastPivot, tempPivot);

			if(count == m) {
				objReader.close();
				objWriter.close();
			}else {
				System.out.println("");
				objWriter.println("");
				moves= new int[3];
			}
		}
		objReader.close();
		objWriter.close();
	}


	public static void organizeDisks(int n, int firstPivot, int lastPivot, int tempPivot) throws IOException {
		if(n == 1) {
			moves[firstPivot-1]--;
			moves[lastPivot-1]++;
			System.out.print(moves[0]+ " "+moves[1]+ " "+moves[2]+ "\n");
			objWriter.print(moves[0]+ " "+moves[1]+ " "+moves[2]+ "\n");
			return;
		}

		organizeDisks(n-1, firstPivot, tempPivot, lastPivot);
		moves[firstPivot-1]--;
		moves[lastPivot-1]++;
		objWriter.print(moves[0]+ " "+moves[1]+ " "+moves[2]+ "\n");
		System.out.print(moves[0]+ " "+moves[1]+ " "+moves[2]+ "\n");
		organizeDisks(n-1, tempPivot, lastPivot, firstPivot);
	}
}