package org.example.Sender;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Setter
public class SenderService {

    @Autowired
    private Sender sender;



    public void message(String message) {
        sender.send(message);
    }
}
