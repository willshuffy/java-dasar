public class WhileLoop {

    /**
     * time : 2:39:06
     * <p>
     * While Loop => versi perulangan yang lebih sederhana dibanding for loop
     * dan hanya terdapat kondisi perulangan, tanpa ada init statement dan post statement
     */

    public static void main(String[] args) {

        var counter = 1;

        while (counter <= 10) {
            System.out.println("perulangan" + counter);

            counter++;
        }


        /**
         * ==================================DO WHILE LOOP==================================
         *
         * time : 2:41:14
         *
         * Do While Loop adalah perulangan yang mirip dengan While loop
         * perbedaannya hanya pada pengecekan kondisi saja
         * pengecekan  kondisi while loop dilakukakn di awal sebelum perulangan dilakukan, sedengkan di do while loop
         * dilakukan setelah perulangan dilakukan
         * Oleh karena itu dalam do while loop, minimal pasti sekali perulangan dilakukan. walaupun kondisi tidak bernilai true
         */

        var counter2 = 100;

        do{
            System.out.println("diulang" + counter2);
            counter2++;
        }while (counter2 <= 10); //kondisi false

    }
}
