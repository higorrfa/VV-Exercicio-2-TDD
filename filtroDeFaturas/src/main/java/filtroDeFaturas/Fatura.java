package filtroDeFaturas;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Fatura {

    private String codigo;
    private double valor;
    private Date data;
    private String cliente;

    public Fatura(double valor, String data, String cliente) throws ParseException {
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        this.codigo = UUID.randomUUID().toString();
        this.valor = valor;
        this.data = formataData.parse(data);
        this.cliente = cliente;
    }

    public String getCliente() {
        return this.cliente;
    }

    public double getValor() {
        return this.valor;
    }

    public Date getData() {
        return data;
    }
}
