/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaprog;
import java.util.ArrayList;

/**
 *
 * @author valeriacarolinaramos
 */
public class DepositoProducto {
    
    private ArrayList <Producto> stock;
    
    public DepositoProducto () {
        stock = new ArrayList <Producto> ();
    }
    
    public void agregaProducto (Producto p) {
        stock.add(p);
    }
    
    public Producto getProducto () { 
        if (stock.size() != 0) {
            return stock.remove(0);
        } else {
            return null; 
        }
    }
    
    public int cantidadProducto () {         
            return stock.size();
        }
}
