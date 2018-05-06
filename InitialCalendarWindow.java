import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneLayout;

// _________METHODS WITHIN THIS CLASS___________
// public class InitialCalendarWindow 
// public void repaint() 
// private void displayLeftSidePanel(JPanel leftSideMonthPanel)
// private void displayRightSidePanel(JPanel rightSideMonthPanel)

/**
 * displays the initial calendar with the month on left and selected day on
 * right
 * 
 * generates the initial calendar that is shown to the user
 * 
 * @author trisha dittbenner
 * @version CS 151 Assignment #4
 *
 */

public class InitialCalendarWindow {

	// _____________EVENTS & CALENDAR FOR INITIAL WINDOW_____________
	private Events window;
	private GregorianCalendar calendar;

	// _____________CREATE LABELS FOR INITIAL WINDOW_____________
	private JLabel monthLabel = new JLabel();
	private JLabel dayLabel = new JLabel();

	// _____________CREATE PANELS FOR INITIAL WINDOW_____________
	private JPanel leftSideMonthPanel; // left side panel - month
	private JPanel rightSideMonthPanel; // right side panel - day

	// ---------------------------------------------------------------------------
	// --------------------------------CONSTRUCTOR--------------------------------
	// ---------------------------------------------------------------------------

	public InitialCalendarWindow(Events window) { // events that are set for the
													// initial calendar window
		this.window = window;
		this.calendar = window.getCalendar();
		this.leftSideMonthPanel = // ..... ;
		this.rightSideMonthPanel = // ..... ;


		// ___________________________________________________________________
		// ____________________INITIAL CALENDAR NEEDS_________________________

		// Main (initial) calendar display (i.e. the month and all dates) on
		// left
		// ------February 2018
		// ------Su Mo Tu We Th Fr Sa
		// ------1 2 3
		// ------4 5 6 7 8 9 10
		// ------11 12 13 14 15 16 17
		// ------18 19 20 {21} 22 23 24
		// ------25 26 27 28
		// right window that displays events for the day selected on the left

		// Toggle buttons < > to switch between days
		// Quit button (that will save events to "events.txt" then quit)
		// Create event button

		// STEPS:
		// 1. load the "events.txt" file (if it exists - for pre-existing
		// events)
		// 2. display the calendar and individual (selected) day's events
		// 3. display all buttons in the window
		// 4. when prompted to create event, display the create event window
		// 5. when prompted to toggle days, view should update date highlighted
		// and events on right
		// 6. when prompted to quit, save events to file "events.txt"
		// ___________________________________________________________________

		// ____________BUTTONS FOR INITIAL WINDOW____________
		// Toggle buttons < > to switch between days
		JButton nextDayButton = new JButton(">");
		JButton previousDayButton = new JButton("<");
		// Create event button
		JButton createButton = new JButton("Create an Event");
		// Quit button (that will save events to "events.txt" then quit)
		JButton quitButton = new JButton("Save & Quit");

		// _________ADD BUTTONS TO PANEL FOR INITIAL WINDOW_________
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(nextDayButton);
		buttonPanel.add(previousDayButton);
		buttonPanel.add(createButton);
		buttonPanel.add(quitButton);

		// _________ADD LISTENERS FOR BUTTONS IN INITIAL WINDOW_________

		// ___NEXT DAY BUTTON___
		nextDayButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				window.nextDay();
			}
		});

		// ___PREVIOUS DAY BUTTON___
		previousDayButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				window.previousDay();
			}
		});

		// ___CREATE EVENT BUTTON___
		createButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				CreateEventWindow createE = new CreateEventWindow(window);
			}
		});

		// ___SAVE & QUIT BUTTON___
		quitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				window.quit();
			}
		});

	}

	// ---------------------------------------------------------------------------
	// --------------------------------RE-PAINT-----------------------------------
	// ---------------------------------------------------------------------------

	/**
	 * repaints the window after the changes are made
	 */
	public void repaint() {

		// repaint the current window

	}

	// ---------------------------------------------------------------------------
	// ---------DRAW THE MONTH "window" on left of initial window---------------
	// ---------------------------------------------------------------------------

	/**
	 * models and displays the left side of the initial window (where the month
	 * display is)
	 * 
	 * @param leftSideMonthPanel
	 *            is the panel for the left side (with month view)
	 */
	private void displayLeftSidePanel(JPanel leftSideMonthPanel) {

		// model the calendar
		// highlight the day selected

		// Main (initial) calendar display (i.e. the month and all dates) on
		// left
		// ------February 2018
		// ------Su Mo Tu We Th Fr Sa
		// ------1 2 3
		// ------4 5 6 7 8 9 10
		// ------11 12 13 14 15 16 17
		// ------18 19 20 {21} 22 23 24
		// ------25 26 27 28

	}

	// ---------------------------------------------------------------------------
	// ---------DRAW THE DAY "window" on right of initial window---------------
	// ---------------------------------------------------------------------------

	/**
	 * models and displays the right side of the initial window (where the day
	 * display is)
	 * 
	 * @param rightSideDayPanel
	 *            is the panel for the right side (with day view)
	 */
	private void displayRightSidePanel(JPanel rightSideDayPanel) {

		// right window that displays events for the day selected on the left

	}

}