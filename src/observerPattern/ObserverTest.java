package observerPattern;
public class ObserverTest {

       public static void main(String args[]) {
    	   	//observers
    	      Newspaper printMedia = new Newspaper();
              Internet onlineMedia = new Internet();

              Loan personalLoan = new Loan("Personal Loan", 12.5f,
                           "Standard Charterd");
              personalLoan.registerObserver(printMedia);
              personalLoan.registerObserver(onlineMedia);
              
              //send notifications to Observers
              personalLoan.setInterest(9.5f);

       }
}


