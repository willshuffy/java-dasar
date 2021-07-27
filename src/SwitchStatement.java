public class SwitchStatement {

    public static void main(String[] args) {

        String nilai = "B";

        switch (nilai){
            case "A":
                System.out.println("Wow, anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai anda cukup baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("mungkin anda salah jurusan");
        }
    }
}
