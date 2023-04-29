package tareaprog;

/**
 *
 * @author valeriacarolinaramos
 */
public abstract class Bebida implements Producto {
    
    public int Serie;
    
    public Bebida(int s){
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

class Sprite extends Bebida {
    
    public Sprite(int Serie) {
        super(Serie);
    }

    @Override
    public String ingerir(){
        return super.ingerir() + "Sprite";
    }
}

class CocaCola extends Bebida {

    public CocaCola(int Serie) {
        super(Serie);
    }

    @Override
    public String ingerir(){
        return super.ingerir() + "CocaCola";
    }
}


