/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.a.Tugas1WS;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ASUS
 */

@Controller
public class TheController {
    
    @RequestMapping("/hiling")
    public String tampil(
            @RequestParam(value = "nama") String isinama,
            @RequestParam(value = "lokasi") String isilokasi,
            @RequestParam(value = "gambar") String isigambar,
            Model kurir
    ){
        kurir.addAttribute("paketnama", isinama);
        kurir.addAttribute("paketlokasi", isilokasi);
        kurir.addAttribute("paketimg", isigambar);
        
        return "view";
    }
    
}

