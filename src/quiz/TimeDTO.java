package quiz;

public class TimeDTO {
	private long start, end, total;

	public long getStart() {
		return start;
	}

	public void setStart(long start) {
		this.start = start;
	}

	public long getEnd() {
		return end;
	}

	public void setEnd(long end) {
		this.end = end;
	}

	public long getTotal() {
		total = (end-start)/1000;
		return total;
	}
	
	
	
}
