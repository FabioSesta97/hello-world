package GIT;

public class Prova {
		
	private String nome;
	private String cognome;

	public Prova(String nome, String cognome){
		this.nome = nome;
		this.cognome = cognome;
	}

	private String getNome(){
		return this.nome;
	}

	private void setNome(String nome){
		this.nome = nome;
	}

	private String getCognome(){
		this.cognome = cognome;
	}

	private void setCognome(String cognome){
		this.cognome = cognome;
	}

}