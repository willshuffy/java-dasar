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


        /*
            Array initializer
         */


        //cara 1
        String[] namaHewan = {
                "ayam", "bebek", "kambing", "sapi", "kerbau"
        };


        //cara 2
        int[] arrayInt = new int[]{
                1,2,3,4,5,6,7,8,9
        };


        //cara 3
        long[] arrayLong = new long[]{
                10L, 20L, 30L
        };


        /*
            Array di dalam array
         */

        String[][] members= {
                {"Willy", "Saputra"},
                {"Bruce", "Wayne"},
                {"joko"}
        };

        System.out.println(members[0][0]);
        System.out.println(members[1][0]);
        System.out.println(members[2][0]);
    }
}
