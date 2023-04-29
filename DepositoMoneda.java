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
public class DepositoMoneda {
    private ArrayList<Moneda> deposito;
    
    public DepositoMoneda () {  
        deposito = new ArrayList<Moneda> ();
    }
    
    public void agregarMoneda (Moneda m) {
        deposito.add(m);
    }
    
    public void sacarMoneda (int i) {
        deposito.remove(i);
    }
    
    public Moneda getMoneda () {
        if (!deposito.isEmpty()) {
            return deposito.remove(0);
        } else {
            return null;
        }
    }
    
    public int cantidadMoneda () {
        return deposito.size();
    }
}
