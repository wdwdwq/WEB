package org.example.motivation.entity;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Motivation {
    int id;
    String body;
    String source;

    Motivation(int id, String body, String source) {
        this.id = id;
        this.body = body;
        this.source = source;
    }

    @Override
    public String toString() {
        return "Motivation{" +
                "id=" + id +
                ", body=" + body + '\'' +
                ", source=" + source + '\'' +
                '}';
    }
}
