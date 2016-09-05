package com.example.android.miwok;

import java.util.ArrayList;

public class ReportCard {
    public static final String GRADE_A = "A";
    public static final String GRADE_B = "B";
    public static final String GRADE_C = "C";
    public static final String GRADE_D = "D";
    public static final String GRADE_F = "F";

    private ArrayList<String> mathGrades;
    private ArrayList<String> musicGrades;

    public ReportCard() {
        mathGrades = new ArrayList<String>();
        musicGrades = new ArrayList<String>();
    }

    public void addGrade(String mathGrade, String musicGrade) {
        mathGrades.add(mathGrade);
        musicGrades.add(musicGrade);
    }

    public ArrayList<String> getMathGrades() {
        return mathGrades;
    }

    public void setMathGrades(ArrayList<String> mathGrades) {
        this.mathGrades = mathGrades;
    }

    public ArrayList<String> getMusicGrades() {
        return musicGrades;
    }

    public void setMusicGrades(ArrayList<String> musicGrades) {
        this.musicGrades = musicGrades;
    }

    @Override
    public String toString() {
        String output = null;
        for (int i = 0; i < mathGrades.size(); i++) {
            output = "math: " + mathGrades.get(i) + ", music: " + musicGrades.get(i) + "\n";
        }

        return output;
    }
}
