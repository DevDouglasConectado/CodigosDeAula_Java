
public class ContaCorrente {
	private double saldo;
	private int conta;
	
	public void sacar(double valor) {
		
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			this.saldo -= 1;
		}
		
		//this.saldo -= valor;
	}
	public void depositar(double valor){
		this.saldo += valor;
		
	}
	public void verSaldo() {
		System.out.println("Saldo = " + this.saldo);
	}
   
}
