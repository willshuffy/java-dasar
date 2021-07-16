public class OperasiMatematika {
    public static void main(String[] args) {

        int a = 100;
        int b = 10;


        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);


        /*
            Aughmented assignment
            operasi matematika dengan dirinya sendiri
         */

        a = 100;
        b = 100;


        //operasi mtk biasa
        a = a + 10;
        System.out.println(a);

        //aughmented assignment
        b += 10;
        System.out.println(b);


        //operasi mtk biasa
        a = a - 10;
        System.out.println(a);

        //aughmented assignment
        b -= 10;
        System.out.println(b);


        //operasi mtk biasa
        a = a * 10;
        System.out.println(a);

        //aughmented assignment
        b *= 10;
        System.out.println(b);

    }
}
