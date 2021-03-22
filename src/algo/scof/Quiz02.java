package algo.scof;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Quiz02 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		int l = Integer.parseInt(input);
		
		String input2 = br.readLine();
		String arr[] = input2.split("0");
		
		int result=1;
				
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()<3) {
				result*=1;
			} else {
				int sum=2;
				for(int j=0;j<arr[i].length()-2;j++) {
					sum +=j;	
				}
				result*=sum;
			}
		}
		System.out.println(result);
		}
}
//clear