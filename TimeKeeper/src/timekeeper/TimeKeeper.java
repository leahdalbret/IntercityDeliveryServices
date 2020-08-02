package timekeeper;
/**
 *
 * @author leahd_000
 */
public class TimeKeeper {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int monstartam,monendam,monstartpm,monendpm,montotal=0;
       int tuesstartam,tuesendam,tuesstartpm,tuesendpm,tuestotal=0;
       int wedsstartam,wedsendam,wedsstartpm,wedsendpm,wedstotal=0;
       int thursstartam,thursendam,thursstartpm,thursendpm,thurstotal=0;
       int fristartam,friendam,fristartpm,friendpm,fritotal=0;
       int satstartam,satendam,satstartpm,satendpm,sattotal=0;
       int sunstartam,sunendam,sunstartpm,sunendpm,suntotal=0;
       int sum=0;
       int montotalam=0,montotalpm=0;
       int tuestotalam=0,tuestotalpm=0;
       int wedstotalam=0,wedstotalpm=0;
       int thurstotalam=0,thurstotalpm=0;
       int fritotalam=0,fritotalpm=0;
       int sattotalam=0,sattotalpm=0;
       int suntotalam=0,suntotalpm=0;
       int avg=0;
       int weektotal =0;
       
  KeyboardReader kb = new KeyboardReader(); 
      
  System.out.println("Enter Monday Running Time:    ");
  System.out.print("AM Started: ");
  monstartam=kb.getInt();
  System.out.print("AM Finished: ");
  monendam=kb.getInt();
  System.out.print("PM Started: ");
  monstartpm=kb.getInt();
  System.out.print("PM Finished: ");
  monendpm=kb.getInt();
 
  montotalam= monendam-monstartam;
  montotalpm= monendpm-monstartpm;

  System.out.println("Enter Tuesday Running Time:     ");
  System.out.print("AM Started: ");
  tuesstartam=kb.getInt();
  System.out.print("AM Finished: ");
  tuesendam=kb.getInt();
  System.out.print("PM Started: ");
  tuesstartpm=kb.getInt();
  System.out.print("PM Finished: ");
  tuesendpm=kb.getInt();
  
  tuestotalam= tuesendam-tuesstartam;
  tuestotalpm= tuesendpm-tuesstartpm;
   
  System.out.println("Enter Wednesday Running Time:    ");
  System.out.print("AM Started: ");
  wedsstartam=kb.getInt();
  System.out.print("AM Finished: ");
  wedsendam=kb.getInt();
  System.out.print("PM Started: ");
  wedsstartpm=kb.getInt();
  System.out.print("PM Finished: ");
  wedsendpm=kb.getInt(); 
   
  wedstotalam= wedsendam-wedsstartam;
  wedstotalpm= wedsendpm-wedsstartpm;
  
  System.out.println("Enter Thursday Running Time:      ");
  System.out.print("AM Started: ");
  thursstartam=kb.getInt();
  System.out.print("AM Finished: ");
  thursendam=kb.getInt();
  System.out.print("PM Started: ");
  thursstartpm=kb.getInt();
  System.out.print("PM Finished: ");
  thursendpm=kb.getInt(); 
   
  thurstotalam= thursendam-thursstartam;
  thurstotalpm= thursendpm-thursstartpm;
  
  System.out.println("Enter Friday Running Time:         ");
  System.out.print("AM Started: ");
  fristartam=kb.getInt();
  System.out.print("AM Finished: ");
  friendam=kb.getInt();
  System.out.print("PM Started: ");
  fristartpm=kb.getInt();
  System.out.print("PM Finished: ");
  friendpm=kb.getInt(); 
   
  fritotalam= friendam-fristartam;
  fritotalpm= friendpm-fristartpm;
  
  System.out.println("Enter Saturday Running Time:        ");
  System.out.print("AM Started: ");
  satstartam=kb.getInt();
  System.out.print("AM Finished: ");
  satendam=kb.getInt();
  System.out.print("PM Started: ");
  satstartpm=kb.getInt();
  System.out.print("PM Finished: ");
  satendpm=kb.getInt(); 
   
  sattotalam= satendam-satstartam;
  sattotalpm= satendpm-satstartpm;
  
  System.out.println("Enter Sunday Running Time:           ");
  System.out.print("AM Started: ");
  sunstartam=kb.getInt();
  System.out.print("AM Finished: ");
  sunendam=kb.getInt();
  System.out.print("PM Started: ");
  sunstartpm=kb.getInt();
  System.out.print("PM Finished: ");
  sunendpm=kb.getInt(); 
   
  suntotalam= sunendam-sunstartam;
  suntotalpm= sunendpm-sunstartpm;
   
  weektotal = montotalam+montotalpm+tuestotalam
          +tuestotalpm+wedstotalam+wedstotalpm
          +thurstotalam+thurstotalpm+fritotalam+fritotalpm
          +sattotalam+sattotalpm+suntotalam+suntotalpm;
  sum= sum+weektotal*8400;
  avg=sum/7; 
  
  System.out.println("----------------------------");
  System.out.println("Day:      Monday            ");
  System.out.println("----------------------------");
  System.out.println("Start AM:  " + monstartam );
  System.out.println("End AM:    " + monendam   );
  System.out.println("Start PM:  " + monstartpm );
  System.out.println("End PM:    " + monendpm   );
  System.out.println("----------------------------");
  System.out.println("Day:      Tuesday           ");
  System.out.println("----------------------------");
  System.out.println("Start AM:  " + tuesstartam );
  System.out.println("End AM:    " + tuesendam   );
  System.out.println("Start PM:  " + tuesstartpm );
  System.out.println("End PM:    " + tuesendpm   );
  System.out.println("----------------------------");
  System.out.println("Day:      Wednesday        ");
  System.out.println("----------------------------");
  System.out.println("Start AM:  " + wedsstartam );
  System.out.println("End AM:    " + wedsendam   );
  System.out.println("Start PM:  " + wedsstartpm );
  System.out.println("End PM:    " + wedsendpm   );
  System.out.println("----------------------------");
  System.out.println("Day:      Thursday          ");
  System.out.println("----------------------------");
  System.out.println("Start AM:  " + thursstartam );
  System.out.println("End AM:    " + thursendam   );
  System.out.println("Start PM:  " + thursstartpm );
  System.out.println("End PM:    " + thursendpm   );
  System.out.println("----------------------------");
  System.out.println("Day:      Friday            ");
  System.out.println("----------------------------");
  System.out.println("Start AM:  " + fristartam );
  System.out.println("End AM:    " + friendam   );
  System.out.println("Start PM:  " + fristartpm );
  System.out.println("End PM:    " + friendpm   );
  System.out.println("----------------------------");
  System.out.println("Day:      Saturday          ");
  System.out.println("----------------------------");
  System.out.println("Start AM:  " + satstartam );
  System.out.println("End AM:    " + satendam   );
  System.out.println("Start PM:  " + satstartpm );
  System.out.println("End PM:    " + satendpm   );
  System.out.println("----------------------------");
  System.out.println("Day:      Sunday            ");
  System.out.println("----------------------------");
  System.out.println("Start AM:  " + sunstartam );
  System.out.println("End AM:    " + sunendam   );
  System.out.println("Start PM:  " + sunstartpm );
  System.out.println("End PM:    " + sunendpm   );
  System.out.println("----------------------------");
  
  System.out.println("The total running time is  "+sum+ "   minutes");
  System.out.println("The average running time is  "+avg+"   minutes");
    }
    }
  