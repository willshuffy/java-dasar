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

        /*
                Switch Lambda statement
         */

        switch (nilai){
            case "A" -> System.out.println("Cumlaude");
            case "B","C" -> System.out.println("lulus");
            case "D" -> System.out.println("tidak lulus");
            default ->{
                System.out.println("drop out");
            }
        }

        /*
                Switch case Yield
         */


        // Switch tanpa yield
        nilai = "A";

        String ucapan;
        switch (nilai){
            case "A" -> ucapan = "Cumlaude";
            case "B","C" -> ucapan = "lulus";
            case "D" -> ucapan =  "tidak lulus";
            default -> ucapan = "drop out";
        }
            System.out.println(ucapan);


        // Switch dengan yield
        nilai = "D";
        ucapan = switch (nilai){
            case "A" :
                yield "Cumlaude";
            case "B","C":
                yield  "lulus";
            case "D" :
                yield "tidak lulus";
            default :
                yield "drop out";
        };
        System.out.println(ucapan);
    }
}
