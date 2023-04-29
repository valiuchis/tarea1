package tareaprog;

/**
 *
 * @author valeriacarolinaramos
 */
public abstract class Moneda {
    
    public int valor;
    
    public Moneda () {
        super ();
    }
    
    public int getValor () {
        return valor;
    }
}

class MonedaCien extends Moneda {

    public MonedaCien () {
        super ();
        valor = 100;
    }

    public int getValor () {
        return valor;
    }
  
     public String toString(){
        return "$" + getValor();
     }
}

class MonedaQuinientos extends Moneda {
    
    public MonedaQuinientos () {
        super ();
        valor = 500;
    }

    public int getValor () {
        return valor;
    }
     
     public String toString(){
        return "$" + getValor();
    }
}

class MonedaMil extends Moneda {

    public MonedaMil () {
        super ();
        valor = 1000;
    }

    public int getValor () {
        return valor;
    }
  
    public String toString(){
        return "$" + getValor();  
    }
}
    
class MonedaMilQuinientos extends Moneda {

    public MonedaMilQuinientos () {
        super ();
        valor = 1000;
    }

    public int getValor () {
        return valor;
    }
  
    public String toString(){
        return "$" + getValor();
    }
    
}

    


