
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
import javax.swing.JTextField;
import javax.swing.ScrollPaneLayout;

// _________METHODS WITHIN THIS CLASS___________
// CreateEventWindow(Events window) {

/**
 * a view portion of the project that when the create event button is selected,
 * it opens a new window for creating an event (description, date, times)
 * 
 * @author trisha dittbenner
 * @version CS 151 Assignment #4 *
 */
public class CreateEventWindow {

	CreateEventWindow(Events window) {

		// get the previous calendar to save the events to
		GregorianCalendar calendar = window.getCalendar();

		// create a frame for the create event window
		JFrame frame = new JFrame();

		// create a J text area for the event description
		JTextField eventTitle = new JTextField("Title / Location of Event");

		// create a J text area for the date (either allow user to edit or just
		// fill content with date the calendar was on
		SimpleDateFormat sDf = new SimpleDateFormat("MM/dd/yyyy"); // (s)imple(D)ate(f)ormat
		String dF = sDf.format(calendar.DATE); // (d)ate(F)ormat
		// System.out.println(b);
		JTextField eventDate = new JTextField(dF);

		// create a J text area for the start time
		SimpleDateFormat startEndTime = new SimpleDateFormat("hh:mm aa");
		String startT = startEndTime.format(calendar.HOUR_OF_DAY);
		JTextField startOfEvent = new JTextField(startT);

		// create a J text area for the end time
		String endTime = startEndTime.format(calendar.HOUR_OF_DAY + 1);
		JTextField endOfEvent = new JTextField(endTime);

		// create a save / add event button
		JButton saveEvent = new JButton("SAVE");

		// exit / close (changed mind) button
		JButton exit = new JButton("Exit");

		// add all of above to the createEventPanel
		JPanel createEventPanel = new JPanel();

		createEventPanel.add(saveEvent);
		createEventPanel.add(exit);
		createEventPanel.add(eventDate);
		createEventPanel.add(startOfEvent);
		createEventPanel.add(endOfEvent);

		// add panel to frame
		frame.add(createEventPanel);

		// _____________ADD ACTION LISTENERS_________________
		saveEvent.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				window.save();
				// ADD A METHOD TO SAVE
			}
		});

		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				window.quit(); // frame.quit? or window.quit?
			}
		});

		eventDate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// call method here

			}
		});

		startOfEvent.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// call method here

			}
		});

		endOfEvent.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// call method here

			}
		});

	}
}
