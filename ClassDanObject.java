class customerData {
    String nama;
    String alamat;
    String tanggalLahir;
    String pekerjaan;
    int gaji;
    
    void berinama (String namaCustomer){
        nama = namaCustomer;
    }
    void berialamat(String alamatCustomer){
        alamat = alamatCustomer;
    }
    void beritanggalLahir (String tanggalLahirCustomer){
        tanggalLahir =  tanggalLahirCustomer;
    }
    void beripekerjaan (String perkerjaanCustomer){
        pekerjaan = perkerjaanCustomer;
    }
    void berigaji (int gajicustomer){
        gaji = gajicustomer;
    }
    void informasi (){
        System.out.println("Nama Customer = " + nama);
        System.out.println("Alamat Customer = " + alamat);
        System.out.println("Tanggal Lahir = " + tanggalLahir);
        System.out.println("Pekerjaan = " + pekerjaan);
        System.out.println("Gaji = Rp. " + gaji);
        
    }
}
public class Main {

   
    public static void main(String[] args) {
        customerData data = new customerData();
        data.berinama("Nikki Rufiansya");
        data.berialamat("Jl Candi III E");
        data.beritanggalLahir("13-02-1997");
        data.beripekerjaan("Pelajar/Mahasiswa");
        data.berigaji(5000000);
        data.informasi();
    }
    
}
