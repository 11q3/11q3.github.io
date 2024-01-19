package Archive.service;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;

@Service
public interface DocumentService {
    ResponseEntity<InputStreamResource> downloadDocument(@RequestParam String fileName) throws FileNotFoundException;
    String saveDocument(MultipartFile file) throws IOException;
    String deleteDocument(String fileName);
}
