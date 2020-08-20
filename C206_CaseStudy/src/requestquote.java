
public class requestquote {
	private String propertytype;
	private int areasize;
	private String requestname;
	private int contactnumber;
	private int budget;
	private String renovationtype;
	private int roomsrenovate;
	private int toiletren;
	private boolean urgent;
	public requestquote(String propertytype, int areasize, String requestname, int contactnumber, int budget,
			String renovationtype, int roomsrenovate, int toiletren, boolean urgent) {
	
		this.propertytype = propertytype;
		this.areasize = areasize;
		this.requestname = requestname;
		this.contactnumber = contactnumber;
		this.budget = budget;
		this.renovationtype = renovationtype;
		this.roomsrenovate = roomsrenovate;
		this.toiletren = toiletren;
		this.urgent = urgent;
	}
	public String getPropertytype() {
		return propertytype;
	}
	public int getAreasize() {
		return areasize;
	}
	public String getRequestname() {
		return requestname;
	}
	public int getContactnumber() {
		return contactnumber;
	}
	public int getBudget() {
		return budget;
	}
	public String getRenovationtype() {
		return renovationtype;
	}
	public int getRoomsrenovate() {
		return roomsrenovate;
	}
	public int getToiletren() {
		return toiletren;
	}
	public boolean isUrgent() {
		return urgent;
	}
	
	

}
