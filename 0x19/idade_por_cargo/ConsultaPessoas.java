import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class ConsultaPessoas {
    static Map<String, List<Pessoa>> obterPessoasPorCargo(List<Pessoa> pessoas) {
       Map<String, List<Pessoa>> pessoasPorCargo = pessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo));
       return pessoasPorCargo;
    }

    static Map<String, List<Integer>> obterIdadePorCargo(List<Pessoa> pessoas) {
        return pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo, mapping(Pessoa::getIdade, toList())));
    }

}
