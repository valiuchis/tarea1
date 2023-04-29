/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaprog;

/**
 *
 * @author valeriacarolinaramos
 */
public class Expendedora {
    
    private int cantProductos;
    private int precioBebidas;
    private int precioDulces;
    private int precioProductos;
    private int idProducto;
    
    private DepositoProducto CocaCola;
    private DepositoProducto Sprite;
    private DepositoProducto Snickers;
    private DepositoProducto Super8;
   
    private int cantidadPagar;
    private int vuelto;
    private DepositoMoneda depositoVuelto;
    
    public Expendedora (int numProducto, int precioBebida, int precioDulce) {
        
        cantProductos = numProducto;
        precioBebidas = precioBebida;
        precioDulces = precioDulce;
        
        CocaCola = new DepositoProducto ();
        Sprite = new DepositoProducto ();
        Snickers = new DepositoProducto ();
        Super8 = new DepositoProducto ();
        
        for (int i = 0; i < cantProductos; i++) {
            CocaCola.agregaProducto (new CocaCola(i));
            Sprite.agregaProducto (new Sprite (i));
            Snickers.agregaProducto (new Snickers (i));
            Super8.agregaProducto (new Super8 (i));    
        }
    }
    
    public Producto ventaProducto (Moneda m, int codigo) throws NoHayProductoException, PagoIncorrectoException, PagoInsuficienteException {

        cantidadPagar = m.getValor();
        idProducto = codigo;
  
        if (m.getValor() >= precioBebidas || m.getValor() >= precioDulces) {
            
            switch (codigo) {
                case 1 -> {
                    if (CocaCola.cantidadProducto() > 0) {
                        return CocaCola.getProducto(); 
                    } else {
                        throw new NoHayProductoException ("Producto agotado.");
                    }
                }    
                case 2 -> {
                    if (Sprite.cantidadProducto() > 0) {
                        return Sprite.getProducto();
                    } else {
                        throw new NoHayProductoException ("Producto agotado.");
                    }
                }  
                case 3 -> { 
                    if (Snickers.cantidadProducto() > 0) {
                        return Snickers.getProducto();
                    } else {
                        throw new NoHayProductoException ("Producto agotado.");
                    }
                }
                case 4 -> { 
                    if (Super8.cantidadProducto() > 0) {
                        return Super8.getProducto();
                    } else {
                        throw new NoHayProductoException ("Producto agotado.");
                    }
                }
                default -> {    
                    return null;
                }
            } 
        }
         
        if (m.getValor() < precioBebidas || m.getValor() < precioDulces) {
            throw new PagoInsuficienteException ("Fondo insuficiente. Por favor, intente de nuevo.");
                }
        if (m == null) {
            throw new PagoIncorrectoException ("Transacción no permitida. Por favor, intente de nuevo");
        }
        
        return null;
    }
    
    public int calcularVuelto () {
        if (idProducto == 1 || idProducto == 2){
            precioProductos = precioBebidas;
            vuelto = cantidadPagar - precioProductos;
            return vuelto;
        }
        if (idProducto == 3 || idProducto == 4) {
            precioProductos = precioDulces;
            vuelto = cantidadPagar - precioProductos;
            return vuelto;
            }
        return 0;
        }   
}

 