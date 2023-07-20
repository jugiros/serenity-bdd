# author: JuanMolina
# date: 19/07/2023
# language: es

Característica: Agregar un producto
  Como usuario quiero agregar un producto dentro del carrito de compras.

  @AgregarProductoExitoso
  Escenario: Generar pago existoso
    Dado Juan navega a la ventana para agregar el 1er productos
    Cuando regresa al home abre sel segundo producto y lo agrega
    Entonces abre el carrito finaliza la compra y visualiza el mensaje de realizado