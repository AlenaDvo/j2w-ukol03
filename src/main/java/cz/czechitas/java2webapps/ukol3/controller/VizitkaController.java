package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {

    private final List<Vizitka> seznamVizitek = List.of(
            new Vizitka("Alena Dvořáková", "Oracle s.r.o.", "Karlovo náměstí 2097/9", "Praha 2", "120 00", "alenadvorakova@oracle.com", "00420 608 541 324", "www.oracle.com"),
            new Vizitka("Pavlína Sedláčková", "Google Ltd.", "Antonínova 5174", "Zlín", "760 01","pavlinasedlackova@google.com", "0420 608 745 963", "www.google.com"),
            new Vizitka("Helena Szewieczek", "Amazon a.s.", "Hlavní třída 439/71", "Havířov", "736 01", "helenaszewieczek@amazon.com", null, "www.amazon.com"),
            new Vizitka("Hana Martinková Kuchyňková", "Microsoft Ltd.", "Tomanova 1530/7", "Brno", "613 00", "hanamartinkovakuchynkova@microsoft.com", "0420 608 745 963", null),
            new Vizitka("Dagmar Podkulová", "Apple s.r.o.", "Hlavní třída 679/116", "Ostrava", "708 00", null, "0420 773 258 147", null)
            );
    @GetMapping("/")
    public ModelAndView seznam() {
        ModelAndView modelAndView = new ModelAndView("seznam");
        modelAndView.addObject("vizitky", seznamVizitek);
        return modelAndView;
    }

    @GetMapping("/detail/{index}")
    public ModelAndView detail(@PathVariable int index) {
        ModelAndView modelAndViewDetail = new ModelAndView("detail");
        modelAndViewDetail.addObject("detailVizitky", seznamVizitek.get(index));
        return modelAndViewDetail;
    }
}