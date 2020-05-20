public class Main {
    public static void main(String[] args) {
        InfoSaver i = new InfoSaver();
        i.reg("Name", "Liika Gumerova");
        i.reg("Hometown", "Kazan");
        i.reg("Hobby", "Badminton");
        i.reg("Hobby", "Drawing");
        i.reg("Aim 4 next year", "To became a web-programmer");
        i.start();
    }
}
