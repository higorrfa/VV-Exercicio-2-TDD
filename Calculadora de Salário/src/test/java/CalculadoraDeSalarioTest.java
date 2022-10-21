package test.java;

import calculadora.*;
import funcionario.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraDeSalarioTest {

    CalculadoraDeSalario calculadora = new CalculadoraDeSalario();

    @Test
    public void verificaSalarioLiquidoDesenvolvedorSalarioBaseMaiorIgual3000() {
        double salarioBase = 5000.00;
        Funcionario funcionario = new Funcionario("Jose", "jose@email.com", salarioBase, Cargo.DESENVOLVEDOR);
        Assertions.assertEquals(this.calculadora.calcularSalarioLiquido(funcionario), 4000.00);
    }

    @Test
    public void verificaSalarioLiquidoDesenvolvedorSalarioBaseMenor3000() {
        double salarioBase = 2000.00;
        Funcionario funcionario = new Funcionario("Fabinho", "fabinho@email.com", salarioBase, Cargo.DESENVOLVEDOR);
        Assertions.assertEquals(this.calculadora.calcularSalarioLiquido(funcionario), 1800.00);
    }

    @Test
    public void verificaSalarioLiquidoDBASalarioBaseMaiorIgual2000() {
        double salarioBase = 2000.00;
        Funcionario funcionario = new Funcionario("Rodilindo", "rodilindo@email.com", salarioBase, Cargo.DBA);
        Assertions.assertEquals(this.calculadora.calcularSalarioLiquido(funcionario), 1500.00);
    }

    @Test
    public void verificaSalarioLiquidoDBASalarioBaseMenor2000() {
        double salarioBase = 1500.00;
        Funcionario funcionario = new Funcionario("Arrascaeta", "arrascaeta@email.com", salarioBase, Cargo.DBA);
        Assertions.assertEquals(this.calculadora.calcularSalarioLiquido(funcionario), 1275.00);
    }

    @Test
    public void verificaSalarioLiquidoTestadorSalarioBaseMaiorIgual2000() {
        double salarioBase = 2000.00;
        Funcionario funcionario = new Funcionario("Jonatas", "jonatas@email.com", salarioBase, Cargo.TESTADOR);
        Assertions.assertEquals(this.calculadora.calcularSalarioLiquido(funcionario), 1500.00);
    }

    @Test
    public void verificaSalarioLiquidoTestadorSalarioBaseMenor2000() {
        double salarioBase = 1500.00;
        Funcionario funcionario = new Funcionario("Abel", "abel@email.com", salarioBase, Cargo.TESTADOR);
        Assertions.assertEquals(this.calculadora.calcularSalarioLiquido(funcionario), 1275.00);
    }

    @Test
    public void verificaSalarioLiquidoGerenteSalarioBaseMaiorIgual5000() {
        double salarioBase = 5000.00;
        Funcionario funcionario = new Funcionario("Abraao", "abraao@email.com", salarioBase, Cargo.GERENTE);
        Assertions.assertEquals(this.calculadora.calcularSalarioLiquido(funcionario), 3500.00);
    }

    @Test
    public void verificaSalarioLiquidoGerenteSalarioBaseMenor5000() {
        double salarioBase = 4000.00;
        Funcionario funcionario = new Funcionario("Luis", "luis@email.com", salarioBase, Cargo.GERENTE);
        Assertions.assertEquals(this.calculadora.calcularSalarioLiquido(funcionario), 3200.00);
    }
}