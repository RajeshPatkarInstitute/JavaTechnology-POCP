package com.rajeshpatkar;

public class Client1 {
    public static void useAStack(AStack s){
        
        s.push(10);
        System.out.println("Client1 pushed 10");
        
        s.push(20);
        System.out.println("Client1 pushed 20");
        
        s.push(30);
        System.out.println("Client1 pushed 30");
        
        System.out.println("Client1 popped "+s.pop());
    }
    
    public static void AuditorAStack(AStack s){
        System.out.println("Entering Auditor for AStack");
        System.out.println("Push Count is " + s.getPushcount());
        System.out.println("Pop Count is "+s.getPopcount());
        System.out.println("Leaving Auditor for AStack");
    }
    
}
