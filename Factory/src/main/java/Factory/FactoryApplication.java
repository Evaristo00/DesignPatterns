package Factory;


import Factory.factory.Cocinar;
import Factory.factory.CocinarBigMac;
import Factory.factory.CocinarCuartoDeLibra;
import Factory.hamburguesa.Hamburguesas;

public class FactoryApplication {

	public static void main(String[] args) {
		Cocinar FBigMac = new CocinarBigMac();
		Cocinar FCurato = new CocinarCuartoDeLibra();

		Hamburguesas bigMac = FBigMac.cocinarHamburguesa();
		bigMac.preparar();
		bigMac.printCalorias();

		Hamburguesas cuarto = FCurato.cocinarHamburguesa();
		cuarto.preparar();
		cuarto.printCalorias();


	}

}
