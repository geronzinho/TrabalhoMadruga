
package PkRotas;




import java.util.ArrayList;
import java.util.Scanner;

public class Rotas {

    static ArrayList<Cidade> list = new ArrayList();
    static Scanner ler = new Scanner(System.in);
    static ArrayList<Cidade> rotas = new ArrayList();
    static Viagem viagem = new Viagem();

    static String origem, destino;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IncluiCidades();
        System.out.print("Digite a cidade origem -> ");
        origem = ler.nextLine();

        System.out.println("");

        System.out.print("Digite a cidade destino-> ");
        destino = ler.nextLine();
        System.out.println("");
        
        PesquisaCidade(origem);
    }

    public static void PesquisaCidade(String inicio) {
        for (Cidade cidade : list) {
            if(viagem.getViagem().isEmpty()) {
                if(cidade.getNome().equalsIgnoreCase(origem)){
                    //Comeca a viagem
                    viagem.getViagem().clear();
                    viagem.getViagem().add(cidade);
                }
            }
            //Se a viagem já começou quer dizer que já tem uma origem
            if(!viagem.getViagem().isEmpty()){
                if(cidade.getFronteira().equalsIgnoreCase(destino)){
                    viagem.setChegou(true);
                    viagem.setTotalKm();
                    System.out.println(viagem.toString());
                    viagem.getViagem().clear();
                } else {
                    if (!viagem.getViagem().contains(cidade))
                        viagem.getViagem().add(cidade);
                    PesquisaCidade(cidade.getFronteira());
                }
            }
        }
    }
    
    //rotina verduplos(ver cidades duplicadas) nao esta completa verificar no arquivo viagem.java
    //Precisa Fazer a condiçao de parada no pesquisa.
    public static void IncluiCidades() {
        list.add(new Cidade("Araucaria", "Curitiba", 41));
        list.add(new Cidade("Balsa Nova", "Campo Largo", 21));
        list.add(new Cidade("Campo Largo", "Curitiba", 34));
        list.add(new Cidade("Campo Largo", "Sao Luis do Puruna", 25));
        list.add(new Cidade("Candoi", "Guarapuava", 63));
        list.add(new Cidade("Chopinzinho", "Foz do Jordao", 32));
        list.add(new Cidade("Clevelandia", "Palmas", 40));
        list.add(new Cidade("Contenda", "Araucaria", 14));
        list.add(new Cidade("Coronel Vivida", "Chopinzinho", 20));
        list.add(new Cidade("Foz do Jordao", "Candoi", 3));
        list.add(new Cidade("General Carneiro", "Uniao da Vitoria", 42));
        list.add(new Cidade("Guamiranga", "Ponta Grossa", 103));
        list.add(new Cidade("Guarapuava", "Prudentopolis", 70));
        list.add(new Cidade("Irati", "Palmeira", 58));
        list.add(new Cidade("Lapa", "Contenda", 73));
        list.add(new Cidade("Mariopolis", "Clevelandia", 22));
        list.add(new Cidade("Palmas", "General Carneiro", 99));
        list.add(new Cidade("Palmeira", "Balsa Nova", 65));
        list.add(new Cidade("Palmeira", "Sao Luis do Puruna", 30));
        list.add(new Cidade("Pato Branco", "Coronel Vivida", 31));
        list.add(new Cidade("Pato Branco", "Vitorino", 8));
        list.add(new Cidade("Pato Branco", "Mariopolis", 18));
        list.add(new Cidade("Ponta Grossa", "Sao Luis do Puruna", 45));
        list.add(new Cidade("Prudentopolis", "Irati", 40));
        list.add(new Cidade("Prudentopolis", "Guamiranga", 22));
        list.add(new Cidade("Sao Joao do Triunfo", "Palmeira", 37));
        list.add(new Cidade("Sao Mateus do Sul", "Lapa", 60));
        list.add(new Cidade("Sao Mateus do Sul", "Sao Joao do Triunfo", 37));
        list.add(new Cidade("Uniao da Vitoria", "Sao Mateus do Sul", 42));
    }
}

