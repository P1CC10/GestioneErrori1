public class Main {
    public static void main(String[] args) {
        try {
            verificaRange(30, 1, 20);
            System.out.println("Il numero è nel range specificato.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void verificaRange(int numero, int minimo, int massimo) throws Exception {
        if (numero < minimo || numero > massimo || minimo > massimo) {
            throw new Exception("Il numero non è nel range specificato ");
        }
    }
}

