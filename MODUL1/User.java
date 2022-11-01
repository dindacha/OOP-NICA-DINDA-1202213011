package MODUL1;

public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    String namauser;
    Integer notelpon;

    public void setNamauser (String namauser){
        this.namauser = namauser;
    }
    public void setNotelpon (Integer notelpon){
        this.notelpon = notelpon;
    }

    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    public void register (){
        System.out.println("Register Success");
        System.out.println("Nama : " + namauser);
        System.out.println("Phone Number : " + notelpon);


    }

}
