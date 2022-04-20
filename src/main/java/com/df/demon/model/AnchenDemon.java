package com.df.demon.model;

import lombok.Data;

import java.io.Serializable;


//ANCHEN_DEMON
@Data
public class AnchenDemon implements Serializable {
    private static final long serialVersionUID = 1L;

    //USER_ADDRESS
    private String userAddress;
    //ID
    private Short id;
    //USER_CARD
    private String userCard;


}