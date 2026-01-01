import java.sql.SQLOutput;

enum Status{
    Success,Pending,Failed,Running;
}
public class Enumclass {
    public static void main(String[] args){

        Status ss=Status.Success;
        switch (ss){
            case Failed -> System.out.println("ok bro failed");
            case Running -> System.out.println("ok bro running");
            case Pending -> System.out.println("ok bro Pending");
            case Success -> System.out.println("ok bro sucess");

        }
        }

}
