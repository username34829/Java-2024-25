class  BasicStudentInfo{

    //Attributes
    private String name;
    private String idNo;
    private CourseSec course_sec;
    private Contact contact;

    //Constuctor
    BasicStudentInfo(String name, String idNo, CourseSec course_sec, Contact contact){
        this.name = name;
        this.idNo = idNo;
        this.course_sec = course_sec;
        this.contact = contact;
    }

    //Setters
    void setName(String name){
        this.name = name;
    }

    void setIdNo(String idNo){
        this.idNo = idNo;
    }


    // Getters
    String getName(){
        return this.name;
    }

    String getIdNo(){
        return this.idNo;
    }

    //Method display
    void displayInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("ID Number: " + this.idNo);
        System.out.print("Course & Section: ");
        this.course_sec.display();
        System.out.print("Contact: ");
        this.contact.display();
    }

}