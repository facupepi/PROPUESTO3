class ItemVenta (
    private var mercaderia : Mercaderia,
    private var cantidad : Int
){
    init{
        mercaderia.stock -= cantidad
    }
    fun importePorCantidad() : Double{
        return cantidad * mercaderia.precio
    }
}