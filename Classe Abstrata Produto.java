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

