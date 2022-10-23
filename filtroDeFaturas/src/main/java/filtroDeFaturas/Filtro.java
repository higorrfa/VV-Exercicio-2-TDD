package filtroDeFaturas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
            else if (fatura.getValor() >= 2000 && fatura.getValor() <= 2500 && comparaDiferencaDeTempo(fatura.getData()) <= 30) {
            	faturasAux.remove(fatura);
            }
        }
        return faturasAux;
    }

    private double comparaDiferencaDeTempo(Date data) {
        Date hoje = new Date();
        GregorianCalendar dataDeHoje = new GregorianCalendar();
        GregorianCalendar dataFutura = new GregorianCalendar();

        dataDeHoje.setTime(hoje);
        dataFutura.setTime(data);

        int dataDeHojeAux = dataDeHoje.get(Calendar.DAY_OF_YEAR);
        int dataFuturaAux = dataDeHoje.get(Calendar.DAY_OF_YEAR);

        return dataDeHojeAux - dataFuturaAux;
    }
}
