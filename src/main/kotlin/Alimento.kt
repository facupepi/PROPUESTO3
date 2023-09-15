class Alimento(
    codigo : Int,
    descripcion : String,
    precio : Double,
    stock : Int,
    var marca : String,
    stockMinimo: Int = 20,

) : Mercaderia(codigo, descripcion, precio, stock, stockMinimo)