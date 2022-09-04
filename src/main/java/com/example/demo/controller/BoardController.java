package com.example.demo.controller;

import com.example.demo.domain.Board;
import com.example.demo.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("board")
public class BoardController {

    private final BoardService boardService;

    // 메인 화면. 모든 board의 리스트를 보여준다.
    @GetMapping("main")
    public String main(Model model){
        model.addAttribute("list", boardService.getList());
        return "boards/main";
    }

    @GetMapping("upload")
    public String uploadForm(){
        return "boards/upload";
    }

    @PostMapping("upload")
    public String upload(Board board){
        System.out.println(board.toString());
        boardService.uploadBoard(board);
        return "redirect:/board/main";
    }

    @GetMapping("view")
    public String singleBoardView(Model model, Long boardId){
        model.addAttribute("view", boardService.getBoard(boardId));
        // 조회수 추가. 테스트 해보기
        Board foundBoard = boardService.getBoard(boardId);
//        foundBoard.addRead();
        boardService.addViewCnt(foundBoard);
        return "boards/view";
    }

    @PutMapping("update")
    public String update(Board board){
        boardService.updateBoard(board);
        System.out.println(board.toString());
        return "redirect:/board/main";
    }

    @DeleteMapping("delete")
    public String delete(Long boardId){
        boardService.deleteBoard(boardId);
        return "redirect:/board/main";
    }
}
