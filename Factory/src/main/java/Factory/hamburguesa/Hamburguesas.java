package Factory.hamburguesa;

public abstract class Hamburguesas {
    protected int calorias;

    public abstract void preparar();

    public void printCalorias(){
        System.out.println("Calorias: "+ calorias);
    }
}
