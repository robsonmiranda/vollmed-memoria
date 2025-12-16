package med.voll.api.testes.memoria;

import med.voll.api.domain.paciente.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.net.http.HttpClient;
import java.util.Scanner;

public class TestaJVM {

    public static void main(String[] args) {
        System.out.println(Paciente.class.getClassLoader()); // Classe do projeto
        System.out.println(JpaRepository.class.getClassLoader()); // Classe do Spring
        System.out.println(HttpClient.class.getClassLoader()); // Classe de uma biblioteca
        System.out.println(Scanner.class.getClassLoader()); // Classe do Java
        System.out.println(ClassLoader.class.getClassLoader()); // Classe do Java
    }
}
