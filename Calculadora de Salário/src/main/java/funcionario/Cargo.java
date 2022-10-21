package funcionario;

public enum Cargo implements Salario {

    DBA {
        @Override
        public double calcularSalarioLiquido(double salarioBase) {
            double salarioLiquido;
            if (salarioBase >= 2000) {
                salarioLiquido = salarioBase - ((salarioBase * 25) / 100);
            } else {
                salarioLiquido = salarioBase - ((salarioBase * 15) / 100);
            }
            return salarioLiquido;
        }
    }, TESTADOR {
        @Override
        public double calcularSalarioLiquido(double salarioBase) {
            double salarioLiquido;
            if (salarioBase >= 2000) {
                salarioLiquido = salarioBase - ((salarioBase * 25) / 100);
            } else {
                salarioLiquido = salarioBase - ((salarioBase * 15) / 100);
            }
            return salarioLiquido;
        }
    }, GERENTE {
        @Override
        public double calcularSalarioLiquido(double salarioBase) {
            double salarioLiquido;
            if (salarioBase >= 5000) {
                salarioLiquido = salarioBase - ((salarioBase * 30) / 100);
            } else {
                salarioLiquido = salarioBase - ((salarioBase * 20) / 100);
            }
            return salarioLiquido;
        }
    }, DESENVOLVEDOR {
        @Override
        public double calcularSalarioLiquido(double salarioBase) {
            double salarioLiquido;
            if (salarioBase >= 3000) {
                salarioLiquido = salarioBase - ((salarioBase * 20) / 100);
            } else {
                salarioLiquido = salarioBase - ((salarioBase * 10) / 100);
            }
            return salarioLiquido;
        }
    }
}
