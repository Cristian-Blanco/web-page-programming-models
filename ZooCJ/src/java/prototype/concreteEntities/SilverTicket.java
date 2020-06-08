/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prototype.concreteEntities;

import prototype.abstractEntities.Ticket;

/**
 *
 * @author jackl
 */
public class SilverTicket extends Ticket{
    
    @Override
    public Ticket clone() {
        Ticket deepSave = new SilverTicket();
        deepSave.setBenefits("Ruta guiada");
        deepSave.setPlanName("Silver");
        deepSave.setPrice("$5 USD por persona");
        deepSave.setVisiterAmmount(this.getVisiterAmmount());
        deepSave.setInTime(this.getInTime());
        deepSave.setOutTime(this.getOutTime());
        return deepSave;
    }
    
}
