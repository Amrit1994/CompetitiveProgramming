import java.io.IOException;

public class Assignment {

	static class BstNode {
		int key;
		BstNode left, right;

		public BstNode(int data) {
			key = data;
			left = right = null;
		}
	}

	public static final String GOOGLE_ACCOUNT_USERNAME = "xxxx@gmail.com"; // Fill in google account username
	public static final String GOOGLE_ACCOUNT_PASSWORD = "xxxx"; // Fill in google account password
	public static final String SPREADSHEET_URL = "https://docs.google.com/spreadsheets/d/1er_hWK1iarUIyc5GQ4-Qzp8B6K94AhkDrz-9QFgB0Tw/edit#gid=0"; // Fill
																																					// in
																																					// google
																																					// spreadsheet
																																					// URI

	/*
	 * public void readSpreadSheet() throws IOException, ServiceException{
	 * 
	 *//** Our view of Google Spreadsheets as an authenticated Google user. *//*
																				 * SpreadsheetService service = new
																				 * SpreadsheetService("Print Google Spreadsheet Demo"
																				 * );
																				 * 
																				 * // Login and prompt the user to pick
																				 * a sheet to use.
																				 * service.setUserCredentials(
																				 * GOOGLE_ACCOUNT_USERNAME,
																				 * GOOGLE_ACCOUNT_PASSWORD);
																				 * 
																				 * // Load sheet URL metafeedUrl = new
																				 * URL(SPREADSHEET_URL);
																				 * SpreadsheetEntry spreadsheet =
																				 * service.getEntry(metafeedUrl,
																				 * SpreadsheetEntry.class); URL
																				 * listFeedUrl = ((WorksheetEntry)
																				 * spreadsheet.getWorksheets().get(0)).
																				 * getListFeedUrl();
																				 * 
																				 * // Print entries ListFeed feed =
																				 * (ListFeed)
																				 * service.getFeed(listFeedUrl,
																				 * ListFeed.class); for(ListEntry entry
																				 * : feed.getEntries()) {
																				 * System.out.println("new row");
																				 * for(String tag :
																				 * entry.getCustomElements().getTags())
																				 * { System.out.println("     "+tag +
																				 * ": " +
																				 * entry.getCustomElements().getValue(
																				 * tag)); } } }
																				 */

}
