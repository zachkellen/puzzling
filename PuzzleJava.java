import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    Random randMachine = new Random();

    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> rolls = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            rolls.add(randMachine.nextInt(20) + 1);
        }
        return rolls;
    }

    public String getRandomLetter(){
        String[] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        int index = randMachine.nextInt(25);
        return letters[index];
    }

    public String generatePassword(){
        String newPassword = "";
        for(int i = 0; i < 8; i++){
            newPassword += getRandomLetter();
        }
        return newPassword;
    }

    public ArrayList<String> getNewPasswordSet(int length){
        ArrayList<String> passwords = new ArrayList<String>();
        for(int i = 0; i < length; i++){
            passwords.add(generatePassword());
        }
        return passwords;
    }
}