package com.JavaCode.ND.nd05.collectionTasks.Task1;

import java.util.Date;

public class Payments {

    private int id;
    private int payerId;
    private int recipientId;
    private String name;
    private Date paymentDate;

    public Payments(int id, int payerId, int recipientId, String name, Date paymentDate) {
        this.id = id;
        this.payerId = payerId;
        this.recipientId = recipientId;
        this.name = name;
        this.paymentDate = paymentDate;
    }

    @Override
    public String toString() {
        return "id :" + id + '\t' +
                "  payerId :" + payerId + '\t' +
                "  recipientId :" + recipientId + '\t' +
                "  name :" + name + '\t' +
                "  paymentDate :" + paymentDate;
    }
}
