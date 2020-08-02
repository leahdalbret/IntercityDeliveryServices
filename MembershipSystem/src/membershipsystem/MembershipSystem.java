package membershipsystem;
/**
 *
 * @author leahd_000
 */
public class MembershipSystem {
    /**
     * @param args the command line arguments
     */
 public static void main( String[] args )
 {       
        int grade;
        int rate = 0 ;
        int sum = 0;
        int people ;
 
        KeyboardReader kb = new KeyboardReader(); 
        
        System.out.println("Enter your membership grade:  (Enter -8 to quit)");
        System.out.println("1 - Standard Member" ); 
        System.out.println("2 - Consession Member");
        System.out.println("3 - Elite Member " );
      
       grade = kb.getInt();
       
       switch(grade) {
        case 1:
            rate = (75 + 12) ;
            System.out.println("Standard Member:" +   rate);
            break;
        case 2:
            rate = (35 + 14) ;
            System.out.println("Consession Member:  " +    rate);
            break;
        case 3:
            rate = 10 ;
            System.out.println("Elite Member:  " +    rate);
            break;
    }  
  while (grade != -8){ 
      
      sum=sum+rate;
      
        System.out.println("Enter your membership grade:  (Enter -8 to quit)");
        System.out.println("1 - Standard Member" ); 
        System.out.println("2 - Consession Member");
        System.out.println("3 - Elite Member " );
      
       grade = kb.getInt();
       
       switch(grade) {
        case 1:
            rate = (75 + 12) ;
            System.out.println("Standard Member:" +   rate);
            break;
        case 2:
            rate = (35 + 14) ;
            System.out.println("Consession Member:  " +    rate);
            break;
        case 3:
            rate = 10 ;
            System.out.println("Elite Member:  " +    rate);
            break;
       }  
    } 
    System.out.println ("Total Amount to pay:  " +  sum);
    } 
 }

 

      
