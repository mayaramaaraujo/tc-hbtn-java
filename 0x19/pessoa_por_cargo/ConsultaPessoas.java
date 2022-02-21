import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConsultaPessoas {
    static Map<String, List<Pessoa>> obterPessoasPorCargo(List<Pessoa> pessoas) {
       return pessoas.stream().collect(Collectors.groupingBy(pessoa -> pessoa.getCargo()));
    }
}
