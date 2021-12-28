public class BreakandContinue {

    /**
     * ============================== Break ==============================
     * <p>
     * time : 2:44:49
     * Break pada perulangan digunakan untuk menghentikan seluruh perulangan
     * namun berbeda dengan continue, continue digunakan untuk menghentikan perulangan saat ini, lalu melanjutkan
     * ke perulangan selanjutnya
     */

    public static void main(String[] args) {

        var counter = 1;

        while (true) {
            System.out.println("Perulangan " + counter);
            counter++;

            if (counter > 10) {
                break;
            }
        }

        System.out.println("Perulangan berhenti");


        /**
         *
         * ============================== Continue ==============================
         *
         * time : 2:48:26
         */

        for (var counter2 = 1; counter2 <= 100; counter2++) {

            if (counter2 % 2 == 0){ //jika genap maka == 1
                continue;
            }

            System.out.println("Perulangan Ganjil " + counter2);
        }
    }
}
