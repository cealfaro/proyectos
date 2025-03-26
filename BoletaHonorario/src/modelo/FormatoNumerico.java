package modelo;

import java.text.DecimalFormat;

public class FormatoNumerico{
 
        public String separarEnMiles(Double numero){
        DecimalFormat formatea = new DecimalFormat("###,###");
        return formatea.format(numero);
    };
    
    public String separarEnMilesConDecimal(Float numero){
        DecimalFormat formatea = new DecimalFormat("###,###.##");
        return formatea.format(numero);
    };
    
    public String quitarSeparacionMiles(String numero){
        String formatoNuevo = numero.replace(".", "");
        return formatoNuevo;
    };
    
}
