package filtroDeFaturas;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Cliente {

    private UUID guid;
    private String nome;
    private Date dataDeInclusao;
    private String estado;

    public Cliente(String nome, String dataDeInclusao, String estado) throws ParseException {
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        this.guid = UUID.randomUUID();
        this.nome = nome;
        this.dataDeInclusao = formataData.parse(dataDeInclusao);
        this.estado = estado;
    }

    public String getNome() {
        return this.nome;
    }

    public String getGuid() {
        return this.guid.toString();
    }

    public Date getDataDeInclusao() {
        return this.dataDeInclusao;
    }

    public String getEstado() {
        return this.estado;
    }
}
