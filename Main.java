public class Main {
    public static void main(String[] args) {
        // Uso da Fachada
        EcommerceFacade loja = new EcommerceFacade();
        
        // Decorando o pedido
        Pedido meuPedido = new EmbalagemPresente(new PedidoBasico());
        
        loja.finalizarCompra(meuPedido.getPreco(), new PagamentoPIX());
    }
}
