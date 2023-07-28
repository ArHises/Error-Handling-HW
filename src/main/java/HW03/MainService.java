package HW03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainService {
    private List<String> paths;
    public void run(){
        Scanner scanner = new Scanner(System.in);
        SaveToFile saveToFile = new SaveToFile();
        this.paths = new ArrayList<>();

        while (true) {
            printOptions();
            String input = scanner.nextLine();
            if(input.equals("3")){
                break;
            } else if (input.equals("2")) {
                printFileData();
            } else if (input.equals("1")){
                addDataToFile();
            } else {
                System.out.println(" --- Try again ---");
            }
        }
    }
    private void printFileData() {
        for (String filePath : this.paths) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.err.println("Error reading file: " + filePath);
                e.printStackTrace();
            }
        }
    }
    private void addDataToFile() {
        Scanner scanner = new Scanner(System.in);
        SaveToFile saveToFile = new SaveToFile();

        System.out.println("Enter user's: Family-Name, Name, Fathers-Name, Birth-Date, Phone-Number, Sex");
        String[] data = scanner.nextLine().split("\\s+");
        try {
            saveToFile.saveUser(data);
            this.paths.add(data[0] + ".txt");
        } catch (UserDataExeption e){
            System.err.println(e.getMessage());
        }
    }
    private void printOptions(){
        System.out.println("Choose option by entering number:");
        System.out.println("1. Add user");
        System.out.println("2. Show all users");
        System.out.println("3. Exit");
    }
}
