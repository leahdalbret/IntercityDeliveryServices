package intercitydeliveryservices;

/**
 *
 * @author leahd_000
 */
public class IntercityDeliveryServices {

    /**
     * @param args the command line arguments
     */
    
    
    
    
    public static void main(String[] args) 
        {        
        KeyboardReader kb = new KeyboardReader();    
        String ds;
        String packing;
        Boolean yes = true;
       
       
        System.out.println("Enter the type of Delivery service needed  (Fast/Super/Express)?");
        ds = kb.getWord();
        
        System.out.println(ds  + "  has been chosen by user");
        
        System.out.println("Enter packing is needed (yes/no):" );
        packing = kb.getWord();
        if (yes)
        System.out.println("The final cost of the Delivery Service is:   " );
        else
        System.out.println("The final cost of the Delivery Service is:   " );
     
     }
 
   
    static service (String Fast, String Super, String Express)
   {
Fast = "50.00";
double n1 = Double.parseDouble(Fast);
Super = "60.00";
double n2 = Double.parseDouble(Super);
Express = "45.00";
double n3 = Double.parseDouble(Express);

          
           }

    }

    
    
   
    



