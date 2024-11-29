# Calculadora de IMC

Este projeto é uma aplicação Java simples que calcula o Índice de Massa Corporal (IMC) com base no peso, altura, idade e sexo de uma pessoa. Ele considera faixas etárias e categorias específicas para adultos, idosos e crianças, conforme tabelas de referência.

## Funcionalidades

- **Cálculo de IMC**: Determina a categoria de IMC com base nos dados fornecidos.
- **Faixas etárias específicas**:
    - Crianças (2 a 12 anos).
    - Adultos (13 a 65 anos).
    - Idosos (acima de 65 anos) com tabelas diferenciadas para homens e mulheres.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **JUnit 5**: Para escrita e execução de testes unitários.

## Estrutura do Projeto

O projeto contém duas classes principais:

1. **`CalculadoraIMC`**  
   Contém a lógica principal para calcular o IMC e categorizar os resultados de acordo com tabelas específicas.

2. **`CalculadoraIMCTestes`**  
   Contém os testes unitários para validar o funcionamento da classe `CalculadoraIMC`.

## Requisitos do Sistema

- Java 8 ou superior.
- IntelliJ IDEA (ou qualquer IDE compatível com Java e JUnit).
- Biblioteca JUnit 5 configurada no ambiente.

## Testes
Os testes abrangem casos comuns e limites, como:

- Valores inválidos de peso, altura ou idade.
- Faixas de IMC para crianças, adultos e idosos.
- Diferenciação entre homens e mulheres.