/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ca.mcgill.ecse.flexibook.application;

import ca.mcgill.ecse.flexibook.model.Appointment;
import ca.mcgill.ecse.flexibook.model.FlexiBook;
import ca.mcgill.ecse.flexibook.model.User;
import view.*;;

public class FlexiBookApplication {
  private static FlexiBook flexibook;  
  private static String message;
  private static User currentuser;
  private static Appointment currentappointment;
  private static AddServiceView addserviceview;
  private static CustomerView customerview;
  private static EditBusinessInfo editbusinessinfo;
  private static EditCustomerInfo editcustomerinfo;
  private static MainPage mainpage;
  private static MakeAppointmentView makeappointmentview;
  private static OwnerView ownerview;
  private static SignUpPage signuppage;
  private static UpdateAppointmentView updatappointmentview;
  private static UpdateServiceView updateserviceview;
  public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new FlexiBookApplication().getGreeting());
    }

    public static FlexiBook getflexibook() {
      if (flexibook == null) {
          flexibook = new FlexiBook();
      }
      return flexibook;
  }
    public static void setflexibook(FlexiBook fb) {
      flexibook = fb;
  }
public static void setmessage(String a) {
  message=a;
  
}
public static String returnmessage() {
  return message;
 
}
public static void setCurrentuser(User a) {
  currentuser=a;
}
public static User getCurrentuser() {
  return currentuser;
}
public static void setcurap(Appointment a) {
  currentappointment=a;
}
public static Appointment getCurrentap() {
  return currentappointment;
}
public static void setaptocus() {
  if(makeappointmentview!=null) {
    makeappointmentview.setVisible(false);
  }
    }
}
