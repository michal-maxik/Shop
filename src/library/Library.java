package library;

public class Library {
	private Book[] items;
	private Magazin[] magazins;
	public void addItems(int count) {
		items = new Book[count];
		for (int i=0; i<count; i++){
			System.out.println("Adding Book " + i+1 + " to the library");
			items[i]=new Book();

			//vytvor instanci
			//pridej instanci do pole

		}
		magazins = new Magazin[count];
		for (int i=0; i<count; i++){
			System.out.println("Adding Magazin " + i+1 + " to the library");
			magazins[i]=new Magazin();

		}
	}

	public void printInfo(){
		System.out.println("-----INFO O KNIHOVNE-----");
		for (int i=0; i<items.length; i++){
			items[i].printInfo();
			magazins[i].printInfo();
		}
		//sem dopln kod
		System.out.println("-----");
	}

}
