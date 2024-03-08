package com.kodilla.spring.basic.dependency_injection;

public class SimpleApplivation {

    private MessageService messageService;

    public SimpleApplivation(MessageService messageService) {
        this.messageService = messageService;
    }

    //chcemy uniknąć tworzenia obiektu dlatego tutworzyliśmy konstruktor
  //  private MessageService messageService = new MessageService();

    public void processMessage(String message, String receiver) {
        if (checkReceiver(receiver)) {
            this.messageService.send(message, receiver);
        }
    }
        public boolean checkReceiver (String receiver){
            return receiver != null && !receiver.isEmpty();
        }
    }

