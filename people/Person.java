/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import utils.Contact;

/**
 *
 * @author amclay2
 */
public class Person {
    
    private String name;
    private Contact contactInfo;
    
    public Person(String name,Contact contactInfo)
    {
        this.contactInfo = contactInfo;
        this.name = name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setContactInfo(Contact c)
    {
        this.contactInfo = c;
    }
    
    public Contact getContactInfo()
    {
        return this.contactInfo;
    }
}
