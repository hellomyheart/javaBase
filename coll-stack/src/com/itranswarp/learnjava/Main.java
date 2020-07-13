package com.itranswarp.learnjava;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;

public class Main {
    public static void main(String [] args){
        String input="x + 2 * ( y - 5 )";        
        SuffixToPostFixString se=compile(input); 
        Map<Character,Integer>map=Map.of('x',1,'y',9);        
        System.out.println(se.execute(map));        
        System.out.println(se.execute(map) == 1 + 2 * (9 - 5) ? "✓" : "✗");    
    }
    public static SuffixToPostFixString compile(String input){
        Deque<Character> ocs=new LinkedList<>();     
        String exp="";
        char [] cexp=input.toCharArray();        
        for(int i=0;i<cexp.length;i++){
            char ch=cexp[i];            
            if(ch==' '){
                continue;            
            }
            if(ch>='0'&&ch<='9'||ch=='x'||ch=='y'){
                exp+=ch;                
                continue;            
            }
            if(ch=='('){
               ocs.push(ch);               
               continue;            
            }
            if(ch=='+'||ch=='-'){
                while (!ocs.isEmpty()&&ocs.peek()!='('){
                    exp+=ocs.pop();                
                }
                ocs.push(ch);                
                continue;            
            }
            if(ch=='*'||ch=='/'){
                while (!ocs.isEmpty()&&(ocs.peek()=='*'||ocs.peek()=='/')){
                    exp+=ocs.pop();                
                }
                ocs.push(ch);                
                continue;            
            }
            if(ch==')') {
                while (ocs.peek() != '(') {
                    exp += ocs.pop();                
                }
                ocs.pop();                
                continue;            
            }
        }
        while (!ocs.isEmpty()){
            exp+=ocs.pop();        
        }
        System.out.println(exp);        
        return new SuffixToPostFixString(exp);    
   }
}

class SuffixToPostFixString{
    String exp;    
    public SuffixToPostFixString(String exp){
        this.exp=exp;    
    }
    public float execute(Map<Character,Integer>map){
        Deque<Float>cs=new LinkedList<>();        
        char [] cexp=exp.toCharArray();        
        for(int i=0;i<cexp.length;i++){
            char ch=cexp[i];            
            if(ch=='x'||ch=='y'){
                ch=(char)(map.get(ch)+48);            
            }
            if(ch>='0'&&ch<='9'){
                cs.push(Float.valueOf(ch-'0'));                
                continue;            
            }else {
                cs.push(caclute(ch,cs.pop(),cs.pop()));                
                continue;            
            }
        }
        return cs.pop();    
     }
    public Float caclute(char ch,Float f1,Float f2){
        switch (ch){
            case '+':
                return f1+f2;            
            case '-':
                return f2-f1;            
            case '*':
                return f1*f2;            
            case '/':
                return f2/f1;                
            default:

        }
        return Float.valueOf(-0);    
    }
}