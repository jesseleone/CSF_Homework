import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class HomeworkLessonTwo {

    public static void main(String[] args){
        peopleInput();
    }

    public static void peopleInput(){
        ArrayList<String> peopleArray = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students in the class?");
        int peopleAmount = scanner.nextInt();
        for(int i=0;i<peopleAmount;i++){
            System.out.println("Enter the name of a student:");
            String name = scanner.next();
            peopleArray.add(name);
        }
        ArrayList<String> pairedArray = new ArrayList<String>();
        for(int i=0; i < (peopleAmount / 2);i++) {
            Random generator = new Random();
            int randomPerson = generator.nextInt(peopleArray.size()-1) + 1;
            String pair;
            if(peopleArray.size()==3){
                pair = "(" + peopleArray.get(0) + "," + peopleArray.get(1) + "," + peopleArray.get(2) + ")";
            }
            else
            {
                pair = "(" + peopleArray.get(0) + "," + peopleArray.get(randomPerson) + ")";
            }
            peopleArray.remove(0);
            peopleArray.remove(randomPerson - 1);
            pairedArray.add(pair);
        }
        System.out.println(pairedArray);
    }
}


