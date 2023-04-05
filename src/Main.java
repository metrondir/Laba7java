import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> SurnamePlaceBirthCatalog = new ArrayList<>(20);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputSurname;
        String inputPlaceBirthday;
        String inputProgramOption = null;
        boolean flag = true;

        SurnamePlaceBirthCatalog.add("Shevchenko");
        SurnamePlaceBirthCatalog.add("Lviv");
        SurnamePlaceBirthCatalog.add("Gaba");
        SurnamePlaceBirthCatalog.add("Vinytsya");
        SurnamePlaceBirthCatalog.add("Pasichnyi");
        SurnamePlaceBirthCatalog.add("Charkiv");
        SurnamePlaceBirthCatalog.add("Zinchenko");
        SurnamePlaceBirthCatalog.add("Cherivtsi");
        SurnamePlaceBirthCatalog.add("Rebrov");
        SurnamePlaceBirthCatalog.add("Luhansk");

        while (flag) {
            System.out.println("Enter the option of program");
            System.out.println("Option '0'  - exit the program");
            System.out.println("Option '1'  - search the item");
            System.out.println("Option '2'  - insert new record");
            System.out.println("Option '3'  - delete item");
            System.out.println("Option '4'  - review the catalog");
            inputProgramOption = br.readLine();

            if (inputProgramOption.equals("0")) {
                flag = false;
            } else if (inputProgramOption.equals("1")) {
                System.out.println("To search the item enter the surname: ");
                inputSurname = br.readLine();
                if (SurnamePlaceBirthCatalog.contains(inputSurname)) {
                    int j = SurnamePlaceBirthCatalog.indexOf(inputSurname) + 1;
                    System.out.println("Searched item " + inputSurname + " " + SurnamePlaceBirthCatalog.get(j));
                } else {
                    System.out.println("Sorry, but we do not have such item");
                }
            } else if (inputProgramOption.equals("2")) {
                System.out.println("Enter the surname you want to insert: ");
                inputSurname = br.readLine();
                SurnamePlaceBirthCatalog.add(inputSurname);
                System.out.println("Enter the place of birth you want to insert: ");
                inputPlaceBirthday = br.readLine();
                SurnamePlaceBirthCatalog.add(inputPlaceBirthday);
                System.out.println("Record has been inserted successfully!");
            } else if (inputProgramOption.equals("3")) {
                System.out.println("To delete the item enter the surname: ");
                inputSurname = br.readLine();
                if (SurnamePlaceBirthCatalog.contains(inputSurname)) {
                    int j = SurnamePlaceBirthCatalog.indexOf(inputSurname);
                    SurnamePlaceBirthCatalog.remove(j + 1);
                    SurnamePlaceBirthCatalog.remove(inputSurname);
                    System.out.println("The record has been deleted successfully!");
                } else {
                    System.out.println("Sorry, but we do not have such item");
                }
            } else if (inputProgramOption.equals("4")) {
                System.out.println("Surname - Place of Birth");
                for (int i = 0; i < SurnamePlaceBirthCatalog.size(); i += 2) {
                    System.out.println(SurnamePlaceBirthCatalog.get(i) + " - " + SurnamePlaceBirthCatalog.get(i + 1));
                }
            } else {
                System.out.println("Please enter the correct option");
            }
        }
    }
}