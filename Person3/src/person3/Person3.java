/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person3;
import java.time.LocalDate;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Person3 {

   private String name;
   private String father_Name;
   private String mother_Name;
   private String date_Of_Birth;
   private String nationality;
   private String id;
  
   public Person3() {
      
       this.name = getAlphaNumericStringName();
       this.father_Name = getAlphaNumericStringName();
       this.mother_Name = getAlphaNumericStringName();
       this.date_Of_Birth = randomDate();
       this.nationality = "Bangladeshi";
       this.id = getRandomNumberString();
   }

   private String randomDate() {
       LocalDate startDate = LocalDate.of(1940, 1, 1); //start date
   long start = startDate.toEpochDay();
     

   LocalDate endDate = LocalDate.now(); //end date
   long end = endDate.toEpochDay();
     

   long randomEpochDay = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
     
       return LocalDate.ofEpochDay(randomEpochDay).toString();
      
   }

   private String getAlphaNumericStringName() {
      
           int n=30;
   // choose a Character random from this String
   String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  
   // create StringBuffer size of AlphaNumericString
   StringBuilder sb = new StringBuilder(n);
  
   for (int i = 0; i < n; i++) {
  
   // generate a random number between
   // 0 to AlphaNumericString variable length
   int index
   = (int)(AlphaNumericString.length()
   * Math.random());
  
   // add Character one by one in end of sb
   sb.append(AlphaNumericString
   .charAt(index));
   }
  
   return sb.toString();
   }

   
   public Person3(String name, String father_Name, String mother_Name, String date_Of_Birth, String nationality, String id) {
      
       this.name = name;
       this.father_Name = father_Name;
       this.mother_Name = mother_Name;
       this.date_Of_Birth = date_Of_Birth;
       this.nationality = nationality;
       this.id = id;
   }
   
   //getter and setter methods

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public String getFather_Name() {
       return father_Name;
   }

   public void setFather_Name(String father_Name) {
       this.father_Name = father_Name;
   }

   public String getMother_Name() {
       return mother_Name;
   }

   public void setMother_Name(String mother_Name) {
       this.mother_Name = mother_Name;
   }

   public String getDate_Of_Birth() {
       return date_Of_Birth;
   }

   public void setDate_Of_Birth(String date_Of_Birth) {
       this.date_Of_Birth = date_Of_Birth;
   }

   public String getNationality() {
       return nationality;
   }

   public void setNationality(String nationality) {
       this.nationality = nationality;
   }

   public String getId() {
       return id;
   }

   public void setId(String id) {
       this.id = id;
   }
   

   public static void main(String[] args) {
       // creating the Array of 20 Person Object
       Person3 persons[]=new Person3[20];
       //initilizing the Array
       for(int i=0; i<20; i++) {
           Person3 p=new Person3();
           persons[i]=p;
       }
      
       System.out.println("-----------Display Array Content------");

       for(Person3 person: persons) {
           System.out.println("Name :"+person.getName()+", Father’s name : "+person.getFather_Name()+", Mother’s name: "+
       person.getMother_Name()+", Date of Birth :"+person.getDate_Of_Birth()+", Nationality :"+person.getNationality()+
       ", ID :"+person.getId());
       }
       
       // swaping the new Object with index 7
       Person3 temp=new Person3();
       Person3 p=persons[7];
       persons[7]=temp;
       System.out.println("-----------After Swap Display Array Content------");
       for(Person3 person: persons) {
           System.out.println("Name :"+person.getName()+", Father’s name : "+person.getFather_Name()+", Mother’s name: "+
       person.getMother_Name()+", Date of Birth :"+person.getDate_Of_Birth()+", Nationality :"+person.getNationality()+
       ", ID :"+person.getId());
       }
      
   }

   
   public static String getRandomNumberString() {
   // It will generate 6 digit random Number.
   // from 0 to 999999
   Random rnd = new Random();
   int number = rnd.nextInt(999999);

   // this will convert any number sequence into 6 character.
   return String.format("%06d", number);
   }
}