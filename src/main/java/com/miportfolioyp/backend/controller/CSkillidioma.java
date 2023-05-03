
package com.miportfolioyp.backend.controller;

import com.miportfolioyp.backend.entity.Skillidioma;
import com.miportfolioyp.backend.service.SSkillidioma;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("skillidioma") //localhost:8080/skill
public class CSkillidioma {
    
    @Autowired SSkillidioma siServ;
    
    @GetMapping("/lista")
    @ResponseBody 
    public List<Skillidioma> listaSkillsD(){
        return siServ.listaSkillsD();  
    }
   
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Skillidioma findSkillD(@PathVariable int id){
        return siServ.findSkillD(id);  
    }
    
    @PostMapping ("/new")
    @ResponseBody
    public String saveSkillD(@RequestBody Skillidioma habil){
        siServ.saveSkillD(habil);
        return "Skill creada";  
    }
    
    @PutMapping("/update/{id}")
    public String updateSkillD( @PathVariable int id, @RequestBody Skillidioma habil){
        siServ.updateSkillD(habil);  
        return "Skill actualizada"; 
    }  
     
    @DeleteMapping("/delete/{id}")
    public String deleteSkillD(@PathVariable int id){
        siServ.deleteSkillD(id);
        return "Skill borrada";
    }    
    
}
