package tareaprog;

/**
 *
 * @author valeriacarolinaramos
 */

public abstract class Dulce implements Producto {
    
    public int Serie;

    public Dulce(int s){
        Serie = s;
    }

    public int getSerie() {
        return Serie;
    }
    
    @Override
    public String ingerir(){
        return "Sabor: ";
    }
}

class Snickers extends Dulce {

    public Snickers(int Serie) {
        super(Serie);
    }
    
    @Override
    public String ingerir(){   
        return super.ingerir() + "Snickers";
    }
}

class Super8 extends Dulce {
    
    public Super8(int Serie) {
        super(Serie);
    }
    
    @Override
    public String ingerir() {
        return super.ingerir() + "Super 8";
    }
}

