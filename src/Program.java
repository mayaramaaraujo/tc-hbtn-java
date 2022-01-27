public class Program {
    public static void main(String[] args) {
        PersonagemGame personagem1 = new PersonagemGame();

        personagem1.setNome("Sonic");
        personagem1.setSaudeAtual(10);

        System.out.println(personagem1.getSaudeAtual() + " - " + personagem1.getStatus());

        personagem1.receberCura(91);

        System.out.println(personagem1.getSaudeAtual() + " - " + personagem1.getStatus());

        personagem1.tomarDano(25);

        System.out.println(personagem1.getSaudeAtual() + " - " + personagem1.getStatus());

        personagem1.tomarDano(80);

        System.out.println(personagem1.getSaudeAtual() + " - " + personagem1.getStatus() + "\n");
    }
}
