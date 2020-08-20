import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<requestquote> RequestquoteList = new ArrayList<requestquote>();

	}

	public static requestquote inputrequestquote() {
		String propertytype = Helper.readString("Enter propertytype > ");
		int areasize = Helper.readInt("Enter Area Size > ");
		String requestname = Helper.readString("Enter Request name > ");
		int contactnumber = Helper.readInt("Enter contact number > ");
		int budget = Helper.readInt("Enter your budget > ");
		String renovationtype = Helper.readString("Enter the renovation type > ");
		int roomsrenovate = Helper.readInt("Enter the number of rooms to be renovated > ");
		int toiletren = Helper.readInt(" Enter the number of toilets to renovate > ");
		String style = Helper.readString("Enter the renovation style > ");
		boolean urgent = false;

		requestquote rq = new requestquote(propertytype, areasize, requestname, contactnumber, budget, renovationtype,
				roomsrenovate, toiletren, style, urgent);
		return rq;

	}

	public static void addRequestQuote(ArrayList<requestquote> RequestquoteList, requestquote rq) {

		RequestquoteList.add(rq);
		System.out.println("Request added");
	}

}
