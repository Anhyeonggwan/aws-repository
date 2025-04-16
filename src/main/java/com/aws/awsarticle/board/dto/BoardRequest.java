package com.aws.awsarticle.board.dto;

import com.aws.awsarticle.board.entity.Board;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class BoardRequest {

    private String title;
    private String content;

    public Board toEntity(){
        return Board.builder()
        .title(this.title)
        .content(this.content)
        .build();
    }

}
