/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.com.fauzanvic3.string.modifier;

import java.util.List;
import java.util.Scanner;
import my.com.fauzanvic3.string.modifier.document.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Fauzan
 */
@SpringBootApplication
public class Main implements CommandLineRunner{
    
    private Logger log = LoggerFactory.getLogger(getClass().getName());
    
    public static void main(String args[]){
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
      

        
        System.out.println("REGEX TRAINING");
        
//        System.out.println("Enter text:");
//        
//        Scanner s = new Scanner(System.in);
//        String text = s.nextLine();
        
        String text = "?one??two???three";
        System.out.println("Text: "+text);
        
        Document doc = new Document(text);
        System.out.println("In Document: "+doc.getText());
        
//        String regex = "[^a-z]+";
        String regex = "[]";
        System.out.println("regex:" + regex);
        List<String> results = doc.getTokens(regex);
        
        for(String result : results){
            System.out.println("result: "+ result);
        }
    }
}
