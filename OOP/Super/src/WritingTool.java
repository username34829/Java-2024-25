public class WritingTool {

    String name;
    String description;

    WritingTool(String name, String description){
        this.name = name;
        this.description = description;
    }

    void useFor(){
        System.out.println("Use for Writing");
    }

    void showDescription(){
        System.out.println("Name: " + this.name);
        System.out.println("Description: " + this.description);
    }
}
