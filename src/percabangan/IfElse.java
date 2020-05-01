package percabangan;

public class IfElse {
    public static void main(String[] args){
        double totalBelanja = 25000;
        double uangDiDompet = 53000;

        if (uangDiDompet<totalBelanja) {
            System.out.println("Uang Kurang, Kurangi Jajan Anda");
        }else {
            System.out.println("Uang Cukup, Berelaan lah");
        }
    }
}
