public class Carro {
    String cor;
    String marca;
    String modelo;
    float velocidademaxima;
    float velocidadeatual;

    Motor motor; // associação de composição, já que o objeto parte não existe sem o objeto todo,
                 // ou seja, o motor tem que obrigatoriamente fazer parte do carro

    Carro() {

        motor = new Motor();
    }

    void ligar() {
        System.out.println("O " + modelo + " está sendo ligado!");
    }

    void acelerar() {
        System.out.println("O " + modelo + " está acelerando!");
    }

    void mostraInfo() {
        System.out.println("A cor do carro é " + cor);
        System.out.println("A marca do carro é " + marca);
        System.out.println("O modelo do carro é " + modelo);
        System.out.println("A velocidade máxima do carro é " + velocidademaxima + " Km/H!");
        System.out.println("A velocidade atual do carro é de " + velocidadeatual + " Km/H!");
    }

}
