class RazonSocial(
    private var nombre : String,
    private var direccion : String,
    private var telefono : String
) {
    override fun toString(): String {
        return "Nombre: $nombre - Direccion: $direccion - Telefono: $telefono"
    }
}