import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class ConsultaPessoas {
    static Map<String, List<Pessoa>> obterPessoasPorCargo(List<Pessoa> pessoas) {
       Map<String, List<Pessoa>> pessoasPorCargo = pessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo));
       return pessoasPorCargo;
    }

    static Map<String, List<Integer>> obterIdadePorCargo(List<Pessoa> pessoas) {
        return pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.mapping(Pessoa::getIdade, toList())));
    }

    static Map<String, List<Pessoa>> obterPessoasPorCargoAcimaDe40anos(List<Pessoa> pessoas) {
        return pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.filtering(pessoa -> pessoa.getIdade() > 40, Collectors.toList())));
    }

    static TreeMap<String, Set<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoas) {

        TreeMap<String, Set<Pessoa>> pessoasPorCargoEmOrdemReversa = pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo,
                        () -> new TreeMap<String, Set<Pessoa>>(Comparator.reverseOrder()),
                        toCollection(() -> new TreeSet<>(Comparator.comparing(Pessoa::getNome)))
                ));

        return pessoasPorCargoEmOrdemReversa;
    }

    static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> pessoas) {
        return pessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.counting()));
    }

    static Map<String, Map<Integer, Long>>  obterContagemPessoasPorCargoEIdade(List<Pessoa> pessoas) {
        return pessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.groupingBy(Pessoa::getIdade, Collectors.counting())));
    }
}
