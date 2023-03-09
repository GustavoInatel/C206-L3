public class Produto {

    int codigoSerie;
    String codigoProduto;
    String nome;
    String categoria;
    int quantidade;

    // o construtor quando criado basicamente ele é automaticamente chamado quando é
    // feito uma instância na main
    // aqui eu estou inicializando as variáveis
    Produto(int codigoSerie, String codigoProduto, String nome, String categoria, int quantidade) // construtor
    {
        this.codigoSerie = codigoSerie;
        this.codigoProduto = codigoProduto;
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }

    void mostraInfo() {
        System.out.println("Código da Série: " + codigoSerie);
        System.out.println("Código do Produto: " + codigoProduto);
        System.out.println("Nome do Produto: " + nome);
        System.out.println("Categoria do Produto: " + categoria);
        System.out.println("Quantidade do Produto: " + quantidade);
    }

}
