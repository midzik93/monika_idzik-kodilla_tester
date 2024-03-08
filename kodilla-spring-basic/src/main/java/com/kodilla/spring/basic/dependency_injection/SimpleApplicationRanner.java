package com.kodilla.spring.basic.dependency_injection;

public class SimpleApplicationRanner {
    public static void main(String[] args) {
       // MessageService messageService= new MessageService();
        // nid możemy utworzyć powyższego obiektu ponieważ jest to interfejs


        //FacebookMessageService przypisujemy do referencji MessageService
        // jest to ok ponieważ MessageSerice jest typem wyższym
        MessageService  messageService=new FacebookMessageService();
        SimpleApplivation application = new SimpleApplivation(messageService);
        application.processMessage("Test message", "receiver@mail.com");
    }
}
