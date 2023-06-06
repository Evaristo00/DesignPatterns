package Factory.factory;

import Factory.hamburguesa.CuartoDeLibra;

public class CocinarCuartoDeLibra implements Cocinar {

    @Override
    public CuartoDeLibra cocinarHamburguesa() {

        return new CuartoDeLibra();
    }
}
