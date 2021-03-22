package algo.scof;

import java.io.*;
import java.util.Arrays;

public class Quiz03 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int h = Integer.parseInt(input);

		String arr[][] = new String[h][h];
		
		for(int i=0;i<h;i++) {
			String length = br.readLine();
			arr[i] = length.split("");
		}
		
		int sum = 0;
		int size[] = new int[h];
		int count=0;
		int total = 0;
		while(count<h) {
			for(int i=0;i<h-count;i++) {
				for(int j=0;j<h-count;j++) {
					if(arr[i][j].equals("1")) {
						size[count]+=1;
					}
				}
			}			
			total += size[count];
			count++;
		}
		System.out.println("total: " + total);
		for(int i = 0;i<h;i++) {
			if (size[i] != 0) {
				System.out.println("size[" + (i + 1) + "]: " + size[i]);
			}
		}
		//arr[i][j].equals("1")&&arr[i+1][j+1].equals("1")&&arr[i+1][j].equals("1")&&arr[i][j+1].equals("1")

	}
} 