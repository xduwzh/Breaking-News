package com.hang.controller;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import com.hang.pojo.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

@RestController
public class FileUploadController {
    @Value("${azure.storage.connection-string}")
    private String connectionString;

    @PostMapping("/upload")
    public Result<String> upload(MultipartFile file) throws IOException {
        // Get Blob Client
        BlobServiceClient blobServiceClient = new BlobServiceClientBuilder()
                .connectionString(connectionString)
                .buildClient();
        BlobContainerClient containerClient = blobServiceClient.getBlobContainerClient("images");

        // Generate unique filename
        String originalFilename = file.getOriginalFilename();
        String filename = UUID.randomUUID().toString() + originalFilename.substring(originalFilename.lastIndexOf("."));
        BlobClient blobClient = containerClient.getBlobClient(filename);

        // Upload
        blobClient.upload(file.getInputStream(), file.getSize(), true);

        // Return file URL
        String fileUrl = blobClient.getBlobUrl();
        return Result.success(fileUrl);
    }

}
