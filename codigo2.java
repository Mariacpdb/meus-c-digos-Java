
import java.util.Scanner;

public class codigo2 {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numb1 = scanner.nextInt();
    int numb2 = scanner.nextInt();
    int numb3 = scanner.nextInt();
    
    int maiornumb;
    if (numb1 > numb2 && numb1 > numb3) {
      maiornumb = numb1;
    }  if (numb2 > numb1 && numb2 > numb3){
      maiornumb = numb2;
    } else {
      maiornumb = numb3;
    }
    
    System.out.println("\n" + numb1);
    System.out.println("\n" + numb2);
    System.out.println("\n" + numb3); 
    System.out.println("====================");
    System.out.println("\n O maior numero e: " + 
    maiornumb);
      
    scanner.close();
    
    
    
  }

  
}