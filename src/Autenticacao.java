
public class  Autenticacao {
	
	private String usuario;
	private String senha;
		
	
	
	public String getUsuario() {
		return usuario;
	}



	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}



	public String getSenha(String senha) {
		return this.senha = senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}



	public boolean autentica(String usuario, String senha) {
	    if (this.usuario == usuario && this.senha == senha) {
	      System.out.println("Acesso Permitido!");
	      return true;
	    } else {
	      System.out.println("Acesso Negado!");
	      return false;
	    }
	}
	
}

