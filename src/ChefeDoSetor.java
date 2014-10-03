public class ChefeDoSetor extends Pessoa {
		
	
	public void cadastrarFuncionario(){
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "João";
		pessoa.email = "joao@email.com";
		pessoa.sexo = 'M';
		pessoa.cep = "40000-000";
		pessoa.perfil.profissao = "Enfermeiro";
		pessoa.perfil.cargaHoraria = 40;			
				
	}
	
	public void cadastrarSetor(){
		Setor setor = new Setor();
		
		setor.nome = "UTI";
		setor.andar = 3;
		setor.chefe.nome = "Fred";
		setor.chefe.perfil.profissao = "Enfermeiro";
		setor.chefe.perfil.cargaHoraria = 20;
		setor.chefe.sexo = 'M';
		setor.chefe.email = "fred@email.com";
		setor.chefe.cep = "40000-000";		
		
	}

	public void receberEscalaEscolhida(){
	
	}
	
	
}
