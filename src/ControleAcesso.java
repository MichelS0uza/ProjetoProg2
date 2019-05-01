
public class ControleAcesso {

	public static void main(String[] args) {
		
		Administrador admin1 = new Administrador("Adamastor", "88665459", "", 02121, "Adamastor", "123");
		
		Visitante func = admin1.novoVisitante();
		func.setNome("zezinho");
		func.setRg("9457820");
		func.setCodigoAcesso(12520);
		
		System.out.println("o funcionario "+ func.getNome() +" seu código de acesso é: "+ func.getCodigoAcesso());
		
		
	}

}
