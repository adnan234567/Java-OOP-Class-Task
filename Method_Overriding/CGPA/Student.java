package Method_Overriding.CGPA;

class Student{
    String name;
    double[] grades;
    static int[] credits = {3,2,1,2,3};
    int totalCredit = 11 ;
    double cgpa;
    Student(String name , double[] number){
        this.name = name ;
        this.grades = new double[5];
        for(int i = 0 ; i < 5 ; i++){
            grades[i] = number[i];
        }
    }
    public double calculateCgpa(){
        double totalMarks = 0 ;
        for(int i = 0 ; i < 5 ; i++){
            totalMarks+=grades[i]*credits[i];
        }

        return (totalMarks/totalCredit);
    }
    public void displayCgpa(){
        System.out.println("cgpa of "+name+":"+calculateCgpa());
    }
}