package filtroDeFaturas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Cliente {
	
	private String nome;
	private Date dataDeInclusao;
	private String estado;
	private Fatura[] listadeFaturas;

	public Cliente(String nome, String dataDeInclusao, String estado, Fatura[] listadeFaturas) throws ParseException {
		SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
		this.nome = nome;
		this.dataDeInclusao = formataData.parse(dataDeInclusao);
		this.estado = estado;
		this.listadeFaturas = listadeFaturas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataDeInclusao() {
		return dataDeInclusao;
	}

	public void setDataDeInclusao(Date dataDeInclusao) {
		this.dataDeInclusao = dataDeInclusao;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Fatura[] getListadeFaturas() {
		return listadeFaturas;
	}

	public void setListadeFaturas(Fatura[] listadeFaturas) {
		this.listadeFaturas = listadeFaturas;
	}
}
