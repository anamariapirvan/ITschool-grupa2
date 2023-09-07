package ocaexercises;

public class Exceptions {

    public int getInt(){
        int returnVal=10;
        try{
            String [] students={"Harry", "Paul"};
            System.out.println(students[5]);
        } catch ( Exception e){
            System.out.println("About to return: " + returnVal);
            return returnVal;
        } finally {
            returnVal+=10;
            System.out.println("Return value is now: " + returnVal);
        }
        return returnVal;
    }

    public static void main(String[] args) {
        Exceptions main = new Exceptions();
        System.out.println("In Exceptions:  " + main.getInt());
    }
}
