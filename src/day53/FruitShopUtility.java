package day53;

public class FruitShopUtility {
    public static void main(String[] args) {
        Fruit f1 = new Apple("crispy but tasteless", "hot red", "Gala");
        Fruit f2 = new Orange("sour", "orange", 12);
        displayFruit(f1);
        displayFruit(f2);
        digestBetter(f1);
        digestBetter(new Apple("tasteless", "red","Golden"));
        //can we directly pass obj IS-A Fruit rather than saving it intp a varriable
        displayFruit(new Apple("tasteless", "red","Golden"));

        Fruit x= getMyFavoriteFruit();
        x.getDigested();
        System.out.println("favorite food " + x);
        System.out.println("getFavoriteByType(1) = " + getFavoriteByType(1));
        System.out.println("getFavoriteByType(2) = " + getFavoriteByType(2));
        System.out.println("getFavoriteByType(3) = " + getFavoriteByType(3));
    }
//create a method called digestBetter
    //it accept a Fruit as parameter  type
    //and inside the method, it will digest the Fruit object 4 time then displayInformation
    // displayFruit
public static void digestBetter (Fruit anyFruit){
    for (int i = 0; i < 4; i++) {
        System.out.println(anyFruit);
    }
}
    public static Fruit getMyFavoriteFruit(){
       Fruit f=new Orange("crispy", "orange",100);
        return f;

    }
    //create a static method getFavoriteByType()
    //it has one int parameter
    //return fav apple  oobj if type is one
    //orange obj if type 2

    public static Fruit getFavoriteByType(int type){
        if (type==1){
            return new Apple("crispy but tasteless", "hot red", "Gala");
        }else if(type==2){
            return new Orange("sour", "orange", 12);
        }else{
            //we can return null for any method that return reference type
            //because null can be assigned to a reference type variable
            return null;
        }
    }

    //create a static method called getMyFavoriteFruit
    //accept no parameter and return your Favorite Fruit Object


    //create a mthod that accept 3 parameter
    public static void displayFruit(Fruit blabla) {

        System.out.println("Displaying fruit \n" + blabla.toString());

    }


    // sellFruit


    // buyFruit


}