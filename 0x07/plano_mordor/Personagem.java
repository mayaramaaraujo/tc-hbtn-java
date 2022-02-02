import comida.Comida;
import humor.*;

public class Personagem {
    private int pontosDeFelicidade;

    public Humor obterHumorAtual() {

        if(pontosDeFelicidade < -5) {
            return new Irritado();
        } else if (pontosDeFelicidade > -5 && pontosDeFelicidade < 0) {
            return new Triste();
        } else if (pontosDeFelicidade > 0 && pontosDeFelicidade <= 15) {
            return new Feliz();
        } else {
            return new MuitoFeliz();
        }
    }

    public void comer(Comida[] comidas) {
        for (Comida c: comidas) {
            this.pontosDeFelicidade = this.pontosDeFelicidade + c.getPontosDeFelicidade();
        }
    }

    @Override
    public String toString() {
        return this.pontosDeFelicidade + " - " + obterHumorAtual().getClass().getSimpleName();
    }
}
