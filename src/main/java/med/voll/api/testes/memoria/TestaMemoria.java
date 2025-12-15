package med.voll.api.testes.memoria;

import med.voll.api.domain.consulta.Consulta;

import java.util.ArrayList;
import java.util.List;

public class TestaMemoria {
    public static void main(String[] args) {
        // Código criado para causar estouro do heap de memória (OutOfMemoryError)
        List<Consulta> consultas = new ArrayList<Consulta>();
        for (int i = 1; i <= 1000000000; i++) {
            Consulta consulta = new Consulta();
            consultas.add(consulta);
        }
    }
}
