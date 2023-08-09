package code;

public class Result extends SpMarks {
	private int per;

	public void getresult() {
		per = (m1 + m2 + m3 + spm) / 4;
		System.out.println("Total percentag=" + per + "%");
	}

}
