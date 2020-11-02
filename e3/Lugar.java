package ling1;

public class Lugar {
	private String nome;
	private String pais;
	private int temp;
	
	public Lugar(String nome, String pais, int temp) {
		this.nome = nome;
		this.pais = pais;
		this.temp = temp;
	}
	
	public void setTem(int temp) {
		this.temp = temp;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getPais() {
		return pais;
	}
	
	public int getTemp() {
		return temp;
	}
	
	public void elogio() {
		System.out.println("O " + nome + " � um lugar bonito.");
	}
	
	public void turismo() {
		System.out.println("Essa local � bom para turismo.");
	}
	
	public void temp() {
		if(temp > 24) {
			System.out.println("Esse local est� quente.");
		}
		else if(temp < 16) {
			System.out.println("Esse local est� fria.");
		}
		else {
			System.out.println("Esse local n�o est� quente nem fria.");
		}
	}
}
