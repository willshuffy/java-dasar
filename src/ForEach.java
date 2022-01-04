public class ForEach {

    /**
     *
     * ============================== ForEach ==============================
     *
     * time : 2:50:55
     *
     * Kadang kita bisa mengakses data array menggunakan perulangan
     * Mengakses data array menggunakan perulangan sangat bertele-tele, kita harus membuat counter,
     * ~lalu mengakses array menggunakan counter yang kita buat
     * Namun untungnya, di java terdapat perulangan for each, yang bisa digunakan untuk mengakses
     * ~seluruh data di Array secara otomatis
     *
     */

    public static void main(String[] args) {

        //contoh for array tanpa each
        String[] name = {
                "Willy", "Saputra", "wayne",
                "Programmer", "mobile", "Apps"
        };

        for (var i = 0; i < name.length; i++){
            System.out.println(name[i]);
        }

        //contoh forEach array
        System.out.println("FOR EACH");

        for (var nama: name){
            System.out.println(nama);
        }
    }
}
