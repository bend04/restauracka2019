package cz.app.restauracka.demo.logika.ovladac;

import cz.app.restauracka.demo.logika.zam.Zamestnanci;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OvladacZam {

    @Autowired
    Zamestnanci zamestnanci;

    public void identifikace(String uzJmeno) {
        switch (zamestnanci.getZamestnanecPodleUzJmeno(uzJmeno).getPozice()) {
            case Kuchar:

                break;
            case Cisnik:
                // code block
                break;
            case Manager:

                break;
            case Boss:

                break;
            default:
                // code block
        }
    }





}
