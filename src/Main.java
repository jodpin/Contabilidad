
import java.io.*;
import java.util.HashMap;

public class Main implements Serializable {

    public static HashMap<String, Producto> ListaP;
    public static HashMap<String, Factura> ListaFact;

    public static void main(String[] args) throws ClassNotFoundException {
        ListaP = new HashMap();
        ListaP = cargarProductos();
        Create c = new Create();
        ListaFact = new HashMap();
        ListaFact = cargarFacturas();

    }

    public static void guardarProductos(HashMap<String, Producto> p) {
        try {

            ObjectOutputStream escritura = new ObjectOutputStream(new FileOutputStream("C:\\Users\\DAVID\\Desktop\\productos.txt")); 
                escritura.writeObject(p);
            
        } catch (IOException e) {
            System.out.println("error de producto");
        }
    }

    public static HashMap<String, Producto> cargarProductos() throws ClassNotFoundException {
        HashMap<String, Producto> p = new HashMap<>();
        try {
            try (ObjectInputStream lectura = new ObjectInputStream(new FileInputStream("C:\\Users\\DAVID\\Desktop\\productos.txt"))) {
                p = (HashMap<String, Producto>) lectura.readObject();
            }
        } catch (IOException e) {
            System.out.println("ojo con la cargada de archivos");
        }

        return p;
    }

    public static void guardarFacturas(HashMap<String, Factura> f) {
        try {

            try (ObjectOutputStream escritura = new ObjectOutputStream(new FileOutputStream("C:\\Users\\DAVID\\Desktop\\facturas.txt"))) {
                escritura.writeObject(f);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
        public static HashMap<String, Factura> cargarFacturas() throws ClassNotFoundException {
        HashMap<String, Factura> f = new HashMap<>();
        try {
            try (ObjectInputStream lectura = new ObjectInputStream(new FileInputStream("C:\\Users\\DAVID\\Desktop\\facturas.txt"))) {
                f = (HashMap<String, Factura>) lectura.readObject();
            }
        } catch (IOException e) {
            System.out.println("ojo con la cargada de archivos");
        }

        return f;
    }

}
