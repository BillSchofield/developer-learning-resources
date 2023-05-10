package developer_learning_resources.coding_practices.testing_loops;

import java.util.HashMap;
import java.util.Map;

public class Menu {


    public void chooseOption() {

        Map<String, Option> choiceToOption = new HashMap<>();
        choiceToOption.put("1", new ListBookOption());

        String input = "Q";
        if (choiceToOption.containsKey(input)){
            choiceToOption.get(input).execute();
        } else {
            switch (input){
                case "2":
                    // Something else

            }

        }


    }

    public boolean shouldQuit() {
        return false;
    }
}
