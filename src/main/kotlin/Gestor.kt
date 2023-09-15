class Gestor {
    var mercaderias : ArrayList<Mercaderia> = arrayListOf()
    var ventas : ArrayList<Venta> = arrayListOf()
    fun recaudacion(){
        var total = 0.0
        for (ventaTemp in ventas){
            if(ventaTemp.concretada){
                total += ventaTemp.importe
            }
        }
        println("TOTAL DE VENTAS CONCRETADAS: $$total")
    }
    fun mercaderiasPocoStock(){
        var cadena = ""
        for(mercaderiaTemp in mercaderias){
            if (mercaderiaTemp.stock <= mercaderiaTemp.stockMinimo){
                cadena += "$mercaderiaTemp\n"
            }
        }
        if (cadena != "") println("MERCADERIAS CON POCO STOCK:\n$cadena")
        else println("TODAS LAS MERCADERIAS TIENEN STOCK MAYOR AL MINIMO")
    }
}