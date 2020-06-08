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
public class PlatinumTicket extends Ticket{
    

    @Override
    public Ticket clone() {
        Ticket deepSave = new PlatinumTicket();
        deepSave.setBenefits("Ruta guiada, acceso ilimitado a zonas de descanso, membresía club ZooCJ, niños menores a 10 años ingresan gratis.");
        deepSave.setPlanName("Platinum");
        deepSave.setPrice("$20 USD por persona");
        deepSave.setVisiterAmmount(this.getVisiterAmmount());
        deepSave.setInTime(this.getInTime());
        deepSave.setOutTime(this.getOutTime());
        return deepSave;
    }
    
}
