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
public class GoldenTicket extends Ticket{
    
    
    

    @Override
    public Ticket clone() {
        Ticket deepSave = new GoldenTicket();
        deepSave.setBenefits("Ruta guiada y acceso ilimitado a zonas de descanso.");
        deepSave.setPlanName("Golden");
        deepSave.setPrice("$10 USD por persona");
        deepSave.setVisiterAmmount(this.getVisiterAmmount());
        deepSave.setInTime(this.getInTime());
        deepSave.setOutTime(this.getOutTime());
        return deepSave;
    }
    
    
}
