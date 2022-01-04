package com.wildcodeschool.myProjectWithSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to the SHIELD";
    }
    
    @GetMapping("/avengers/assemble")
    public String avenger() {
   	 return "Avengers... Assemble";
    }
    
    @GetMapping("/secret-bases")
    public String showSecretBases() {
   	 return "List of secret bases : Lyon, Marseille, Barcelone, Paris, Lille, La Loupe, Biarritz, Bordeaux, Nantes , Orléans, Reims, Strasbourg, Toulouse...";	
    }
    
    
}