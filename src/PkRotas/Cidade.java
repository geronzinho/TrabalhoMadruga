package PkRotas;
public class Cidade {
   private String nome;
   private String fronteira; 
   private int distancia;
   
   public Cidade ( String nome, String fronteira, int distancia ) {
      setNome( nome );
      setFronteira ( fronteira );
      setDistancia ( distancia );
   }
   public void setNome( String nome ) { this.nome = nome; }
   public void setFronteira ( String fronteira ) { this.fronteira = fronteira; }
   public void setDistancia( int distancia ) { this.distancia = distancia; }
   public String getNome() { return nome; }
   public String getFronteira() { return fronteira; }
   public int getDistancia() { return distancia; }

    @Override
    public boolean equals(Object obj) {
        if(this == null)
            return false;
        if(obj == null)
            return false;
        if(this.getNome().equalsIgnoreCase(((Cidade)obj).getNome()))
            return true;
       return false;
    }
}

