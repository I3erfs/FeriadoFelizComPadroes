class ProdutoFactory {
    public static Produto criarProduto(String tipo) {
        if (tipo.equals("fisico")) return new ProdutoFisico();
        return new ProdutoDigital();
    }
}
