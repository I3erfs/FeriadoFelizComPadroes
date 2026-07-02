import java.util.*;

// PROXY: Proteção de pagamento
class PagamentoProxy implements PagamentoStrategy {
    private PagamentoStrategy real = new PagamentoPIX();
    public void pagar(double v) {
        System.out.println("Validando saldo no Proxy...");
        real.pagar(v);
    }
