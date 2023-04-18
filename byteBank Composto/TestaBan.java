
public class TestaBan {
	public static void main(String[] args) {
		Cliente parra = new Cliente();
		parra.nome = "Henrique Parra";
		parra.cpf = "222-222-222-22";
		parra.Profissao = "dev";
		
		Conta contaDoParra = new Conta();
		contaDoParra.deposita(100);
		
		contaDoParra.titular = parra;
		
	System.out.println(contaDoParra.titular.nome);
		
	}
}
