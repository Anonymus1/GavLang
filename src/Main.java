import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        run(args[0]);
    }

    public static void convert(String[][] preGav){

    }

    public static String[][] run(String arg) {

        String gavFile = arg;
        BufferedReader bR = null;
        BufferedReader newBR = null;
        String line = "";
        String split = " ";
        int i = 0;
        int lines = 0;

        try {

            bR = new BufferedReader(new FileReader(gavFile));
            while ((line = bR.readLine()) != null) {
                lines++;
            }
            //make max length
            String[][] lineParse = new String[lines][16];

            newBR = new BufferedReader(new FileReader(gavFile));
            while ((line = newBR.readLine()) != null) {
                // use comma as separator
                String[] gavParse = line.split(split);
                lineParse[i] = gavParse;

                for(int j = 0; j < gavParse.length; j++) {
                    System.out.println(lineParse[i][j]);
                }
                i++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bR != null) {
                try {
                    bR.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    //LOOOK HERE
        return null;
    }
}
