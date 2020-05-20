import java.nio.file.Files;
import java.util.HashMap;
import java.util.Scanner;


public class InfoSaver {
    private HashMap <String, String> info = new HashMap<>();
    private boolean exit;

    //Files.createFile()

    public void start(){
        Scanner sc = new Scanner(System.in);
        exit = true;
        System.out.println("Please, write INFO to get information about me");

        while (exit){
            String req = sc.nextLine();
            if(req.matches("^info")||req.matches("^INFO")){
                System.out.println(info);
                System.out.println("Write EXIT to close");
            }
            else if(req.matches("^exit") ||req.matches("^EXIT")){
                exit=false;
                break;
            }
            else {
                System.out.println("No such command. Write EXIT to close");
            }
        }

//была идея сделать все +- адекватно (записать информацию о себе в текстовый файл, потом вывести на экран), но...
// малёха не хватило времени и сил, очень неожиданно пришло задание.. хотя может быть я успею еще доделать

    }
    public void reg(String parameter, String value){ info.put(parameter, value);}
}
