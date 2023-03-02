package Lab10;

public class Lab10_Inheritance_OfferedCourse extends Lab10_Inheritance_Course {
   // TODO: Declare private fields - instructorName, term, classTime
   protected String instructorName;
   protected String term;
   protected String classTime;
   
   // TODO: Define mutator methods -
   //      setInstructorName(), setTerm(), setClassTime()
   public void setInstructorName(String input){
     instructorName = input;
   }
   public void setTerm(String input){
     term = input;
   }
   public void setClassTime(String input){
     classTime = input;
   }


   // TODO: Define accessor methods -
   //      getInstructorName(), getTerm(), getClassTime()
   public String getInstructorName(){
     return instructorName;
   }
   public String getTerm(){
     return term;
   }
   public String getClassTime(){
     return classTime;
   }
   
   
}