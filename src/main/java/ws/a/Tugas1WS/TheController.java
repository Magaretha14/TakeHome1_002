/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.a.Tugas1WS;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Blob;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author ASUS
 */

@Controller
public class TheController {
    
    public static String UPLOAD_DIRECTORY = System.getProperty("user.dir");
    
    @RequestMapping("/hiling")
    public String tampil(
            @RequestParam(value = "nama") String isinama,
            @RequestParam(value = "lokasi") String isilokasi,
            @RequestParam(value = "gambar") MultipartFile file,
            Model kurir
    ) throws IOException{
        StringBuilder fileNames = new StringBuilder();
        Path fileNameAndPath = Paths.get(UPLOAD_DIRECTORY, file.getOriginalFilename());
        fileNames.append(file.getOriginalFilename());
        Files.write(fileNameAndPath, file.getBytes());
        kurir.addAttribute("msg", file);
        
        kurir.addAttribute("paketnama", isinama);
        kurir.addAttribute("paketlokasi", isilokasi);
        
        return "view";
    }
    
}

