package office_hour_01_27;
class data {
    private final String password = "123456";
    public String getPassword(){
        return password;
    }
    /*
        public void setPassWord(String password ){
            this.password =password;
        }
    */
    public final void printName(){
        System.out.println("Hasan");
    }
    public int printName(int a){
        return 10;
    }
}
public class FinalKeyword extends data {
    /*
    @Override
    public void printName(){
        System.out.println("Mohammed");
    }
*/
    // final long l;
    final int a =200;
    final static double b =100;
    public  static void main(String[] args) {
        final int num = 100;
        //  num = 300;
        System.out.println(num);
        final String username;
        System.out.println(b);
    }
}
