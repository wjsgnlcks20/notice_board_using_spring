package com.example.demo.service;

import com.example.demo.domain.Board;
import com.example.demo.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly=true)
public class BoardService {

    private final BoardMapper boardMapper;

    public int cntBoards(){
        return boardMapper.boardCnt();
    }

    public List<Board> getList(){
        return boardMapper.getList();
    }

    @Transactional
    public void uploadBoard(Board board){
        boardMapper.create(board);
    }

    @Transactional
    public void updateBoard(Board board){
        boardMapper.update(board);
    }

    @Transactional
    public void deleteBoard(Long boardId){
        boardMapper.delete(boardId);
    }

    public Board getBoard(Long boardId) {
        return boardMapper.getBoard(boardId);
    }

    public void addViewCnt(Board board) {
        boardMapper.addViewCnt(board);
    }
}
