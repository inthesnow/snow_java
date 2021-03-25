package quiz24;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RegexQuiz {
	public static void main(String[] args) {
		/*
		 * 1. product 클래스 day, store grade, detail, price
		 * (getter, setter사용 은닉클래스)
		 * 2. product를 제네릭으로 갖는 리스트 생성
		 * 3. bufferedreader사용 건담.txt 읽기
		 * 4. while문안에서 readLine으로 한줄씩읽어서 처리
		 * 5. 날짜, 지점, 등급, 상세, 가격 패던을 분석해서 Product에 저장한 후에 리스트에 추가
		 * 
		 * 6. 외부라이브러리(POI) 사용해서 분석한 패턴을 xlsx엑셀 파일로 추출하면됩니다.
		 */
		List<Product> list = new ArrayList<>();
		BufferedReader br = null;

		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\exFile\\건담.txt"), "UTF-8"));
			String str;
			while ((str = br.readLine()) != null) {
				list.add(pattern(str));
			}	
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();				
			} catch (Exception e) {
			}
		}
		
		Workbook xlsxWb = new XSSFWorkbook(); // Excel 2007 이상
		 
        // *** Sheet-------------------------------------------------
        // Sheet 생성
        Sheet sheet1 = xlsxWb.createSheet("firstSheet");
 
        // 컬럼 너비 설정
        for(int i=0;i<6;i++) {
        	sheet1.setColumnWidth(i, 5000);
        }
        // ----------------------------------------------------------
         
        // *** Style--------------------------------------------------
        // Cell 스타일 생성
        CellStyle cellStyle = xlsxWb.createCellStyle();
         
        // 줄 바꿈
        cellStyle.setWrapText(true);
         
        Row row = null;
        Cell cell = null;
        //----------------------------------------------------------
         
        // 첫 번째 줄 - 날짜, 지점, 등급, 상세, 가격 패던
        row = sheet1.createRow(0);
         
        // 첫 번째 줄에 Cell 설정하기-------------
        cell = row.createCell(0);
        cell.setCellValue("날짜");
         
        cell = row.createCell(1);
        cell.setCellValue("지점");
         
        cell = row.createCell(2);
        cell.setCellValue("등급");
        
        cell = row.createCell(3);
        cell.setCellValue("상세");
        
        cell = row.createCell(4);
        cell.setCellValue("가격");
        //---------------------------------
         
        // 두 번째 줄
        for(int i=1;i<=list.size();i++) {
        	row = sheet1.createRow(i);
        	// 두 번째 줄에 Cell 설정하기-------------
        	cell = row.createCell(0);
        	cell.setCellValue(list.get(i-1).getDay());
        	
        	cell = row.createCell(1);
        	cell.setCellValue(list.get(i-1).getStore());
        	
        	cell = row.createCell(2);
        	cell.setCellValue(list.get(i-1).getGrade());
        	
        	cell = row.createCell(3);
            cell.setCellValue(list.get(i-1).getDetail());
            
            cell = row.createCell(4);
            cell.setCellValue(list.get(i-1).getPrice());
            
        	//---------------------------------
        }
 
        // excel 파일 저장
        try {
            File xlsxFile = new File("D:\\exFile\\makeExcel.xls");
            FileOutputStream fileOut = new FileOutputStream(xlsxFile);
            xlsxWb.write(fileOut);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Success");
	}
	static Product pattern(String line) {
		String str = line.replace(",", "");
		
		String dayP = "\\d{8}";
		String storeP = "[가-힝]+\\s[가-힝]+";
		String gradeP = "\\[[A-Z]+\\]|\\[[가-힣]+\\]";
		String priceP = "\\d{4,6}원";
		Matcher m  = Pattern.compile(dayP).matcher(str);
		Matcher m2  = Pattern.compile(storeP).matcher(str);
		Matcher m3  = Pattern.compile(gradeP).matcher(str);
		Matcher m4  = Pattern.compile(priceP).matcher(str);
		
		if(m.find()&&m2.find()&&m3.find()&&m4.find()) {
		String detailP = str.substring(m3.end()+1,m4.start()-1);
		
		int day = Integer.parseInt(m.group());
		String store = m2.group();
		String grade = m3.group();
		String detail = detailP;
		int price = Integer.parseInt(m4.group().replace("원", ""));
		Product product = new Product(day, store, grade, detail, price);
		return product;

		}else {
			return null;
		}
			
	}
}
