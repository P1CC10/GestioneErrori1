public class Main {
    public static void main(String[] args) {
        int numero = 8;
        int numeroMassimo = 5;
        int numeroMinimo = 1;
        try {
            if (verificaRange(numero, numeroMassimo, numeroMinimo)) {
                System.out.println("il numero è nel range");
            }else{
                System.out.println("il numero non è nel range");
                }
        } catch (ArithmeticException e) {
            System.out.println("Errore non è nel range");
        }

    }
    public static boolean verificaRange(int numero,int numeroMassimo,int numeroMinimo){
        return numero < numeroMassimo && numero > numeroMinimo;
    }
}