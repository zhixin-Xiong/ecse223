/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ca.mcgill.ecse.flexibook.application;

import ca.mcgill.ecse.flexibook.model.Appointment;
import ca.mcgill.ecse.flexibook.model.FlexiBook;
import ca.mcgill.ecse.flexibook.model.Owner;
import ca.mcgill.ecse.flexibook.model.User;
import view.*;;

public class FlexiBookApplication {
  private static FlexiBook flexibook;
  private static String message;
  private static User currentuser;
  private static Appointment currentappointment;
  private static CreateServiceView addserviceview;
  private static CustomerView customerview;
  private static EditBusinessInfo editbusinessinfo;
  private static EditCustomerInfo editcustomerinfo;
  private static MainPage mainpage;
  private static MakeAppointmentView makeappointmentview;
  private static OwnerView ownerview;
  private static SignUpPage signuppage;
  private static UpdateAppointmentView updateappointmentview;
  private static UpdateServiceView updateserviceview;
  private static EditOwnerAccount editowneraccount;
  private static ViewBusinessInfoCustomer viewbcustomer;
  private static ViewBusinessInfoOwner viewbowner;
  
  public static void main(String[] args) {
     start();
   // flexibook = new FlexiBook();
   
    //currentuser = flexibook.getOwner();
   // init();
  
  }

  private static void init() {
    editbusinessinfo = new EditBusinessInfo();

  }

  public static void start() {
    mainpage = new MainPage();
    
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
    message = a;

  }

  public static String returnmessage() {
    return message;

  }

  public static void setCurrentuser(User a) {
    currentuser = a;
  }

  public static User getCurrentuser() {
    return currentuser;
  }

  public static void setcurap(Appointment a) {
    currentappointment = a;
  }

  public static Appointment getCurrentap() {
    return currentappointment;
  }

  public static void setaptocus() {
    if (customerview == null) {
      customerview = new CustomerView();
    } else {
      if (makeappointmentview.frame.isVisible() == true) {
        if (customerview.frame.isVisible() == false) {
          customerview.frame.setVisible(true);
        }
        makeappointmentview.frame.setVisible(false);
      } else {

        makeappointmentview.frame.setVisible(false);
      }
    }
  }

  public static void gotomakeappointment() {
    if (makeappointmentview == null) {
      makeappointmentview = new MakeAppointmentView();
    } else {
      if (customerview.frame.isVisible() == true) {
        if (makeappointmentview.frame.isVisible() == false) {
          makeappointmentview.frame.setVisible(true);
        }
        customerview.frame.setVisible(false);
      } else {
        makeappointmentview.frame.setVisible(true);
      }
    }
  }

  public static void editownercancel() {
    if (ownerview == null) {
      ownerview = new OwnerView();
    } else {
      if (editowneraccount.frame.isVisible() == true) {
        if (ownerview.frame.isVisible() == false) {
          ownerview.frame.setVisible(true);
        }
        editowneraccount.frame.setVisible(false);
      } else {
        ownerview.frame.setVisible(true);
      }
    }
  }

  public static void ownertoedit() {
    if (editowneraccount == null) {
      editowneraccount = new EditOwnerAccount();
    } else {
      if (ownerview.frame.isVisible() == true) {
        if (editowneraccount.frame.isVisible() == false) {
          editowneraccount.frame.setVisible(true);
        }
        ownerview.frame.setVisible(false);
      } else {
        editowneraccount.frame.setVisible(true);
      }
    }
  }

  public static void ownertoaddservice() {
    if (addserviceview == null) {
      addserviceview = new CreateServiceView();
    } else {
      if (ownerview.frame.isVisible() == true) {
        if (addserviceview.frame.isVisible() == false) {
          addserviceview.frame.setVisible(true);
        }
        ownerview.frame.setVisible(false);
      } else {
        addserviceview.frame.setVisible(true);
      }
    }
  }

  public static void addservicecancel() {
    if (ownerview == null) {
      ownerview = new OwnerView();
    } else {
      if (addserviceview.frame.isVisible() == true) {
        if (ownerview.frame.isVisible() == false) {
          ownerview.frame.setVisible(true);
        }
        addserviceview.frame.setVisible(false);
      } else {
        ownerview.frame.setVisible(true);
      }
    }
  }

  public static void logout() {
    if (mainpage == null) {
      mainpage = new MainPage();
    } else {
      if (ownerview.frame.isVisible() == true) {
        if (mainpage.frame.isVisible() == false) {
          mainpage.frame.setVisible(true);
        }
        ownerview.frame.setVisible(false);
      } else {
        mainpage.frame.setVisible(true);
      }
    }
  }

  public static void updateservice() {
    if (updateserviceview == null) {
      updateserviceview = new UpdateServiceView();
    } else {
      if (ownerview.frame.isVisible() == true) {
        if (updateserviceview.frame.isVisible() == false) {
          updateserviceview.frame.setVisible(true);
        }
        ownerview.frame.setVisible(false);
      } else {
        updateserviceview.frame.setVisible(true);
      }
    }
  }

  public static void updateservicecancel() {
    if (ownerview == null) {
      ownerview = new OwnerView();
    } else {
      if (updateserviceview.frame.isVisible() == true) {
        if (ownerview.frame.isVisible() == false) {
          ownerview.frame.setVisible(true);
        }
        updateserviceview.frame.setVisible(false);
      } else {
        ownerview.frame.setVisible(true);
      }
    }
  }

  public static void ownertobusiness() {
    if (viewbowner == null) {
      viewbowner = new ViewBusinessInfoOwner();
    } else {
      if (ownerview.frame.isVisible() == true) {
        if (viewbowner.frame.isVisible() == false) {
          viewbowner.frame.setVisible(true);
        }
        ownerview.frame.setVisible(false);
      } else {
        viewbowner.frame.setVisible(true);
      }
    }
  }

  public static void businesstoowner() {
    if (ownerview == null) {
      ownerview = new OwnerView();
    } else {
      if (viewbowner.frame.isVisible() == true) {
        if (ownerview.frame.isVisible() == false) {
          ownerview.frame.setVisible(true);
        }
        viewbowner.frame.setVisible(false);
      } else {
        ownerview.frame.setVisible(true);
      }
    }
  }

  public static void editbusiness() {
    if (editbusinessinfo == null) {
      editbusinessinfo = new EditBusinessInfo();
    } else {
      if (viewbowner.frame.isVisible() == true) {
        if (editbusinessinfo.frame.isVisible() == false) {
          editbusinessinfo.frame.setVisible(true);
        }
        viewbowner.frame.setVisible(false);
      } else {
        editbusinessinfo.frame.setVisible(true);
      }
    }
  }

  public static void editbusinessinfocancel() {
    if (viewbowner == null) {
      viewbowner = new ViewBusinessInfoOwner();
    } else {
      if (editbusinessinfo.frame.isVisible() == true) {
        if (viewbowner.frame.isVisible() == false) {
          viewbowner.frame.setVisible(true);
        }
        editbusinessinfo.frame.setVisible(false);
      } else {
        viewbowner.frame.setVisible(true);
      }
    }
  }  public static void clogout() {
    if (mainpage == null) {
      mainpage = new MainPage();
    } else {
      if (customerview.frame.isVisible() == true) {
        if (mainpage.frame.isVisible() == false) {
          mainpage.frame.setVisible(true);
        }
        customerview.frame.setVisible(false);
      } else {
        mainpage.frame.setVisible(true);
      }
    }
  }  public static void editcustomercancel() {
    if (customerview == null) {
      customerview = new CustomerView();
    } else {
      if (editcustomerinfo.frame.isVisible() == true) {
        if (customerview.frame.isVisible() == false) {
          customerview.frame.setVisible(true);
        }
        editcustomerinfo.frame.setVisible(false);
      } else {
        customerview.frame.setVisible(true);
      }
    }
  }

  public static void customertoedit() {
    if (editcustomerinfo == null) {
      editcustomerinfo = new EditCustomerInfo();
    } else {
      if (customerview.frame.isVisible() == true) {
        if (editcustomerinfo.frame.isVisible() == false) {
          editcustomerinfo.frame.setVisible(true);
        }
        customerview.frame.setVisible(false);
      } else {
        editcustomerinfo.frame.setVisible(true);
      }
    }
  }  
  public static void customertobusiness() {
    if (viewbcustomer== null) {
      viewbcustomer = new ViewBusinessInfoCustomer();
    } else {
      if (customerview.frame.isVisible() == true) {
        if (viewbcustomer.frame.isVisible() == false) {
          viewbcustomer.frame.setVisible(true);
        }
        customerview.frame.setVisible(false);
      } else {
        viewbcustomer.frame.setVisible(true);
      }
    }
  }

  public static void businesstocustomer() {
    if (customerview == null) {
      customerview = new CustomerView();
    } else {
      if (viewbcustomer.frame.isVisible() == true) {
        if (customerview.frame.isVisible() == false) {
          customerview.frame.setVisible(true);
        }
        viewbcustomer.frame.setVisible(false);
      } else {
        customerview.frame.setVisible(true);
      }
    }
  }
  public static void updateapp() {
    if (updateappointmentview== null) {
      updateappointmentview = new UpdateAppointmentView();
    } else {
      if (customerview.frame.isVisible() == true) {
        if (updateappointmentview.frame.isVisible() == false) {
          updateappointmentview.frame.setVisible(true);
        }
        customerview.frame.setVisible(false);
      } else {
        updateappointmentview.frame.setVisible(true);
      }
    }
  }

  public static void updateappcancel() {
    if (customerview == null) {
      customerview = new CustomerView();
    } else {
      if (updateappointmentview.frame.isVisible() == true) {
        if (customerview.frame.isVisible() == false) {
          customerview.frame.setVisible(true);
        }
        updateappointmentview.frame.setVisible(false);
      } else {
        customerview.frame.setVisible(true);
      }
    }
  }
  public static void tocustomer() {
    if (customerview == null) {
      customerview = new CustomerView();
    } else {
      if (mainpage.frame.isVisible() == true) {
        if (customerview.frame.isVisible() == false) {
          customerview.frame.setVisible(true);
        }
        mainpage.frame.setVisible(false);
      } else {
        customerview.frame.setVisible(true);
      }
    }
  }
  public static void toowner() {
    if (ownerview == null) {
      ownerview = new OwnerView();
    } else {
      if (mainpage.frame.isVisible() == true) {
        if (ownerview.frame.isVisible() == false) {
          ownerview.frame.setVisible(true);
        }
        mainpage.frame.setVisible(false);
      } else {
        ownerview.frame.setVisible(true);
      }
    }
  }
}
