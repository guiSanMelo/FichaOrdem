import java.util.Scanner;

public class Ocultista  extends Atributos{

    public int prestigioO;
    private int pontosVidaO;
    private int pontosDetO;
    public String patenteO;
    public int periciaO = 3 + this.getIntelecto();
    public int inventarioO = 5*setForca(getForca());

    public Ocultista(String nomePersonagem, String nomeJogador, int forca,
                     int agilidade, int presenca, int intelecto, int vigor) {
        super(nomePersonagem, nomeJogador, forca, agilidade, presenca, intelecto, vigor);

     this.pontosVidaO = 0;
     this.pontosDetO = 0;
     this.prestigioO = 0;
    }

    public int getPontosVidaO() {return pontosVidaO;}
    public void setPontosVidaO(int pontosVidaO) {this.pontosVidaO = pontosVidaO;}
    public int getPontosDetO() {return pontosDetO;}
    public void setPontosDetO(int pontosDetO) {this.pontosDetO = pontosDetO;}

    public void patenteOcul (){
        //Os pontos de prestígio definem a patente do personagem
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quanto prestígio tem o seu personagem?");
        int prestigioC = entrada.nextInt();
        //A patente defini a Vida e a Determinação do Personagem
        if(prestigioC < 20) {
            pontosVidaO = 12 + setVigor(this.getVigor());
            pontosDetO = 16 + setPresenca(this.getPresenca());
            patenteO = "Recruta";
           ;
        }
        if (prestigioC >= 20 && prestigioC < 50){
            pontosVidaO = 12 + setVigor(this.getVigor()) + (6 + setVigor(this.getVigor()));
            pontosDetO = 16 + (setPresenca(this.getPresenca())) + (8 + setPresenca(this.getPresenca()));
            patenteO = "Operador";

        }
        if (prestigioC >= 50 && prestigioC < 100){
            pontosVidaO = 12 + setVigor(this.getVigor()) + 2*(6 + setVigor(this.getVigor()));
            pontosDetO = 16 + setPresenca(this.getPresenca()) + 2*(8 + setPresenca(this.getPresenca()));
            patenteO = "Agente Especial";

        }
        if (prestigioC >= 100 && prestigioC < 200){
            pontosVidaO = 12 + setVigor(this.getVigor()) + 3*(6 + setVigor(this.getVigor()));
            pontosDetO = 16 + setPresenca(this.getPresenca()) + 3*(8 + setPresenca(this.getPresenca()));
            patenteO = "Oficial de Operações";
        }
        if (prestigioC == 200){
            pontosVidaO = 12 + setVigor(this.getVigor()) + 4*(6 + setVigor(this.getVigor()));
            pontosDetO = 16 + setPresenca(this.getPresenca()) + 4*(8 + setPresenca(this.getPresenca()));
            patenteO = "Agente de Elite";
        }
        if (prestigioC < 0) {
            patenteO = "Você foi demitido!";
        }
        else if(prestigioC > 200) {
            patenteO = "Você foi aposentado. Bom desccanso";
        }



    }

    public void sumarioOcul (){
        System.out.println("Sua patente é: " + patenteO);
        System.out.println("Sua vida é: " + pontosVidaO);
        System.out.println("Sua determinação é: " + pontosDetO);
        System.out.println("Você possui " + inventarioO + " espaços");
        System.out.println("Você pode ter " + periciaO + " perícias");
        System.out.println("Os seus atributos são:");
        System.out.println("Força: " + this.getForca());
        System.out.println("Agilidade: " + this.getAgilidade());
        System.out.println("Intelecto: " + this.getIntelecto());
        System.out.println("Presença: " + this.getPresenca());
        System.out.println("Vigor: " + this.getVigor());
    }


}
