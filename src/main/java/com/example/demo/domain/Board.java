package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
public class Board {
    private Long boardId;
    private String title;
    private String name;
    private String content;
    private int read;
    private LocalDateTime localDateTime;
    private Long memberId;

    public void addRead() {
        read += 1;
    }
    @Override
    public String toString(){
        return "boardId = " + boardId + "\n"
                + "title = " + title + "\n"
                + "name = " + name + "\n"
                + "content = " + content;
    }
}
