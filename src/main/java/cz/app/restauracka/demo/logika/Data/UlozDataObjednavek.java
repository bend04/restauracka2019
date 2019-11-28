package cz.app.restauracka.demo.logika.Data;

import com.google.gson.Gson;
import cz.app.restauracka.demo.logika.obj.Objednavky;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

//TODO předělat na Mysql až bude čas.

@Component
public class UlozDataObjednavek {
    private static final String SAVE_FILE_NAME = "src/main/resources/LocalData/objednavky.json";
    @Autowired
    Objednavky objednavky;
    private Gson gson = new Gson();


    public void saveData() {
        String json = gson.toJson(objednavky.getSetObjednavek());
        try {
            Files.write(Paths.get(SAVE_FILE_NAME), json.getBytes());
        } catch (IOException e) {
            System.out.println("Error while saving data: " + e.getMessage());
        }
    }

  /*
    public void loadData() {

        try {
            List<String> lines = Files.readAllLines(Paths.get(SAVE_FILE_NAME));
            String jsonRaw = String.join("\n", lines);
            Type listOfPersonsType = new TypeToken<Set<Zamestnanec>>() {}.getType();
            zamestnanci = gson.fromJson(jsonRaw, listOfPersonsType);

            //personsTable.getItems().clear();
            //personsTable.getItems().addAll(persons);
        } catch (IOException e) {
            System.out.println("Error while saving data: " + e.getMessage());
        }
    }*/


}
