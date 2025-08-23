public class Subject {
    private String studentNumber;
    private double prelim;
    private double midterms;
    private double prefinals;
    private double finalsterms;

    Subject(String studentNumber, double prelim, double midterm, double preFinal, double finalsterms){
        this.studentNumber = studentNumber;
        this.prelim = prelim;
        this.midterms = midterm;
        this.prefinals = preFinal;
        this.finalsterms = finalsterms;
    }
    //Get
    public String getStudentNumber(){
        return studentNumber;
    }

    public double getPrelim(){
        return prelim;
    }

    public double getMidterms(){
        return midterms;
    }

    public double getPreFinals(){
        return prefinals;
    }

    public double getFinalsTermsTerms(){
        return finalsterms;
    }

    //Set
    public  void setStudentNumber(String studentNumber){
        this.studentNumber = studentNumber;
    }

    public void setPrelim(double prelim){
        this.prelim = prelim;
    }

    public void setMidterms(double midterms){
        this.midterms = midterms;
    }

    public void setPreFinals(double preFinals){
        this.prefinals = preFinals;
    }

    public void setFinalsTerms(double finalsterms){
        this.finalsterms = finalsterms;
    }

    void calculateAverage(){
        double sum = this.prelim + this.midterms + this.prefinals + this.finalsterms;
        double average = sum/4;
        System.out.println("Student Average is: " + average);
    }

    void displayInfo(){
        System.out.println("---------Profile---------");
        System.out.println("Student Number: " + this.studentNumber);
        System.out.println("Prelim: " + this.prelim);
        System.out.println("Midterms: " + this.midterms);
        System.out.println("PreFinals: " + this.prefinals);
        System.out.println("FinalTerms: " + this.finalsterms);
        System.out.println("-----------//------------");
    }
}