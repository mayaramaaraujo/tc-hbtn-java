import java.util.ArrayList;

public class Workflow {
    private ArrayList<Atividade> atividades;

    public Workflow() {
        this.atividades = new ArrayList<>();
    }

    public void registrarAtividade(Atividade atividade) {
        atividades.add(atividade);
    }

    public ArrayList<Atividade> getAtividades() {
        return atividades;
    }
}
