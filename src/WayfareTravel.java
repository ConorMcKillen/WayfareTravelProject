import java.text.DecimalFormat;
import java.util.Scanner;

public class WayfareTravel extends Passport
{
   //Initialise the scanner and the decimal format we are going to use
   static Scanner scan = new Scanner(System.in);
   static DecimalFormat df = new DecimalFormat("###,###,000.00");

   //final variables for use in methods below
   final int ONE = 1;
   final int TWO = 2;
   final int THREE = 3;
   final int FOUR = 4;

   //final variables to store the set prices of our holiday packages
   final double ONE_HUNDRED = 100.00;
   final double TWO_HUNDRED = 200.00;
   final double TWO_FIFTY = 250.00;
   final double ONE_THOUSAND = 1000.00;
   final double ONE_THOUSAND_TWO_FIFTY = 1250.00;
   final double TWO_THOUSAND = 2000.00;
   final double TWO_THOUSAND_FIVE_HUNDRED = 2500.00;
   final double THREE_THOUSAND = 3000.00;
   final double THREE_THOUSAND_FIVE_HUNDRED = 3500.00;
   final double ONE_HUNDRED_THOUSAND = 100000.00;

   double budget;
   double total = 0.00;
   int selectedOption;

   //Simple graphic to act as a welcome header to the travel agency app

   //SHAY'S CODE STARTING POINT
   protected void welcomePage()
   {
      System.out.println("=================================================");
      System.out.println("*************************************************");
      System.out.println("=================================================");

      System.out.println("               W E L C O M E");
      System.out.println("                    T O");
      System.out.println("               W A Y F A R E");
      System.out.println("                T R A V E L");

      System.out.println("=================================================");
      System.out.println("*************************************************");
      System.out.println("=================================================\n");
   }

   //Simple information panel outputting what the program does
   protected void informationPage()
   {
      System.out.println("=================================================");
      System.out.println("************* I N F O R M A T I O N ************");
      System.out.println("=================================================\n");

      System.out.println("Wayfare Travel offer holiday experience for all budgets.");
      System.out.println("\nAll you have to do is enter your budget and how many (MAX 4) we will cater for.\n");
      System.out.println("Our application will list all of the options in your price range or just slightly above.");
   }

   //Prompt the user to enter their budget
   protected void budgetPrompt()
   {
      System.out.println("\nWhat is your budget per person £: ");
   }

   //set the budget
   protected void setBudget(double budget)
   {
      this.budget = budget;
   }
   //get the budget
   protected double getBudget()
   {
      return budget;
   }

   protected void outputBudget()
   {
      System.out.println("\nYour budget is: £" + df.format(budget));
   }

   protected void budgetInformation()
   {
      budgetPrompt();
      budget = scan.nextDouble();
      setBudget(budget);
   }

   protected void optionSelection()
   {
      System.out.println("\nEnter the number of the option you would like to select: ");
      selectedOption = scan.nextInt();
      scan.nextLine();
   }

   protected void invalidBudget()
   {
      System.out.println("\nSorry, you need to enter a budget of at least: £" + df.format(TWO_FIFTY));
   }
   //SHAY'S CODE ENDING POINT


   //Methods that contain the information of the options
   //JOHN'S CODE STARTING POINT
   protected void lowerBudgetOptions()
   {
      System.out.println("\n\n*******| OPTION 1 |*******\n");
      System.out.println("Weekend in Slieve Russell Hotel, Cavan");
      System.out.println("Price per person: £" + df.format(TWO_FIFTY));

      System.out.println("\n\n*******| OPTION 2 |*******\n");
      System.out.println("Weekend seafront chalet in Co. Cork");
      System.out.println("Price per person: £" + df.format(ONE_HUNDRED));

      System.out.println("\n\n*******| OPTION 3 |*******\n");
      System.out.println("Weekend apartment in Galway city centre");
      System.out.println("Price per person: £" + df.format(TWO_HUNDRED));
   }

   protected void selectionSlieveRussell()
   {
      total = TWO_FIFTY * getNumberOfPassports();

      System.out.println("\nSelection: Slieve Russell Hotel, Cavan");
      System.out.println("Price per person: £" + df.format(TWO_FIFTY));
      System.out.println("Number of people: " + getNumberOfPassports());
      System.out.println("Total cost: £" + df.format(total));
   }

   protected void selectionCorkChalet()
   {
      total = ONE_HUNDRED * getNumberOfPassports();

      System.out.println("\nSelection: Chalet in Co. Cork");
      System.out.println("Price per person: £" + df.format(ONE_HUNDRED));
      System.out.println("Number of people: " + getNumberOfPassports());
      System.out.println("Total cost: £" + df.format(total));
   }

   protected void selectionGalwayApartment()
   {
      total = TWO_HUNDRED * getNumberOfPassports();

      System.out.println("\nSelection: Apartment in Galway city centre");
      System.out.println("Price per person: £" + df.format(TWO_HUNDRED));
      System.out.println("Number of people: " + getNumberOfPassports());
      System.out.println("Total cost: £" + df.format(total));
   }

   protected void middleBudgetOptions()
   {
      System.out.println("\n\n*******| OPTION 1 |*******\n");
      System.out.println("4 days in the Hotel Byzantium, Ravenna, Italy");
      System.out.println("Price per person: £" + df.format(ONE_THOUSAND));

      System.out.println("\n\n*******| OPTION 2 |*******\n");
      System.out.println("4 days in Hotel Andalusia, Malaga, Spain");
      System.out.println("Price per person: £" + df.format(ONE_THOUSAND));

      System.out.println("\n\n***| OPTION 3 |***");
      System.out.println("5 days in Diocletian's Palace, Split, Croatia");
      System.out.println("Price per person: £" + df.format(ONE_THOUSAND_TWO_FIFTY));
   }

   protected void selectionHotelByzantium()
   {
      total = ONE_THOUSAND * getNumberOfPassports();

      System.out.println("\nSelection: Hotel Byzantium, Ravenna, Italy");
      System.out.println("Price per person: £" + df.format(ONE_THOUSAND));
      System.out.println("Number of people: " + getNumberOfPassports());
      System.out.println("Total cost: £" + df.format(total));
   }

   protected void selectionHotelAndalusia()
   {
      total = ONE_THOUSAND * getNumberOfPassports();

      System.out.println("\nSelection: Hotel Andalusia, Malaga, Spain");
      System.out.println("Price per person: £" + df.format(ONE_THOUSAND));
      System.out.println("Number of people: " + getNumberOfPassports());
      System.out.println("Total cost: £" + df.format(total));
   }

   protected void selectionDiocletiansPalace()
   {
      total = ONE_THOUSAND_TWO_FIFTY * getNumberOfPassports();

      System.out.println("\nSelection: Diocletian's Palace, Split, Croatia");
      System.out.println("Price per person: " + df.format(ONE_THOUSAND_TWO_FIFTY));
      System.out.println("Number of people: " + getNumberOfPassports());
      System.out.println("Total cost: £" + df.format(total));
   }

   protected void highBudgetOptions()
   {
      System.out.println("\n\n*******| OPTION 1 |*******\n");
      System.out.println("Two weeks in Ocean View Hotel, Vice City, United States");
      System.out.println("Price per person: £" + df.format(TWO_THOUSAND));

      System.out.println("\n\n*******| OPTION 2 |*******\n");
      System.out.println("Three week guided tour of Argentina and Uruguay");
      System.out.println("Price per person: £" + df.format(TWO_THOUSAND));

      System.out.println("\n\n*******| OPTION 3 |*******\n");
      System.out.println("Two week ski resort in British Columbia, Canada");
      System.out.println("Price per person: £" + df.format(TWO_THOUSAND_FIVE_HUNDRED));
   }

   protected void selectionOceanView()
   {
      total = TWO_THOUSAND * getNumberOfPassports();

      System.out.println("\nSelection: Ocean View Hotel, Vice City, United States");
      System.out.println("Price per person: £" + df.format(TWO_THOUSAND));
      System.out.println("Number of people: " + getNumberOfPassports());
      System.out.println("Total cost: £" + df.format(total));
   }

   protected void selectionArgentinaUruguay()
   {
      total = TWO_THOUSAND * getNumberOfPassports();

      System.out.println("\nSelection: Guided tour of Argentina and Uruguay");
      System.out.println("Price per person: £" + df.format(TWO_THOUSAND));
      System.out.println("Number of people: " + getNumberOfPassports());
      System.out.println("Total cost: £" + df.format(total));
   }

   protected void selectionSkiResort()
   {
      total = TWO_THOUSAND_FIVE_HUNDRED * getNumberOfPassports();

      System.out.println("\nSelection: Ski resort in British Columbia, Canada");
      System.out.println("Price per person: £" + df.format(TWO_THOUSAND_FIVE_HUNDRED));
      System.out.println("Number of people: " + getNumberOfPassports());
      System.out.println("Total cost: £" + df.format(total));
   }

   protected void superHighBudgetOptions()
   {
      System.out.println("\n\n*******| OPTION 1 |*******\n");
      System.out.println("Two weeks safari in Madagascar");
      System.out.println("Price per person: £" + df.format(THREE_THOUSAND));

      System.out.println("\n\n*******| OPTION 2 |*******\n");
      System.out.println("Four week train journey through Namibia, Botswana and South Africa");
      System.out.println("Price per person: £" + df.format(THREE_THOUSAND));

      System.out.println("\n\n*******| OPTION 3 |*******\n");
      System.out.println("Week trip in Antarctica");
      System.out.println("Price per person: £" + df.format(THREE_THOUSAND_FIVE_HUNDRED));
   }

   protected void selectionSafariMadagascar()
   {
      total = THREE_THOUSAND * getNumberOfPassports();

      System.out.println("\nSelection: Safari in Madagascar");
      System.out.println("Price per person: £" + df.format(THREE_THOUSAND));
      System.out.println("Number of people: " + getNumberOfPassports());
      System.out.println("Total cost: £" + df.format(total));
   }

   protected void selectionSouthernAfrica()
   {
      total = THREE_THOUSAND * getNumberOfPassports();

      System.out.println("\nSelection: Train journey in Namibia, Botswana and South Africa");
      System.out.println("Price per person: £" + df.format(THREE_THOUSAND));
      System.out.println("Number of people: " + getNumberOfPassports());
      System.out.println("Total cost: £" + df.format(total));
   }

   protected void selectionAntarctica()
   {
      total = THREE_THOUSAND_FIVE_HUNDRED * getNumberOfPassports();

      System.out.println("\nSelection: Trip in Antarctica");
      System.out.println("Price per person: £" + df.format(THREE_THOUSAND_FIVE_HUNDRED));
      System.out.println("Number of people: " + getNumberOfPassports());
      System.out.println("Total cost: £" + df.format(total));
   }

   protected void insaneBudgetOptions()
   {
      System.out.println("\n\n*******| OPTION 1 |*******\n");
      System.out.println("Two weeks in Moon space station");
      System.out.println("Price per person: £" + df.format(ONE_HUNDRED_THOUSAND));

      System.out.println("\n\n*******| OPTION 2 |*******\n");
      System.out.println("Month in MEGA CITY ONE, Mars");
      System.out.println("Price per person: £" + df.format(ONE_HUNDRED_THOUSAND));
   }

   protected void selectionMoon()
   {
      total = ONE_HUNDRED_THOUSAND * getNumberOfPassports();

      System.out.println("\nSelection: Moon space station");
      System.out.println("Price per person: £" + df.format(ONE_HUNDRED_THOUSAND));
      System.out.println("Number of people: " + getNumberOfPassports());
      System.out.println("Total cost: £" + df.format(total));
   }

   protected void selectionMars()
   {
      total = ONE_HUNDRED_THOUSAND * getNumberOfPassports();

      System.out.println("\nSelection: MEGA CITY ONE, Mars");
      System.out.println("Price per person: £" + df.format(ONE_HUNDRED_THOUSAND));
      System.out.println("Number of people: " + getNumberOfPassports());
      System.out.println("Total cost: £" + df.format(total));
   }
   //JOHN'S CODE ENDING POINT

   //This method uses the previously defined methods to get the budget entered
   //and the number of passports entered. It will then run the methods
   //that will return the details of the selection with the total cost

   //MARIEAD'S CODE STARTING POINT
   protected void returnBudgetInfo()
   {
      outputBudget();

      if (getBudget() < TWO_FIFTY)
      {
         if (Passport.getNumberOfPassports() == ONE)
         {
            invalidBudget();
         }
         if (Passport.getNumberOfPassports() == TWO)
         {
            invalidBudget();
         }
         if (Passport.getNumberOfPassports() == THREE)
         {
            invalidBudget();
         }
         if (Passport.getNumberOfPassports() == FOUR)
         {
            invalidBudget();
         }
      }

////////////////////////////////////// LOW BUDGET /////////////////////////////////////////////

      if ((getBudget() >= TWO_FIFTY) && (getBudget() < ONE_THOUSAND))
      {
         if (Passport.getNumberOfPassports() == ONE)
         {
            lowerBudgetOptions();

            optionSelection();

            if (selectedOption == ONE)
            {
               selectionSlieveRussell();
            }
            if (selectedOption == TWO)
            {
               selectionCorkChalet();
            }
            if (selectedOption == THREE)
            {
               selectionGalwayApartment();
            }
         }

         if (Passport.getNumberOfPassports() == TWO)
         {
            lowerBudgetOptions();

            optionSelection();

            if (selectedOption == ONE)
            {
               selectionSlieveRussell();
            }
            if (selectedOption == TWO)
            {
               total = ONE_HUNDRED * getNumberOfPassports();

               selectionCorkChalet();
            }
            if (selectedOption == THREE)
            {
               selectionGalwayApartment();
            }
         }

         if (Passport.getNumberOfPassports() == THREE)
         {
            lowerBudgetOptions();

            optionSelection();

            if (selectedOption == ONE)
            {
               selectionSlieveRussell();
            }
            if (selectedOption == TWO)
            {

               selectionCorkChalet();
            }
            if (selectedOption == THREE)
            {
               selectionGalwayApartment();
            }
         }
            if (Passport.getNumberOfPassports() == FOUR)
            {
               lowerBudgetOptions();

               optionSelection();

               if (selectedOption == ONE)
               {
                  selectionSlieveRussell();
               }
               if (selectedOption == TWO)
               {
                  selectionCorkChalet();
               }
               if (selectedOption == THREE)
               {
                  selectionGalwayApartment();
               }
            }

      }
/////////////////////////// MIDDLE BUDGET ///////////////////////////////////////////////////

            if ((getBudget() >= ONE_THOUSAND) && (getBudget() < TWO_THOUSAND))
            {
               if (Passport.getNumberOfPassports() == ONE)
               {
                  middleBudgetOptions();

                  optionSelection();

                  if (selectedOption == ONE)
                  {
                     selectionHotelByzantium();
                  }
                  if (selectedOption == TWO)
                  {
                     selectionHotelAndalusia();
                  }
                  if (selectedOption == THREE)
                  {
                     selectionDiocletiansPalace();
                  }
               }

               if (Passport.getNumberOfPassports() == TWO)
               {
                  middleBudgetOptions();

                  optionSelection();

                  if(selectedOption == ONE)
                  {
                     selectionHotelByzantium();
                  }
                  if(selectedOption == TWO)
                  {
                     selectionHotelAndalusia();
                  }
                  if(selectedOption == THREE)
                  {
                     selectionDiocletiansPalace();
                  }
               }

               if(Passport.getNumberOfPassports() == THREE)
               {
                  middleBudgetOptions();

                  optionSelection();

                  if(selectedOption == ONE)
                  {
                     selectionHotelByzantium();
                  }
                  if(selectedOption == TWO)
                  {
                     selectionHotelAndalusia();
                  }
                  if(selectedOption == THREE)
                  {
                     selectionDiocletiansPalace();
                  }
               }

               if(Passport.getNumberOfPassports() == FOUR)
               {
                  middleBudgetOptions();

                  optionSelection();

                  if(selectedOption == ONE)
                  {
                     selectionHotelByzantium();
                  }
                  if(selectedOption == TWO)
                  {
                     selectionHotelAndalusia();
                  }
                  if(selectedOption == THREE)
                  {
                     selectionDiocletiansPalace();
                  }
               }
            }

 /////////////////////////// HIGH BUDGET //////////////////////////////

         if((getBudget() >= TWO_THOUSAND) && (getBudget() < THREE_THOUSAND))
         {
            if(Passport.getNumberOfPassports() == ONE)
            {
               highBudgetOptions();

               optionSelection();

               if(selectedOption == ONE)
               {
                  selectionOceanView();
               }
               if(selectedOption == TWO)
               {
                  selectionArgentinaUruguay();
               }
               if(selectedOption == THREE)
               {
                  selectionSkiResort();
               }
            }
            if(Passport.getNumberOfPassports() == TWO)
            {
               highBudgetOptions();

               optionSelection();

               if(selectedOption == ONE)
               {
                  selectionOceanView();
               }
               if(selectedOption == TWO)
               {
                  selectionArgentinaUruguay();
               }
               if(selectedOption == THREE)
               {
                  selectionSkiResort();
               }
            }
            if(Passport.getNumberOfPassports() == THREE)
            {
               highBudgetOptions();

               optionSelection();

               if(selectedOption == ONE)
               {
                  selectionOceanView();
               }
               if(selectedOption == TWO)
               {
                  selectionArgentinaUruguay();
               }
               if(selectedOption == THREE)
               {
                  selectionSkiResort();
               }
            }
            if(Passport.getNumberOfPassports() == FOUR)
            {
               highBudgetOptions();

               optionSelection();

               if(selectedOption == ONE)
               {
                  selectionOceanView();
               }
               if(selectedOption == TWO)
               {
                  selectionArgentinaUruguay();
               }
               if(selectedOption == THREE)
               {
                  selectionSkiResort();
               }
            }
         }
///////////////////////// SUPER HIGH BUDGET ////////////////////////////////////////////

         if((getBudget() >= THREE_THOUSAND) && (getBudget() < ONE_HUNDRED_THOUSAND))
         {
            if(Passport.getNumberOfPassports() == ONE)
            {
               superHighBudgetOptions();

               optionSelection();

               if(selectedOption == ONE)
               {
                  selectionSafariMadagascar();
               }
               if(selectedOption == TWO)
               {
                  selectionSouthernAfrica();
               }
               if(selectedOption == THREE)
               {
                  selectionAntarctica();
               }
            }

            if(Passport.getNumberOfPassports() == TWO)
            {
               superHighBudgetOptions();

               optionSelection();

               if(selectedOption == ONE)
               {
                  selectionSafariMadagascar();
               }
               if(selectedOption == TWO)
               {
                  selectionSouthernAfrica();
               }
               if(selectedOption == THREE)
               {
                  selectionAntarctica();
               }
            }

            if(Passport.getNumberOfPassports() == THREE)
            {
               superHighBudgetOptions();

               optionSelection();

               if(selectedOption == ONE)
               {
                  selectionSafariMadagascar();
               }
               if(selectedOption == TWO)
               {
                  selectionSouthernAfrica();
               }
               if(selectedOption == THREE)
               {
                  selectionAntarctica();
               }
            }

            if(Passport.getNumberOfPassports() == FOUR)
            {
               superHighBudgetOptions();

               optionSelection();

               if(selectedOption == ONE)
               {
                  selectionSafariMadagascar();
               }
               if(selectedOption == TWO)
               {
                  selectionSouthernAfrica();
               }
               if(selectedOption == THREE)
               {
                  selectionAntarctica();
               }
            }
         }
////////////////////// INSANE BUDGET ///////////////////////////////////////
         if(getBudget() >= ONE_HUNDRED_THOUSAND)
         {
            if(Passport.getNumberOfPassports() == ONE)
            {
               insaneBudgetOptions();

               optionSelection();

               if(selectedOption == ONE)
               {
                  selectionMoon();
               }
               if(selectedOption == TWO)
               {
                  selectionMars();
               }
            }

            if(Passport.getNumberOfPassports() == TWO)
            {
               insaneBudgetOptions();

               optionSelection();

               if(selectedOption == ONE)
               {
                  selectionMoon();
               }
               if(selectedOption == TWO)
               {
                  selectionMars();
               }
            }

            if(Passport.getNumberOfPassports() == THREE)
            {
               insaneBudgetOptions();

               optionSelection();

               if(selectedOption == ONE)
               {
                  selectionMoon();
               }
               if(selectedOption == TWO)
               {
                  selectionMars();
               }
            }

            if(Passport.getNumberOfPassports() == FOUR)
            {
               insaneBudgetOptions();

               optionSelection();

               if(selectedOption == ONE)
               {
                  selectionMoon();
               }
               if(selectedOption == TWO)
               {
                  selectionMars();
               }
            }
         }
      }
      //MARIEAD'S CODE ENDING POINT
}//class
