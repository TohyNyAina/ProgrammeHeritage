import java.io.BufferedReader;
import java.io.InputStreamReader;


public class informatique1annee extends informatique{

	
	public informatique1annee(String nom,String prenom,int nbrm1Sem,int nbrm2Sem)
	{
		this.nom=nom;
		this.prenom=prenom;
		BufferedReader x;
		String val=null;
		this.nbrMatiereSem1=nbrm1Sem;
		this.nbrMatiereSem2=nbrm2Sem;
		System.out.println("=================SEMESTRE1======================");
		for (int i=0;i<nbrm1Sem;i++)
		{
			
			try
			{
				x=new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Entrer Note"+i+"Sem1 = ");
				val=x.readLine();
			}
			catch(Exception er){}
			this.matiereSem1[i]=Float.parseFloat(val);
			
			val=null;
		}
		System.out.println("==================SEMESTRE2=====================");
		for (int i=0;i<nbrm2Sem;i++)
		{
			
			try
			{
				x=new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Entrer Note"+i+"Sem2 = ");
				val=x.readLine();
			}
			catch(Exception er){}
			this.matiereSem2[i]=Float.parseFloat(val);
			
			val=null;
		}
		System.out.println("=======================================");
	}
	
	@Override
	protected void calculMoySem1() {
		// TODO Auto-generated method stub
		float somme=0;
		for (int i=0;i<this.nbrMatiereSem1;i++)
		{
			somme=somme+this.matiereSem1[i];
		}
		this.MoyenneSem1=(somme+14)/(this.nbrMatiereSem1+1);
	}

	@Override
	protected void calculMoySem2() {
		// TODO Auto-generated method stub
		float somme=0;
		for (int i=0;i<this.nbrMatiereSem2;i++)
		{
			somme=somme+this.matiereSem2[i];
		}
		this.MoyenneSem2=(somme)/(this.nbrMatiereSem2);
		
	}

	@Override
	void calculMoyenne() {
		// TODO Auto-generated method stub
		this.calculMoySem1();
		this.calculMoySem2();
		this.moyenne=(this.MoyenneSem1+(2*this.MoyenneSem2))/3;		
	}

}
