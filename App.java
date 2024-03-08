public class App {
    public static void main(String[] args) {

        SegitigaSikuSiku segitigaSikuSiku = new SegitigaSikuSiku(5, 8);
        System.out.println("Luas Segitiga Siku-Siku: " + segitigaSikuSiku.hitungLuas());

        Persegi persegi = new Persegi(9);
        System.out.println("Luas Persegi: " + persegi.hitungLuas());

        Lingkaran lingkaran = new Lingkaran(10);
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
    }
}
