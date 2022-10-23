package filtroDeFaturas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filtro {
	
	private ClienteController clienteController;

    public Filtro(ClienteController clienteController) {
        this.clienteController = clienteController;
    }

    public List<Fatura> filtrarFaturas(Fatura[] faturas) {
        List<Fatura> faturasAux = new ArrayList<>(Arrays.asList(faturas));
        for (Fatura fatura : faturas) {
            if (fatura.getValor() < 2000) {
                faturasAux.remove(fatura);
            } 
        }
        return faturasAux;
    }

}
