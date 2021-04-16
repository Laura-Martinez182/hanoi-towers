import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.IOException;



public class Main {

	static BufferedReader objReader;
	static PrintWriter objWriter;
	public static final int EXAMPLE = 0;
	public static final int HANOI = 1;

	public static int n; 
	public static int firstPivot = 1; 
	public static int tempPivot = 2; 
	public static int lastPivot = 3;
	public static int[] moves = new int[3];

	public static void main(String[] args) throws IOException {
		//Escoja EXAMPLE para resolver el ejemplo y use HANOI para resolver los casos de prueba
		int option = EXAMPLE;
		String input = "";
		String output = "";
		switch(option) {
		case EXAMPLE:
			input = "C:\\Users\\prestamo\\Desktop\\eclipse-workspace\\hanoi-towers\\textFiles\\inputExample.txt";
			output = "C:\\Users\\prestamo\\Desktop\\eclipse-workspace\\hanoi-towers\\textFiles\\outputExample.txt";
			break;
		case HANOI: 
			input = "C:\\Users\\prestamo\\Desktop\\eclipse-workspace\\hanoi-towers\\textFiles\\hanoiInput.txt";
			output = "C:\\Users\\prestamo\\Desktop\\eclipse-workspace\\hanoi-towers\\textFiles\\hanoiOutput.txt";
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
		for (int i=1;i<=m;i++) {
			int n = Integer.parseInt(objReader.readLine());
			moves[0]= n;
			System.out.println(moves[0]+ " "+moves[1]+ " "+moves[2]);
			objWriter.println(moves[0]+ " "+moves[1]+ " "+moves[2]);
			organizeDisks(n, firstPivot, lastPivot, tempPivot);
			System.out.println(" ");
			objWriter.println(" ");
			moves= new int[3];
		}
		objWriter.close();
		objReader.close();
	}


	public static void organizeDisks(int n, int firstPivot, int lastPivot, int tempPivot) throws IOException {
		if(n == 1) {

			moves[firstPivot-1]--;
			moves[lastPivot-1]++;
			System.out.println(moves[0]+ " "+moves[1]+ " "+moves[2]);
			objWriter.println(moves[0]+ " "+moves[1]+ " "+moves[2]);
			return;
		}

		organizeDisks(n-1, firstPivot, tempPivot, lastPivot);
		moves[firstPivot-1]--;
		moves[lastPivot-1]++;
		objWriter.println(moves[0]+ " "+moves[1]+ " "+moves[2]);
		System.out.println(moves[0]+ " "+moves[1]+ " "+moves[2]);
		organizeDisks(n-1, tempPivot, lastPivot, firstPivot);
	}
}