package factorymethod;

import factorymethod.Juomat.Vesi;
import factorymethod.Juomat.Juoma;
import factorymethod.Ruuat.Kaurapuuro;
import factorymethod.Ruuat.Ruoka;

public class Opettaja extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Vesi();
    }

    public Ruoka createRuoka() {
        return new Kaurapuuro();
    }
}
