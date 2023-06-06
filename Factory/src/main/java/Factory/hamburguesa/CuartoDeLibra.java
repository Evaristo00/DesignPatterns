package Factory.hamburguesa;

public class CuartoDeLibra extends Hamburguesas {

    public CuartoDeLibra(){
        super.calorias= 1000;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando cuarto de Libra...");
    }
}
