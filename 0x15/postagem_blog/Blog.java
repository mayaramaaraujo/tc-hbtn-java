import java.util.*;

public class Blog {
    private Set<Post> listaDePostagens = new HashSet<>();

    public Set<Post> getListaDePostagens() {
        return listaDePostagens;
    }

    public void adicionarPostagem(Post post) {
        if (listaDePostagens.contains(post)) {
            throw new IllegalArgumentException("Postagem jah existente");
        }

        this.listaDePostagens.add(post);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> todosOsAutores = new TreeSet<>();

        for (Post posts : listaDePostagens) {
            todosOsAutores.add(posts.getAutor());
        }

        return todosOsAutores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> contagem = new TreeMap<>();

        for (Categorias categoria : obterCategorias()) {
            if(contagem.containsKey(categoria)) {
                Integer contagemAtual = contagem.get(categoria);
                contagem.put(categoria, contagemAtual + 1);
            } else {
                contagem.put(categoria, 1);
            }
        }

        return contagem;
    }

    public List<Categorias> obterCategorias() {
        List<Categorias> todasCategorias = new ArrayList<>();

        for (Post posts : listaDePostagens) {
            todasCategorias.add(posts.getCategoria());
        }

        return todasCategorias;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> postsPorAutor = new TreeSet<>();

        for (Post post: listaDePostagens) {
            if(post.getAutor().equals(autor)) {
                postsPorAutor.add(post);
            }
        }

        return postsPorAutor;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categorias) {
        Set<Post> postsPorCategoria = new TreeSet<>();

        for (Post post: listaDePostagens) {
            if(post.getCategoria().equals(categorias)) {
                postsPorCategoria.add(post);
            }
        }

        return postsPorCategoria;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> todosOsPostsPorCategoria = new HashMap<>();

        for (Post post : listaDePostagens) {
            if(todosOsPostsPorCategoria.containsKey(post.getCategoria())) {
                todosOsPostsPorCategoria.get(post.getCategoria()).add(post);
            } else {
                todosOsPostsPorCategoria.put(post.getCategoria(), obterPostsPorCategoria(post.getCategoria()));
            }
        }

        return todosOsPostsPorCategoria;
    }


    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> todosOsPostsPorAutor = new TreeMap<>();

        for (Post post: listaDePostagens) {
            if(todosOsPostsPorAutor.containsKey(post.getAutor())) {
                todosOsPostsPorAutor.get(post.getAutor()).add(post);
            } else {
                todosOsPostsPorAutor.put(post.getAutor(), obterPostsPorCategoria(post.getCategoria()));
            }
        }
        return todosOsPostsPorAutor;
    }

}
