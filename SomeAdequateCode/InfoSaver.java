package SomeAdequateCode;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class InfoSaver {


    private boolean exit;

    public void start() throws IOException {

        this.createFile();
        Scanner sc = new Scanner(System.in);
        exit = true;
        System.out.println("Please, write INFO to get information about me");

        while (exit){
            String req = sc.nextLine();
            if(req.matches("^info")||req.matches("^INFO")){
                FileInputStream file = new FileInputStream("info.txt");
                int i;

                while((i=file.read())!= -1){
                    System.out.print((char)i);
                }
                System.out.println();
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
    }

    public void createFile() throws IOException {
        String fileData = "Now u r going to read some info about Liika Gumerova - student of the 1st course of ITIS. IDK how to present yourself, but there should be some useful information. I want to study Python because I think that I can and I want. Why Python, not Ruby or PHP? Because I choose this lang when I pass an \"EGE\" exam and I supposed that I will continue to learn it later. So... now I have a chance (I suppose ahah) and I will try to do all that will need to enroll to Python course. PS. sorry 4 my eng, but... my level is A1)))))";
        FileOutputStream fos = new FileOutputStream("info.txt");
        fos.write(fileData.getBytes());
        fos.flush();
        fos.close();
    }
}
