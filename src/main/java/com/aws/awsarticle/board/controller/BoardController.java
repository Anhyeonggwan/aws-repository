package com.aws.awsarticle.board.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.aws.awsarticle.board.dto.BoardRequest;
import com.aws.awsarticle.board.service.BoardService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @PostMapping("/save")
    public ResponseEntity<Void> postMethodName(@RequestBody BoardRequest boardRequest) {
        boardService.saveBoard(boardRequest);
        
        return ResponseEntity.ok().build();
    }
    

    // @PostMapping("/upload")
    // public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile multipartFile) {

    //     try {
    //         String imageUrl = boardService.uploadFile(multipartFile);
    //         return ResponseEntity.ok("File uploaded successfully! imageUrl: " + imageUrl);
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //         return ResponseEntity.ok("File upload failed!");
    //     }
    // }
    

}
