package chartlins;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Inventory {
    static String[] parseFile() throws Exception{

        File file = new File("inventory.txt");

        //Create a new scanner to parse the file

        Scanner scanner = new Scanner(file);

        //Loop through every line of the file to check how many entries there are

        int count = 0;

        while(scanner.hasNextLine()){

            String line = scanner.nextLine();

            //TODO remove line variable

            //System.out.println(line);
            count = count + 1;

        }

        //Loop through file a second time in order to extract the information into an array

        int count2 = 0;
        String[] lineArray = new String[count + 1];
        String[] lineInfo = new String[1];
        Scanner scanner2 = new Scanner(file);
        while(scanner2.hasNextLine()){
            String line = scanner2.nextLine();
            count2 = count2 + 1;
            lineInfo[0] = line;
            String lineInfos;
            lineInfos = Arrays.toString(lineInfo);
            lineArray[count2] = lineInfos;


        }

        //Return array of information

        return(lineArray);
    }
}
