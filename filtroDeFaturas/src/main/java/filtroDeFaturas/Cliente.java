package filtroDeFaturas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Cliente {
	
	private String nome;
	private Date dataDeInclusao;
	private String estado;
	private UUID guid;

	public Cliente(String nome, String dataDeInclusao, String estado) throws ParseException {
		SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
		this.nome = nome;
		this.dataDeInclusao = formataData.parse(dataDeInclusao);
		this.estado = estado;
		this.guid = UUID.randomUUID();
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
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getGuid() {
	    return this.guid.toString();
	}
}
