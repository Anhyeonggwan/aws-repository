package com.aws.awsarticle.board.controller;

import org.springframework.http.ResponseEntity;

import com.aws.awsarticle.board.dto.BoardRequest;
import com.aws.awsarticle.board.service.BoardService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/")
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("Hello World");
    }
    

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
