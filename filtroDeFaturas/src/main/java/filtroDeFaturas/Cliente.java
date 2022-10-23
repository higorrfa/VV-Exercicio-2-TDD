package filtroDeFaturas;

import java.util.Calendar;

public class Cliente {
	
	private String nome;
	private Calendar dataDeInclusao;
	private String estado;

	public Cliente(String nome, Calendar dataDeInclusao, String estado) {
		this.nome = nome;
		this.dataDeInclusao = dataDeInclusao;
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataDeInclusao() {
		return dataDeInclusao;
	}

	public void setDataDeInclusao(Calendar dataDeInclusao) {
		this.dataDeInclusao = dataDeInclusao;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
