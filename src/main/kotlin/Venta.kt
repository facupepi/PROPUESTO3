class Venta(
    var fecha : String?,
    var pago : Double?,
    private var vuelto : Double?,
    var razonSocial: RazonSocial?,
    var concretada: Boolean = false,
    var importe : Double = 0.0
) {
    private var items : ArrayList<ItemVenta> = arrayListOf()
    fun agregarItem(mercaderia: Mercaderia, cantidad: Int){
        val itemTemp= ItemVenta(mercaderia, cantidad)

        items.add(itemTemp)
        importe += itemTemp.importePorCantidad()
    }
    fun finalizar(pagoTemp: Double){
        if(pagoTemp < importe){
            println("\n\nERROR! EL PAGO ES MENOR AL IMPORTE, REINTENTAR \n\n")
        }
        else {
            vuelto = pagoTemp - importe
            concretada = true
            println("\n\nEL PAGO SE REALIZO CON EXITO - VUELTO: $$vuelto\n\n")
        }
    }
}
