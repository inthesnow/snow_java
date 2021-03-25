package algo.scof;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.naming.ldap.StartTlsRequest;

public class Quiz01 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int total = Integer.parseInt(input);
		
		List<String> list = new ArrayList<>();
		List<String> startT = new ArrayList<>();
		List<String> endT = new ArrayList<>();
		
		int i = 0;
		while (i < total) {
				String time = br.readLine();
				list.add(time);
				
				String nonBlank = list.get(i).replace(" ","");
				String arr[] = nonBlank.split("~");
				
				int staTime = Integer.parseInt(arr[0].replace(":", ""));
				int endTime = Integer.parseInt(arr[1].replace(":", ""));
				
				startT.add(arr[0]);
				endT.add(arr[1]);
				i++;
		}
		startT.sort(null);
		endT.sort(null);
		
		int sTime = Integer.parseInt(startT.get(total - 1).replace(":", ""));
		int eTime = Integer.parseInt(endT.get(0).replace(":", ""));
		
		if (eTime > sTime) {
			System.out.println(startT.get(total - 1) + " ~ " + endT.get(0));
		} else {
			System.out.println("-1");
		}
	}
}//clear