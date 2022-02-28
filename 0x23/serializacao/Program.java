import java.util.List;

public class Program {

    public static void main(String[] args) {

        Estudante estudante1 = new Estudante(21, "Jane Doe");
        Estudante estudante2 = new Estudante(33, "John Bannons");
        Estudante estudante3 = new Estudante(27, "Alyssa White");
        Estudante estudante4 = new Estudante(35, "Maike Eed");
        Estudante estudante5 = new Estudante(19, "Peter Diemon");

        List<Estudante> estudantes = List.of(
                estudante1, estudante2, estudante3, estudante4, estudante5
        );

        SerializarEstudantes<Estudante> serializarEstudantes1 = new SerializarEstudantes<Estudante>("estudantes.data");
        serializarEstudantes1.serializar(estudantes);

        List<Estudante> listaDesserializacao1 = serializarEstudantes1.desserializar();

        for(Estudante e : listaDesserializacao1) {
            System.out.println(e);
        }

        SerializarEstudantes<Estudante> serializarEstudantes2 = new SerializarEstudantes<Estudante>("estudantes1.data");
        List<Estudante> listaDesserializacao2 = serializarEstudantes2.desserializar();
    }
}