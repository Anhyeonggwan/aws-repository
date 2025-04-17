package com.aws.awsarticle.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class S3Config {

    // @Value("${spring.cloud.aws.credentials.access-key}")
    // private String accessKey;

    // @Value("${spring.cloud.aws.credentials.secret-key}")
    // private String secretKey;

    // @Value("${spring.cloud.aws.region.static}")
    // private String region;

    // @Bean
    // public AmazonS3 amazonS3(){
    //     BasicAWSCredentials awsCredentials = new BasicAWSCredentials(accessKey, secretKey);
    //     return AmazonS3ClientBuilder.standard()
    //     .withRegion(region)
    //     .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
    //     .build();
    // }

}
