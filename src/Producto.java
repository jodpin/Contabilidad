
import java.io.*;




public class Producto implements Serializable{  
    private String nombre;
    private String codigo;
    private String val;
    private String cantidad;
    private String subtotal;

    public Producto(String nombre, String codigo, String val, String cantidad, String subtotal) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.val = val;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }
    
    
    
    public Producto(String nombre, String codigo, String val){
        this.codigo = codigo;
        this.nombre = nombre;
        this.val = val;
        this.subtotal="";
        this.cantidad ="";
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String valor) {
        this.val = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad= cantidad;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }
    

}
