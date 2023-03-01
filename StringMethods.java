public class StringMethods {
    public int lenght(String a){
        return a.length();
    }

    public char CharAt(String a, int b){
        if(b > a.length()){
            System.out.println("Excuse me but you did smth wrong :<");
        }
        return a.charAt(b);
    }

    public boolean isContains(String a, String WhatToContain){
        return a.contains(WhatToContain);
    }

    public boolean endsWith(String a, String b){
        return a.endsWith(b);
    }

    public String lowerCase(String a){
        return a.toLowerCase();
    }

    public String upperCase(String a){
        return a.toUpperCase();
    }
}
