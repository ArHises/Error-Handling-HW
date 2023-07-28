package HW03;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveToFile {
    private CreateUser createUser = new CreateUser();
    public void saveUser(String[] data) throws UserDataExeption{
        User user = createUser.createUser(data);
        saveToFile(user,user.getFamilyName() + ".txt");
    }

    private void saveToFile(User user, String path){
        File file = new File(path);
        try (FileWriter fileWriter = new FileWriter(file,true)){

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(user.toString() + "\n");

            bufferedWriter.close();

            System.out.println("User added successfully!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
