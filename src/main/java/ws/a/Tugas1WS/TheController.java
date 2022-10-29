/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.a.Tugas1WS;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ASUS
 */

@Controller
public class TheController {
    
    @RequestMapping("/hiling")
    public String tampil(){
        return "view";
    }
    
}

