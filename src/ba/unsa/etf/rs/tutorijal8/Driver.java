package ba.unsa.etf.rs.tutorijal8;

import java.time.LocalDate;

public class Driver {
    private String ime, prezime, jmbg;
    private LocalDate datumRodjenja, datumZaposljenja;
    private int ID;

    public Driver(String ime, String prezime, String jmbg, LocalDate datumRodjenja, LocalDate datumZaposljenja) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.datumRodjenja = datumRodjenja;
        this.datumZaposljenja = datumZaposljenja;
    }

    public Driver(int ID, String ime, String prezime, String jmbg, LocalDate datumRodjenja, LocalDate datumZaposljenja) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.datumRodjenja = datumRodjenja;
        this.datumZaposljenja = datumZaposljenja;
        this.ID = ID;
    }

    public int getId() {
        return ID;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getJmb() {
        return jmbg;
    }

    public String getName() {
        return ime;
    }

    public LocalDate getBirthday() {
        return datumRodjenja;
    }

    public String getDatumZaposlenja() {
        return datumZaposljenja.toString();
    }

    public String getSurname() {
        return prezime;
    }
}
