package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    private double nextStudentId;
    private String name;
    private String numberOfCredits;
    private String gpa;

    public SchoolPractice(Object name, double v, double v1) {
    }

    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        String name = "Cathrine Karangi";
        int studentId = 51;
        new Student(name, studentId, 1,4.0);

    }

    public double getNextStudentId(){
        return nextStudentId;
    }

    public void setNextStudentId(double nextStudentId){
        this.nextStudentId = nextStudentId;
    }

    public void studentInfo(){
        System.out.println (this.name + "has :" + this.numberOfCredits + "credits: " + "GPA of: " +this.gpa);
    }

    

}
