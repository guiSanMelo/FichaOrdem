import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

      Combatente c1 = new Combatente("teste", "teste", 0, 0, 0,
      0, 0);
      Especialhista e1 = new Especialhista("teste", "teste", 0 , 0 , 0,
              0, 0);
         Ocultista o1 = new Ocultista("teste", "teste", 0, 0, 0 ,
                 0, 0);

      System.out.println("Escolha a sua classe:");
      System.out.println("1.Combatente:");
      System.out.println("2.Especialhista:");
      System.out.println("3.Ocultista:");
      Scanner scanner = new Scanner(System.in);
      int escolha = scanner.nextInt();
      switch (escolha) {
         case 1 -> c1.sumarioComb();
         case 2 -> e1.sumaEsp();
         case 3 -> o1.patenteOcul();
      }








   }
}