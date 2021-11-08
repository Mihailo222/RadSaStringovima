package zadatak1;

public class Osoba {
	
	
	//inicijalizacija stringa
	String ime=new String("nepoznato");
	String adresa;//dobijem adresu u formatu ulica;broj;grad
	String prezime;
	
	
	//fja koja postavlja vrednost ako ime nije prazno i prosledjuje novu vredmost
	
	void postaviIme(String ime) {
		if(ime==null||ime.trim().length()==0)
			System.out.println("Greska");
		else
		this.ime=ime.trim(); // u promenljivu ime upisi vrednost parametra ime
	}
	
	void postaviPrezime(String prezime) {
		if(prezime==null||prezime.trim().length()==0)
			System.out.println("Greska");
		else
			this.prezime=prezime;
	}
	
	
	//fja koja bronji znakove
	
	int prebrojZnakove(String s, char c) {
		int brojac=0;
		for(int i=0; i<s.length(); i++)
			if(s.charAt(i)==c)
				brojac++;
		return brojac;
	}
	
	//fja koja postavlja adresu
	/*
	void postaviAdresu(String ulica, String broj, String grad) {
    if(adresa==null ||adresa.length()==0 || prebrojZnakove(adresa, ';')!=2)
    	System.out.println("Greska");
    else
    	this.adresa=adresa;
    }
  
  */
	void postaviAdresu(String  adresa) {
		if(adresa!=null && adresa.length()!=0 && adresa.indexOf(';')!=adresa.lastIndexOf(';'))
				this.adresa=adresa;
		else 
			
			System.out.println("Greska");
	}
	
	//proveri da li su data adresa i unesena adresa iste
	void proveriAdresu(String ulica, String broj, String grad) {
		String adresa2=ulica+';'+broj+';'+grad;
		if(adresa.equals(adresa2))
			System.out.println("Adrese su iste");
		else {
			if(adresa2.endsWith(grad))
			   System.out.println("Isti grad");
			else
				System.out.println("Nisu iste adrese");
		}
	}
//	Jove Ilica;154;Beograd
//	1.substring: adresa.substring(J, ;);
	
	
	void ispisi() {
		System.out.println("Ime:"+ime);
		System.out.println("Prezime:"+prezime);
		String ulica=adresa.substring(0, adresa.indexOf(';'));
		String broj=adresa.substring(adresa.indexOf(';')+1, adresa.lastIndexOf(';'));
		String grad=adresa.substring(adresa.lastIndexOf(';')+1);
		System.out.println("Ulica:"+ulica);
		System.out.println("Broj:"+broj);
		System.out.println("Grad:"+grad);
		
		//mogli smo i preko adresa.split(";");
		//znaci: podeli String svuda gde imas  ;
		
	
	
	
	}
	
	

}
