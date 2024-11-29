package test;

import main.CalculadoraIMC;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraIMCTest {

    private final CalculadoraIMC calculadora = new CalculadoraIMC();

    // Testes para Crianças
    @Test
    void testCriancaBaixoPeso() {
        assertEquals("Baixo peso", calculadora.calcularImc(14, 1.20, 8, "F"));
    }

    @Test
    void testCriancaPesoNormal() {
        assertEquals("Peso normal", calculadora.calcularImc(24, 1.30, 10, "M"));
    }

    @Test
    void testCriancaSobrepesoOuObesidade() {
        assertEquals("Sobrepeso ou Obesidade", calculadora.calcularImc(40, 1.40, 12, "F"));
    }

    // Testes para Adultos - Homens
    @Test
    void testAdultoBaixoPesoMuitoGraveHomem() {
        assertEquals("Baixo peso muito grave", calculadora.calcularImc(45, 1.80, 25, "M"));
    }

    @Test
    void testAdultoPesoNormalHomem() {
        assertEquals("Peso normal", calculadora.calcularImc(70, 1.75, 30, "M"));
    }

    @Test
    void testAdultoObesidadeGrauIHomem() {
        assertEquals("Obesidade grau I", calculadora.calcularImc(95, 1.75, 40, "M"));
    }

    // Testes para Adultos - Mulheres
    @Test
    void testAdultoBaixoPesoGraveMulher() {
        assertEquals("Baixo peso grave", calculadora.calcularImc(40, 1.60, 30, "F"));
    }

    @Test
    void testAdultoPesoNormalMulher() {
        assertEquals("Peso normal", calculadora.calcularImc(55, 1.60, 35, "F"));
    }

    @Test
    void testAdultoObesidadeGrauIIIMulher() {
        assertEquals("Obesidade grau III", calculadora.calcularImc(100, 1.60, 28, "F"));
    }

    // Testes para Idosos - Homens
    @Test
    void testIdosoBaixoPesoHomem() {
        assertEquals("Baixo peso", calculadora.calcularImc(60, 1.70, 70, "M"));
    }

    @Test
    void testIdosoPesoNormalHomem() {
        assertEquals("Peso normal", calculadora.calcularImc(80, 1.80, 68, "M"));
    }

    @Test
    void testIdosoObesidadeGrauIIHomem() {
        assertEquals("Obesidade grau II", calculadora.calcularImc(112, 1.77, 72, "M"));
    }

    @Test
    void testIdosoObesidadeGrauIIIHomem() {
        assertEquals("Obesidade grau III (obesidade mórbida)", calculadora.calcularImc(121, 1.73, 66, "M"));
    }

    // Testes para Idosos - Mulheres
    @Test
    void testIdosaPesoNormalMulher() {
        assertEquals("Peso normal", calculadora.calcularImc(65, 1.60, 68, "F"));
    }

    @Test
    void testIdosaSobrepesoMulher() {
        assertEquals("Sobrepeso", calculadora.calcularImc(73, 1.63, 72, "F"));
    }

    @Test
    void testIdosaObesidadeGrauIIMulher() {
        assertEquals("Obesidade grau II", calculadora.calcularImc(92, 1.56, 74, "F"));
    }

    @Test
    void testIdosaObesidadeGrauIIIMulher() {
        assertEquals("Obesidade grau III (obesidade mórbida)", calculadora.calcularImc(115, 1.65, 77, "F"));
    }

    // Valores inválidos
    @Test
    void testPesoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.calcularImc(-1, 1.75, 25, "M"));
    }

    @Test
    void testAlturaInvalida() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.calcularImc(70, 0, 30, "F"));
    }

    @Test
    void testIdadeInvalida() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.calcularImc(70, 1.75, 1, "M"));
    }

    @Test
    void testSexoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.calcularImc(70, 1.75, 30, "X"));
    }
}