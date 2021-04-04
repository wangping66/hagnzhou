package com.example.study.demo.gitstudy;

import java.util.*;
import java.util.stream.Collectors;

public class GitTest2 {

    public static void main(String[] args) throws InterruptedException {
        List<Question> questionList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (i <= 3) {
                Thread.sleep(100);
                questionList.add(new Question("testAA",
                        "testAA", new Date()));
            } else if(i <= 6) {
                Thread.sleep(500);
                questionList.add(new Question("testBB",
                        "testBB", new Date()));
            }else{
                Thread.sleep(200);
                questionList.add(new Question("testCC",
                        "testCC", new Date()));
            }
        }
        System.out.println("去重排序前:");
        for (Question question : questionList) {
            System.out.println(question);
        }
        List<Question> collect = questionList.stream()
                .sorted(Comparator.comparing(Question::getDate).reversed())
                .collect(Collectors.collectingAndThen(Collectors.toCollection(() ->
                        new TreeSet<>(Comparator.comparing(Question::getQuestionnairname)
                                .thenComparing(Question::getQuestionnairremark))), ArrayList::new));
        System.out.println("去重排序后:");
        for (Question question : collect) {
            System.out.println(question);
        }
    }
}
