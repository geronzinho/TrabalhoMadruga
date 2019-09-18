package PkRotas;


public class Rota {
    private Cidade origem;
    private Cidade destino;
    private int distancia;

    public Rota() {
    }

    public Rota(Cidade origem, Cidade destino, int distancia) {
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return "Rota{" + "origem=" + origem + ", destino=" + destino + ", distancia=" + distancia + '}';
    }

    public Cidade getOrigem() {
        return origem;
    }

    public void setOrigem(Cidade origem) {
        this.origem = origem;
    }

    public Cidade getDestino() {
        return destino;
    }

    public void setDestino(Cidade destino) {
        this.destino = destino;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    
}