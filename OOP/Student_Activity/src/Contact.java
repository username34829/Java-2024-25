class Contact{
    //Attributes
    private int guardianNo;
    private String email;

    //Constructor
    Contact(int guardianNo, String email){
        this.guardianNo = guardianNo;
        this.email = email;
    }

    //Setters
    void setGuardianNo(int guardianNo){
        this.guardianNo = guardianNo;
    }

    void setEmail(String email){
        this.email = email;
    }

    //Getters\
    int getGuardianNo(){
        return this.guardianNo;
    }

    String getEmail(){
        return this.email;
    }

    //Method display
    void display(){
        System.out.println("No: " + guardianNo + ", Email: " + email);
    }

}