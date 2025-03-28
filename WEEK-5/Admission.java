class Student{
    string name;
    double percentage;

    public Student(string name,double percentage){
        this.name=name;
        this.percentage=percentage;
        void getEligibility(){
            System.out.println(name+"must meet the eligibility criteria");
        }
    }
        class UGStudent extends Student{
        public UGStudent(string name,double percentage){
            super(name,percentage);
        }
    }
    @override
    void Eligibility(){
        if(percentage>=60){
            System.out.println(name+"is eligible for UG course");
        }else{
            System.out.println(name+"is not eligible for UG course");
        }
        }
        class PGStudent extends Student{
        public PGStudent(name double percentage){
            super(name,percentage);
        }
    }
    @override
    void Eligibility(){
        if(percentage>=70){
            System.out.println(name+"is eligible for the PG course");
        }else{
            System.out.println(name+"is not eligible for the PG course");
        }
        }
        public class Admission{
            public static void main(String[]args){
                UGStudent ugstudent=new UGStudent("abc",99);
               PGtudent ugstudent=new UGStudent("pqr",33);
               ugstudent.getEligibility();
               pgstudent.getEligibility();
            }
        }
    }
