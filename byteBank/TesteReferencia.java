
public class TesteReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta PrimeiraConta = new Conta();
		PrimeiraConta.saldo = 300;
		
		System.out.println(PrimeiraConta.saldo);
		
		Conta SegundaConta = PrimeiraConta;
		
		System.out.println(SegundaConta.saldo);
	}

}
