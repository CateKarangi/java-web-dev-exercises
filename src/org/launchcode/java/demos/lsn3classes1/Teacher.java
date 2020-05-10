package org.launchcode.java.demos.lsn3classes1;

public class Teacher<firstName, lastName, subject, yearsOfTeaching, getFirstName> {
    private static String Eudius;
    private static String Wathire;
    private static String Education;
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsOfTeaching;
    
    public static void main (String[] args){
        //instantiating
        String firstName = Eudius;
        String lastName = Wathire;
        String subject = Education;
        int yearsOfTeaching = 10;
    }

    public Teacher (String firstName, String lastName, String subject, int yearsOfTeaching){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

   public String getFirstName(){
        return firstName;
   }

   public void setFirstName(String firstName){
        this.firstName = firstName;
   }

   public String getLastName(){
        return lastName;
   }

   public void setLastName(String lastName){
        this.lastName =lastName;
   }

   public String getSubject(){
        return subject;
   }

   public void setSubject(String subject){
        this.subject =subject;
   }

   public int getYearsOfTeaching(){
        return yearsOfTeaching;
   }

   public void setYearsOfTeaching(int yearsOfTeaching){
        this.yearsOfTeaching = yearsOfTeaching;
   }

}
