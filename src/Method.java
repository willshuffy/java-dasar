public class Method {

    /**
     * ============================== Method ==============================
     * <p>
     * time : 2:55:32
     * <p>
     * Di bahasa pemrograman lain, Method juga disebut dengan Function
     * Method adalah blok kode program yang akan berjalan saat kita panggil
     * Untuk membuat method di java, kita bisa menggunakan kata kunci void, lalu diikuti dengan nama method, kurung ()
     */

    public static void main(String[] args) {
        sayHelloWorld();

        //[STEP 2]
        sayHelloName("Willy", "Saputra");
        sayHelloName("Bruce", "Wayne");
    }

    static void sayHelloWorld() {
        System.out.println("Hello World 1");
        System.out.println("Hello World 2");
        System.out.println("Hello World 3");
    }

    /**
     *
     * ============================== Method Parameter ==============================
     *
     * time : 3:00:14
     *
     * Kita bisa mengirim informasi ke method yang ingin kita panggil
     * Untuk melakukan hal tersebut, kita perlu menambahkan parameter atau argument di method yg sudah kita buat
     * Cara membuat parameter sama seperti cara membuat variabel
     * Parameter ditempatkan di dalam kurung () dideklarasi method
     * Parameter bisa lebih dari satu, jika lebih dari satu, harus dipisah menggunakan tanda koma
     */

    //[STEP 1]
    static void sayHelloName(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
