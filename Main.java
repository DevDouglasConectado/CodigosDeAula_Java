
public class Main {

	public static void main(String[] args) {
  
	    //Instanciar uma classe	=> objeto
		
		/*Carro c1 = new Carro();
		
		Carro ix35 = new Carro();*/
		
		//CONTA CORRENTE
		ContaCorrente c1 = new ContaCorrente();
		c1.depositar(100);
		c1.sacar(50);
		c1.saldo = 5000;
		System.out.println(c1.saldo);
		
	}

}
