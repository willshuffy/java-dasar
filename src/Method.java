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

        //[STEP 2] --------- menggunakan contoh array ---------
        int[] values = {80, 80, 80, 80, 80};
        rapotBelajar("willy", values);

        //[STEP 2] --------- menggunakan Variable Argument ---------
        rapotKuliah("willy", 90,55,75,65,45);
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

    /**
     *
     * ============================== Method Variable Argument ==============================
     *
     * time : 3:10:00
     *
     * Kadang kita butuh mengirim data ke method sejumlah data yang tidak pasti
     * Biasanya, agar bisa seperti ini, kita akan menggunakan array sebagai parameter di method tersebut
     * Namun di java, kita bisa menggunakan variable argument, untuk mengirim data yang berisi jumlah tak tentu,
     * ~bisa nol atau lebih
     * Parameter dengan tipe variable argument, hanya bisa ditempatkan di posisi akhir parameter
     *
     *
     */


    //[STEP 1] --------- menggunakan contoh array ---------
    static void rapotBelajar(String name, int[] values){
        var total = 0;
        for (var value : values){
            total += value;
        }

        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " + name + ", anda lulus");
        }else {
            System.out.println("Maaf " + name + ", Anda tidak lulus");
        }
    }

    //[STEP 1] --------- menggunakan Variable Argument ---------
    static void rapotKuliah(String name, int... values){ // hanya mengubah int[], menjadi int...
        var total = 0;
        for (var value : values){
            total += value;
        }

        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " + name + ", anda lulus");
        }else {
            System.out.println("Maaf " + name + ", Anda tidak lulus");
        }
    }
}
