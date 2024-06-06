//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Compania extends Vuelos {
    protected String nombreCompania;

    public Compania(String tipoVuelo, String codigo, String destino, String duracion, String plazas, String nombreCompania) {
        super(tipoVuelo, codigo, destino, duracion, plazas);
        this.nombreCompania = nombreCompania;
    }

    public String getNombreCompania() {
        return this.nombreCompania;
    }

    public void setNombreCompania(String nombreCompania) {
        this.nombreCompania = nombreCompania;
    }

    public void imprimirInformacionV() {
        super.imprimirInformacionVuelos();
        System.out.println("Nombre Compañia: " + this.nombreCompania);
    }
}
