import java.util.Scanner;

public class Especialhista  extends Atributos {
    public int prestigioE;
    private int pontosVidaE;
    private int pontosDetE;
    public String patenteE;
    public int periciaE = 7 + getIntelecto();
    public int inventarioE = 5*getForca();

    public Especialhista(String nomePersonagem, String nomeJogador,
                         int forca, int agilidade, int presenca, int intelecto, int vigor) {
        super(nomePersonagem, nomeJogador, forca, agilidade, presenca, intelecto, vigor);
        this.pontosVidaE = 0;
        this.pontosDetE = 0;
        this.prestigioE = 0;


    }

    public int getPontosVidaE() {return pontosVidaE;}
    public void setPontosVidaE(int pontosVidaE) {this.pontosVidaE = pontosVidaE;}
    public int getPontosDetE() {return pontosDetE;}
    public void setPontosDetE(int pontosDetE) {this.pontosDetE = pontosDetE;}

    public void patenteOcul (){
        //Os pontos de prestígio definem a patente do personagem
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quanto prestígio tem o seu personagem?");
        int prestigioC = entrada.nextInt();
        //A patente defini a Vida e a Determinação do Personagem
        if(prestigioC < 20) {
            pontosVidaE = 16 + setVigor(this.getVigor());
            pontosDetE = 12 + setPresenca(this.getPresenca());
            patenteE = "Recruta";
        }
        if (prestigioC >= 20 && prestigioC < 50){
            pontosVidaE = 16 + setVigor(this.getVigor()) + (8 + setVigor(this.getVigor()));
            pontosDetE = 12 + (setPresenca(this.getPresenca())) + (6 + setPresenca(this.getPresenca()));
            patenteE = "Operador";
        }
        if (prestigioC >= 50 && prestigioC < 100){
            pontosVidaE = 16 + setVigor(this.getVigor()) + 2*(8 + setVigor(this.getVigor()));
            pontosDetE = 12 + setPresenca(this.getPresenca()) + 2*(6 + setPresenca(this.getPresenca()));
            patenteE = "Agente Especial";
        }
        if (prestigioC >= 100 && prestigioC < 200){
            pontosVidaE = 16 + setVigor(this.getVigor()) + 3*(8 + setVigor(this.getVigor()));
            pontosDetE = 12 + setPresenca(this.getPresenca()) + 3*(6 + setPresenca(this.getPresenca()));
            patenteE = "Oficial de Operações";
        }
        if (prestigioC == 200){
            pontosVidaE = 16 + setVigor(this.getVigor()) + 4*(8 + setVigor(this.getVigor()));
            pontosDetE = 12 + setPresenca(this.getPresenca()) + 4*(6 + setPresenca(this.getPresenca()));
            patenteE = "Agente de Elite";
        }
        if (prestigioC < 0) {
            System.out.println("Você foi demitido!");
        }
        else if(prestigioC > 200) {
            System.out.println("Você foi aposentado. Bom desccanso");
        }
        System.out.println("Você possui " + inventarioE + " espaços");


    }

    public void sumaEsp (){
        System.out.println("Sua patente é: " + patenteE);
        System.out.println("Sua vida é: " + pontosVidaE);
        System.out.println("Sua determinação é: " + pontosDetE);
        System.out.println("Você possui " + inventarioE + " espaços");
        System.out.println("Você pode ter " + periciaE + " perícias");
        System.out.println("Os seus atributos são:");
        System.out.println("Força: " + this.getForca());
        System.out.println("Agilidade: " + this.getAgilidade());
        System.out.println("Intelecto: " + this.getIntelecto());
        System.out.println("Presença: " + this.getPresenca());
        System.out.println("Vigor: " + this.getVigor());
    }


}
