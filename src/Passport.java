import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Conor McKillen on 24/11/2020
 * Prompts the user to enter their passport details
 * Stores all of the information needed to execute and store
 * everything relating to the users passport/passports
 **/
public class Passport
{
   static Scanner scan = new Scanner(System.in);

   static final int INCREMENTOR = 1;

   // This will count the number of passport objects passed
   static int numberOfPassportObjects;

   //These static variables are used to refer to which passport object we are going
   //to be referring to or the selection made in some of the methods below

   static final int ONE = 1;
   static final int TWO = 2;
   static final int THREE = 3;
   static final int FOUR = 4;

   //Store variables
   String nationality;
   String firstName;
   String lastName;

   protected Passport()
   {
      //This increments the static variable numberOfPassports
      //We will use this variable when we need to find out how many passport objects
      //have been created.
      numberOfPassportObjects += INCREMENTOR;
   }
   //Override the toString method to give an overview of passport objects
   //This acts as an extra verification that we have the users full name
   //and nationality
   public String toString()
   {
      return "\nNAME: " + getFullName() + "\nNATIONALITY: " + getNationality() + "\n";
   }

   //setter and getter for the Passport
   protected void setPassport(String nationality)
   {
      this.nationality = nationality;
   }

   protected String getNationality()
   {
      return nationality;
   }

   //Prompts the user to enter their passport nationality
   protected String promptForPassport()
   {
      return "\nWhat passport do you hold?";
   }

   //Set the user's first name
   protected void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }

   //Get the user's first name (this method isn't used, but is here if you need it)
   protected String getFirstName()
   {
      return firstName;
   }

   //set the user's last name
   protected void setLastName(String lastName)
   {
      this.lastName = lastName;
   }

   //Get teh user's last name (this method isn't used, but is here if you need it)
   protected String getLastName()
   {
      return lastName;
   }

   //Concatenates the first name and last name and returns it as a String
   protected String getFullName()
   {
      return firstName + " " + lastName;
   }

   //This method welcomes the user and outputs their nationality
   //It takes in the passports that we are working with
   //Makes use of the equalsIgnoreCase so it will receive the details
   //of the passport regardless of case sensitivity
   //The or operator || is used so that the user can enter the
   //country that issues their passport or their national identifier
   //i.e "Albania" or "Albanian"
   //This will then return a String that will welcome the user
   //this implements the getFullName() method and will follow
   //with the user's specified passport

   protected String welcomeUser()
   {
     if((nationality.equalsIgnoreCase("Albanian")) || (nationality.equalsIgnoreCase("Albania")))
     {
        return "Welcome, " + getFullName() + " from Albania.";
     }

     else if((nationality.equalsIgnoreCase("Algeria")) || (nationality.equalsIgnoreCase("Alergian")))
          {
             return "Welcome, " + getFullName() + " from Algeria.";
          }

     else if((nationality.equalsIgnoreCase("Angola")) || (nationality.equalsIgnoreCase("Angolan")))
          {
             return "Welcome " + getFullName() + " from Angola.";
          }

     else if((nationality.equalsIgnoreCase("Argentina")) || (nationality.equalsIgnoreCase("Argentinian")))
          {
             return "Welcome, " + getFullName() + " from Argentina.";
          }

     else if((nationality.equalsIgnoreCase("Armenian")) || (nationality.equalsIgnoreCase("Armenia")))
          {
             return "Welcome, " + getFullName() + " from Armenia.";
          }

     else if ((nationality.equalsIgnoreCase("Austria")) || (nationality.equalsIgnoreCase("Austrian")))
          {
             return "Welcome, " + getFullName() + " from Austria.";
          }
     else if((nationality.equalsIgnoreCase("Australia")) || (nationality.equalsIgnoreCase("Australian")))
          {
             return "Welcome, " + getFullName() + " from Australia";
          }

     else if((nationality.equalsIgnoreCase("Bolivia")) || (nationality.equalsIgnoreCase("Bolivian")))
          {
             return "Welcome, " + getFullName() + " from Bolivia.";
          }

     else if((nationality.equalsIgnoreCase("Brazil")) || (nationality.equalsIgnoreCase("Brazilian")))
          {
             return "Welcome, " + getFullName() + " from Brazil.";
          }

     else if((nationality.equalsIgnoreCase("Burkina Faso")) || (nationality.equalsIgnoreCase("Burkinabe")))
          {
             return "Welcome, " + getFullName() + " from Burkina Faso.";
          }

     else if((nationality.equalsIgnoreCase("Belarus")) || (nationality.equalsIgnoreCase("Belarusian")))
          {
             return "Welcome, " + getFullName() + " from Belarus.";
          }

     else if((nationality.equalsIgnoreCase("Chile")) || (nationality.equalsIgnoreCase("Chilean")))
          {
             return "Welcome, " + getFullName() + " from Chile.";
          }

     else if((nationality.equalsIgnoreCase("China")) || (nationality.equalsIgnoreCase("Chinese")))
          {
             return "Welcome, " + getFullName() + " from China.";
          }

     else if((nationality.equalsIgnoreCase("Colombia")) || (nationality.equalsIgnoreCase("Colombian")))
          {
             return "Welcome, " + getFullName() + " from Colombia.";
          }

     else if((nationality.equalsIgnoreCase("Canada")) || (nationality.equalsIgnoreCase("Canadian")))
          {
             return "Welcome, " + getFullName() + " from Canada";
          }

     else if((nationality.equalsIgnoreCase("Central African Republic")) || (nationality.equalsIgnoreCase("Central African")))
          {
             return "Welcome, " + getFullName() + " from the Central African Republic.";
          }

     else if((nationality.equalsIgnoreCase("Denmark")) || (nationality.equalsIgnoreCase("Danish")))
          {
             return "Welcome, " + getFullName() + " from Denmark.";
          }

     else if((nationality.equalsIgnoreCase("Estonia")) || (nationality.equalsIgnoreCase("Estonian")))
          {
             return "Welcome, " + getFullName() + " from Estonia";
          }

     else if((nationality.equalsIgnoreCase("Ethiopia")) || (nationality.equalsIgnoreCase("Ethiopian")))
          {
             return "Welcome, " + getFullName() + " from Ethiopia.";
          }

     else if((nationality.equalsIgnoreCase("Finland")) || (nationality.equalsIgnoreCase("Finnish")))
          {
             return "Welcome, " + getFullName() + " from Finland";
          }

     else if((nationality.equalsIgnoreCase("France")) || (nationality.equalsIgnoreCase("French")))
          {
             return "Welcome, " + getFullName() + " from France";
          }

     else if((nationality.equalsIgnoreCase("Germany")) || (nationality.equalsIgnoreCase("German")))
          {
             return "Welcome, " + getFullName() + " from Germany.";
          }

     else if((nationality.equalsIgnoreCase("Grenada")) || (nationality.equalsIgnoreCase("Grenadian")))
          {
             return "Welcome, " + getFullName() + " from Grenada";
          }

     else if((nationality.equalsIgnoreCase("India")) || (nationality.equalsIgnoreCase("Indian")))
          {
             return "Welcome, " + getFullName() + " from India.";
          }

     else if((nationality.equalsIgnoreCase("Ireland")) || (nationality.equalsIgnoreCase("Irish")))
          {
             return "Welcome, " + getFullName() + " from Ireland.";
          }

     else if((nationality.equalsIgnoreCase("Italy")) || (nationality.equalsIgnoreCase("Italian")))
          {
             return "Welcome, " + getFullName() + " from Italy.";
          }

     else if((nationality.equalsIgnoreCase("Japan")) || (nationality.equalsIgnoreCase("Japanese")))
          {
             return "Welcome, " + getFullName() + " from Japan.";
          }

     else if((nationality.equalsIgnoreCase("Kenya")) || (nationality.equalsIgnoreCase("Kenyan")))
          {
             return "Welcome, " + getFullName() + " from Kenya.";
          }

     else if((nationality.equalsIgnoreCase("Latvia")) || (nationality.equalsIgnoreCase("Latvian")))
          {
             return "Welcome, " + getFullName() + " from Latvia.";
          }

     else if((nationality.equalsIgnoreCase("Moldova")) || (nationality.equalsIgnoreCase("Moldovan")))
          {
             return "Welcome, " + getFullName() + " from Moldova.";
          }

     else if((nationality.equalsIgnoreCase("Namibia")) || (nationality.equalsIgnoreCase("Namibian")))
          {
             return "Welcome, " + getFullName() + " from Namibia.";
          }

     else if((nationality.equalsIgnoreCase("New Zealand")) || (nationality.equalsIgnoreCase("New Zealander")))
          {
             return "Welcome, " + getFullName() + " from New Zealand.";
          }

     else if((nationality.equalsIgnoreCase("Norway")) || (nationality.equalsIgnoreCase("Norwegian")))
          {
             return "Welcome, " + getFullName() + " from Norway.";
          }

     else if((nationality.equalsIgnoreCase("Poland")) || (nationality.equalsIgnoreCase("Polish")))
          {
             return "Welcome, " + getFullName() + " from Poland.";
          }

     else if((nationality.equalsIgnoreCase("South Africa")) || (nationality.equalsIgnoreCase("South African")))
          {
             return "Welcome, " + getFullName() + " from South Africa.";
          }

     else if((nationality.equalsIgnoreCase("Tanzania")) || (nationality.equalsIgnoreCase("Tanzanian")))
          {
             return "Welcome, " + getFullName() + " from Tanzania.";
          }

     else if((nationality.equalsIgnoreCase("Zimbabwe")) || (nationality.equalsIgnoreCase("Zimbabwean")))
          {
             return "Welcome, " + getFullName() + " from Zimbabwe.";
          }

     else if((nationality.equalsIgnoreCase("United Kingdom")) || (nationality.equalsIgnoreCase("British")))
          {
             return "Welcome, " + getFullName() + " from the United Kingdom.";
          }

     else if((nationality.equalsIgnoreCase("United States")) || (nationality.equalsIgnoreCase("US")) || (nationality.equalsIgnoreCase("USA")) || (nationality.equalsIgnoreCase("American")))
          {
             return "Welcome, " + getFullName() + " from the United States.";
          }

     else
     {
        return "Sorry, " + getFullName() + ". We cannot currently work with " + getNationality() + " passports.";
     }
   }

   //This method will get all of the information of how many passports to verify and prompt
   //for the details

   protected static void passportInformation()
   {
      //Create ArrayLists for each of the continents
      //This will display all the passports we cater for

      ArrayList<String> europeanNations = new ArrayList<String>();
      ArrayList<String> americanNations = new ArrayList<String>();
      ArrayList<String> africanNations = new ArrayList<String>();
      ArrayList<String> oceaniaNations = new ArrayList<String>();
      ArrayList<String> asianNations = new ArrayList<String>();

      ArrayList<String> nationIdentifiers = new ArrayList<String>();

      //Add the countries to their respective ArrayList

      europeanNations.add("Albania");
      europeanNations.add("Armenia");
      europeanNations.add("Austria");
      europeanNations.add("Belarus");
      europeanNations.add("Denmark");
      europeanNations.add("Estonia");
      europeanNations.add("Finland");
      europeanNations.add("France");
      europeanNations.add("Germany");
      europeanNations.add("Ireland");
      europeanNations.add("Italy");
      europeanNations.add("Latvia");
      europeanNations.add("Moldova");
      europeanNations.add("Norway");
      europeanNations.add("Poland");
      europeanNations.add("United Kingdom");

      americanNations.add("Argentina");
      americanNations.add("Bolivia");
      americanNations.add("Brazil");
      americanNations.add("Canada");
      americanNations.add("Chile");
      americanNations.add("Colombia");
      americanNations.add("Grenada");
      americanNations.add("United States");

      africanNations.add("Algeria");
      africanNations.add("Angola");
      africanNations.add("Burkina Faso");
      africanNations.add("Ethiopia");
      africanNations.add("Kenya");
      africanNations.add("Namibia");
      africanNations.add("South Africa");
      africanNations.add("Tanzania");
      africanNations.add("Zimbabwe");

      oceaniaNations.add("Australia");
      oceaniaNations.add("New Zealand");

      asianNations.add("China");
      asianNations.add("India");
      asianNations.add("Japan");

      nationIdentifiers.add("Albanian");
      nationIdentifiers.add("Algerian");
      nationIdentifiers.add("Angolan");
      nationIdentifiers.add("Argentinian");
      nationIdentifiers.add("Armenian");
      nationIdentifiers.add("Austrian");
      nationIdentifiers.add("Australian");

      nationIdentifiers.add("Bolivian");
      nationIdentifiers.add("Brazilian");
      nationIdentifiers.add("Burkinabe");
      nationIdentifiers.add("Belarusian");

      nationIdentifiers.add("Chilean");
      nationIdentifiers.add("Chinese");
      nationIdentifiers.add("Colombian");
      nationIdentifiers.add("Canadian");
      nationIdentifiers.add("Central African");

      nationIdentifiers.add("Danish");

      nationIdentifiers.add("Estonian");
      nationIdentifiers.add("Ethiopian");

      nationIdentifiers.add("Finnish");
      nationIdentifiers.add("French");
      nationIdentifiers.add("German");
      nationIdentifiers.add("Grenadian");

      nationIdentifiers.add("Indian");
      nationIdentifiers.add("Irish");
      nationIdentifiers.add("Italian");

      nationIdentifiers.add("Japanese");

      nationIdentifiers.add("Kenyan");

      nationIdentifiers.add("Latvian");

      nationIdentifiers.add("Moldovan");

      nationIdentifiers.add("Namibian");
      nationIdentifiers.add("New Zealander");
      nationIdentifiers.add("Norwegian");

      nationIdentifiers.add("Polish");

      nationIdentifiers.add("South African");

      nationIdentifiers.add("Tanzanian");

      nationIdentifiers.add("British");

      nationIdentifiers.add("US");
      nationIdentifiers.add("USA");
      nationIdentifiers.add("American");

      nationIdentifiers.add("Zimbabwean");

      //This will loop through the ArrayLists and output the details

      System.out.println("We accept passports from the following nations: \n");
      System.out.println("\nEUROPEAN NATIONS: \n");

      for(String europeanNation : europeanNations)
      {
         System.out.println(europeanNation);
      }

      System.out.println("\nAMERICAN NATIONS: \n");

      for(String americanNation : americanNations)
      {
         System.out.println(americanNation);
      }

      System.out.println("\nAFRICAN NATIONS: \n");

      for(String africanNation : africanNations)
      {
         System.out.println(africanNation);
      }

      System.out.println("\nOCEANIC NATIONS: \n");

      for(String oceanicNation : oceaniaNations)
      {
         System.out.println(oceanicNation);
      }

      System.out.println("\nASIAN NATIONS: \n");

      for(String asianNation : asianNations)
      {
         System.out.println(asianNation);
      }

      //This ArrayList wil store variables of the Passport type
      //So we can store the passport objects created in this ArrayList
      ArrayList<Passport> passports = new ArrayList<Passport>();

      String firstName;
      String lastName;
      String nationality;
      int numberOfPassports;

      firstName = "";
      lastName = "";
      nationality = "";

      //We get user input at the start to get how many passport objects we will need to create
      System.out.println("\nEnter the number of passports you will be providing the details of (MAX 4): ");
      numberOfPassports = scan.nextInt();

      //This code below will output an error message if the user has entered the number of passports
      //as a number above 4. It will continue to loop until the user enters a valid number of passports
      if(numberOfPassports > FOUR)
      {
         do
         {
            System.out.println("\nSorry, you cannot enter more than 4 passports.");
            System.out.println("\nEnter the number of passports you will be providing the details of (MAX 4): ");
            numberOfPassports = scan.nextInt();
         } while (numberOfPassports > FOUR);
      }//if

      //If the user specifies to enter one passport this if statement will run
      //It creates one passport object

      if (numberOfPassports == ONE)
      {
         Passport passport1 = new Passport();

         System.out.println("\nEnter your first name: ");
         firstName = scan.next();
         scan.nextLine();
         passport1.setFirstName(firstName);

         System.out.println("\nEnter your last name: ");
         lastName = scan.next();
         scan.nextLine();
         passport1.setLastName(lastName);

         System.out.println(passport1.promptForPassport());
         nationality = scan.nextLine();
         passport1.setPassport(nationality);

         //This rather strange looking if statement will run if the user enters a nationality
         //that is not contained in any of our ArrayLists
         //It then runs a do while loop that will keep looping until the user enters a
         //nationality that the program deems valid

         if(!europeanNations.contains(nationality))
         {
            if(!americanNations.contains(nationality))
            {
               if(!africanNations.contains(nationality))
               {
                  if(!oceaniaNations.contains(nationality))
                  {
                     if(!asianNations.contains(nationality))
                     {
                       if(!nationIdentifiers.contains(nationality))
                       {
                          do
                          {
                             System.out.println("\nPlease enter a valid passport: ");
                             nationality = scan.nextLine();
                             passport1.setPassport(nationality);
                          }
                          while((!europeanNations.contains(nationality) && (!americanNations.contains(nationality) && (!africanNations.contains(nationality) && (!oceaniaNations.contains(nationality) && (!asianNations.contains(nationality) && (!nationIdentifiers.contains(nationality))))))));
                       }
                     }
                  }
               }
            }
         }

         System.out.println("\n" + passport1.welcomeUser());

         passport1.getFullName();

         passports.add(passport1);

      }

      //If the user states that they have 2 passports this else if will create 2 passport objects
      //The following else if's work the same as the above
      //The only difference is that they create either 2 passport objects, 3 passports objects
      //or 4 objects. This is depends on how many passports the user enters.

      else if (numberOfPassports == TWO)
      {
         Passport passport1 = new Passport();

         System.out.println("\nEnter your first name: ");
         firstName = scan.next();
         scan.nextLine();
         passport1.setFirstName(firstName);

         System.out.println("\nEnter your last name: ");
         lastName = scan.next();
         scan.nextLine();
         passport1.setLastName(lastName);

         System.out.println(passport1.promptForPassport());
         nationality = scan.nextLine();
         passport1.setPassport(nationality);

         if(!europeanNations.contains(nationality))
         {
            if(!americanNations.contains(nationality))
            {
               if(!africanNations.contains(nationality))
               {
                  if(!oceaniaNations.contains(nationality))
                  {
                     if(!asianNations.contains(nationality))
                     {
                        if(!nationIdentifiers.contains(nationality))
                        {
                           do
                           {
                              System.out.println("\nPlease enter a valid passport: ");
                              nationality = scan.nextLine();
                              passport1.setPassport(nationality);
                           }
                           while((!europeanNations.contains(nationality) && (!americanNations.contains(nationality) && (!africanNations.contains(nationality) && (!oceaniaNations.contains(nationality) && (!asianNations.contains(nationality) && (!nationIdentifiers.contains(nationality))))))));
                        }
                     }
                  }
               }
            }
         }

         System.out.println("\n" + passport1.welcomeUser());

         passports.add(passport1);

         ////////////////////////////////////////////

         Passport passport2 = new Passport();

         System.out.println("\nEnter your first name: ");
         firstName = scan.next();
         scan.nextLine();
         passport2.setFirstName(firstName);

         System.out.println("\nEnter your last name: ");
         lastName = scan.next();
         scan.nextLine();
         passport2.setLastName(lastName);

         System.out.println(passport2.promptForPassport());
         nationality = scan.nextLine();
         passport2.setPassport(nationality);

         if(!europeanNations.contains(nationality))
         {
            if(!americanNations.contains(nationality))
            {
               if(!africanNations.contains(nationality))
               {
                  if(!oceaniaNations.contains(nationality))
                  {
                     if(!asianNations.contains(nationality))
                     {
                        if(!nationIdentifiers.contains(nationality))
                        {
                           do
                           {
                              System.out.println("\nPlease enter a valid passport: ");
                              nationality = scan.nextLine();
                              passport1.setPassport(nationality);
                           }
                           while((!europeanNations.contains(nationality) && (!americanNations.contains(nationality) && (!africanNations.contains(nationality) && (!oceaniaNations.contains(nationality) && (!asianNations.contains(nationality) && (!nationIdentifiers.contains(nationality))))))));
                        }
                     }
                  }
               }
            }
         }

         System.out.println("\n" + passport2.welcomeUser());

         passports.add(passport2);
      }

      else if (numberOfPassports == THREE)
      {
         Passport passport1 = new Passport();

         System.out.println("\nEnter your first name: ");
         firstName = scan.next();
         scan.nextLine();
         passport1.setFirstName(firstName);

         System.out.println("\nEnter your last name: ");
         lastName = scan.next();
         scan.nextLine();
         passport1.setLastName(lastName);

         System.out.println(passport1.promptForPassport());
         nationality = scan.nextLine();
         passport1.setPassport(nationality);

         if(!europeanNations.contains(nationality))
         {
            if(!americanNations.contains(nationality))
            {
               if(!africanNations.contains(nationality))
               {
                  if(!oceaniaNations.contains(nationality))
                  {
                     if(!asianNations.contains(nationality))
                     {
                        if(!nationIdentifiers.contains(nationality))
                        {
                           do
                           {
                              System.out.println("\nPlease enter a valid passport: ");
                              nationality = scan.nextLine();
                              passport1.setPassport(nationality);
                           }
                           while((!europeanNations.contains(nationality) && (!americanNations.contains(nationality) && (!africanNations.contains(nationality) && (!oceaniaNations.contains(nationality) && (!asianNations.contains(nationality) && (!nationIdentifiers.contains(nationality))))))));
                        }
                     }
                  }
               }
            }
         }

         System.out.println("\n" + passport1.welcomeUser());

         passports.add(passport1);

         ////////////////////////////////////////////

         Passport passport2 = new Passport();

         System.out.println("\nEnter your first name: ");
         firstName = scan.next();
         scan.nextLine();
         passport2.setFirstName(firstName);

         System.out.println("\nEnter your last name: ");
         lastName = scan.next();
         scan.nextLine();
         passport2.setLastName(lastName);

         System.out.println(passport2.promptForPassport());
         nationality = scan.nextLine();
         passport2.setPassport(nationality);

         if(!europeanNations.contains(nationality))
         {
            if(!americanNations.contains(nationality))
            {
               if(!africanNations.contains(nationality))
               {
                  if(!oceaniaNations.contains(nationality))
                  {
                     if(!asianNations.contains(nationality))
                     {
                        if(!nationIdentifiers.contains(nationality))
                        {
                           do
                           {
                              System.out.println("\nPlease enter a valid passport: ");
                              nationality = scan.nextLine();
                              passport1.setPassport(nationality);
                           }
                           while((!europeanNations.contains(nationality) && (!americanNations.contains(nationality) && (!africanNations.contains(nationality) && (!oceaniaNations.contains(nationality) && (!asianNations.contains(nationality) && (!nationIdentifiers.contains(nationality))))))));
                        }
                     }
                  }
               }
            }
         }

         System.out.println("\n" + passport2.welcomeUser());

         passports.add(passport2);

         ////////////////////////////////////////////

         Passport passport3 = new Passport();

         System.out.println("\nEnter your first name: ");
         firstName = scan.next();
         scan.nextLine();
         passport3.setFirstName(firstName);

         System.out.println("\nEnter your last name: ");
         lastName = scan.next();
         scan.nextLine();
         passport3.setLastName(lastName);

         System.out.println(passport3.promptForPassport());
         nationality = scan.nextLine();
         passport3.setPassport(nationality);

         if(!europeanNations.contains(nationality))
         {
            if(!americanNations.contains(nationality))
            {
               if(!africanNations.contains(nationality))
               {
                  if(!oceaniaNations.contains(nationality))
                  {
                     if(!asianNations.contains(nationality))
                     {
                        if(!nationIdentifiers.contains(nationality))
                        {
                           do
                           {
                              System.out.println("\nPlease enter a valid passport: ");
                              nationality = scan.nextLine();
                              passport1.setPassport(nationality);
                           }
                           while((!europeanNations.contains(nationality) && (!americanNations.contains(nationality) && (!africanNations.contains(nationality) && (!oceaniaNations.contains(nationality) && (!asianNations.contains(nationality) && (!nationIdentifiers.contains(nationality))))))));
                        }
                     }
                  }
               }
            }
         }

         System.out.println("\n" + passport3.welcomeUser());

         passports.add(passport3);
      }
      else if (numberOfPassports == FOUR)
      {
         Passport passport1 = new Passport();

         System.out.println("\nEnter your first name: ");
         firstName = scan.next();
         scan.nextLine();
         passport1.setFirstName(firstName);

         System.out.println("\nEnter your last name: ");
         lastName = scan.next();
         scan.nextLine();
         passport1.setLastName(lastName);

         System.out.println(passport1.promptForPassport());
         nationality = scan.nextLine();
         passport1.setPassport(nationality);

         if(!europeanNations.contains(nationality))
         {
            if(!americanNations.contains(nationality))
            {
               if(!africanNations.contains(nationality))
               {
                  if(!oceaniaNations.contains(nationality))
                  {
                     if(!asianNations.contains(nationality))
                     {
                        if(!nationIdentifiers.contains(nationality))
                        {
                           do
                           {
                              System.out.println("\nPlease enter a valid passport: ");
                              nationality = scan.nextLine();
                              passport1.setPassport(nationality);
                           }
                           while((!europeanNations.contains(nationality) && (!americanNations.contains(nationality) && (!africanNations.contains(nationality) && (!oceaniaNations.contains(nationality) && (!asianNations.contains(nationality) && (!nationIdentifiers.contains(nationality))))))));
                        }
                     }
                  }
               }
            }
         }

         System.out.println("\n" + passport1.welcomeUser());

         passports.add(passport1);

         ////////////////////////////////////////////

         Passport passport2 = new Passport();

         System.out.println("\nEnter your first name: ");
         firstName = scan.next();
         scan.nextLine();
         passport2.setFirstName(firstName);

         System.out.println("\nEnter your last name: ");
         lastName = scan.next();
         scan.nextLine();
         passport2.setLastName(lastName);

         System.out.println(passport2.promptForPassport());
         nationality = scan.nextLine();
         passport2.setPassport(nationality);

         if(!europeanNations.contains(nationality))
         {
            if(!americanNations.contains(nationality))
            {
               if(!africanNations.contains(nationality))
               {
                  if(!oceaniaNations.contains(nationality))
                  {
                     if(!asianNations.contains(nationality))
                     {
                        if(!nationIdentifiers.contains(nationality))
                        {
                           do
                           {
                              System.out.println("\nPlease enter a valid passport: ");
                              nationality = scan.nextLine();
                              passport1.setPassport(nationality);
                           }
                           while((!europeanNations.contains(nationality) && (!americanNations.contains(nationality) && (!africanNations.contains(nationality) && (!oceaniaNations.contains(nationality) && (!asianNations.contains(nationality) && (!nationIdentifiers.contains(nationality))))))));
                        }
                     }
                  }
               }
            }
         }

         System.out.println("\n" + passport2.welcomeUser());

         passports.add(passport2);

         ////////////////////////////////////////////

         Passport passport3 = new Passport();

         System.out.println("\nEnter your first name: ");
         firstName = scan.next();
         scan.nextLine();
         passport3.setFirstName(firstName);

         System.out.println("\nEnter your last name: ");
         lastName = scan.next();
         scan.nextLine();
         passport3.setLastName(lastName);

         System.out.println(passport3.promptForPassport());
         nationality = scan.nextLine();
         passport3.setPassport(nationality);

         if(!europeanNations.contains(nationality))
         {
            if(!americanNations.contains(nationality))
            {
               if(!africanNations.contains(nationality))
               {
                  if(!oceaniaNations.contains(nationality))
                  {
                     if(!asianNations.contains(nationality))
                     {
                        if(!nationIdentifiers.contains(nationality))
                        {
                           do
                           {
                              System.out.println("\nPlease enter a valid passport: ");
                              nationality = scan.nextLine();
                              passport1.setPassport(nationality);
                           }
                           while((!europeanNations.contains(nationality) && (!americanNations.contains(nationality) && (!africanNations.contains(nationality) && (!oceaniaNations.contains(nationality) && (!asianNations.contains(nationality) && (!nationIdentifiers.contains(nationality))))))));
                        }
                     }
                  }
               }
            }
         }

         System.out.println("\n" + passport3.welcomeUser());

         passports.add(passport3);

         ///////////////////////////////////////////////////////////////////////////////////////////////////////////

         Passport passport4 = new Passport();

         System.out.println("\nEnter your first name: ");
         firstName = scan.next();
         scan.nextLine();
         passport4.setFirstName(firstName);

         System.out.println("\nEnter your last name: ");
         lastName = scan.next();
         scan.nextLine();
         passport4.setLastName(lastName);

         System.out.println(passport4.promptForPassport());
         nationality = scan.nextLine();
         passport4.setPassport(nationality);

         if(!europeanNations.contains(nationality))
         {
            if(!americanNations.contains(nationality))
            {
               if(!africanNations.contains(nationality))
               {
                  if(!oceaniaNations.contains(nationality))
                  {
                     if(!asianNations.contains(nationality))
                     {
                        if(!nationIdentifiers.contains(nationality))
                        {
                           do
                           {
                              System.out.println("\nPlease enter a valid passport: ");
                              nationality = scan.nextLine();
                              passport1.setPassport(nationality);
                           }
                           while((!europeanNations.contains(nationality) && (!americanNations.contains(nationality) && (!africanNations.contains(nationality) && (!oceaniaNations.contains(nationality) && (!asianNations.contains(nationality) && (!nationIdentifiers.contains(nationality))))))));
                        }
                     }
                  }
               }
            }
         }

         System.out.println("\n" + passport4.welcomeUser());

         passports.add(passport4);
      }

      //Output the number of passports the user has created

      if(numberOfPassports == ONE)
      {
         System.out.println("\nVERIFIED " + numberOfPassports + " PASSPORT.");
      }
      else if(numberOfPassports > FOUR)
      {
         System.out.println("");
      }
      else
      {
         System.out.println("\nVERIFIED " + numberOfPassports + " PASSPORTS.");
      }
   }

   //returns number of passport objects.
   //The minus one is here as it is the only way the number of Passport objects will be accurate
   protected static int getNumberOfPassports()
   {
      return numberOfPassportObjects - 1;
   }

} //class

