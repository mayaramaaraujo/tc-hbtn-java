import java.util.ArrayList;

public class ListaTodo {
    private ArrayList<Tarefa> tarefas;

    public ListaTodo() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {

        if(tarefa.getDescricao().isEmpty()) {
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        }

        for (int i = 0; i < this.tarefas.size(); i++) {
            if(this.tarefas.get(i).getIdentificador() == tarefa.getIdentificador()){
                throw new IllegalArgumentException("Tarefa com identificador  " + tarefa.getIdentificador() +
                        " ja existente na lista");
            }
        }
        this.tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int identificador) {
        for (Tarefa tarefa: this.tarefas) {
            if(tarefa.getIdentificador() == identificador) {
                tarefa.setEstahFeita(true);
                return true;
            };
        }

        return false;
    }

    public boolean desfazerTarefa(Integer identificador) {
        for (Tarefa tarefa: this.tarefas) {
            if(tarefa.getIdentificador() == identificador) {
                tarefa.setEstahFeita(false);
                return true;
            };
        }

        return false;
    }

    public void desfazerTodas() {
        this.tarefas.forEach(t -> t.setEstahFeita(false));
    }

    public void fazerTodas() {
        this.tarefas.forEach(t -> t.setEstahFeita(true));
    }

    public void listarTarefas() {
        for (Tarefa t: this.tarefas) {
            System.out.printf("[");
            if (t.estahFeita()) {
                System.out.printf("X");
            } else {
                System.out.printf(" ");
            }
            System.out.printf("]");

            System.out.printf(" Id: " + t.getIdentificador() + " - Descricao: " + t.getDescricao() + "\n" );
        }
    }
}
