//  STRATEGY: Pagamento
interface PagamentoStrategy { void pagar(double valor); }
class PagamentoPIX implements PagamentoStrategy {
    public void pagar(double v) { System.out.println("Pagando R$" + v + " via PIX."); }
}

//  DECORATOR: Embalagem para presente
interface Pedido { double getPreco(); }
class PedidoBasico implements Pedido { 
    public double getPreco() { return 100.0; } 
}
public class EmbalagemPresente implements Pedido {
    private Pedido pedido;
    public EmbalagemPresente(Pedido p) { this.pedido = p; }
    public double getPreco() { return pedido.getPreco() + 10.0; } // Adiciona custo
}

//  ADAPTER: Frete Legado
class ServicoFreteAntigo { public void calcularFreteAntigo() { System.out.println("Frete calculado (Sistema Legado)"); } }
interface FreteModerno { void calcular(); }
class AdaptadorFrete implements FreteModerno {
    private ServicoFreteAntigo antigo = new ServicoFreteAntigo();
    public void calcular() { antigo.calcularFreteAntigo(); }
}
