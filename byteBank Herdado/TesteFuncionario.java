
public class TesteFuncionario {
	public static void main(String[] args) {

		Funcionario parra = new Funcionario();
		parra.setNome("Henrique Parra Benitez");
		parra.setCpf("222-222-222-22");
		parra.setSalario(1300);

		System.out.println(parra.getBoniFicacao());
		System.out.println(parra.getNome());
	
		
	}
}
