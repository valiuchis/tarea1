
package tareaprog;

public class Tareaprog {

    public static void main(String[] args) {
        
        
        //PagoInsuficienteException
        System.out.println("Caso 1:");
        Moneda cien = new MonedaCien();
        Expendedora maquinaExpendedora1 = new Expendedora(6,1300,1700);
        Comprador Valeria = new Comprador(cien,1,maquinaExpendedora1);
        Valeria.compraProducto();
        System.out.println(Valeria.saborProducto());
        System.out.println("El vuelto es: " + maquinaExpendedora1.calcularVuelto() + "$");
        
        System.out.println("Caso 2:"); 
        Moneda quinientos = new MonedaQuinientos();
        Expendedora maquinaExpendedora2 = new Expendedora(2,500,200);
        Comprador Rosh = new Comprador(quinientos,4,maquinaExpendedora2);
        Rosh.compraProducto();
        System.out.println(Rosh.saborProducto());
        System.out.println("El vuelto es: " + maquinaExpendedora2.calcularVuelto() + "$");
        Rosh.getVuelto();
        
        
        //NoHayProductoException
        System.out.println("Caso 3:");
        Moneda mil = new MonedaMil();
        Expendedora maquinaExpendedora3 = new Expendedora(0,1000,800);
        Comprador Freddy = new Comprador(mil,2,maquinaExpendedora3);
        Freddy.compraProducto();
        System.out.println(Freddy.saborProducto());
        System.out.println("El vuelto es: " + maquinaExpendedora3.calcularVuelto() + "$");
        
        //PagoIncorrectoException
        System.out.println("Caso 4:");
        Moneda nula = null;
        Expendedora maquinaExpendedora4 = new Expendedora(50,1200,900);
        Comprador Doris = new Comprador(nula,4,maquinaExpendedora4);
        Doris.compraProducto();
        System.out.println(Doris.saborProducto());
        System.out.println("El vuelto es: " + maquinaExpendedora4.calcularVuelto() + "$");  
    }  
}
