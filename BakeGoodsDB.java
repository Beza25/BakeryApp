import java.util.*;

public class BakeGoodsDB {
    // public BakeGoods(String name, double price, Date date, int quantity)
    private BakeGoods bakeGood;


    //Add bake goods in an array list called bakeGoods
    ArrayList<BakeGoods> bakeGoods = new ArrayList<BakeGoods>();
    //
    HashMap<String, ArrayList<BakeGoods>> allergiesBakeGood= new HashMap<String, ArrayList<BakeGoods>>();

    /**
     * Adds bake goods objects in the bakeGoods arraylist
     * Specifies the different allergies in the bake goods
     *
     */

    public BakeGoodsDB(){
        bakeGoods.add(new BakeGoods("Banana Bread", 5.0, new Date(2019, 9, 24), 50)); //0
        bakeGoods.add(new BakeGoods("White Bread", 8.0, new Date(2019,10,1) ,100)); //1
        bakeGoods.add(new BakeGoods("MultiGrain Bread", 10.0, new Date(2019,9, 25),10));//2
        bakeGoods.add(new BakeGoods("Muffins", 6.0, new Date(2019,9, 20),5));//3
        bakeGoods.add(new BakeGoods("Cinnamon Bread ", 3.0, new Date(2019,9, 22),25));//4
        bakeGoods.add(new BakeGoods("Savory Rolls", 2.5, new Date(2019,9, 23),15));//5
        bakeGoods.add(new BakeGoods("Chocolate Croissant ", 6.5, new Date(2019,9, 21),80));//6
        bakeGoods.add(new BakeGoods("Regular Croissant", 6.5 , new Date(2019,9, 20),12));             //7
        bakeGoods.add(new BakeGoods("Brownie", 20, new Date(2019,9, 25),200));    //8
        bakeGoods.add(new BakeGoods("Bagels", 2.5, new Date(2019,9, 30),100));     //9
        bakeGoods.add(new BakeGoods("Corn Bread", 75.0, new Date(2019, 9, 17), 5000)); //10
        bakeGoods.add(new BakeGoods("Not White Bread", .1, new Date(2019,10,25) ,1000)); //11
        bakeGoods.add(new BakeGoods("Cookies", 1.0, new Date(2019,9, 29),60));//12
        bakeGoods.add(new BakeGoods("Cake", 600, new Date(2019,9, 24),8));//13
        bakeGoods.add(new BakeGoods("Flat Bread", 31.0, new Date(2019,9, 30),250));//14

        //All of our bakegoods have dairy
        allergiesBakeGood.put("dairy", new ArrayList<BakeGoods>() {
            {
                for(BakeGoods b : bakeGoods)
                    add(b);
            }
        });
        //goods that contain eggs
        allergiesBakeGood.put("eggs", new ArrayList<BakeGoods>(){
            {
                for (int i = 4; i < bakeGoods.size(); i++){
                    if( i < 9){
                        add(bakeGoods.get(i));
                    }
                }
            }
        });
        //goods that contain nuts
        allergiesBakeGood.put("peanuts", new ArrayList<BakeGoods>(){
            {
                add(bakeGoods.get(0));
                add(bakeGoods.get(9));
            }
        }) ;
        //goods that contain gulten
        allergiesBakeGood.put("gluten", new ArrayList<BakeGoods>(){
            {
                add(bakeGoods.get(1));
                add(bakeGoods.get(2));
                add(bakeGoods.get(7));
                add(bakeGoods.get(3));
                add(bakeGoods.get(0));
            }
        });
        //bake goods with soy
        allergiesBakeGood.put("soy", new ArrayList<BakeGoods>(){
            {
                add(bakeGoods.get(9));
                add(bakeGoods.get(6));
                add(bakeGoods.get(7));

            }
        });
    }
    //Search goods that have your allergy

    /**
     * This method takes in allergy and returns list of goods with allergy
     * @param allergy : user's input
     * @return List of goods that have the allergy as a string
     */
    public String getAllergyList(String allergy){
       return  "The bake goods with " + allergy + " are  " + allergiesBakeGood.get(allergy).toString() + ".";
    }

    /**
     * This method displays all food we have
     * @return a string of bake goods
     */
    public String displayAllFood(){
        String str = "";
        for(int i= 0; i< bakeGoods.size(); i++){
            str += bakeGoods.get(i).toString() +"  " ;

        }
        return str;

    }


    public BakeGoods getBakeGood() {
        return bakeGood;
    }

    public void setBakeGood(BakeGoods bakeGood) {
        this.bakeGood = bakeGood;
    }

    public ArrayList<BakeGoods> getBakeGoods() {
        return bakeGoods;
    }

    public void setBakeGoods(ArrayList<BakeGoods> bakeGoods) {
        this.bakeGoods = bakeGoods;
    }

    public HashMap<String, ArrayList<BakeGoods>> getBakeGoodsDB() {
        return allergiesBakeGood;
    }

    public void setBakeGoodsDB(HashMap<String, ArrayList<BakeGoods>> bakeGoodsDB) {
        this.allergiesBakeGood = bakeGoodsDB;
    }
}
