/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaprog;

/**
 *
 * @author valeriacarolinaramos
 */
public class Comprador {
    private Moneda pago;
    private int vuelto;
    private int id;
    private Expendedora vendingMachine;
    private Producto producto;
    private DepositoMoneda depositoVuelto;
    
    public Comprador(Moneda moneda, int codigo, Expendedora exp) {    
        pago = moneda;
        id = codigo;
        vendingMachine = exp;
    }
    
    public Producto compraProducto () {  
        try { 
            producto = vendingMachine.ventaProducto(pago, id);
        } catch (NoHayProductoException | PagoIncorrectoException | PagoInsuficienteException exception) {
            System.out.println(exception.getMessage());  
        }
        
        return producto;    
    }
     
    public void getVuelto () { 
        for (int i = (vuelto/100); i >= 0; i--) {
            //vuelto = vuelto - 100;
            MonedaCien cambio = new MonedaCien();
            System.out.println("Retire su vuelto: " + cambio);
        }
    }

    public String saborProducto () {
        return producto.ingerir();
    }
}
