public class Array {

    public static void main(String[] args) {

        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Willy";
        stringArray[1] = "Saputra";
        stringArray[2] = "batsy";


        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "Bruce";

        System.out.println(stringArray[0]);
    }
}
