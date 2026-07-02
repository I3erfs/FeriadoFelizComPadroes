interface PagamentoStrategy { void pagar(double valor); }

class PagamentoPIX implements PagamentoStrategy {
    public void pagar(double valor) { System.out.println("Pagando R$" + valor + " via PIX."); }
}
