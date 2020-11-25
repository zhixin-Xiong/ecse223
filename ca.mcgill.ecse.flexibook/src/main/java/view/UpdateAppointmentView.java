package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import ca.mcgill.ecse.flexibook.Controller.FlexibookController;
import ca.mcgill.ecse.flexibook.Controller.InvalidInputException;
import ca.mcgill.ecse.flexibook.application.FlexiBookApplication;
import ca.mcgill.ecse.flexibook.model.Appointment;
import ca.mcgill.ecse.flexibook.model.BookableService;

public class UpdateAppointmentView{

	public static JFrame frame = new JFrame();
	private static JLabel Title = new JLabel();
	private static JLabel User = new JLabel();
	private static String error=null;
	private static JLabel errorMessage = new JLabel("");
	private static JLabel errorMessage2 = new JLabel("");
	private static JLabel date = new JLabel();
	private static JLabel appdetail = new JLabel();
	private static JLabel starttime = new JLabel();
	private static JLabel Bookable = new JLabel();
	private static JTextField dateinput = new JTextField();
	private static JTextField usr_input = new JTextField();
	private static JTextField starttimeinput = new JTextField();
	private static JComboBox<String> BookableService = new JComboBox<String>();
	private static JButton make = new JButton();
	private static JButton back = new JButton();
	private static JButton cancel = new JButton();
	
	public UpdateAppointmentView() {
		init();
	}
	
	public static void main(String[] args) {
		init();
	}
	
	private static void init() {
		JPanel panel = new JPanel();
		Font font1 = new Font("Times New Romans", Font.BOLD, 20);
		panel.setLayout(null);
		frame.add(panel);
		frame.setSize(700, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Appointment cura=FlexiBookApplication.getCurrentap();
		Title.setText("Update an Appointment:");
		Title.setBounds(200, 50, 400, 75);
		Title.setFont(font1);
		panel.add(Title);
		//appdetail.setText("Current Service: "+cura.getBookableService().getName()+"Current Startdate: "+
				//cura.getTimeSlot().getStartDate().toString()+"Current Starttime"+ cura.getTimeSlot().getStartTime());
		appdetail.setBounds(200, 150, 80, 25);
		panel.add(User);
		date.setText("New Start Date(yyyy-mm-dd): ");
		date.setBounds(100, 200, 200, 25);
		panel.add(date);
		dateinput.setBounds(330, 200, 165, 25);
		panel.add(dateinput);
		starttime.setText("New Start Time(hh:mm): ");
		starttime.setBounds(135, 250, 165, 25);
		panel.add(starttime);
		starttimeinput.setBounds(330, 250, 165, 25);
		panel.add(starttimeinput);
		Bookable.setText("Please choose the Service: ");
		Bookable.setBounds(120, 300, 200, 25);
		panel.add(Bookable);
		BookableService.setBounds(330,300,165,25);
		panel.add(BookableService);
		if(FlexiBookApplication.getflexibook().getBookableServices().size()>0) {
			BookableService.addItem("null");
			for(BookableService a: FlexiBookApplication.getflexibook().getBookableServices()) {
				BookableService.addItem(a.getName());
			}
		}
		BookableService.addItem("null");
		BookableService.addItem("cut");
		BookableService.addItem("wash");
		cancel.setText("Cancel Appointment");
		cancel.setBounds(300, 370, 180, 25);
		cancel.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cancelAppointmentActionPerformed(evt);
			}});
		panel.add(cancel);
		back.setText("Back");
		back.setBounds(550, 370, 100, 25);
		back.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					backAppointmentActionPerformed(evt);
				} catch (InvalidInputException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}});
		panel.add(back);  
		make.setText("Update");
		make.setBounds(150, 370, 100, 25);
		make.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				makeAppointmentActionPerformed(evt);
			}});
		panel.add(make); 
		errorMessage.setBounds(200, 400, 500, 25);
		errorMessage.setForeground(Color.red);
		panel.add(errorMessage);
		errorMessage2.setBounds(200, 450, 300, 25);
		errorMessage2.setForeground(Color.red);
		panel.add(errorMessage2);

		frame.setVisible(true);  

	}
	
	private static void makeAppointmentActionPerformed(ActionEvent evt) {
		try {
			Appointment a = FlexiBookApplication.getCurrentap();
			String oldstarttime=a.getTimeSlot().getStartTime().toString().substring(0,a.getTimeSlot().getStartTime().toString().length()-3);;
			if(BookableService.getSelectedItem().toString()=="null") {
				FlexibookController.UpdateAppointment(FlexiBookApplication.getCurrentuser().getUsername(),null,null, null,
						FlexiBookApplication.getCurrentap().getBookableService().getName(),a.getTimeSlot().getStartDate().toString(),dateinput.getText(),
						oldstarttime, starttimeinput.getText());
			}else {
				FlexibookController.CancelAppointment(FlexiBookApplication.getCurrentuser().getUsername(),null,
						a.getTimeSlot().getStartDate().toString(), oldstarttime);

				FlexibookController.MakeAppointment(FlexiBookApplication.getCurrentuser().getUsername(),
						date.getText(), BookableService.getSelectedItem().toString(), null, starttime.getText());
			}
			errorMessage.setText("Successfully update an appointment");
		}catch (InvalidInputException e) {
			error = e.getMessage();
			errorMessage.setText(error);
			errorMessage2.setText("Sorry the appointment is not updated");
		}
	}
	
	private static void cancelAppointmentActionPerformed(ActionEvent evt) {
//		try {
//			FlexibookController.CancelAppointment(customer, customer2, serviceDate, startTime);
//		} catch(InvalidInputException e) {
//			
//		}
	}
	
	private static void backAppointmentActionPerformed(ActionEvent evt) throws InvalidInputException {
		FlexiBookApplication.updateappcancel();
	}


}


