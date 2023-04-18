
public class TestaMetodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta contaDoParra = new Conta();
		contaDoParra.saldo = 100;
		contaDoParra.deposita(50);
		System.out.println(contaDoParra.saldo);
		
		boolean conseguiuRetirar = contaDoParra.saca(20);
		System.out.println(contaDoParra.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		contaDaMarcela.transfere(300, contaDoParra);
		
		System.out.println(contaDaMarcela.saldo);
		
		System.out.println(contaDoParra.saldo);
		
		contaDoParra.titular = "Henrique Parra Benitez";
		System.out.println(contaDoParra.titular);
	}

}
