package quiz;

import java.text.SimpleDateFormat;

public class TimeService {
	TimeDTO dto = new TimeDTO();
	SimpleDateFormat simple = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
	
	public void setStTime() {
		long start = System.currentTimeMillis();
		dto.setStart(start);
	}
	
	public void printStTime() {
		System.out.println((String)simple.format(dto.getStart()));
	}
	
	public void setEndTime() {
		long end = System.currentTimeMillis();
		dto.setEnd(end);
	}
	
	public void printEndTime() {
		System.out.println((String)simple.format(dto.getEnd()));
	}
	
	public String useTime() {
		int m = (int)dto.getTotal()/60;
		int s = (int)dto.getTotal()%60;
		return m+"분"+s+"초 사용";
	}
}
