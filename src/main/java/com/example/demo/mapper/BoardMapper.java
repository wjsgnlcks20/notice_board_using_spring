package com.example.demo.mapper;

import com.example.demo.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardMapper {
    int boardCnt();
    List<Board> getList();
    void create(Board board);
    void update(Board board);
    void delete(Long boardId);
    Board getBoard(Long boardId);
    void addViewCnt(Board board);
}
