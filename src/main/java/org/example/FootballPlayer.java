package org.example;


import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@Builder
public class FootballPlayer {

    private String name;
    private int age;
    private String position;
    private int goalsScored;

    public FootballPlayer(String name, int age, String position, int goalsScored) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.goalsScored = goalsScored;
    }


    @Override
    public String toString() {
        return super.toString();
    }




}


