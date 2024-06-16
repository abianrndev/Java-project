package PRAKTIKUM3;

class Karyawan{
    String Nama;
    String Jabatan;

    //constructor 
    public Karyawan(String Nama, String Jabatan){
        this.Nama = Nama;
        this.Jabatan = Jabatan;
    }
    // methid display

    void displayName() {
    System.out.println("Karyawan dengan nama " + this.Nama); 
    
    }

    void displayJabatan(){
        System.out.println("Karyawan dengan jabatan " + this.Jabatan + "\n"); 
    }
}


class Pimpinan extends Karyawan{
    String NIK;
    //constructor
    public Pimpinan(String Nama, String NIK){
        super(Nama, "pimpinan");
        this.NIK = NIK;
    }

    //method
    void detailPimpinan(){

        System.out.println(this.Nama + "adalah pimpinan personalia");
        System.out.println(this.Nama + " memiliki NIK " + this.NIK);

    }
}

public class MainP3 {
    
    public static void main(String [] args){

        Karyawan karyawan1 = new Karyawan(" Cinta", " Direktur");
        //memanggil method
        karyawan1.displayName();
        karyawan1.displayJabatan();

        Pimpinan pimpinan1 = new Pimpinan("Cinta ", "2205101011");
        pimpinan1.detailPimpinan();
    }
}
