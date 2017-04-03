
import javax.swing.*;

public class Ventana extends JFrame {


    int x;
    int y;

    public JPanel panel;
    JTextField texto;
    public JLabel label;

    public Ventana() {

        panel = new JPanel();
        panel.setLayout(null);
        texto = new JTextField();
        label = new JLabel("LISTADO DE PRODUCTOS");
        label.setBounds(155, 10, 200, 16);
        panel.add(label);
        crear_pagina();

    }
    
    private void crear_pagina (){
        this.add(panel);
        this.setBounds(30, 30, 500, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.mostrarProducto();
    }

 
    public void mostrarProducto() {

        x = 17;
        y = 80;

        Main.ListaP.forEach((String k, Producto v) -> {

            String cod = Main.ListaP.get(k).getCodigo();
            JLabel c = new JLabel();
            c.setBounds(x, y, 40, 16);
            c.setText(cod);
            panel.add(c);
            x += 80;

            String nom = Main.ListaP.get(k).getNombre();
            JLabel n = new JLabel();
            n.setBounds(x, y, 120, 16);
            n.setText(nom);
            panel.add(n);
            x += 200;

            String num = Main.ListaP.get(k).getVal();
            JLabel val = new JLabel();
            val.setBounds(x, y, 40, 16);
            val.setText(num);
            panel.add(val);
            y += 10;

            x = 17;
        });
    }

}
