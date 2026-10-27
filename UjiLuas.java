import mahasiswa.matematika.*;

public class UjiLuas 
{
    public static void main(String[] args) 
    {
        // Memanggil method pesan dari package matematika
        Luas.pesan();

        // Menggunakan method hitungLuasPersegi
        int sisi = 5;
        int hasil = Luas.hitungLuasPersegi(sisi);
        
        System.out.println("Panjang sisi : " + sisi);
        System.out.println("Luas persegi : " + hasil);
    }
}