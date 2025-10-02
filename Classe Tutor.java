import java.util.Objects;

public class Tutor {
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;

    // Construtor 1 [cite: 23]
    public Tutor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Construtor 2 [cite: 23]
    public Tutor(String nome, String cpf, String telefone, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    // Getters e Setters [cite: 24]
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    // Sobrescrita de métodos da classe Object [cite: 25]
    @Override
    public String toString() {
        return "Tutor{" + "nome='" + nome + '\'' + ", cpf='" + cpf + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tutor tutor = (Tutor) o;
        return Objects.equals(cpf, tutor.cpf);
    }
}

//analise do codigo:

//import java.util.Objects;

//public class Tutor {

//import java.util.Objects;: Esta linha importa a classe Objects, que é uma classe utilitária do Java. 
//Ela oferece métodos úteis para trabalhar com objetos, como o Objects.equals(), que é usado mais abaixo para comparar os CPFs de forma segura (evitando erros se um dos CPFs for nulo).

//public class Tutor {: Esta é a declaração da classe.

//public: É um modificador de acesso que significa que esta classe pode ser acessada por qualquer outra classe em qualquer pacote do projeto.

//class Tutor: Define o nome da classe. Por convenção, nomes de classes em Java começam com letra maiúscula.

//----------------------------------------------------

//private String nome;
//private String cpf;
//private String telefone;
//private String endereco;

//Estes são os atributos (também chamados de campos ou variáveis de instância). Eles definem as características ou os dados que cada objeto da classe Tutor irá armazenar.

//private: Este é um modificador de acesso crucial para o conceito de Encapsulamento. 
//Ele significa que estes atributos só podem ser acessados ou modificados diretamente dentro da própria classe Tutor. 
//Nenhuma outra classe pode fazer, por exemplo, meuTutor.nome = "João". Isso protege os dados de modificações indevidas e garante que o acesso seja controlado através de métodos (Getters e Setters).
//String nome;: Declara uma variável do tipo String para armazenar o nome do tutor. O mesmo se aplica para cpf, telefone e endereco

//--------------------------------------------------

//Construtor 1
//public Tutor(String nome, String cpf) {
    //this.nome = nome;
    //this.cpf = cpf;
//}

// Construtor 2
//public Tutor(String nome, String cpf, String telefone, String endereco) {
    //this.nome = nome;
    //this.cpf = cpf;
    //this.telefone = telefone;
    //this.endereco = endereco;
//}

//Um construtor é um método especial que é chamado automaticamente quando um novo objeto é criado (usando a palavra-chave new). Sua função principal é inicializar os atributos do objeto.

//Dois Construtores: A classe possui dois construtores, o que é um exemplo de Sobrecarga de Construtor. 
//Isso oferece flexibilidade: você pode criar um objeto Tutor fornecendo apenas os dados essenciais (nome e CPF) ou fornecendo todos os dados de uma vez.

//this.nome = nome;: Esta linha é muito importante.
//O nome à direita do = é o parâmetro que foi passado para o construtor.
//O this.nome à esquerda se refere ao atributo da classe. A palavra-chave this é usada para desambiguar, deixando claro que estamos atribuindo o valor do parâmetro ao atributo do objeto que está sendo criado.

//--------------------------------------------------------

// Getters e Setters
//public String getNome() { return nome; }
//public void setNome(String nome) { this.nome = nome; }
    // ... e assim por diante para os outros atributos

//Como os atributos são private, precisamos de métodos públicos para poder interagir com eles de fora da classe. Isso é a essência do Encapsulamento.

//Getters (public String getNome()):
//São métodos que retornam o valor de um atributo.
//Permitem que outras classes leiam os dados do objeto de forma controlada. Ex: String nomeDoTutor = meuTutor.getNome();.

//Setters (public void setNome(String nome)):
//São métodos que alteram o valor de um atributo.
//O tipo de retorno é void, pois eles não retornam nada, apenas executam uma ação. Ex: meuTutor.setNome("Maria");.

//—-------------------------------------------------------

//@Override
    //public String toString() {
        //return "Tutor{" + "nome='" + nome + '\'' + ", cpf='" + cpf + '\'' + '}';
    //}

    //@Override
    //public boolean equals(Object o) {
        //if (this == o) return true;
        //if (o == null || getClass() != o.getClass()) return false;
        //Tutor tutor = (Tutor) o;
        //return Objects.equals(cpf, tutor.cpf);
   // }

//Toda classe em Java herda, implicitamente, da superclasse Object. Os métodos toString() e equals() são originalmente definidos na classe Object.

//@Override: Esta é uma anotação que indica ao compilador que estamos sobrescrevendo (substituindo) um método da superclasse. Ajuda a evitar erros de digitação no nome do método.

//public String toString():
//Função: Retornar uma representação em formato de String do objeto.
//Por que é útil? Se você tentar imprimir um objeto sem sobrescrever o toString(), o resultado será algo como Tutor@1f32e575 (o nome da classe e seu endereço na memória). 
//Ao sobrescrevê-lo, você pode definir uma saída legível, como Tutor{nome='Ana', cpf='111.111.111-11'}, o que é muito melhor para depuração e exibição de dados.

//public boolean equals(Object o):
//Função: Definir um critério para determinar se dois objetos são "iguais".
//Por que é útil? Por padrão, o operador == compara se duas variáveis apontam para o mesmo objeto na memória. O método equals padrão faz o mesmo. Ao sobrescrevê-lo, podemos definir uma igualdade lógica, baseada nos atributos.

//Lógica do método:
//if (this == o) return true;: Verifica se é o mesmíssimo objeto. Se for, são iguais.
//if (o == null || getClass() != o.getClass()) return false;: Verifica se o objeto comparado é nulo ou de uma classe diferente. Se for, não podem ser iguais.
//Tutor tutor = (Tutor) o;: Faz um "cast", convertendo o objeto o (que é genérico) para o tipo Tutor, para podermos acessar seus atributos.
//return Objects.equals(cpf, tutor.cpf);: Esta é a regra de negócio principal. Dois objetos Tutor são considerados iguais se, e somente se, seus CPFs forem iguais. O Objects.equals é usado para fazer essa comparação de forma segura.


