package list.shopping.web.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.core.JsonProcessingException;

import list.shopping.web.service.FileService;

@RequestMapping("/download")
@Controller
public class DownloadController {
    @Autowired
    private FileService fileService;

    @PostMapping("/csv")
    public ResponseEntity<byte[]> getCsv() throws UnsupportedEncodingException, JsonProcessingException {
        return fileService.getCsvFile();
    }

}