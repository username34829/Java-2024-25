public class Pencil extends WritingTool{
    //we are going to method override this pencil class
    //because pencil can't only 'use for' writing but also draw

    @Override
    void useFor(){ //This method is coming from super class (Writing Tool class)
        System.out.println("Use for Drawing");
    }

}
