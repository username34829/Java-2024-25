public class Main {
    public static void main(String[] args){
        /**
        * @author: Joshan Lucamayan
        * @description: fandental java
        *
        */
        
        var name = "Joshan";
        var age = 19;
        var isCircle = false;
        var dollar = '$';
        System.out.println(dollar);
        /*
        if(isCircle){
            System.out.println("Is Circle: " + isCircle);
        }
        else{
            System.out.println("Is Circle: " + isCircle);
        }
        */
        
        String str = "";
        
        System.out.println(str instanceof String);
        
        str = "hello";
        
        System.out.println(str instanceof String);
        System.out.println(str);
        
        Integer num = null;
        Character ch = null;
        Double numd = null;
        
        ch = '$';
        num = 99;
        numd = 199.09;
        
        System.out.println("from " + numd + ch + " to " + num + ch);
        
    }
}