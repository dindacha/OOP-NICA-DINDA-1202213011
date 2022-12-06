public class Sampan extends TransportasiAir {
    protected int layar;

    public Sampan (int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;
    }

    public void informasi(){
        System.out.println("Transportasi Air jenis sampan dengan kursi berjumlah " + this.jumlahKursi + " ditetapkan dengan biaya sebesar Rp."+ this.biaya);
    }

    public void berlayar(){
        System.out.println("Transportasi Air jenis sampan sedang berlayar menggunakan " + this.layar + " layar");
    }

    public void berlabuh(){
        System.out.println("Transportasi Air jenis sampan berlabuh di pantai tanpa jangkar");
    }

    public void berlabuh(int jangkar){
        System.out.println("Transportasi Air jenis sampan berlabuh di pantai menggunakan " + jangkar + " jangkar");
    }

}
