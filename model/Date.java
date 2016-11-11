package model;

public class Date {
	private int ngay, thang, nam;

	public Date(int ngay, int thang, int nam) {
		super();
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}

	@Override
	public String toString() {
		return ngay + "/" + thang + "/" + nam;
	}

}
