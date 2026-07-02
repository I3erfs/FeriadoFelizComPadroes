class EcommerceFacade {
    public void finalizarCompra(double valor, PagamentoStrategy metodo) {
        Logger.getInstancia().log("Iniciando processo de compra.");
        
        // Usa o Proxy
        PagamentoStrategy pagamento = new PagamentoProxy();
        pagamento.pagar(valor);
        
        // Usa o Adapter
        FreteModerno frete = new AdaptadorFrete();
        frete.calcular();
        
        // Notifica Observadores
        Cliente c = new Cliente();
        c.update("Pedido finalizado com sucesso!");
    }
}
