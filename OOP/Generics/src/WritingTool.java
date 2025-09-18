public class WritingTool<T, U> { //Generics
    private final T tool;
    private final U price;

    WritingTool(T tool, U price){
        this.tool = tool;
        this.price = price;
    }

    public T getTool(){
        return this.tool;
    }

    public U getPrice(){
        return this.price;
    }

}
