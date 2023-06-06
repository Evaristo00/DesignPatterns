package Factory.hamburguesa;

public class BigMac extends Hamburguesas {

    public BigMac(){
        super.calorias = 3000;
    }
    @Override
    public void preparar() {
        System.out.println("Preparando BigMac...");
    }
}
