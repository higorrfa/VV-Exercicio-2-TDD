package filtroDeFaturas;
import java.util.*;

public class Filtro {

    private ClienteController clienteController;

    public Filtro(ClienteController clienteController) {
        this.clienteController = clienteController;
    }

    public List<Fatura> filtrarFaturas(Fatura[] faturas) {
        List<Fatura> listaAux = new ArrayList<>(Arrays.asList(faturas));
        for (Fatura fatura : faturas) {
            Cliente cliente = this.clienteController.getCliente(fatura.getCliente());
            if (fatura.getValor() < 2000) {
                listaAux.remove(fatura);
            } else if (fatura.getValor() >= 2000 && fatura.getValor() <= 2500 && comparaDiferencaDeTempo(fatura.getData()) <= 30) {
                listaAux.remove(fatura);
            } else if (fatura.getValor() > 2500 && fatura.getValor() <= 3000 && comparaDiferencaDeTempo(cliente.getDataDeInclusao()) <= 60) {
                listaAux.remove(fatura);
            } else if (fatura.getValor() > 4000 && verificaRegiao(cliente.getEstado()).equals("Sul")) {
                listaAux.remove(fatura);
            }
        }
        return listaAux;
    }

    private double comparaDiferencaDeTempo(Date data) {
        Date hoje = new Date();
        GregorianCalendar dataDeHoje = new GregorianCalendar();
        GregorianCalendar dataAComparar = new GregorianCalendar();

        dataDeHoje.setTime(hoje);
        dataAComparar.setTime(data);

        int diaHoje = dataDeHoje.get(Calendar.DAY_OF_YEAR);
        int diaData = dataAComparar.get(Calendar.DAY_OF_YEAR);

        return diaHoje - diaData;
    }

    private String verificaRegiao(String estado) {
        List<String> regiaoSul = new ArrayList<String>();

        regiaoSul.addAll(List.of(new String[]{"parana", "rio grande do sul", "santa catarina"}));


        if (regiaoSul.contains(estado.toLowerCase())) {
            return "Sul";
        } else {
            return "";
        }
    }
}
