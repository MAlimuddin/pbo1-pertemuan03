package percabangan;

public class Switch {
    public static void main(String[] args){
        char nilai='D';
        switch (nilai){
            case 'A':
                System.out.println("Mhs   :\"Terimakasih Pak\"");
                System.out.println("Dosen :\"Selamat ya!!\"");
                break;
            case 'B':
                System.out.println("Mhs   :\"Kenapa Ulun kada Dapat A, Pak?\"");
                System.out.println("Dosen :\"!@3$%$!!\"");
                break;
            case 'C':
                System.out.println("Mhs   :\"Ulun Turun Pul Pak Ai, Tugas Pul Jua\"");
                System.out.println("Dosen :\"Tapi Bisa lah Menjawab Ujian\"");
                System.out.println("Mhs   :\"Hihihihihi\"");
                break;
            default:
                System.out.println("Mhs   :\"Ulun Turun Pul Pak Ai , Tugas Pul Jua\"");
                System.out.println("Dosen :\"Bujur Jua Kah\"");
                System.out.println("Dosen :\"Memeriksa Berkas\"");
                System.out.println("Dosen :\"Menceleng\"");
                System.out.println("Mhs   :\"Kabur..\"");
                break;

        }
    }
}
