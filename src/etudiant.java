
abstract class etudiant {
	
	public String nom,prenom;
	public float moyenne;
	
	abstract void calculMoyenne();
	
	public void afficheResultat()
	{
		System.out.println("====================================");
		System.out.println("Nom= "+this.nom);
		System.out.println("Prenom= "+this.prenom);
		System.out.println("Moyenne = "+this.moyenne);
		System.out.println("====================================");
	}

}
