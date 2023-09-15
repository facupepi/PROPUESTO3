abstract class Mercaderia(
    private var codigo : Int,
    private var descripcion : String,
    var precio : Double,
    var stock : Int,
    var stockMinimo : Int
){
    override fun toString(): String {
        return "CODIGO: $codigo - DESCRIPCION: $descripcion - PRECIO: $precio - STOCK: $stock - STOCKMINIMO: $stockMinimo"
    }
}