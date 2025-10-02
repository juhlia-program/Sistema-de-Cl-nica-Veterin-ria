import java.time.LocalDate;
import java.util.Objects;

public class Animal {
    private String nome;
    private String especie;
    private String raca;
    private LocalDate dataNascimento;

    // Construtor 1 [cite: 23]
    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    // Construtor 2 [cite: 23]
    public Animal(String nome, String especie, String raca, LocalDate dataNascimento) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.dataNascimento = dataNascimento;
    }

    // Getters e Setters [cite: 24]
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }
    public String getRaca() { return raca; }
    public void setRaca(String raca) { this.raca = raca; }
    public LocalDate getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }

    // Sobrescrita de métodos da classe Object [cite: 25]
    @Override
    public String toString() {
        return "Animal{" + "nome='" + nome + '\'' + ", especie='" + especie + '\'' + ", raca='" + raca + '\'' + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, especie, raca, dataNascimento);
    }
}

/*  
Análise Detalhada da Classe `Animal.java`

```

import java.time.LocalDate;
import java.util.Objects;

public class Animal {

```

  import java.time.LocalDate;: Importa a classe `LocalDate` do Java. Esta classe é usada especificamente para representar uma data (ano, mês, dia) sem informações de horário ou fuso horário. É a escolha ideal para o atributo `dataNascimento`.
  
  import java.util.Objects;: Importa a classe `Objects`, que contém métodos utilitários para trabalhar com objetos. Neste caso, ela será usada para ajudar a gerar o `hashCode` do objeto.
  
  public class Animal {: Declara uma classe pública chamada `Animal`, que pode ser acessada por outras classes do projeto.

-----

Atributos (As características do Animal)

```
    private String nome;
    private String especie;
    private String raca;
    private LocalDate dataNascimento;
```

Estes são os atributos que definem as informações que cada objeto `Animal` irá guardar.

private: Este modificador de acesso garante o **encapsulamento**. Significa que os atributos só podem ser acessados diretamente de dentro da própria classe `Animal`. 
Para acessá-los de fora, é necessário usar os métodos públicos `get` e `set`.

String nome;: Armazena o nome do animal (ex: "Rex").

String especie;: Armazena a espécie (ex: "Cachorro", "Gato").

String raca;: Armazena a raça do animal (ex: "Labrador", "Siamês").

LocalDate dataNascimento;: Armazena a data de nascimento do animal.

-----

Construtores (Como criar um Animal)

A classe possui dois construtores, o que é um exemplo de sobrecarga de construtores. Isso oferece flexibilidade na hora de criar um novo objeto `Animal`.

```
    // Construtor 1 (Simplificado)
    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    // Construtor 2 (Completo)
    public Animal(String nome, String especie, String raca, LocalDate dataNascimento) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.dataNascimento = dataNascimento;
    }
```

  Construtor 1: É um construtor mais simples, útil para um cadastro rápido onde talvez você só tenha as informações essenciais do animal: nome e espécie.
  
  Construtor 2: É o construtor completo, usado quando você tem todos os dados do animal disponíveis no momento da criação do objeto.
  
  this.nome = nome;: A palavra-chave `this` é usada para diferenciar o atributo da classe (`this.nome`) do parâmetro que o construtor recebeu (`nome`). Ela basicamente diz: "atribua o valor do parâmetro `nome` ao atributo `nome` *deste* objeto que está sendo criado".

-----

Métodos de Acesso (Getters e Setters)

```
    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    // ... e assim por diante para os outros atributos ...
```

Esses métodos permitem a interação controlada com os atributos `private` da classe.

  Getters (ex: `getNome()`): São métodos públicos que **retornam** o valor de um atributo. Eles permitem que outras partes do seu código **leiam** as informações de um objeto `Animal`.
  Setters (ex: `setNome(String nome)`): São métodos públicos que **alteram** o valor de um atributo. Eles permitem que outras partes do seu código **modifiquem** as informações de um objeto `Animal`.

-----

Métodos Sobrescritos (Comportamentos especiais)

Estes métodos foram sobrescritos da superclasse `Object` para dar à classe `Animal` comportamentos mais específicos e úteis. A anotação `@Override` indica essa intenção.

```
    @Override
    public String toString() {
        return "Animal{" + "nome='" + nome + '\'' + ", especie='" + especie + '\'' + ", raca='" + raca + '\'' + '}';
    }
```

  toString() : Este método retorna uma representação textual do objeto. Se você não o sobrescrevesse e tentasse imprimir um objeto `Animal` (`System.out.println(meuAnimal);`), 
  o resultado seria um código de memória (ex: `Animal@7f31245a`). Com este método, o resultado será uma string formatada e legível, como `Animal{nome='Totó', especie='Cachorro', raca='Vira-lata'}`, o que é excelente para depuração.


```
    @Override
    public int hashCode() {
        return Objects.hash(nome, especie, raca, dataNascimento);
    }
```

  hashCode() : Este método retorna um número inteiro (um "código hash") que representa o objeto.
      Para que serve? Ele é usado internamente por estruturas de dados que precisam de alta performance, como `HashMap` e `HashSet`, para organizar e encontrar objetos rapidamente.
      Regra importante: Se dois objetos são considerados iguais pelo método `equals()`, eles **devem** ter o mesmo `hashCode()`.
      Objects.hash(...) : É uma forma moderna e segura de gerar um `hashCode` a partir dos atributos de um objeto. Ele combina os hash codes dos atributos fornecidos para gerar um código final para o objeto `Animal`.
*/
