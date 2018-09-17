// imports everything within the javax swing package
import javax.swing.*;
// declares the name of the class
class PhoneNumbers
{
	//main shell of the program
   public static void main(String[] args)
   {
	   //allocates 30 new memory slots to be reserved 
       String[] names = new String[30];
	   //gives value to 9 of the 30 names slots 
       names[0] = "Gina";    names[1] = "Marcia";
       names[2] = "Rita";    names[3] = "Jennifer";
       names[4] = "Fred";    names[5] = "Neil";
       names[6] = "Judy";    names[7] = "Arlene";
       names[8] = "LaWanda"; names[9] = "Deepak";
	   //allocates 30 new memory slots to be reserved
       String numbers[] = new String[30];
	   //gives value to 9 of the 30 names slots 
       numbers[0] = "(847) 341-0912";
       numbers[1] = "(847) 341-2392";
       numbers[2] = "(847) 354-0654";
       numbers[3] = "(414) 234-0912";
       numbers[4] = "(414) 435-6567";
       numbers[5] = "(608) 123-0904";
       numbers[6] = "(608) 435-0434";
       numbers[7] = "(608) 123-0312";
       numbers[8] = "(920) 787-9813";
       numbers[9] = "(930) 412-0991";

	   //2 new string variables with no value yet
       String entryName, entryPhone;
	   
	   // 2 integers variables x is not defined yet and highest is set at 10
       int x;
	   int highest = 10;
	   
	   //boolean which is set to be false
       boolean isFound = false;
       
	   //prompts user to enter a name or to type quit to end program
       entryName = JOptionPane.showInputDialog(null, "Enter name to look up. Type 'quit' to quit.");
	   
	   //while loop as long as 10 is less than 30 program will keep running or if user enters quit
       while (highest < 30 && !entryName.equalsIgnoreCase("quit"))
       { 
		  //for loop that will loop until x is no longer less than the highest variable which is set to 30
          for(x = 0; x < highest; ++ x)
			  //if users input equals any of the names at the index counter
             if(entryName.equalsIgnoreCase(names[x]))
             {
				 //isfound will now be true
                isFound = true;
				//outputs the name and number that the user requested
                JOptionPane.showMessageDialog(null,
                   names[x] + "'s phone number is " + numbers[x]);
                x = highest;
             }
			 //if entryName is flase
          if(!isFound)
          {
			  //allow user to input a number for the new name that was not found
             entryPhone= JOptionPane.showInputDialog(null,
               "Enter phone number for " + entryName);
			   //saves name a number with a new index within one of the 30 slots that are not used
             names[highest] = entryName;
             numbers[highest] = entryPhone;
             ++highest;
          }
		 //else statement that prompts user to enter a name again
		else
		{
          entryName = JOptionPane.showInputDialog(null,
            "Enter name to look up. Type 'quit' to quit.");
          isFound = false;
		}
      }
   }
}