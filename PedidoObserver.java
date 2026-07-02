interface PedidoObserver { void notificar(String status); }

class Pedido {
    private List<PedidoObserver> observadores = new ArrayList<>();
    public void setStatus(String status) {
        for (PedidoObserver o : observadores) o.notificar(status);
    }
}
