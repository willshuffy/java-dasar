public class BreakandContinue {

    /**
     *
     * ============================== Break & Continue ==============================
     *
     * Break pada perulangan digunakan untuk menghentikan seluruh perulangan
     * namun berbeda dengan continue, continue digunakan untuk menghentikan perulangan saat ini, lalu melanjutkan
     * ke perulangan selanjutnya
     */

    public static void main(String[] args) {

        var counter = 1;

        while (true){
            System.out.println("Perulangan " + counter);
            counter++;

            if (counter > 10){
                break;
            }
        }

        System.out.println("Perulangan berhenti");
    }
}
