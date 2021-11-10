public class Carro{

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    //construtor padrão

    public Carro(){
        System.out.println("Classe Carro foi instanciada");
        this.numPassageiros=4;
    }
//construtor parametrizado
    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }
//fácil né pessoal!!!!

public void exibirAutonomia(){
    System.out.println("A autonomia do carro é: "+this.capCombustivel*this.consumoCombustivel);


}
public double obterAutonomia(){
    System.out.println("Método obterAutonomia foi chamado");

    return this.capCombustivel*this.consumoCombustivel;
}
    
public double calcularCombustivel(double km){
    double qtdCombustivel=km/this.consumoCombustivel;
    return qtdCombustivel;
}
//mais um construtor parametrizado
public Carro(String marca, String modelo, int numPassageiros) {
    this.marca = marca;
    this.modelo = modelo;
    this.numPassageiros = numPassageiros;

    System.out.println("Chamando o construtor com 3 parametros");
}
public Carro(String marca, String modelo) {
    this(marca,modelo,10);
    System.out.println("Chamando o construtor com 2 parametros");

}

//clique com o botão direito para aparecer a listagem no Visual Studio Code


    
}