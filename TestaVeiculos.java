import java.util.ArrayList;

public class TestaVeiculos {

    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro("Fusca", 12));
        veiculos.add(new Bicicleta("Caloi", "Montanha", 12));

        for (Veiculo v : veiculos) {
            v.acelerar();
        }

    }
}
