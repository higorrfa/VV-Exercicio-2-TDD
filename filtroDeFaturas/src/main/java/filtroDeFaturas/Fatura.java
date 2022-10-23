package filtroDeFaturas;

import java.util.Calendar;

public class Fatura {
	
	private String codigo;
    private double valor;
    private Calendar data;

	public Fatura(String codigo, double valor, Calendar data) {
		this.codigo = codigo;
        this.valor = valor;
        this.data = data;
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

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public void checaValor(double valor) {
		if (valor < 0) {
			throw new RuntimeException("Valor negativo!");
		}
		if (valor == null) {
			throw new RuntimeException("Valor nulo!");
		}
	}
}
