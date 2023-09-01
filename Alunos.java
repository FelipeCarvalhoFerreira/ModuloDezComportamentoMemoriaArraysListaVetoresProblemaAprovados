package ModuloDezComportamentoMemoriaArraysListaVetoresProblemaAprovados;

public class Alunos {
	
	private String nome;
	private double primeira;
	private double segunda;
	
	public Alunos(String nome, double primeira, double segunda) {
		this.nome = nome;
		this.primeira = primeira;
		this.segunda = segunda;
	}
	
	

	public Alunos(double primeira, double segunda) {
		this.primeira = primeira;
		this.segunda = segunda;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrimeira() {
		return primeira;
	}

	public void setPrimeira(double primeira) {
		this.primeira = primeira;
	}

	public double getSegunda() {
		return segunda;
	}

	public void setSegunda(double segunda) {
		this.segunda = segunda;
	}
	
	
	
	

}
