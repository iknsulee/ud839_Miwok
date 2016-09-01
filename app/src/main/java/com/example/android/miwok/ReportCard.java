package com.example.android.miwok;

import java.util.ArrayList;

public class ReportCard {
    private ArrayList<String> studentNames;
    private ArrayList<String> studentMathGrades;
    private ArrayList<String> studentMusicGrades;

    public ReportCard() {
        studentNames = new ArrayList<String>();
        studentMathGrades = new ArrayList<String>();
        studentMusicGrades = new ArrayList<String>();
    }

    public void addGrade(String name, String mathGrade, String musicGrade) {
        studentNames.add(name);
        studentMathGrades.add(mathGrade);
        studentMusicGrades.add(musicGrade);
    }

    public ArrayList<String> getStudentNames() {
        return studentNames;
    }

    public void setStudentNames(ArrayList<String> studentNames) {
        this.studentNames = studentNames;
    }

    public ArrayList<String> getStudentMathGrades() {
        return studentMathGrades;
    }

    public void setStudentMathGrades(ArrayList<String> studentMathGrades) {
        this.studentMathGrades = studentMathGrades;
    }

    public ArrayList<String> getStudentMusicGrades() {
        return studentMusicGrades;
    }

    public void setStudentMusicGrades(ArrayList<String> studentMusicGrades) {
        this.studentMusicGrades = studentMusicGrades;
    }

    @Override
    public String toString() {
        String output = null;
        for (int i = 0; i < studentNames.size(); i++) {
            output = "name: " + studentNames.get(i) + ", math: " + studentMathGrades.get(i) + ", music: " + studentMusicGrades.get(i) + "\n";
        }

        return output;
    }
}
