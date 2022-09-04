package com.example.demo.viewCount;

import com.example.demo.domain.Board;
import com.example.demo.mapper.BoardMapper;
import com.example.demo.service.BoardService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class viewCountTest {

    private BoardService boardService;

    @Test
    @DisplayName("페이지 조회 시 viewCount 올라가는지 확인")
    void viewCountTest(){
        Long testBoardId = 1L;

        boardService.addViewCnt(boardService.getBoard(testBoardId));
        Board board1 = boardService.getBoard(testBoardId);

        System.out.println(board1.getRead());
    }

}
