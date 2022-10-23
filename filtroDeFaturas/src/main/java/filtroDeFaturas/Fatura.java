package filtroDeFaturas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fatura {
	
	private String codigo;
    private double valor;
    private Date data;

	public Fatura(String codigo, double valor, String data) throws ParseException {
		SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
		this.codigo = codigo;
        this.valor = valor;
        this.data = formataData.parse(data);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	public double checaValor(double valor) {
		if (valor < 0) {
			throw new RuntimeException("Valor negativo!");
		}
		return valor;
	}
}
