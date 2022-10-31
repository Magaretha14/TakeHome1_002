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
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author ASUS
 */

@Controller
public class TheController {
    
    @RequestMapping(value = "/hiling", method = RequestMethod.POST)
    public String tampil(
            @RequestParam(value = "nama") String isinama,
            @RequestParam(value = "lokasi") String isilokasi,
            @RequestParam(value = "gambar") MultipartFile file,
            Model kurir
    ) throws IOException{
        byte[] gmbr = file.getBytes();
        String base64gmbr = Base64.encodeBase64String(gmbr);
        String gmbrlink = "data:image/*;base64,".concat(base64gmbr);
        
        kurir.addAttribute("paketnama", isinama);
        kurir.addAttribute("paketlokasi", isilokasi);
        kurir.addAttribute("msg", gmbrlink);
        
        return "view";
    }
    
}

