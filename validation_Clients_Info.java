
package contacts;
 
import javax.swing.JOptionPane;
  

public class validation_Clients_Info {
     private String nameL;
     private String phoneNumberL;
     private String emailL;
     private String addressL;
     private String message;
      private boolean f;
      
      {
        nameL = "";
        phoneNumberL = "";
        emailL = ""; 
        addressL = "";
        f = true;
      }
      
       public String getMessage(){
          return message;
       }
      public validation_Clients_Info(String nameL,String phoneNumberL,String emailL){
        setNameL(nameL);
        setPhoneNumberL(phoneNumberL);
        setEmailL(emailL);
      }
      public validation_Clients_Info(String nameL,String phoneNumberL,String emailL,String addressL){
        this(nameL, phoneNumberL,emailL);
        setAddressL(addressL);
      }
      public String getNameL(){
         return nameL.trim();
      }

      public void setNameL(String nameL) {
        if( !nameL.isEmpty()&& nameL.trim().replaceAll("[ ]+", "").length() >= 10 ){
          this.nameL= nameL;
        }else{
          message += " Name Is Invalid\n ";
          f = false;
        }
    }
   
      public String getEmailL(){
         return emailL.trim();
      }
      public void setEmailL(String emailL) {
         if(emailL.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")){
           this.emailL = emailL.trim().toLowerCase();
         }else{
            message += " Email Is Invalid\n ";
            f = false;
         }
    }
     public String getPhoneNumberL(){
         return phoneNumberL.trim();
      }
     public void setPhoneNumberL(String phoneNumberL) {
        if(phoneNumberL.length()== 11 && (phoneNumberL.startsWith("012") ||
              phoneNumberL.startsWith("011") || phoneNumberL.startsWith("010")||  phoneNumberL.startsWith("015"))){
          this.phoneNumberL = phoneNumberL.trim();
        }else{
            message+=" Phone Number Is Invalid\n ";
            f = false;
        }
    }
    public String getAddressL(){
         return addressL.trim();
      }
    public void setAddressL(String addressL) {
       if(addressL.length() >= 5 ){
         this.addressL = addressL.trim();
       }else{
          message+=" Address Is Invalid\n ";
            f = false;
       }
    }
    public boolean vlag(){
       return f;
    }
    
}
