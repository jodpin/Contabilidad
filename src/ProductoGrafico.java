
import java.io.Serializable;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DAVID
 */
public class ProductoGrafico implements Serializable {

    public ProductoGrafico(JTextField codigo, JLabel nombre, JTextField cantidad, JLabel precio, JLabel subtotal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subtotal = subtotal;
    }
    
    private JTextField codigo;
    private JLabel nombre;
    private JTextField cantidad;
    private JLabel precio;
    private JLabel subtotal;
    
}
