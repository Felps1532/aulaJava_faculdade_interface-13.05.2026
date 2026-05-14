import javax.swing.JOptionPane;

public class Bicicleta implements Veiculo {
    private double velocidade;
    private String tipo; // montanha ou estrada, por exemplo
    private String nome;

    public Bicicleta() {

    }

    public Bicicleta(String tipo, double velocidade) {
        this("", tipo, velocidade);
    }

    public Bicicleta(String nome, String tipo, double velocidade) {
        this.nome = nome;
        this.tipo = tipo;
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

    @Override
    public String obterTipo() {
        return "Bicicleta";
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
