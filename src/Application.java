
public class Application {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    //Coding Steps 1
    int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 77};
    int total = 0;
    
    for(int i=0; i<ages.length; i++) {
      total = total + ages[i];
    }
    double average1 = total / (double) ages.length;
    
    System.out.println(average1);
    
    //Coding Steps 2
    String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; 
    int sum = 0; 
    
    for (String name1 : names) {
      sum += name1.length();
    }
      double average2 = sum / (double) names.length;
    
    System.out.println(average2);
    
    String name2 = "";
    for (int i = 0; i < names.length; i++) {
      name2 += names[i] + " ";
    }
    
    System.out.println(name2);
    
    //Coding Steps 3: 
    
    System.out.println(ages[ages.length - 1]);
    
    //Coding Steps 4:
    
   System.out.println(ages[0]);
    
    //Coding Steps 5: 
    
    int[] nameLengths = new int [names.length];
    for (int i = 0; i < nameLengths.length; i++) {
      nameLengths[i] = names[i].length();
      }
    
    //Coding Steps 6: 
    int sumOfNameLengths = 0;
    for (int nameLength : nameLengths) {
      sumOfNameLengths += nameLength;
    }
    System.out.println(sumOfNameLengths);
    
    //Coding Steps 7:  
    
    System.out.println(duplicateWord ("Hello", 3));
    
    //Coding Steps 8: 
    
    System.out.println(mergeFullName ("Moira", "Rose"));
    
    //Coding Steps 9:  
    
    int[] test1 = {25, 46, 55, 37};
    System.out.println(isSumGreaterThanOneHundred (test1));
    int[] test2 = {2, 4, 55, 7};
    System.out.println(isSumGreaterThanOneHundred (test2));
    
    //Coding Steps 10: 
    double[] test3 = {25.5, 60.9, 35.7, 45.2}; 
    System.out.println(findAverage(test3));
  
    //Coding Steps 11: 
    double[] test4 = {100.2, 97.8, 98.6, 104.3};
    System.out.println(isFirstAverageGreater (test3, test4));
    System.out.println(isFirstAverageGreater (test4, test3));
    
    //Coding Steps 12:     
    
    System.out.println(willBuyDrink (true, 11.76));
    System.out.println(willBuyDrink (true, 9.01));
    System.out.println(willBuyDrink (false, 11.76));
    
    //Coding Steps 13: This method will print, when called, the proper name order for
    //greeting someone from China. Why did I choose this? I work with international
    //students and wanted to create something relevant to my current work. 
   
    greetFamilyNameFirst ("China", "Micky", "Mouse");
    greetFamilyNameFirst ("USA", "Micky", "Mouse");
  }
  
//Coding Steps 7 Method Code: 
 public static String duplicateWord (String word, int n) {
   String duplicatedWord = "";
   for (int i = 0; i < n; i++) {
     duplicatedWord += word;
   }
   return duplicatedWord; 
 }
 
 //Coding Steps 8 Method Code: 
 public static String mergeFullName (String firstName, String lastName) {
   return firstName + " " + lastName;
 }
 
 //Coding Steps 9 Method Code: 
 public static boolean isSumGreaterThanOneHundred (int[] arr) {
   int sum = 0;
   for (int number : arr) {
     sum += number;
     if (sum > 100) {
       return true;
   } 
   }
   return false;
 }
 
 //Coding Steps 10 Method Code: 
 public static double findAverage (double[] array) {
   double sum = 0;
   for (double number : array) {
     sum += number;
   }
   return sum/array.length;
 }
 
 //Coding Steps 11 Method Code: 
 public static boolean isFirstAverageGreater (double[] one, double[] two) {
   double sumx = 0;
   double sumy = 0;
   for (double x : one) {
     sumx += x;
   }
   for (double y : two) {
     sumy += y;
   }
   if ((sumx/one.length) > (sumy/two.length)) {
     return true;
   }
   return false; 
 }
 
 //Coding Steps 12 Method:
 public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
  if (isHotOutside && moneyInPocket > 10.50) {
    return true;
  }
   return false;
 }
 
 public static void greetFamilyNameFirst (String country, String givenName, String familyName) {
   String str = "China"; 
   String str2 = "Dear " + familyName + " " + givenName + ",";
   String str3 = "Dear " + givenName + " " + familyName + ",";
   if (country.equalsIgnoreCase(str)){
      str = str2 ;
      System.out.println(str2);
   } else {
     System.out.println(str3);
   }
    
  
    }
    
   
     }
 
 

 
  
  
  
    
    

