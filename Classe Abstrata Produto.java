import java.time.LocalDate;

public abstract class Produto {
    private String nome; [cite: 32]
    private Marca marca; [cite: 32]
    private double preco; [cite: 32]
    private LocalDate validade; [cite: 32]

    public Produto(String nome, Marca marca, double preco, LocalDate validade) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.validade = validade;
    }

    public abstract void imprimir(); // Método abstrato [cite: 36]

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Marca getMarca() { return marca; }
    public void setMarca(Marca marca) { this.marca = marca; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
    public LocalDate getValidade() { return validade; }
    public void setValidade(LocalDate validade) { this.validade = validade; }
}

/*

A `Produto.java` é uma **Classe Abstrata**, e entender esse conceito é fundamental.

### O que é uma Classe Abstrata?

Uma classe abstrata funciona como um **modelo** ou um **contrato** para outras classes. Ela serve a dois propósitos principais:

1.  **Definir características e comportamentos comuns:** Ela agrupa todos os atributos e métodos que são compartilhados por um conjunto de classes relacionadas, evitando a repetição de código.
2.  **Não pode ser instanciada:** Você não pode criar um objeto diretamente de uma classe abstrata (com `new Produto()`). Isso acontece porque ela representa uma ideia genérica, e não algo concreto. 
      No seu projeto, "Produto" é um conceito; o que existe de verdade é um `Medicamento` ou um `Cosmetico`.

-----

### Análise Detalhada do Código `Produto.java`

Vamos analisar cada parte do arquivo:

```java
import java.time.LocalDate;

public abstract class Produto {
```

  * **`public abstract class Produto`**: Esta é a declaração da classe.
      * `public`: A classe é visível para todo o projeto.
      * `abstract`: Esta é a palavra-chave que a define como uma classe abstrata. Ela indica que esta classe serve como base para outras e não pode ser usada para criar objetos diretamente. 
         [cite\_start]Isso cumpre o requisito do exercício de ter uma classe base chamada `Produto`[cite: 30].

-----

```java
    private String nome;
    private Marca marca;
    private double preco;
    private LocalDate validade;
```

  * [cite\_start]**Atributos:** Estes são os quatro atributos que todo e qualquer produto da clínica terá, independentemente de ser um medicamento ou um cosmético[cite: 32]. 
    Por estarem na classe `Produto`, qualquer classe que herdar dela (como `Medicamento` e `Cosmetico`) também terá esses atributos automaticamente.

-----

```java
    public Produto(String nome, Marca marca, double preco, LocalDate validade) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.validade = validade;
    }
```

  * **O Construtor:** Pode parecer estranho que uma classe da qual não se pode criar objetos tenha um construtor. No entanto, ele é essencial.
      * **Qual a sua função?** Este construtor não é chamado diretamente (com `new Produto()`), mas sim indiretamente pelas classes filhas (`Medicamento` e `Cosmetico`) através da palavra-chave `super()`. 
          Quando você cria um `new Medicamento(...)`, o construtor do `Medicamento` chama este construtor do `Produto` para inicializar os atributos comuns (`nome`, `marca`, `preco`, `validade`).

-----

```java
    public abstract void imprimir(); // Método abstrato
```

  * **O Método Abstrato:** Esta é a parte mais importante para entender o conceito.
      * **`abstract void imprimir()`**: Um método abstrato é um método que **não tem implementação**. Ele é apenas uma assinatura, uma declaração.
      * **Por que ele existe?** A classe `Produto` sabe que *todo produto precisa ser capaz de se imprimir*. No entanto, ela não sabe *como* se imprimir, pois não conhece os detalhes específicos de um medicamento (dosagem) ou de um cosmético (hipoalergênico).
      * **O Contrato:** Ao declarar `imprimir()` como `abstract`, a classe `Produto` estabelece uma **regra obrigatória** para suas subclasses: 
         "Se você quer ser um tipo de `Produto`, você é obrigado a escrever sua própria versão do método `imprimir()`". [cite\_start]Isso garante que todas as subclasses terão esse método, o que é fundamental para o polimorfismo funcionar[cite: 36].

-----

```java
    // Getters e Setters
    public String getNome() { return nome; }
    // ...
```

  * **Getters e Setters:** São os métodos públicos padrão que permitem o acesso controlado aos atributos privados, seguindo o princípio do encapsulamento. Como são definidos aqui na classe `Produto`, eles também são herdados por todas as subclasses.
*/
