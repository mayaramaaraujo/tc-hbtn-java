import java.util.ArrayList;
import java.util.Objects;

public class Pedido {
    private ArrayList<PedidoCookie> cookies;

    public ArrayList<PedidoCookie> getCookies() {
        return cookies;
    }

    public Pedido() {
        this.cookies = new ArrayList<>();
    }

    public void setCookies(ArrayList<PedidoCookie> cookies) {
        this.cookies = cookies;
    }


    public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {
        this.cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas() {
        int quantidadeDeCaixas = 0;
        for (PedidoCookie pedidoCookie: this.cookies) {
            quantidadeDeCaixas = quantidadeDeCaixas + pedidoCookie.getQuantidadeCaixas();
        }
        return quantidadeDeCaixas;
    }

    public int removerSabor(String sabor) {
        int quantidadeDeCaixasRemovidas = 0;

        for (int i = 0; i < this.cookies.size(); i++) {
            if(this.cookies.get(i).getSabor().equals(sabor)) {
                quantidadeDeCaixasRemovidas = quantidadeDeCaixasRemovidas + this.cookies.get(i).getQuantidadeCaixas();
                this.cookies.remove(this.cookies.get(i));
            } else {
                quantidadeDeCaixasRemovidas = 0;
            }
        }

        return quantidadeDeCaixasRemovidas;
    }
}


