public class IfElse {

    public static void main(String[] args) {

        /*
            IF Else statement
         */

        int nilai = 80;
        int absen = 90;

        if (nilai >= 75 && absen >= 75){
            System.out.println("selamat anda lulus");
        } else {
            System.out.println("silahkan coba lagi tahun depan");
        }

        /*
            Els IF Statement
         */

        if (nilai >= 90 && absen >= 90){
            System.out.println("Nilai anda A");
        }else if (nilai >= 80 && absen >= 80){
            System.out.println("Nilai anda B");
        }else if (nilai >= 70 && absen >= 70){
            System.out.println("Nilai anda C");
        }else {
            System.out.println("Nilai anda D");
        }
    }
}
