package filtroDeFaturas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FiltroDeFaturasTest {

    private Filtro filtro;
    private ClienteController clienteController;

    @BeforeEach
    public void before() {
        this.clienteController = new ClienteController();
        this.filtro = new Filtro(clienteController);
    }

    @Test
    void cadastrarClienteComDadosCorretos() throws ParseException {
        Cliente client = new Cliente("Abedess", "19/07/2022", "Paraiba");

        assertEquals("Abedess", client.getNome());
        assertEquals("Paraiba", client.getEstado());
    }

    @Test
    void criarFaturaComDadosCorretos() throws ParseException {
        String cliente = clienteController.verificaECriaCliente("Abedess", "19/07/2022", "Paraiba");
        Fatura fatura = new Fatura(550, "20/10/2022", cliente);

        assertEquals(cliente, fatura.getCliente());
    }

    @Test
    void verificaFaturasComValorMenorQueDoisMil() throws ParseException {
        String cliente = clienteController.verificaECriaCliente("Abedess", "19/07/2022", "Paraiba");
        Fatura fatura = new Fatura(1999, "20/10/2022", cliente);
        Fatura[] faturas = new Fatura[]{fatura};

        assertTrue(filtro.filtrarFaturas(faturas).size() == 0);
    }

    @Test
    void verificaFaturasComValorEntreDoisMilEDoisMilEQuinhentosEDataMenorIgualQueUmMesAtras() throws ParseException {
        String cliente = clienteController.verificaECriaCliente("Abedess", "19/07/2022", "Paraiba");
        Fatura fatura = new Fatura(2100, "01/10/2022", cliente);
        Fatura[] faturas = new Fatura[]{fatura};

        assertEquals(0, filtro.filtrarFaturas(faturas).size());
    }

    @Test
    void verificaFaturasComValorEntreDoisMilEQuinhentosETresMilEDataMenorIgualQueDoisMesesAtras() throws ParseException {
        String cliente = clienteController.verificaECriaCliente("Abedess", "19/09/2022", "Paraiba");
        Fatura fatura = new Fatura(2900, "22/10/2022", cliente);
        Fatura[] faturas = new Fatura[]{fatura};

        assertTrue(filtro.filtrarFaturas(faturas).size() == 0);
    }

    @Test
    void verificaFaturasComValorMaiorQueQuatroMilDoSulDoBrasil() throws ParseException {
        String cliente = clienteController.verificaECriaCliente("Abedess", "19/09/2022", "Santa Catarina");
        Fatura fatura = new Fatura(4500, "22/10/2022", cliente);
        Fatura[] faturas = new Fatura[]{fatura};

        assertEquals(0, filtro.filtrarFaturas(faturas).size());
    }
}
