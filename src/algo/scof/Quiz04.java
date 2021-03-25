package algo.scof;
import java.io.*;
public class Quiz04 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] favor = input.split(" ");
		String input2 = br.readLine();
		String[] watchInfo = input2.split(" ");
		int row = Integer.parseInt(watchInfo[0]);
		int cal = Integer.parseInt(watchInfo[1]);
		String[][] watchPer = new String[row][cal];
		String[][] genrePer = new String[row][cal];
		
		for(int i=0;i<row;i++) {
			String inputWat = br.readLine();
			watchPer[i] = inputWat.split("");
		}
		for(int i=0;i<row;i++) {
			String inputGenre = br.readLine();
			genrePer[i] = inputGenre.split("");
		}
		
		for(int i=0;i<watchPer.length;i++) {
			for(int j=0;j<watchPer[i].length;j++) {
				System.out.print(watchPer[i][j]);
			}
			System.out.println();
		}
		for(int i=0;i<genrePer.length;i++) {
			for(int j=0;j<genrePer[i].length;j++) {
				System.out.print(genrePer[i][j]);
			}
			System.out.println();
		}

	}
}
//4.0 3.0 2.1 4.3 5.0