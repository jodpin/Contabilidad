
package contabilidad;


public class Producto {
    
    private String codigo;
    private String nombre;
    private int valor;
    private int subtotal;
    private int cantidad;

    public Producto(String codigo, String nombre, int valor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.valor = valor;
        
    }
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }
    
    
    
}
