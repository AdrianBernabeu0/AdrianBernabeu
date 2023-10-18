
public class MayaOrdre extends Maya implements Ordre{
    
    public MayaOrdre(String nombre, String categoria, Arma arma, int fuer, int cons, int velo, int intel, int sor) {
        super(nombre, categoria, arma, fuer, cons, velo, intel, sor);
    }

    @Override
    public int ordenRestaurarSalud() {
        int saludOrden=pSalud*=1.1;
        if(saludOrden<getSaludBase())
            return saludOrden;
        else
            return getSaludBase();
    }
    

}
