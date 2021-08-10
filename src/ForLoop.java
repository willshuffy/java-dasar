public class ForLoop {

    /***
            for(init statement;kondisi;post statement){

                //block perulangan
            }

     * init statement akan dieksekusi hanya sekali di awal sebelum perulangan
     * kondisi akan dilakukan pengecekan dalam setiap perulangan, jika true maka perulangan akan dilakukan,
       jika false maka perulangan akan berhenti
     * post statement akan dieksekusi setiap kali diakhir perulangan
     * init statement, kondisi dan post statement tidak wajib diisi, jika kondisi tidak diisi, berarti kondisi
       selalu bernilai true, maka akan terus berulang terus tanpa henti
     */

    public static void main(String[] args) {

        var counter = 1;


        // perulangan dengan kondisi
        for(; counter <= 10 ;){
            System.out.println("Perulangan " + counter);

            counter++;
        }

        /*
            counter terakhir dari ke sepuluh adalah smpe 11, namun  krn menjadi false pada forloop maka tidak tercetak
         */
        System.out.println(counter);
        System.out.println("ulang" + counter);


        //perulangan dengan init statement
        for(var counter2 = 1; counter2 <= 10 ;){
            System.out.println("ulangan " + counter2);

            counter2++;
        }


        //perulangan dengan post statement
        for(var counter3 = 1; counter3 <= 10; counter3++){
            System.out.println("diulang " + counter3);
        }
    }
}
