package com.example.study.demo.gitstudy;

import java.util.Date;

public class Question {

    private String questionnairname;
    private String questionnairremark;
    private Date date;


    public Question(String questionnairname, String questionnairremark, Date date) {
        this.questionnairname = questionnairname;
        this.questionnairremark = questionnairremark;
        this.date = date;
    }

    public String getQuestionnairname() {
        return questionnairname;
    }

    public void setQuestionnairname(String questionnairname) {
        this.questionnairname = questionnairname;
    }

    public String getQuestionnairremark() {
        return questionnairremark;
    }

    public void setQuestionnairremark(String questionnairremark) {
        this.questionnairremark = questionnairremark;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionnairname='" + questionnairname + '\'' +
                ", questionnairremark='" + questionnairremark + '\'' +
                ", date=" + date +
                '}';
    }
}
