public class lowToHigh {
    public static void main(String[] args){

        int[] num = {5, 1, 8, 3, 7};
        int target;
        int max = 0;

        //CHALLENGE:
        //Sort from highest to lowest e.g 8 7 5 3 1
        //Sort from lowest to highest e.g 1 3 5 7 8

        /*
        PLAN:
        0. Find the max of arrays and use it as a target or checking
        1. Find the lowest
        2. Then find after the lowest
        3. Continue until u reach the end
         */
        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num.length; j++){
                if(max < num[j]){
                    max = num[j];
                    break;
                }
            }
        }

        System.out.print("From highest to lowest: ");
        target = max;
        for(int i = 0; i < max; i++){
            for(int j = 0; j < num.length; j++){
                if(target == num[j]){
                    System.out.print(num[j]+" ");
                    break;
                }
            }
            target--;

        }

        System.out.println();

        System.out.print("From lowest to highest: ");
        target = 0;
        for(int i = 0; i < max + 1; i++){
            for(int j = 0; j < num.length; j++){
                if(target == num[j]){
                    System.out.print(num[j]+" ");
                    break;
                }
            }
            target++;

        }


    }

}
