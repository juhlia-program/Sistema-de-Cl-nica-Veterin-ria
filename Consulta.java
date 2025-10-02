import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Consulta {
    private LocalDate data;
    private LocalTime hora;
    private String motivo;
    private String diagnostico;

    // Construtor 1 [cite: 23]
    public Consulta(LocalDate data, String motivo) {
        this.data = data;
        this.motivo = motivo;
    }

    // Construtor 2 [cite: 23]
    public Consulta(LocalDate data, LocalTime hora, String motivo, String diagnostico) {
        this.data = data;
        this.hora = hora;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
    }

    // Getters e Setters [cite: 24]
    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }
    public LocalTime getHora() { return hora; }
    public void setHora(LocalTime hora) { this.hora = hora; }
    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }
    public String getDiagnostico() { return diagnostico; }
    public void setDiagnostico(String diagnostico) { this.diagnostico = diagnostico; }
    
    // Sobrecarga de método (Overload) [cite: 25]
    public void agendarRetorno(LocalDate data) {
        System.out.println("Retorno agendado para o dia " + data);
    }
    
    public void agendarRetorno(LocalDate data, LocalTime hora) {
        System.out.println("Retorno agendado para o dia " + data + " às " + hora);
    }

    // Sobrescrita de métodos da classe Object [cite: 25]
    @Override
    public String toString() {
        return "Consulta{" + "data=" + data + ", hora=" + hora + ", motivo='" + motivo + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consulta consulta = (Consulta) o;
        return Objects.equals(data, consulta.data) && Objects.equals(hora, consulta.hora);
    }
}

/*

O objetivo desta classe é modelar um atendimento ou consulta veterinária no sistema. Cada objeto criado a partir desta classe representará um evento de consulta, com suas próprias informações, como data, motivo e diagnóstico.

### **Análise Detalhada da Classe `Consulta.java`**

```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Consulta {
```

  * **`import java.time.LocalDate;`**: Importa a classe para trabalhar com datas (ano-mês-dia).
  * **`import java.time.LocalTime;`**: Importa a classe para trabalhar com horários (hora-minuto-segundo).
  * **`import java.util.Objects;`**: Importa a classe utilitária `Objects`, que será usada no método `equals`.
  * **`public class Consulta {`**: Declara a classe pública `Consulta`.

-----

### **1. Atributos (Os dados da Consulta)**

```java
    private LocalDate data;
    private LocalTime hora;
    private String motivo;
    private String diagnostico;
```

Estes são os campos que armazenam as informações específicas de cada consulta.

  * **`private`**: Garante o **encapsulamento**, restringindo o acesso direto aos atributos. A interação deve ser feita através dos métodos públicos (Getters e Setters).
  * **`LocalDate data;`**: Guarda a data em que a consulta ocorreu ou está agendada.
  * **`LocalTime hora;`**: Guarda o horário da consulta.
  * **`String motivo;`**: Armazena o motivo da visita (ex: "Vacinação anual", "Pata machucada").
  * **`String diagnostico;`**: Guarda o diagnóstico feito pelo veterinário (ex: "Virose", "Fratura leve").

-----

### **2. Construtores (Como criar uma Consulta)**

Assim como as outras classes, `Consulta` possui dois construtores, demonstrando a **sobrecarga de construtores** para maior flexibilidade.

```java
    // Construtor 1 (Para agendamento)
    public Consulta(LocalDate data, String motivo) {
        this.data = data;
        this.motivo = motivo;
    }

    // Construtor 2 (Para registro completo)
    public Consulta(LocalDate data, LocalTime hora, String motivo, String diagnostico) {
        this.data = data;
        this.hora = hora;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
    }
```

  * **Construtor 1:** É ideal para o agendamento inicial de uma consulta, quando você só tem a data e o motivo, mas ainda não tem a hora exata ou o diagnóstico.
  * **Construtor 2:** É usado para criar um objeto com o registro completo de uma consulta que já aconteceu ou que tem todos os detalhes definidos.
  * **`this.data = data;`**: Atribui o valor do parâmetro `data` ao atributo `data` do objeto.

-----

### **3. Métodos de Acesso (Getters e Setters)**

```java
    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }
    // ... e assim por diante para os outros atributos ...
```

Esses métodos fornecem acesso público e controlado aos atributos privados da classe, permitindo que outras partes do sistema leiam ou modifiquem os dados de uma consulta de forma segura.

-----

### **4. Sobrecarga de Método (Funcionalidade principal da classe)**

[cite\_start]Esta é uma das partes mais importantes desta classe, pois cumpre um requisito específico da sua avaliação: implementar a sobrecarga de método[cite: 25].

```java
    // Sobrecarga de método (Overload)
    public void agendarRetorno(LocalDate data) {
        System.out.println("Retorno agendado para o dia " + data);
    }
    
    public void agendarRetorno(LocalDate data, LocalTime hora) {
        System.out.println("Retorno agendado para o dia " + data + " às " + hora);
    }
```

  * **O que é Sobrecarga?** É a capacidade de ter dois ou mais métodos com o **mesmo nome** dentro da mesma classe, desde que suas listas de **parâmetros** sejam diferentes (seja no número de parâmetros ou no tipo deles).
  * **Como funciona aqui?**
      * O primeiro método `agendarRetorno` aceita apenas uma `LocalDate`. Ele serve para agendar um retorno para um dia específico, sem definir a hora.
      * O segundo método `agendarRetorno` aceita uma `LocalDate` **e** um `LocalTime`. Ele serve para agendar um retorno com data e hora marcadas.
  * **Por que é útil?** Oferece flexibilidade. Quem for usar a classe `Consulta` pode escolher a versão do método que melhor se adapta à sua necessidade, usando sempre o mesmo nome intuitivo: `agendarRetorno`.

-----

### **5. Métodos Sobrescritos (Comportamentos herdados)**

```java
    @Override
    public String toString() {
        return "Consulta{" + "data=" + data + ", hora=" + hora + ", motivo='" + motivo + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consulta consulta = (Consulta) o;
        return Objects.equals(data, consulta.data) && Objects.equals(hora, consulta.hora);
    }
```

  * **`toString()`**: Fornece uma representação em texto do objeto `Consulta`, facilitando a visualização dos seus dados durante a execução do programa.
  * **`equals()`**: Redefine o conceito de "igualdade" para os objetos `Consulta`.
      * **Regra de Negócio:** Neste código, foi definido que duas consultas são consideradas **iguais** se elas ocorrerem na mesma **data** e na mesma **hora**. 
      O motivo e o diagnóstico não são considerados para a igualdade, o que pode ser útil para evitar agendamentos duplicados no mesmo horário.
*/
