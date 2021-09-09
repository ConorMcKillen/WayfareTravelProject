
/**
 * Created by Conor McKillen, Shay McStravick, Mairead McKeague, John Hopkins on 24/11/2020
 * Main class that runs all the code made in the Passport and WayfareTravel classes
 **/
public class TravelAgency extends WayfareTravel
{
   public static void main(String[] args)
   {
      WayfareTravel travelPage = new WayfareTravel();

      travelPage.welcomePage();
      travelPage.informationPage();

      passportInformation();

      travelPage.budgetInformation();
      travelPage.returnBudgetInfo();
   }
} //class
