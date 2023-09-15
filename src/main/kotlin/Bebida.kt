class Bebida(
    codigo : Int,
    descripcion : String,
    precio : Double,
    stock : Int,
    stockMinimo: Int,
    var contenidoNeto : Double
) : Mercaderia(codigo,descripcion,precio,stock,stockMinimo)