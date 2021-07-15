public class KonversiNumber {

    public static void main(String[] args) {


        //konversi auto
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long inilong = iniInt;
        float iniFloat = inilong;
        double iniDouble = iniFloat;


        //konversi manual

        /*
            hati" dengan konversi manual/paksa ini, karena jika nila tipe data yang akan dikonversi
            lebih besar maka akan terjadi number over flow
         */


        float iniFloat2 = (float) iniDouble;
        long iniLong2 = (long) iniFloat2;
        int iniInt2 = (int) iniLong2;
        short iniShort2 = (short) iniInt2;
    }
}
