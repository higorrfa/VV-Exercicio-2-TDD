package filtroDeFaturas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fatura {
	
	private String codigo;
    private double valor;
    private Date data;
    private String cliente;

	public Fatura(String codigo, double valor, String data, String cliente) throws ParseException {
		SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
		this.codigo = codigo;
        this.valor = valor;
        this.data = formataData.parse(data);
	}

	public String getCodigo() {
		return codigo;
	}

	public double getValor() {
		return valor;
	}

	public Date getData() {
		return data;
	}

	public String getCliente() {
		return cliente;
	}

	public double checaValor(double valor) {
		if (valor < 0) {
			throw new RuntimeException("Valor negativo!");
		}
		return valor;
	}
}
