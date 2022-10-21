package test.java;

import calculadora.*;
import funcionario.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraDeSalarioTest {

    CalculadoraDeSalario calculadora = new CalculadoraDeSalario();

    @Test
    public void calculaSalarioDesenvolvedor() {
        double salarioBase = 5000.00;
        Funcionario funcionario = new Funcionario("Jose", "jose@email.com", salarioBase, Cargo.DESENVOLVEDOR);
        Assertions.assertEquals(this.calculadora.calcularSalarioLiquido(funcionario), 4000.00);
    }

    @Test
    public void calculaSalarioDBA() {
        double salarioBase = 5000.00;
        Funcionario funcionario = new Funcionario("Marcos", "marcos@email.com", salarioBase, Cargo.DBA);
        Assertions.assertEquals(this.calculadora.calcularSalarioLiquido(funcionario), 4000.00);
    }

}