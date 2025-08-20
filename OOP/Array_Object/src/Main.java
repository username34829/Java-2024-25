public class Main {
    public static void main(String[] args) {
        Pen[] pens = {new Pen("Fountain", "Black", "Medium"),
                        new Pen("Ball", "Red", "Fine"),
                        new Pen("Fountain", "Blue", "Fine")};

        for(Pen pen : pens){
            if(pen.color.equalsIgnoreCase("Black")){
                pen.pen = "[Not Available right now]";
                pen.color = "[Not Available right now]";
                pen.nimbSize = "[Not Available right now]";
            }
        }

        for(Pen pen : pens){
            pen.available();
        }
    }
}