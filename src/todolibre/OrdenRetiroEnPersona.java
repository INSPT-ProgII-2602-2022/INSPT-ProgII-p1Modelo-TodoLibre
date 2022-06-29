package todolibre;

public class OrdenRetiroEnPersona extends OrdenDeCompra {

    private Sucursal sucursal;

    public OrdenRetiroEnPersona(Sucursal sucursal, int numero, double monto, Usuario vendedor, Usuario comprador) {
        super(numero, monto, vendedor, comprador);
        this.sucursal = sucursal;
    }   
    
    @Override
    public Domicilio getDomicilioDestino() {
        return this.sucursal.getDomicilio();
    }
}
