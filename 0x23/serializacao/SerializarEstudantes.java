import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializarEstudantes<T> {
    private String nomeDoArquivo;

    public SerializarEstudantes(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    public void serializar(List<Estudante> estudantes) {
        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream(nomeDoArquivo))) {
            out.writeObject(estudantes);
        } catch (IOException e) {
            System.out.println("Nao foi possivel serializar");
        }
    }

    public List<Estudante> desserializar() {
        List<Estudante> estudantes = new ArrayList<>();

        try (ObjectInput in = new ObjectInputStream(new FileInputStream(nomeDoArquivo))) {
            return estudantes = (List<Estudante>) in.readObject();
        } catch (IOException e) {
            System.out.println("Nao foi possivel desserializar");
        } catch (ClassNotFoundException e) {
            System.out.println("Nao foi possivel desserializar");
        }

        return estudantes;
    }
}
