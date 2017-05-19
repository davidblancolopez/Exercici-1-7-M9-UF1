
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Usuario
 */
public class TestFileAcces {

    public static void main(String[] args) throws Exception {
        String home = System.getProperty("user.dir");
        System.out.println(home);
        
//        File fichero = new File("C:\\Test.txt");


        File fichero = new File(home + File.separator + "Test.txt");
        
        
        FileReader fr = new FileReader(fichero);
        BufferedReader buffer = new BufferedReader(fr);
        String cad;
        while ((cad = buffer.readLine()) != null) {
            System.out.println(cad);

        }
    }

}
