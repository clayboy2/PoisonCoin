/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author amclay2
 */
public class Contact {
    private final String name;
    private final String number;
    private final String email;
    private final String address;
    
    public Contact(String name, String number, String email, String address)
    {
        this.name = name;
        this.number = number;
        this.email = email;
        this.address = address;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getNumber()
    {
        return this.number;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
    public String getAddress()
    {
        return this.address;
    }
}
