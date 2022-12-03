public class MainApp {
    public static void main(String[] args) {
        Perangkat perangkat1 = new Perangkat("Adata",2,(float)1.80);
        Laptop laptop1 = new Laptop("Seagate", 8, (float)2.40, false);
        Handphone handphone1 = new Handphone("Sandisk",3,(float)2.20,false);

        perangkat1.informasi();
        System.out.println();
        laptop1.informasi();
        laptop1.bukaGame("stumble guy");
        laptop1.kirimEmail("dindacha@student.telkomuniversity.com");
        laptop1.kirimEmail("dindacha3@gmail.com","dindacha@student.telkomuniversity.com");

        System.out.println();
        handphone1.informasi();
        handphone1.telfon(628569547);
        handphone1.kirimSMS(628569547, 628786077);
    }
}

