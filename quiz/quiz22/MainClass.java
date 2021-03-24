package quiz22;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {
	public static void main(String[] args) {
		/*
		 * 1.bufferedReader를 이용해서 파일을 읽어드리세요. readLine()
		 * 2. , 기준으로 잘라서 Data클래스에 맴버변수에 한줄 단위로 저장(Data는 get,set을 갖는 은닉 클래스)
		 * 3. List<Data>에 추가
		 * 4. 람다식을 이용해서 뽑아서 새로운 리스트로 정리. 
		 * Null이 아닌 데이터
		 * 지역:서울
		 * (1분기)6월이하
		 * 분양가격 4000이상만
		 * 
		 */
		List<Data> list = new ArrayList<>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\exFile\\주택도시보증공사_전국 평균 분양가격(2020년 2월).csv"), "EUC-KR"));
			String str=br.readLine();
			int i =0;
			while((str=br.readLine())!=null) {
				Data data = new Data();
				String arr[] = new String[5];
				arr = str.replace(" ", "").replace("-", "0").split(",");
				
				if (arr.length == 5) {
					data.setArea(arr[0]);
					data.setSize(arr[1]);
					data.setYear(Integer.parseInt(arr[2]));
					data.setMonth(Integer.parseInt(arr[3]));
					data.setPrice(Integer.parseInt(arr[4]));

					list.add(data);
				}
			}
			List<Data> filteringDataList = list.stream()
			.filter((a)-> a.getArea().equals("서울")&&a.getMonth()<7&&a.getPrice()>4000)
			.collect(Collectors.toList());
			
			for(Data l : filteringDataList) {
				System.out.println("["+l.getArea()+", "+l.getSize()+", "+l.getYear()+", "+l.getMonth()+", "+l.getPrice()+"]");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
				
	}
}
