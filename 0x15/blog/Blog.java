import java.util.*;

public class Blog {
    private List<Post> listaDePostagens = new ArrayList<>();

    public List<Post> getListaDePostagens() {
        return listaDePostagens;
    }

    public void adicionarPostagem(Post post) {
        this.listaDePostagens.add(post);
    }

    public Set<String> obterTodosAutores() {
        Set<String> todosOsAutores = new HashSet<>();

        for (Post posts : listaDePostagens) {
            todosOsAutores.add(posts.getAutor());
        }

        return todosOsAutores;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> contagem = new TreeMap<>();

        for (String categoria : obterCategorias()) {
            if(contagem.containsKey(categoria)) {
                Integer contagemAtual = contagem.get(categoria);
                contagem.put(categoria, contagemAtual + 1);
            } else {
                contagem.put(categoria, 1);
            }
        }

        return contagem;
    }

    public List<String> obterCategorias() {
        List<String> todasCategorias = new ArrayList<>();

        for (Post posts : listaDePostagens) {
            todasCategorias.add(posts.getCategoria());
        }

        return todasCategorias;
    }


}
