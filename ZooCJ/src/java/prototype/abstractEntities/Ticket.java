/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prototype.abstractEntities;

/**
 *
 * @author jackl
 */
public abstract class Ticket {
    
    public abstract Ticket clone();
    private String benefits=" ";
    private String planName=" ";
    private String visiterAmmount = " ";
    private String price = " ";
    private String inTime=" ";
    private String outTime=" ";

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getVisiterAmmount() {
        return visiterAmmount;
    }

    public void setVisiterAmmount(String visiterAmmount) {
        this.visiterAmmount = visiterAmmount;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getInTime() {
        return inTime;
    }

    public void setInTime(String inTime) {
        this.inTime = inTime;
    }

    public String getOutTime() {
        return outTime;
    }

    public void setOutTime(String outTime) {
        this.outTime = outTime;
    }
    
}
