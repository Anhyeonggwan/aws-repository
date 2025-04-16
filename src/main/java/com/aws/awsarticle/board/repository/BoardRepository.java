package com.aws.awsarticle.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aws.awsarticle.board.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long>{

}
