package Factory.factory;

import Factory.hamburguesa.BigMac;


public class CocinarBigMac implements Cocinar {

    @Override
    public BigMac cocinarHamburguesa() {
        return new BigMac();
    }
}
