package cz.czechitas.java2webapps.ukol3.entity;

public class CelaAdresa {
    private final String ulice;
    private final String obec;

    private final String psc;

    public CelaAdresa(String ulice, String obec, String psc) {
        this.ulice = ulice;
        this.obec = obec;
        this.psc = psc;
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
}