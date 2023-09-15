class RazonSocial(
    var nombre : String,
    var direccion : String,
    var telefono : String
) {
    override fun toString(): String {
        return "Nombre: $nombre - Direccion: $direccion - Telefono: $telefono"
    }
}