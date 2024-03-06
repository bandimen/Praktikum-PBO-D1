//Nama      : Fendi Ardianto
//NIM       : 24060122130077
//Lab       : D1


public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        else{
            System.out.println("Angka "+angka+" bukan angka sial");
        }
    }

    public static void main(String[] args){
        AngkaSial angkasial = new AngkaSial();
        try{
            angkasial.cobaAngka(10);
            angkasial.cobaAngka(13);
            angkasial.cobaAngka(12);
        }
        catch(AngkaSialException sial){
            System.out.println(sial.getMessage());
            System.out.println("hati-hati memasukkan angka");
        }
    }
}

/* 
Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
Jawab: 
    Tidak, ketika terjadi eksepsi, program akan langsung meng-throw sebuah eksepsi dan menghentikan perintah yang ada di line selanjutnya

Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
Jawab:
    Tidak, karena di baris 20 terjadi eksepsi, sehingga langsung ditangkap oleh catsh AngkaSialException dan mengabaikan perintah yang ada di baris selanjutnya pada try.



*/