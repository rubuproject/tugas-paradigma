import mahasiswa.*;

public class cobaPaket
{
    public static void main(String args[])
    {
        // Memanggil method static isiPaket()
        Paket.isiPaket();

        // Membuat objek dari class Paket untuk mengakses method setData() dan info()
        Paket mhs = new Paket();
        mhs.setData(20, "Budi"); 
        mhs.info();              
    }
}