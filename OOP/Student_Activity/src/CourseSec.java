class CourseSec{

    //Attributes
    private String course;
    private String section;

    //Constractor
    CourseSec(String course, String section){
        this.course = course;
        this.section = section;
    }

    //Setters
    void setCourse(String course){
        this.course = course;
    }

    void setSection(String section){
        this.section = section;
    }

    //Getters
    String getCourse(){
        return this.course;
    }

    String getSection(){
        return this.section;
    }

    //Method display
    void display(){
        System.out.println(this.course + " " + this.section);
    }

}