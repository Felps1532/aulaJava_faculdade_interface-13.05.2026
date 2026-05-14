import javax.swing.JOptionPane;

public class Caminhao implements Veiculo {
    private double capacidadeCarga;
    private double velocidade;
    private String nome;

    public Caminhao() {

    }

    public Caminhao(String nome, double capacidadeCarga, double velocidade) {
        this.nome = nome;
        this.capacidadeCarga = capacidadeCarga;
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
        return "Caminhão";
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
