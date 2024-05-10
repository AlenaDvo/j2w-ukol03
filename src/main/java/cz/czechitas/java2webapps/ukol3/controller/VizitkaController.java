package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {

    private final List<Vizitka> seznamVizitek = List.of(
            new Vizitka("Alena Dvořáková", "Oracle s.r.o.", "Karlovo náměstí 32/856", "Praha 2", "120 00", "alenadvorakova@oracle.com", "00420 608 541 324", "www.oracle.com"),
            new Vizitka("Pavlína Sedláčková", "Google Ltd.", "Nové náměstí 324/58", "Zlín", "760 01","pavlinasedlackova@google.com", "0420 608 745 963", "www.google.com"),
            new Vizitka("Helena Szewieczek", "Amazon a.s.", "Václavské náměstí 539/25", "Havířov", "736 01", "helenaszewieczek@amazon.com", null, "www.amazon.com"),
            new Vizitka("Hana Martinková Kuchyňková", "Microsoft Ltd.", "Dlouhá 2/856", "Brno", "602 10", "hanamartinkovakuchynkova@microsoft.com", "0420 608 745 963", null),
            new Vizitka("Dagmar Podkulová", "Apple s.r.o.", "Červeňanského 258/78", "Ostrava", "700 30", null, "0420 773 258 147", null)
            );
    @GetMapping("/")
    public ModelAndView seznam() {
        ModelAndView modelAndView = new ModelAndView("seznam");
        modelAndView.addObject("vizitky", seznamVizitek);
        return modelAndView;
    }

    @GetMapping("/detail")
    public String detail() {
        return "detail";
    }
}