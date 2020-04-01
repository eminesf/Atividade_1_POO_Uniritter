package Atividade1;

public class CarrosTestes {

	public static void main(String[] args) {
		Endereco end1 = new Endereco();
		
		Proprietario prop1 = new Proprietario("Emiliano", "12345", "67890", end1);
		
		Marca gol = new Marca();
		
		Carro carro1 = new Carro(prop1, gol);
		
		
	}

}
