public class OperasiBoolean {

    public static void main(String[] args) {

        int absen = 70;
        int nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 80;

        boolean lulus1 = lulusAbsen && lulusNilai;
        boolean lulus2 = lulusAbsen || lulusNilai;

        System.out.println(lulus1);
        System.out.println(lulus2);
    }
}
