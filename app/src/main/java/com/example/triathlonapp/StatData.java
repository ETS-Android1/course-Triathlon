package com.example.triathlonapp;

public class StatData {


    private  String equipe;
    private  String nbrJrs ;
    private String  moyAge ;
    private String tempMoy;

    public StatData(String eq, String nbr, String moyA, String tempM) {
        this.setEq(eq);
        this.setNbr( nbr);
        this.setMoyA (moyA);
        this.setTempM (tempM);
    }

    public String getEq() {
        return equipe;
    }

    public void setEq(String eq) {
        this.equipe = eq;
    }

    public String getNbr() {
        return nbrJrs;
    }

    public void setNbr(String Nbr) {
        this.nbrJrs = Nbr;
    }






    public String getMoyA() {
        return moyAge;
    }

    public void setMoyA(String MoyA) {
        this.moyAge = MoyA;
    }



    public String getTempM() {
        return tempMoy;
    }

    public void setTempM(String TempM) {
        this.tempMoy = TempM;
    }

    //String arrivee =Integer.toString(arrive);


    public String toString1() {
        return " " + equipe      ;
    }
    public String toString2() {
        return nbrJrs ;
    }
    public String toString3() {
        return moyAge;
    }
    public String toString4() {
        return tempMoy +" ";
    }
}
