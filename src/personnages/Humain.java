package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int quantiteArgent;
	
	
	
	public Humain(String nom, String boissonFavorite, int quantiteArgent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.quantiteArgent = quantiteArgent;
	}
	
	private void parler(String texte) {
		System.out.println("("+nom+") - "+texte);
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getBoissonFavorite() {
		return boissonFavorite;
	}

	public void setBoissonFavorite(String boissonFavorite) {
		this.boissonFavorite = boissonFavorite;
	}

	public int getQuantiteArgent() {
		return quantiteArgent;
	}

	public void setQuantiteArgent(int quantiteArgent) {
		this.quantiteArgent = quantiteArgent;
	}

	private void perdreArgent(int argent) {
		quantiteArgent-=argent;
	}
	private void gagnerArgent(int argent) {
		quantiteArgent+=argent;
	}
	public void direBonjour() {
		parler("Bonjour! Je m'appelle "+nom+" et j'aime boire du "+boissonFavorite+".");
	}
	public void boire() {
		parler("Hmmm, un bon verre de "+boissonFavorite+"! GLOUPS!");
	}
	
	public boolean acheter(String bien,int prix) {
		assert prix>=0;
		if (quantiteArgent>=prix) {
			parler("J'ai "+quantiteArgent+" sous en poche. Je vais pouvoir m'offrir "+bien+" a "+prix+" sous");
			perdreArgent(prix);
			return true;
		}
		else {
			parler("Je n'ai plus que "+quantiteArgent+" sous en poche. Je ne peut meme pas m'offrir un "+bien+" a "+prix+" sous");
			return false;
		}
	}
}
