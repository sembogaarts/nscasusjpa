package nl.hu.dp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name = "reiziger")
public class Reiziger {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "reiziger_Sequence")
    @SequenceGenerator(name = "reiziger_Sequence", sequenceName = "REIZIGER_SEQ")
    private int reizgerid;
    private String voorletters;
    private String tussenvoegsel;
    private String achternaam;
    private Date geboortedatum;

    public String getVoorletters() {
        return voorletters;
    }

    public void setVoorletters(String voorletters) {
        this.voorletters = voorletters;
    }

    public String getTussenvoegsel() {
        return tussenvoegsel;
    }

    public void setTussenvoegsel(String tussenvoegsel) {
        this.tussenvoegsel = tussenvoegsel;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public Date getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(Date geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public String toString() {
        return "Reiziger: " + this.voorletters +  " " + this.tussenvoegsel + " " + this.achternaam;
    }

}
