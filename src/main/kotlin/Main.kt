fun main() {
    var alimento1 = Alimento(1,"Masitas",30.0,500,"Arcor")
    var alimento2 = Alimento(2,"Hamburguesas",50.0,100,"Swift",50)
    var bebida1 = Bebida(3,"Pepsi",15.0,150,100,1.0)
    var bebida2 = Bebida(4,"Coca Cola",30.0,200,300,2.0)
    var razonSocial1 = RazonSocial("Facundo","Mitre","3564")

    var venta1 = Venta("2023",null,null,razonSocial1)
    var venta2 = Venta("2024",null,null,null)

    venta1.agregarItem(alimento1,5)

    venta2.agregarItem(alimento2,1)
    venta2.agregarItem(bebida2,2)
    venta2.razonSocial = razonSocial1

    venta2.finalizar(300.0)

    var gestor = Gestor()
    gestor.mercaderias.add(alimento1)
    gestor.mercaderias.add(alimento2)
    gestor.mercaderias.add(bebida1)
    gestor.mercaderias.add(bebida2)

    gestor.ventas.add(venta1)
    gestor.ventas.add(venta2)

    gestor.recaudacion()
    gestor.mercaderiasPocoStock()

    venta1.finalizar(300.0)

    gestor.recaudacion()
}