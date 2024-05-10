package cz.czechitas.java2webapps.ukol3.entity;

public class Vizitka {
    public String jmeno;
    public String firma;
    public String ulice;
    public String obec;

    public String psc;
    private CelaAdresa celaAdresa;
    public String email;
    public String telefon;
    public String web;

    public Vizitka(String jmeno, String firma, String ulice, String obec, String psc, String email, String telefon, String web) {
        this.jmeno = jmeno;
        this.firma = firma;
        this.ulice = ulice;
        this.obec = obec;
        this.psc = psc;
        this.email = email;
        this.telefon = telefon;
        this.web = web;
        this.celaAdresa = new CelaAdresa(ulice, obec, psc);
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

    public String getObec() {
        return obec;
    }

    public String getPsc() {
        return psc;
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

    public CelaAdresa getCelaAdresa() {
        return celaAdresa;
    }

    @Override
    public String toString() {
        return "Vizitka{" +
                "jmeno='" + jmeno + '\'' +
                ", firma='" + firma + '\'' +
                ", ulice='" + ulice + '\'' +

                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                ", web='" + web + '\'' +
                '}';
    }
}
