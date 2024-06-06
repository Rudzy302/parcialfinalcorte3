//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class CodigoAeropuerto {
    protected String codigo;

    public CodigoAeropuerto(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void ImprimirCodigo() {
        System.out.println("Codigo: " + this.codigo);
    }
}
