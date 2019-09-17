import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        BakeGoodsDB b1 = new BakeGoodsDB();
        do{
            System.out.println("Welcome to Brookely's Bkery App. \n"+
                    "We contain diary, eggs, peanuts, gluten, and soy in our products. \n" +
                    "To search for the food that you can eat please enter the name of the diet restrictions. \n"+
                    "To see a list of all our foods, please type \"all\".");
            String answer = userInput.nextLine();

            if(answer.equalsIgnoreCase("all")) {
                System.out.println(b1.displayAllFood());
            }else{
                System.out.println(b1.getAllergyList(answer));
            }

            System.out.println("Do you want to buy another bake good? ('Y'/'N')");
            String another = userInput.nextLine();
            if(another.equalsIgnoreCase("n")){
                break;
            }
        }while(true);

    }
}

// for(int row =0; row<50; row++){
//        for(int col=0; col >=row; col++){
//        if()
//        }
//
//        System.out.println("");
//        }
//