
public class TesteReferencias {
 public static void main(String[] args) {
	
	 Funcionario g1 = new Gerente();
	 g1.setNome("marcos");
	 g1.setSalario(5000);
	 
	 Funcionario f = new Funcionario();
	 f.setSalario(2000);
	 
	 Funcionario ev = new EditorVideo();
	 ev.setSalario(2500);
	 
	 ControleBonificacao controle = new ControleBonificacao();
	 controle.registra(g1);
	 controle.registra(f);
	 controle.registra(ev);
	 
	 System.out.println(controle.getSoma());
}
}
