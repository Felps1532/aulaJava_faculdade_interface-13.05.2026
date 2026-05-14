import javax.swing.JOptionPane;

public class Carro implements Veiculo {
    private String nome;
    private double velocidade;

    public Carro() {

    }

    public Carro(double velocidade) {
        this("", velocidade);
    }

    public Carro(String nome, double velocidade) {
        this.nome = nome;
        this.velocidade = velocidade;
    }

    @Override
    public void acelerar() {
        JOptionPane.showMessageDialog(null, "Acelerando " + obterTipo());
    }

    @Override
    public void frear() {
        JOptionPane.showMessageDialog(null, "Acionando freio da " + obterTipo());
    }

    public String obterTipo() {
        return "Carro";
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
}
