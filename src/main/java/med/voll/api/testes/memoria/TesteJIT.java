package med.voll.api.testes.memoria;

public class TesteJIT {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            System.out.println(soma(i, i + 3));
        }
    }
    public static int soma(int valor1, int valor2) {
        return valor1 + valor2;
    }
}
