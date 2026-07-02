//  SINGLETON: Log de Transações
class Logger {
    private static Logger instancia;
    private Logger() {}
    public static Logger getInstancia() {
        if (instancia == null) instancia = new Logger();
        return instancia;
    }
    public void log(String msg) { System.out.println("[LOG]: " + msg); }
}

// FACTORY: Criação de produtos
interface Produto { String getNome(); }
class ProdutoFisico implements Produto { public String getNome() { return "Produto Físico"; } }

class ProdutoFactory {
    public static Produto criar(String tipo) {
        if (tipo.equals("fisico")) return new ProdutoFisico();
        return null;
    }
}
