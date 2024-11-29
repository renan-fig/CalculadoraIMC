package main;

public class CalculadoraIMC {

    public String calcularImc(double peso, double altura, int idade, String sexo) {
        if (peso <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Peso e altura devem ser maiores que zero.");
        }

        if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
            throw new IllegalArgumentException("Sexo deve ser 'M' (masculino) ou 'F' (feminino).");
        }

        if (idade < 2) {
            throw new IllegalArgumentException("Idade mínima para cálculo é 2 anos.");
        }

        double imc = peso / (altura * altura);
        String faixaImc;

        if (idade > 65) {
            // idosos
            if (sexo.equalsIgnoreCase("M")) {
                faixaImc = idosoIMCM(imc);
            } else {
                faixaImc = idosoIMCF(imc);
            }
        } else if (idade <= 12) {
            // crianças
            faixaImc = criancaIMC(imc);
        }else {
            // adultos
            if (sexo.equalsIgnoreCase("M")) {
                faixaImc = adultoIMCM(imc);
            } else {
                faixaImc = adultoIMCF(imc);
            }
        }
        return faixaImc;
    }

    // CALCULO DO IMC PARA IDOSOS
    public String idosoIMCM(double imc){
        String faixaImc;
        if (imc < 21.9) {
            faixaImc = "Baixo peso";
        } else if (imc <= 27) {
            faixaImc = "Peso normal";
        } else if (imc <= 30) {
            faixaImc = "Sobrepeso";
        } else if (imc <= 35) {
            faixaImc = "Obesidade grau I";
        } else if (imc <= 39.9) {
            faixaImc = "Obesidade grau II";
        } else {
            faixaImc = "Obesidade grau III (obesidade mórbida)";
        }
        return faixaImc;
    }

    // CALCULO DO IMC PARA IDOSAS
    public String idosoIMCF(double imc){
        String faixaImc;
        if (imc < 21.9) {
            faixaImc = "Baixo peso";
        } else if (imc <= 27) {
            faixaImc = "Peso normal";
        } else if (imc <= 32) {
            faixaImc = "Sobrepeso";
        } else if (imc <= 37) {
            faixaImc = "Obesidade grau I";
        } else if (imc <= 41.9) {
            faixaImc = "Obesidade grau II";
        } else {
            faixaImc = "Obesidade grau III (obesidade mórbida)";
        }
        return faixaImc;
    }

    // CALCULO DO IMC PARA ADULTOS
    public String adultoIMCM(double imc){
        String faixaImc;
        if (imc < 16) {
            faixaImc = "Baixo peso muito grave";
        } else if (imc < 17) {
            faixaImc = "Baixo peso grave";
        } else if (imc < 18.5) {
            faixaImc = "Baixo peso";
        } else if (imc < 25) {
            faixaImc = "Peso normal";
        } else if (imc < 30) {
            faixaImc = "Sobrepeso";
        } else if (imc < 35) {
            faixaImc = "Obesidade grau I";
        } else if (imc < 40) {
            faixaImc = "Obesidade grau II";
        } else {
            faixaImc = "Obesidade grau III";
        }
        return faixaImc;
    }

    // CALCULO DO IMC PARA ADULTAS
    public String adultoIMCF(double imc){
        String faixaImc;
        if (imc < 15.5) {
            faixaImc = "Baixo peso muito grave";
        } else if (imc < 16.5) {
            faixaImc = "Baixo peso grave";
        } else if (imc < 18) {
            faixaImc = "Baixo peso";
        } else if (imc < 24) {
            faixaImc = "Peso normal";
        } else if (imc < 29) {
            faixaImc = "Sobrepeso";
        } else if (imc < 34) {
            faixaImc = "Obesidade grau I";
        } else if (imc < 39) {
            faixaImc = "Obesidade grau II";
        } else {
            faixaImc = "Obesidade grau III";
        }
        return faixaImc;
    }

    //CALCULO DO IMC PARA CRIANÇAS
    public String criancaIMC(double imc){
        String faixaImc;
        if (imc < 14) {
            faixaImc = "Baixo peso";
        } else if (imc < 18) {
            faixaImc = "Peso normal";
        } else {
            faixaImc = "Sobrepeso ou Obesidade";
        }
        return faixaImc;
    }
}
