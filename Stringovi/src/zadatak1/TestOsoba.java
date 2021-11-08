package zadatak1;

public class TestOsoba {
	public static void main(String[] args) {
		Osoba os = new Osoba(); //preko praznog konstruktora
		
		os.postaviIme("Mihailo");
		os.postaviPrezime("Mahovac");
		os.postaviAdresu("Jove Ilica;154;Beograd");
		os.ispisi();
		os.proveriAdresu("Joakima Rakovca","65","Beograd");
		


}
}
