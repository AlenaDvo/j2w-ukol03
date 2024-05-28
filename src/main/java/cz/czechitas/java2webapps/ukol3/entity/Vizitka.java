package cz.czechitas.java2webapps.ukol3.entity;

public class Vizitka {
    public String jmeno;
    public String firma;
    public String ulice;
    public String obecPsc;
    public String email;
    public String telefon;
    public String web;

    public Vizitka(String jmeno, String firma, String ulice, String obecPsc, String email, String telefon, String web) {
        this.jmeno = jmeno;
        this.firma = firma;
        this.ulice = ulice;
        this.obecPsc = obecPsc;
        this.email = email;
        this.telefon = telefon;
        this.web = web;
    }

    public Vizitka() {
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getFirma() {
        return firma;
    }

    public String getUlice() {
        return ulice;
    }

    public String getObecPsc() {
        return obecPsc;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getWeb() {
        return web;
    }

    public String getCelaAdresa() {return ulice + obecPsc;}

    @Override
    public String toString() {
        return "Vizitka{" +
                "jmeno='" + jmeno + '\'' +
                ", firma='" + firma + '\'' +
                ", ulice='" + ulice + '\'' +
                ", obecPsc='" + obecPsc + '\'' +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                ", web='" + web + '\'' +
                '}';
    }
}
