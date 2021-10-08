package com.example.triathlonapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MyDatabase extends SQLiteOpenHelper {
    public MyDatabase(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE Joueurs (ID_Joueur	INTEGER PRIMARY KEY AUTOINCREMENT ," +
                "equipe	TEXT,Nom_jrs TEXT,Prenon_jrs	TEXT,Age_jrs	TEXT,sexe	TEXT," +
                " arrive INTEGER DEFAULT 9999 ,natation INTEGER DEFAULT 9999,velo INTEGER DEFAULT 9999," +
                "course INTEGER DEFAULT 999999 ,FOREIGN KEY(equipe) REFERENCES Equipes(equipe))");
        db.execSQL("CREATE TABLE Equipes (ID_eqp	INTEGER PRIMARY KEY AUTOINCREMENT ,equipe	TEXT,natio  TEXT )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS Joueurs");
        db.execSQL("DROP TABLE IF EXISTS Equipes");

        onCreate(db);

    }
    public void AjouterJoueur(String e , String n ,String p, String a , String s ){
        SQLiteDatabase db =this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("equipe",e);
        cv.put("Nom_jrs",n);
        cv.put("Prenon_jrs",p);
        cv.put("Age_jrs",a);
        cv.put("sexe",s);
        db.insert("Joueurs",null,cv);
        db.close();

    }
    public void AjouterEquipe(String e , String n ){
        SQLiteDatabase db =this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("equipe",e);
        cv.put("natio",n);
        db.insert("Equipes",null,cv);
        db.close();

    }


    public  void modiff(String id ,String arr , String natt ,String vell, String couu  ) {

        int ar = Integer.parseInt(arr);
        int nat = Integer.parseInt(natt);
        int vel = Integer.parseInt(vell);
        int cou = Integer.parseInt(couu);



        // String strSql = "update Joueurs set arrive = " + x +", natation = "+ y + ",velo = "+z+
        //    ", course = "+ c+ " WHERE ID_Joueur = "+ i ;
        // Cursor cursor = this.getReadableDatabase().rawQuery(strSql,null);

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put("ID_Joueur",id);
        contentValues.put("arrive",ar);
        contentValues.put("natation",nat);
        contentValues.put("velo",vel);
        contentValues.put("course",cou);
        db.update("joueurs",contentValues,"ID_Joueur = ?", new String[]{ id });
        db.close();




    }



   public List<ScoreData> readTop10(String s, String a1,String a2 , String ch ,int x ){
   //public List<ScoreData> readTop10( String s ){

        List<ScoreData> scores = new ArrayList<>();
        //String strSql = "select *  from joueurs  WHERE sexe="+ s + " AND Age_jrs>"+ a1 +" AND Age_jrs<"+a2 +" order by "+ch+" asc " ;
       //...........................
//       String strSql = "select *  from joueurs WHERE sexe = '"+s+"'    AND Age_jrs>'"+a1+"' AND Age_jrs<'"+a2+"' order by "+ch+" asc " ;
       String strSql = "select ID_Joueur,equipe, Nom_jrs , Prenon_jrs , Age_jrs , sexe ,\n" +
               "               time(arrive,'unixepoch') ,time(natation,'unixepoch'),time(velo,'unixepoch'),time(course,'unixepoch')  from joueurs WHERE sexe = '"+s+"'    AND Age_jrs>'"+a1+"' AND Age_jrs<'"+a2+"' order by "+ch+" asc " ;
        Cursor cursor = this.getReadableDatabase().rawQuery(strSql,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){

            ScoreData score = new ScoreData(cursor.getString(2 ), cursor.getString(3), cursor.getString(4), cursor.getString(1),cursor.getString(x));
            scores.add(score);
            cursor.moveToNext();
        }
      for (int i = 0 ; i < 11 ; i ++){

            ScoreData score = new ScoreData(" ", " "," " , " "," ");
            scores.add(score);
        }

        cursor.close();

        return scores;

    }
    public  int nbre( String x ){
        String ch ="select *  from joueurs WHERE sexe = '"+x+"' ";
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor = db.rawQuery(ch,null);
        int count = cursor.getCount();
        cursor.close();
        return count ;

    }
    public  int nbreage( String x , String y ){
        String ch ="select *  from joueurs WHERE Age_jrs>'"+x+"' AND Age_jrs<'"+y+"' ";
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor = db.rawQuery(ch,null);
        int count = cursor.getCount();
        cursor.close();
        return count ;

    }



    public List<StatData> stat10(String s){
        //public List<ScoreData> readTop10( String s ){

        List<StatData> stats = new ArrayList<>();
        //String strSql = "select *  from joueurs  WHERE sexe="+ s + " AND Age_jrs>"+ a1 +" AND Age_jrs<"+a2 +" order by "+ch+" asc " ;
        //...........................
//       String strSql = "select *  from joueurs WHERE sexe = '"+s+"'    AND Age_jrs>'"+a1+"' AND Age_jrs<'"+a2+"' order by "+ch+" asc " ;
        String strSql = "SELECT equipe ,COUNT(ID_Joueur),avg(Age_jrs)  , time(avg(arrive),'unixepoch')  FROM Joueurs WHERE sexe='"+s+"'  group BY equipe ORDER by avg(arrive)" ;
        Cursor cursor = this.getReadableDatabase().rawQuery(strSql,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){

            StatData stat = new StatData(cursor.getString(0 ), cursor.getString(1), cursor.getString(2), cursor.getString(3));
            stats.add(stat);
            cursor.moveToNext();
        }
//        for (int i = 0 ; i < 11 ; i ++){
//
//            StatData stat = new StatData(" ", " "," " , " ");
//            stats.add(stat);
//        }

        cursor.close();

        return stats;

    }

}


















