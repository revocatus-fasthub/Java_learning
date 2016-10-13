package switcher;

public class Switcher {

    public static void main(String[] args) {
       int x = 9;
       
       switch (x)
            {
         case 1: case 5: case 7: case 9:
            System.out.println("RED");
            break;
         case 2:
            System.out.println("BLUE");
            break;
         case 3:
            System.out.println("GREEN");
            break;
          default:
            System.out.println("NONE");
       }
       
    }
    
}
