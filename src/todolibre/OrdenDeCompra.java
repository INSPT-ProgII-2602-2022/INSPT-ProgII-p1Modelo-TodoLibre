package todolibre;

public abstract class OrdenDeCompra implements Entregable {

    private int numero;
    private double monto;
    private Usuario vendedor;
    private Usuario comprador;

    public OrdenDeCompra(int numero, double monto, Usuario vendedor, Usuario comprador) {
        this.numero = numero;
        this.monto = monto;
        this.vendedor = vendedor;
        this.comprador = comprador;
    }
    
    @Override
    public Domicilio getDomicilioOrigen() {
        return this.vendedor.getDomicilio();
    }

    public Usuario getComprador() {
        return comprador;
    }
    
    public boolean mismaComunaDestinoPartida(){
         return getDomicilioOrigen().getNumComuna() == getDomicilioDestino().getNumComuna();
    }   
    
}
