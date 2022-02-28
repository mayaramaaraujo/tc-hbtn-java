import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.List;

public class Serializar {
    private String nomeDoArquivo;

    public void serializar(List<Estudante> estudantes) {

        estudantes.stream().forEach(estudante -> {
            try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream(nomeDoArquivo))) {
                out.writeObject(estudante);
            } catch (IOException e) {
                System.out.println("Nao foi possivel serializar");
            }
        });

    }

    public void desserializar() {

    }
}
