package runtime.check;

public class CheckRunTime {
	private long start;
	private long end;
	
	public long getStart() {
		start = System.nanoTime();
		return start;
	}
	public long getEnd() {
		end = System.nanoTime();
		return end;
	}
	public void getRunTime() {
		double rst = (end-start)/1000000000.0;
		String rst_S = String.format("%.2f", rst);
		System.out.println("RunTime : " + rst_S + "sec");
	}
}
