package MODUL1;

import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        // TODO Create Database
        Database db = new Database();

        // TODO Create Menu
        Menu mn1 = new Menu();   
        mn1.setNama("bakso");
        mn1.setKategori("makanan");
        mn1.setHarga("10000");
       
        Menu mn2 = new Menu(); 
        mn2.setNama("nasi goreng");
        mn2.setKategori("makanan");
        mn2.setHarga("15000");

        Menu mn3 = new Menu(); 
        mn3.setNama("nasi kuning");
        mn3.setKategori("makanan");
        mn3.setHarga("15000");

        // TODO Insert Menu to Database
        db.insertmenu(mn1);
        db.insertmenu(mn2);
        db.insertmenu(mn3);


        // TODO Display Main Menu and User must be Register First
        System.out.println("Selamat Datang di Restoran EAD");
        System.out.println("Silakan Registrasi terlebih dahulu");



        // TODO Create User from register in Main Menu
        User ur1 = new User();
        ur1.setNamauser("Nama :");
        ur1.setNotelpon("No. Telpon :");

        // TODO Display Menu
        public displaymenu() {
            ;
        }

    }
}
