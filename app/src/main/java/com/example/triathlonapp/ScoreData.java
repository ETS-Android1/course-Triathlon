package com.example.triathlonapp;

public class ScoreData {

    private  String Nom_jrs;
    private  String Prenon_jrs ;
    private String  equipe ;
    private String arrive;
    private String Age_jrs;

    public ScoreData(String name, String prenoms, String Age_jrs, String equipe, String temps) {
        this.setName(name);
        this.setPrenoms( prenoms);
        this.setEquipe (equipe);
        this.setTemps (temps);
        this.setAge_jrs (Age_jrs);
    }

    public String getName() {
        return Nom_jrs;
    }

    public void setName(String name) {
        this.Nom_jrs = name;
    }

    public String getPrenoms() {
        return Prenon_jrs;
    }

    public void setPrenoms(String prenoms) {
        this.Prenon_jrs = prenoms;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }




    public String getTemps() {
        return arrive;
    }

    public void setTemps(String temps) {
        this.arrive = temps;
    }



    public String getAge_jrs() {
        return Age_jrs;
    }

    public void setAge_jrs(String Age_jrs) {
        this.Age_jrs = Age_jrs;
    }

    //String arrivee =Integer.toString(arrive);


    public String toString1() {
        return Nom_jrs +" "+Prenon_jrs;
    }
    public String toString2() {
        return equipe ;
    }
    public String toString3() {
        return arrive;
    }
    public String toString4() {
        return Age_jrs ;
    }
}
