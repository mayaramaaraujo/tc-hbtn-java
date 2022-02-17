import java.util.List;
import java.util.stream.Collectors;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro criterioFiltro) {
        return produtos.stream().filter(p -> criterioFiltro.testar(p)).collect(Collectors.toList());
    }
}
