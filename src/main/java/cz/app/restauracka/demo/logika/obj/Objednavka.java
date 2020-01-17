package cz.app.restauracka.demo.logika.obj;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Objednavka {

    @Autowired
    MenuJidla menuJidla;
    int idStolu;

    private int cenaObjednavky = 0;
    private Set<Jidlo> jidloVObjednavce = new HashSet<>();

    public Objednavka(Set<Jidlo> jidloVObjednavce, int idStolu) {
        this.jidloVObjednavce = jidloVObjednavce;
        this.idStolu = idStolu;
    }

    public Set<String> getNazvyJidel() {
        return this.jidloVObjednavce.stream()
                .map(Jidlo::getNazev)
                .collect(Collectors.toSet());
    }

    public Set<String> getNazeJidlaACenu() {
        return this.jidloVObjednavce.stream()
                .map(Jidlo::getNazevACena)
                .collect(Collectors.toSet());
    }

    public void pridejDoObjednavky(Jidlo jidlo) {
        jidloVObjednavce.add(jidlo);
    }

    public void odeberZObjednavky(Jidlo jidlo) {
        jidloVObjednavce.remove(jidlo);
    }

    public Set getObsahObjednavky() {
        return jidloVObjednavce.stream()
                .map(Jidlo::getNazev)
                .collect(Collectors.toSet());
    }


    public int getCelkovaCena() {
        for (Jidlo jidlo : this.jidloVObjednavce) {
            cenaObjednavky = cenaObjednavky + jidlo.getCena();
        }
        return cenaObjednavky;
    }

}
