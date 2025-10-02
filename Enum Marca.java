public enum Marca {
    BAYER,
    ZOETIS,
    MSD,
    CEVA
}

/*
Com certeza\! Vamos explicar de forma clara e detalhada o que é a classe `Enum Marca.java` e por que ela é tão importante no projeto.

[cite\_start]O arquivo `Marca.java` atende diretamente a um requisito da sua avaliação[cite: 35].

```java
// Arquivo: Marca.java
public enum Marca {
    BAYER,
    ZOETIS,
    MSD,
    CEVA
}
```

### 1\. O que é um `Enum`?

Um **`enum`** (abreviação de *enumeração*) é um tipo especial de "classe" em Java que representa um **conjunto fixo de constantes**.

Pense nele como um tipo de dado que você mesmo cria, onde as únicas opções de valores possíveis são as que você define na sua declaração.

  * **Analogia:** Imagine que você quer criar uma variável para o dia da semana. Em vez de usar um número (1 para Domingo, 2 para Segunda) ou um texto ("Segunda-feira"), você pode criar um `enum DiaDaSemana` com os valores `DOMINGO`, `SEGUNDA`, `TERCA`, etc. Assim, a variável só poderá conter um desses sete valores, e nada mais.

No nosso projeto, o `enum Marca` define que qualquer variável do tipo `Marca` só pode ter um dos quatro valores: `BAYER`, `ZOETIS`, `MSD` ou `CEVA`.

### 2\. Analisando o Código `Marca.java`

  * **`public enum Marca`**: Esta linha não declara uma `class`, e sim um `enum`. Ela diz ao Java: "Estou criando um novo tipo de dado chamado `Marca`".
  * **`BAYER, ZOETIS, MSD, CEVA`**: Estes são os valores constantes e únicos permitidos para o tipo `Marca`. Eles são, por convenção, escritos em letras maiúsculas. Cada um deles é, na verdade, uma instância única e imutável do `enum Marca`.

### 3\. Como o `Enum Marca` é Usado no Projeto?

1.  **Na Classe `Produto`:** O atributo é declarado com o tipo `Marca`.
    ```java
    // Dentro de Produto.java
    private Marca marca;
    ```
2.  **Na Classe `Aplicacao`:** Quando o usuário digita um número para escolher a marca, o código converte esse número para o valor do `enum` correspondente.
    ```java
    // Dentro do método lerDadosProduto() em Aplicacao.java
    System.out.println("Marcas disponíveis: 1-BAYER, 2-ZOETIS, 3-MSD, 4-CEVA");
    System.out.print("Escolha a marca (número): ");
    int marcaOp = scanner.nextInt();

    // Pega todos os valores do enum em um array e seleciona pelo índice
    Marca marca = Marca.values()[marcaOp - 1]; 
    ```

Em resumo, o `Enum Marca.java` cria um tipo de dado seguro, legível e centralizado para as marcas dos produtos, prevenindo erros e facilitando a manutenção do código.
*/
