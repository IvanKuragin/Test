import java.io.File;

public class Main {

    public static void main(String[] args) {

        File file = new File("E:\\IDEA\\Projects\\Test", "file.bin");
        try {
            file.createNewFile();
        } catch (Exception error) {
            System.out.println("Error");
        }

        file.delete();
    }
}
