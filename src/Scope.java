public class Scope {

    /**
     * ============================== Scope ==============================
     * <p>
     * time : 3:29:42
     * <p>
     * Di Java, variable hanya bisa diakses di dalam area dimana mereka dibuat
     * Hal ini disebut Scope
     * Contoh, jika sebuah variable dibuat di method, maka hanya bisa diakses di method tersebut, atau jika dibuat di
     * ~dalam block, maka hanya bisa diakses di dalam block tersebut
     */


    public static void main(String[] args) {

        sayHello("Willy ");
        sayHello("");

    }

    static void sayHello(String name){
        String hello = "Hello " + name;

        if (!name.isBlank()){
            String hi = "Hi " + name;
            System.out.println(hi);
        }

        System.out.println(hello);
    }
}
