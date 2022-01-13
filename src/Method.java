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

        //[STEP 2]
        var result1 = sum(100, 100);
        System.out.println(result1);
        System.out.println(sum(200, 200));

        //[STEP 4]
        System.out.println(hitung(500, "+", 100));
        System.out.println(hitung(2000, "-", 100));
        System.out.println(hitung(200, "salah", 100));
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

    /**
     *
     * ============================== Method Return Value ==============================
     *
     * time : 3:03:27
     *
     * Secara default, method itu tidak menghasilkan value apapun, namun jika kita ingin, kita bisa membuat sebuah
     * ~method mengembalikan nilai
     * Agar method bisa menghasilkan value, kita harus mengubah kata kunci void dengan tipe data yang dihasilkan
     * Dan didalam block method, untuk menghasilkan nilai tersebut, kita harus menggunakan kata kunci return, lalu
     * ~diikuti dengan data yang sesuai dengan tipe data yang sudah kita deklarasikan di method
     * Di Java, kita hanya bisa menghasilkan 1 data di sebuah method, tidak bisa lebih dari satu
     *
     */

    //[STEP 1]
    static int sum(int value1, int value2){
        var total = value1 + value2;
        return total;
    }


    //[STEP 3] --------- menggunakan return value lebih dari satu ---------

    static int hitung(int value1, String operasi, int value2){
        switch (operasi){
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
}
