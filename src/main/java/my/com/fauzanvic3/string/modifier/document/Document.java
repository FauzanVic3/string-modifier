/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.com.fauzanvic3.string.modifier.document;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Fauzan
 */
public class Document {
    
    protected String text;
    
    public Document(String text){
        this.text = text;
    }
    
    public List<String> getTokens(String pattern)
    {
            ArrayList<String> tokens = new ArrayList<String>();
            Pattern tokSplitter = Pattern.compile(pattern);
            Matcher m = tokSplitter.matcher(text);

            while (m.find()) {
                    tokens.add(m.group());
            }

            return tokens;
    }
    
    public String getText(){
        return this.text;
    }
}
