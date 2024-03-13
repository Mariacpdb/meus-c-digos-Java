


import java.util.Scanner;
public class Main {
  
  public static void main(String[] args) {

    String nome;
    Scanner teclado = new Scanner(System.in);
    nome = teclado.nextLine();
    System.out.println();
    System.out.println("Hello, " + nome);
    teclado.close();
    
  }

  
}