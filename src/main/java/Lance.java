public class Lance {
    Usuario usuario;
    Double valor;
    public Lance(Usuario usuario, Double valor){
    this.usuario=usuario;
    this.valor=valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
