//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Vuelos extends CodigoAeropuerto {
    protected String tipoVuelo;
    protected String destino;
    protected String duracion;
    protected String plazas;

    public Vuelos(String tipoVuelo, String codigo, String destino, String duracion, String plazas) {
        super(codigo);
        this.tipoVuelo = tipoVuelo;
        this.destino = destino;
        this.duracion = duracion;
        this.plazas = plazas;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getPlazas() {
        return this.plazas;
    }

    public void setPlazas(String plazas) {
        this.plazas = plazas;
    }

    public String getDuracion() {
        return this.duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void imprimirInformacionVuelos() {
        super.ImprimirCodigo();
        System.out.println("Tipo Vuelo: " + this.tipoVuelo + "\nDestino: " + this.destino + "\nDuracion: " + this.duracion + "\nPlazas: " + this.plazas);
    }
}
