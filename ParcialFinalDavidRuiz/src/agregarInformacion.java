//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class agregarInformacion {
    private final List<Aeropuerto> aeropuertos = new ArrayList();
    private final List<Compania> companias = new ArrayList();

    public agregarInformacion() {
    }

    public List<Aeropuerto> getAeropuertos() {
        return this.aeropuertos;
    }

    public List<Compania> getCompanias() {
        return this.companias;
    }

    public void agregarAeropuertos(Aeropuerto aeropuerto) {
        this.aeropuertos.add(aeropuerto);
    }

    public void imprimirInformacionAeropuertos() {
        Iterator var1 = this.aeropuertos.iterator();

        while(var1.hasNext()) {
            Aeropuerto aeropuerto = (Aeropuerto)var1.next();
            aeropuerto.imprimirInformacion();
            System.out.println();
        }

    }

    public void agregarVuelo(Compania compania) {
        this.companias.add(compania);
    }

    public void imprimirInformacionVuelos() {
        Iterator var1 = this.companias.iterator();

        while(var1.hasNext()) {
            Compania compania = (Compania)var1.next();
            compania.imprimirInformacionV();
            System.out.println();
        }

    }

    private Aeropuerto buscarAeropuertoPorCodigo(String codigo) {
        Iterator var2 = this.aeropuertos.iterator();

        Aeropuerto aeropuerto;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            aeropuerto = (Aeropuerto)var2.next();
        } while(!aeropuerto.getCodigo().equals(codigo));

        return aeropuerto;
    }

    public void mostrarVuelosSalidaPorAeropuerto(String codigoAeropuerto) {
        Aeropuerto aeropuerto = this.buscarAeropuertoPorCodigo(codigoAeropuerto);
        if (aeropuerto != null) {
            System.out.println("Vuelos de salida desde el aeropuerto " + codigoAeropuerto + ": " + aeropuerto.getNombre());
            Iterator var3 = this.companias.iterator();

            while(var3.hasNext()) {
                Compania compania = (Compania)var3.next();
                if (compania.getCodigo().equals(codigoAeropuerto)) {
                    compania.imprimirInformacionV();
                    System.out.println();
                }
            }

            System.out.println();
        }

    }

    public void mostrarVuelosllegadaPorAeropuerto(String codigoAeropuerto) {
        Aeropuerto aeropuerto = this.buscarAeropuertoPorCodigo(codigoAeropuerto);
        if (aeropuerto != null) {
            System.out.println("Vuelos de llegada desde el aeropuerto " + codigoAeropuerto + ": " + aeropuerto.getNombre());
            Iterator var3 = this.companias.iterator();

            while(var3.hasNext()) {
                Compania compania = (Compania)var3.next();
                if (compania.getDestino().equals(codigoAeropuerto)) {
                    compania.imprimirInformacionV();
                    System.out.println();
                }
            }

            System.out.println();
        }

    }
}
