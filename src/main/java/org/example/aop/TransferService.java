package org.example.aop;

import lombok.Getter;

@Getter
public class TransferService {

    void print(TransferData transferData) {
        System.out.println("card " + transferData.getCardNo() + "password " + transferData.getPassword());
    }
}
