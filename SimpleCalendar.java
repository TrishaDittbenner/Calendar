import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * the class with the main method that will run the program Loads / creates new
 * set of events and loads/runs the initial calendar view
 * 
 * @author trisha dittbenner
 * @version CS 151 Assignment #4
 *
 */
public class SimpleCalendar { // name SimpleCalendar per instructions
								// (class w/ main)

	public static void main(String[] args) {

		Events myCalendar = new Events();
		InitialCalendarWindow openingWindow = new InitialCalendarWindow(myCalendar);
		myCalendar.setView(openingWindow); // opens the first view to be the
											// calendar with daily events

	}
}
