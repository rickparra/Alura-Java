
public class CriaContaJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta PrimeiraConta = new Conta();
		PrimeiraConta.saldo = 200;
		System.out.println(PrimeiraConta.saldo);
		
		PrimeiraConta.saldo += 100;
		System.out.println(PrimeiraConta.saldo);
		
		Conta SegundaConta = new Conta();
		SegundaConta.saldo = 50; 
		
		System.out.println(PrimeiraConta.agencia);
		System.out.println(PrimeiraConta.numero);

		
	}

}
