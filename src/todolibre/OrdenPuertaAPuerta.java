package todolibre;

public class OrdenPuertaAPuerta extends OrdenDeCompra {

    private boolean envioGratis;

    public OrdenPuertaAPuerta(boolean envioGratis, int numero, double monto, Usuario vendedor, Usuario comprador) {
        super(numero, monto, vendedor, comprador);
        this.envioGratis = envioGratis;
    }
    
    @Override
    public Domicilio getDomicilioDestino() {
        return getComprador().getDomicilio();
    }
    
    public boolean hasEnvioGratis() {
        return envioGratis;
    }     
}
