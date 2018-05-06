import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
//import java.util.Calendar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
//import java.util.Calendar;
import java.util.ArrayList;
import java.util.Collections;

//  _________METHODS WITHIN THIS CLASS___________
//	public Events() 
//	public Events(String title, GregorianCalendar startTime, GregorianCalendar endTime) { //, GregorianCalendar dat
//	public GregorianCalendar getCalendar() 
//	public ArrayList<Events> getEvents() 
//	void setView(InitialCalendarWindow windowView) 
//	public void addEvent(Event e) 
//	public void previousDay() 
//	public void nextDay() 
//	public void setDay(int day) 
//	public String getTitle() 
//	public GregorianCalendar getStartTime() 
//	public GregorianCalendar getEndTime() 
//	public void setStartTime(GregorianCalendar st) 
//	public void setEndTime(GregorianCalendar et) 
//	public String eventToString() 
//	public int compareTo(Events e) 
//  public void quit() 

/**
 * general event class and the MODEL portion of the event
 * 
 * @author trisha dittbenner
 * @version CS 151 Assignment #4
 *
 */
public class Events implements Comparable<Events> {

	private ArrayList<Events> events = new ArrayList<>(); // holds the array of
															// events that are
															// to be saved in
															// the calendar

	private GregorianCalendar calendar; // sets the initial calendar to be
										// today's date
										// for the InitialCalendarView

	SimpleDateFormat sdf; // for formatting the date i.e. HH:MM:SS, etc..

	private InitialCalendarWindow windowView; // the view that is being
												// displayed
												// to the user

	private String title; // TITLE/name of the event

	// private GregorianCalendar date; // DATE of the event (MM/DD/YYYY)

	private GregorianCalendar startTime; // STARTing time (24 hour clock such as
											// 06:00 for
	// 6 AM)

	private GregorianCalendar endTime; // ENDing time (24 hour clock such as
										// 06:00 for 6
	// AM)

	// 1. load the events into calendar
	// 2. get today's date for the calendar window being displayed
	// 3. show the view/window to the user
	// 4. allow the user to toggle between days (prev/next)

	/**
	 * Set up a new Data model with today as the default value
	 */
	public Events() {
		calendar = new GregorianCalendar();
	}

	public Events(String title, GregorianCalendar startTime, GregorianCalendar endTime) { // ,
																							// GregorianCalendar
																							// date
		sdf = new SimpleDateFormat("MM-dd-yyyy hh:mm");

		this.title = title;
		// this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	/**
	 * gets the calendar being displayed/viewed
	 * 
	 * @return calendar based (initially initialized to today's date)
	 */
	public GregorianCalendar getCalendar() {

		return calendar;

	}

	/**
	 * gets the array list of events to be entered into the calendar when
	 * started
	 * 
	 * @return the list of events
	 */
	public ArrayList<Events> getEvents() {

		return events;

	}

	/**
	 * sets the view to the current window view that is updated
	 * 
	 * @param windowView
	 *            is the view being updated / set
	 */
	void setView(InitialCalendarWindow windowView) {

		this.windowView = windowView;

	}

	/**
	 * adds events to the calendar (that will be saved when program quits)
	 * 
	 * @param e
	 *            is each event being added to the calendar
	 */
	public void addEvent(Events e) {

		events.add(e); // events is the array list of events in the calendar

		Collections.sort(events); // sorts events based on the event added and
									// updates the window (i.e. the right window
									// that shows individual day's events)

		windowView.repaint(); // repaint the view that is displayed to the user

	}

	/**
	 * gets the previous day from the current day selected (i.e. for the toggle
	 * buttons to go between previous/next day)
	 */
	public void previousDay() {

		calendar.add(GregorianCalendar.DAY_OF_MONTH, -1);
		windowView.repaint();

	}

	/**
	 * gets the next day from the current day selected (i.e. for the toggle
	 * buttons to go between previous/next day)
	 */
	public void nextDay() {

		calendar.add(GregorianCalendar.DAY_OF_MONTH, 1);
		windowView.repaint();

	}

	/**
	 * sets the calendar to the date selected
	 * 
	 * @param day
	 *            is the day the calendar will move to
	 */
	public void setDay(int day) {

		calendar.set(GregorianCalendar.DAY_OF_MONTH, day); // GregorianCalendar
															// or
															// Calendar.DAY_OF_MONTH
															// ??
		windowView.repaint();

	}

	/**
	 * gets the title (name) of the event
	 * 
	 * @return title of event
	 */
	public String getTitle() {

		return title;
	}

	/**
	 * gets the start time of the event
	 * 
	 * @return startTime
	 */
	public GregorianCalendar getStartTime() {

		return startTime;
	}

	/**
	 * gets the end time of the event
	 * 
	 * @return endTime
	 */
	public GregorianCalendar getEndTime() {

		return endTime;
	}

	/**
	 * sets the start time for the event
	 * 
	 * @param st
	 *            is the starting time of the event
	 */
	public void setStartTime(GregorianCalendar st) {

		startTime = st;
	}

	/**
	 * sets the end time of the event
	 * 
	 * @param et
	 *            is the ending time of the event
	 */
	public void setEndTime(GregorianCalendar et) {

		endTime = et;
	}

	/**
	 * gets the string of: date, title of event, start/end time
	 * 
	 * @return the string
	 */
	public String eventToString() {

		return getTitle() + " " + getStartTime().toString() + " - " + getEndTime().toString();

	}

	/**
	 * compares the event to make sure the start/end times are valid
	 */
	@Override
	public int compareTo(Events e) {

		// _________________________________________________________________
		// https://www.tutorialspoint.com/java/lang/string_compareto.htm
		// | The result is a negative integer if this String object
		// | lexicographically precedes the argument string.
		// |
		// | The result is a positive integer if this String object
		// | lexicographically follows the argument string.
		// |
		// | The result is zero if the strings are equal, compareTo returns
		// | 0 exactly when the equals(Object) method would return true.
		// |________________________________________________________________

		// ______before( )______
		// public boolean before(Object when)
		//
		// Returns whether this Calendar represents a time before the time
		// represented by the specified Object.

		if (e.getStartTime().before(this.getStartTime()) && e.getEndTime().before(this.getStartTime())) {
			
			// if the new event is entirely before the other event
			return 1; 
			
		} else if (e.getStartTime().after(this.getEndTime()) && e.getEndTime().after(this.getEndTime())) {

			// if the new event is entirely after the other event
			return -1;
			
		} else {

			//if they have the same start and end times
			return 0;
		}
	}

	/**
	 * Saves the events and then quits the program
	 */
	public void quit() {

		// save events to "events.txt"

		// quit / close window

	}

}
