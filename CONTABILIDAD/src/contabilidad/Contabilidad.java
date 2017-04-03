package contabilidad;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class Contabilidad {

    public static Map<String, Producto> listaP = new HashMap<>();
    private static Producto pdb;
    private static Producto pdy;
    private static Producto alm;
    private static Producto man;
    private static Producto tcua;
    private static Producto tpan;
    private static Producto tcho;
    private static Producto gav;
    private static Producto gpolv;

    public static void main(String[] args) {

        pdb = new Producto("020", "pan de bono", 1000);
        pdy = new Producto("023", "pan de yuca", 1000);
        alm = new Producto("021", "almojabana", 1000);
        man = new Producto("024", "mantecada", 850);
        tcua = new Producto("033", "torta de cuajada", 1050);
        tpan = new Producto("025", "torta de pan", 800);
        tcho = new Producto("030", "torta de chocolate", 1100);
        gav = new Producto ("032", "galleta de avena", 650);
        gpolv = new Producto("027", "galleta polvorosa", 650);
        
        

        listaP.put("020", pdb);
        listaP.put("023", pdy);
        listaP.put("021", alm);
        listaP.put("024", man);
        listaP.put("025", tpan);
        listaP.put("033", tcua);
        listaP.put("030", tcho);
        listaP.put("032", gav);
        listaP.put("027", gpolv);

        Interfaz i = new Interfaz();
        Contabilidad.generateDate(i);

    }

    public static Map<String, Producto> getListaP() {
        return listaP;
    }

    public static void setListaP(Map<String, Producto> listaP) {
        Contabilidad.listaP = listaP;
    }

    private static void generateDate(Interfaz i) {
        Date date = new Date();
        String dateFormat = "dd/MM/yy";
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        i.getDate().setText(sdf.format(date));

        Calendar c = new GregorianCalendar();
        int hora = c.get(Calendar.HOUR_OF_DAY);
        int minutos = c.get(Calendar.MINUTE);
        int segundos = c.get(Calendar.SECOND);

        String Hora = "";
        if (hora <= 9) {
            Hora += "0";
            Hora += String.valueOf(hora);
            Hora += ":";
        } else {
            Hora += String.valueOf(hora);
            Hora += ":";
        }

        if (minutos <= 9) {
            Hora += "0";
            Hora += String.valueOf(minutos);
            Hora += ":";
        } else {
            Hora += String.valueOf(minutos);
            Hora += ":";
        }

        if (segundos <= 9) {
            Hora += "0";
            Hora += String.valueOf(segundos);

        } else {
            Hora += String.valueOf(segundos);

        }

        i.getHour().setText(Hora);
    }
}
