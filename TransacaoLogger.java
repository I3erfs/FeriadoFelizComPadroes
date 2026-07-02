class TransacaoLogger {
    private static TransacaoLogger instancia;
    private TransacaoLogger() {} // Construtor privado
    public static TransacaoLogger getInstancia() {
        if (instancia == null) instancia = new TransacaoLogger();
        return instancia;
    }
    public void logar(String msg) { System.out.println("[AUDITORIA] " + msg); }
}
