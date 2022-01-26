import java.util.Locale;
import java.text.DecimalFormat;
public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        DecimalFormat df = new DecimalFormat("###,###,###,###,###.00");
        System.out.println("Valor: R$ " + df.format(valor));
        System.out.println("Taxa: " + String.format(Locale.US,"%.2f",taxa) + "%");
    }
}