package com.aws.awsarticle.board.service;

import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.aws.awsarticle.board.dto.BoardRequest;
import com.aws.awsarticle.board.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {

    // @Value("${spring.cloud.aws.s3.bucket}")
    // private String bucket;

    private final BoardRepository boardRepository;
    //private final AmazonS3 amazonS3;

    public void saveBoard(BoardRequest boardRequest){
        boardRepository.save(boardRequest.toEntity());
    }

    // public String uploadFile(MultipartFile multipartFile) throws IOException{

    //     String filename = UUID.randomUUID().toString();

    //     // 메타 데이터 설정
    //     ObjectMetadata metadata = new ObjectMetadata();
    //     metadata.setContentType(multipartFile.getContentType());
    //     metadata.setContentLength(multipartFile.getSize());

    //     // S3에 파일 업로드 요청 생성
    //     PutObjectRequest objectRequest = new PutObjectRequest(bucket, filename, multipartFile.getInputStream(), metadata);

    //     // S3에 파일 업로드
    //     amazonS3.putObject(objectRequest);

    //     return getPublicUrl(filename);
    // }

    // private String getPublicUrl(String fileName){
    //     return String.format("https://%s.s3.%s.amazonaws.com/%s", bucket, amazonS3.getRegionName(), fileName);
    // }
}
