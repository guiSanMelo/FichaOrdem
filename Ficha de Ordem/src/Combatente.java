import java.util.Scanner;
public class Combatente extends Atributos {

    public int prestigioC;
    private int pontosDetC;
    private int pontosVidaC;
    public String patenteC;
    public int periciaC = 2 + setIntelecto(this.getIntelecto());
    public int inventarioC = 5*setForca(this.getForca());
    public Combatente (String nomePersonagem, String nomeJogador,
                         int forca, int agilidade, int presenca, int intelecto, int vigor) {
        super(nomePersonagem, nomeJogador, forca, agilidade, presenca, intelecto, vigor);
         this.prestigioC = 0;
         this.pontosVidaC = 0;
         this.pontosDetC = 0;
    }

    public int setPontosDetC() {this.pontosDetC = pontosDetC; return pontosDetC;}
    public int getPontosDetC (){return pontosDetC;}
    public int setPontosVidaC() {this.pontosVidaC = pontosVidaC; return pontosVidaC;}
    public int getPontosVidaC(){return pontosVidaC;}

    //Talvez ficasse melhor com switch cases, mas eu não fazer isso ainda.

    public void patenteComb (){
        //Os pontos de prestígio definem a patente do personagem
        Scanner entrada = new Scanner(System.in);
     System.out.println("Quanto prestígio tem o seu personagem?");
     int prestigioC = entrada.nextInt();
       //A patente defini a Vida e a Determinação do ersonagem
     if(prestigioC < 20) {
         pontosVidaC = 20 + setVigor(this.getVigor());
         pontosDetC = 8 + setPresenca(this.getPresenca());
         patenteC = "Recruta";
     }
     if (prestigioC >= 20 && prestigioC < 50){
         pontosVidaC = (20 + setVigor(this.getVigor())) + (10 + setVigor(this.getVigor()));
         pontosDetC = 8 + (setPresenca(this.getPresenca())) + (4 + setPresenca(this.getPresenca()));
         patenteC = "Operador";
     }
     if (prestigioC >= 50 && prestigioC < 100){
            pontosVidaC = 20 + setVigor(this.getVigor()) + 2*(10 + setVigor(this.getVigor()));
            pontosDetC = 8 + setPresenca(this.getPresenca()) + 2*(4 + setPresenca(this.getPresenca()));
            patenteC = "Agente Especial";
        }
     if (prestigioC >= 100 && prestigioC < 200){
            pontosVidaC = 20 + setVigor(this.getVigor()) + 3*(10 + setVigor(this.getVigor()));
            pontosDetC = 8 + setPresenca(this.getPresenca()) + 3*(4 + setPresenca(this.getPresenca()));
            patenteC = "Oficial de Operações";
        }
     if (prestigioC == 200){
            pontosVidaC = 20 + setVigor(this.getVigor()) + 4*(10 + setVigor(this.getVigor()));
            pontosDetC = 8 + setPresenca(this.getPresenca()) + 4*(4 + setPresenca(this.getPresenca()));
            patenteC = "Agente de Elite";
        }
      if (prestigioC < 0) {
          patenteC = "Você foi demitido!";
      }
         else if(prestigioC > 200) {
             patenteC = "Você foi aposentado. Bom desccanso";
      }
    }

    public void sumarioComb () {
        System.out.println("Sua patente é: " + patenteC);
        System.out.println("Sua vida é: " + setPontosVidaC());
        System.out.println("Sua determinação é: " + setPontosDetC());
        System.out.println("Você possui " + inventarioC + " espaços");
        System.out.println("Você pode ter " + periciaC + " perícias");
        System.out.println("Os seus atributos são:");
        System.out.println("Força: " + this.getForca());
        System.out.println("Agilidade: " + this.getAgilidade());
        System.out.println("Intelecto: " + this.getIntelecto());
        System.out.println("Presença: " + this.getPresenca());
        System.out.println("Vigor: " + this.getVigor());
    }

}
