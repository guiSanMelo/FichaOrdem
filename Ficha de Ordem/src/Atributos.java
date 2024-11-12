import java.util.Scanner;

public class Atributos {
    /*To tentando fazer uma ficha de RPG usando java.
    A ideia é aqui ser a base e as heranças serem as classes
    de personagem.*/
    public String nomePersonagem;
    public String nomeJogador;
    private int forca;
    private int agilidade;
    private int presenca;
    private int intelecto;
    private int vigor;
     //Tentativa de fazer um construtor
    public Atributos (String nomePersonagem,String nomeJogador, int forca,
                  int agilidade, int presenca, int intelecto, int vigor) {
             this.nomePersonagem = nomePersonagem;
             this.nomeJogador = nomeJogador;
             this.forca = forca;
             this.agilidade = agilidade;
             this.presenca = presenca;
             this.intelecto = intelecto;
             this.vigor = vigor;
    }
    /*Ainda não domino isso de set e get, Ent aceito
    uma dica de como poderia fazer aqui para ficar certo*/
    public int setForca(int forca) {this.forca = forca; return forca;}
    public int getForca(){return forca;}
    public int setAgilidade(int agilidade) {this.agilidade = agilidade; return agilidade;}
    public int getAgilidade(){return agilidade;}
    public int setIntelecto(int intelecto) {this.intelecto = intelecto; return intelecto;}
    public int getIntelecto(){return intelecto;}
    public int setPresenca(int presenca) {this.presenca = presenca;return presenca;}
    public int getPresenca(){return presenca;}
    public int setVigor(int vigor) {this.vigor = vigor; return vigor;}
    public int getVigor(){return vigor;}

     //Onde A pessoa define os atributos do Personagem
    public void selecaoAtributos () {
      Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o nome do seu Personagem?");
        String nomePersornagem = entrada.nextLine();
        System.out.println("Qual o nome do Jogador?");
        String nomeJogador = entrada.nextLine();
        System.out.println("Digite os Atributos:");
        System.out.println("Força:");
        setForca(entrada.nextInt());
        System.out.println("Agilidade:");
        setAgilidade(entrada.nextInt());
        System.out.println("Intelecto:");
        setIntelecto(entrada.nextInt());
        System.out.println("Presença:");
        setPresenca(entrada.nextInt());
        System.out.println("Vigor:");
        setVigor(entrada.nextInt());
    }
}
