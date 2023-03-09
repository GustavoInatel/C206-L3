public class Main {
    public static void main(String[] args) throws Exception {
        // instanciando dois objetos para carros
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        // instanciando dois objetos para motores
        Motor motor1 = new Motor();
        Motor motor2 = new Motor();

        // preenchendo atributos para o carro 1
        carro1.cor = "Azul";
        carro1.marca = "Fiat";
        carro1.modelo = "Uno";
        carro1.velocidademaxima = 200f;
        carro1.velocidadeatual = 60f;

        // preenchendo atributos para o carro 2
        carro2.cor = "Preto";
        carro2.marca = "Chevrolet";
        carro2.modelo = "Camaro";
        carro2.velocidademaxima = 290f;
        carro2.velocidadeatual = 100f;

        // preenchendo atributos para motor do carro 1
        carro1.motor.potencia = 85;
        carro1.motor.tipo = "Fire 1.0";

        // preenchendo atributos para o motor do carro 2
        carro2.motor.potencia = 406;
        carro2.motor.tipo = "LT1";

        // chamando métodos para o carro
        carro1.ligar();
        carro1.acelerar();
        carro1.mostraInfo();

        carro2.ligar();
        carro2.acelerar();
        carro2.mostraInfo();

        // chamando métodos para o motor
        carro1.motor.mostraInfo();
        carro2.motor.mostraInfo();
    }
}
