 class SubarnaException extends Exception{
    public SubarnaException(String message){
        super(message);
    }
}
public class ExceptionHandling {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try {
            j = 18 / i;
            if(j==0){
                throw new SubarnaException("i DONT WANT TO PRINT ZERO");
            }
        } catch (SubarnaException e) {
            System.out.println("Something went wrong: "+e);
        }

        System.out.println(j);
    }
}