package com.heima.minio.test;

import com.heima.file.service.FileStorageService;
import com.heima.minio.MinIOApplication;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author HLxxx
 * @version 1.0
 */
@SpringBootTest(classes = MinIOApplication.class)
@RunWith(SpringRunner.class)
public class MinIOTest {
    @Autowired
    private FileStorageService fileStorageService;
    //MinIO に list.html ファイルをアップロードして、ブラウザでアクセスできるようにします。
    @Test
    public void test() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("/Users/dreammtank125/Downloads/list.html");
        String path = fileStorageService.uploadHtmlFile("", "list.html", fileInputStream);
        System.out.println(path);
    }
    /**
     * MinIO に list.html ファイルをアップロードして、ブラウザでアクセスできるようにします。
     * @param args
     */
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/dreammtank125/js/axios.min.js");

            //MinIO の接続情報を取得、MinIO クライアントを作成します。
            MinioClient minioClient = MinioClient.builder()
                    .credentials("minio", "minio123")
                    .endpoint("http://127.0.0.1:9000")
                    .build();
            //アップロード
            PutObjectArgs putObjectArgs = PutObjectArgs.builder()
                    .object("plugins/js/axios.min.js")//ファイル名
                    .contentType("text/js")//ファイルタイプ
                    .bucket("leadnews")
                    .stream(fileInputStream, fileInputStream.available(),-1)
                    .build();
            minioClient.putObject(putObjectArgs);
            //アクセスパス
           // System.out.println("localhost:9000/leadnews/list.html");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
