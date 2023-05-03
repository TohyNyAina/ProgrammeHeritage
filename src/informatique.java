
abstract class informatique extends etudiant {
	
	public float matiereSem1[]= new float[100],MoyenneSem1;
	public int nbrMatiereSem1;
	public float matiereSem2[]= new float[100],MoyenneSem2;
	public int nbrMatiereSem2;
	
	protected abstract void calculMoySem1();
	protected abstract void calculMoySem2();
	
}
