class ItemVenta (
    var mercaderia : Mercaderia,
    var cantidad : Int
){
    init{
        mercaderia.stock -= cantidad
    }
    fun importePorCantidad() : Double{
        return cantidad * mercaderia.precio
    }
}