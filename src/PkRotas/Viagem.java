package PkRotas;

import java.util.ArrayList;
import PkRotas.Cidade;


public class Viagem {

    private int totalKm;
    private String fronteira;
    private ArrayList<Cidade> viagem = new ArrayList<>();
    private boolean chegou = false;

    public Viagem() {
    }

    public Viagem(int totalKm, String fronteira, ArrayList<Cidade> viagem) {
        this.totalKm = totalKm;
        this.fronteira = fronteira;
        this.viagem = viagem;
    }

    @Override
    public String toString() {
        System.out.println("");
        String ret = "-> Saida por " + fronteira + " total = " + totalKm + " km, roteiro : \n";
        for (Cidade v : viagem) {
            ret = ret + v.getNome() + " - " + v.getFronteira() + " " + v.getDistancia() + "\n";
        }
        return ret;
    }

    public int VerDuplos(Viagem v, Cidade c) {
        for (Cidade cidade : v.viagem){
            if(cidade.getNome().equalsIgnoreCase(c.getNome()) 
                    && cidade.getFronteira().equalsIgnoreCase(c.getFronteira()))
                return 1;
        }
        return 0;
    }

    public void setTotalKm() {
        int tot = 0;
        for (Cidade v : viagem) {
            tot += v.getDistancia();
        }
        this.setTotalKm(tot);
    }

    public int getTotalKm() {
        return totalKm;
    }

    public void setTotalKm(int totalKm) {
        this.totalKm = totalKm;
    }

    public void setFronteira(String fronteira) {
        this.fronteira = fronteira;
    }

    public String getFronteira() {
        return fronteira;
    }

    public ArrayList<Cidade> getViagem() {
        return viagem;
    }

    public void setViagem(ArrayList<Cidade> viagem) {
        this.viagem = viagem;
    }

    /**
     * @return the chegou
     */
    public boolean isChegou() {
        return chegou;
    }

    /**
     * @param chegou the chegou to set
     */
    public void setChegou(boolean chegou) {
        this.chegou = chegou;
    }
}
