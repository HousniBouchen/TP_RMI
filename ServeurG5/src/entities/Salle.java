/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 *
 * @author Housni
 */

@Entity
@NamedQuery(name ="findAllSalle", query="from Salle")
//@NamedNativeQuery(name "findMachineBySalle", query = "SELECT m.* FROM Machine m JOIN Salle s ON m.salle_id = s.id WHERE s.code =: code", resultClass = Machine.class)
        

public class Salle implements Serializable{    
    @Id
    private int id;
    private String code;
    
    public Salle(){}
    public Salle(String code)
    {
        this.code = code;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    @Override
    public String toString() {
        return "Salle{" + "id=" + id + ", code=" + code + '}';
    }
    
}
