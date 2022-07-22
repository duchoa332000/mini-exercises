package com.exercise1;

import java.util.ArrayList;
import java.util.List;

public class GSM {
    private String Model;
    private String Manufacturer;
    private int Price;
    private String Owner;
    private Battery gsmBattery;
    private Display gsmDisplay;

    private Battery battery;
    private Display display;

    /**
     * Constructor of GSM
     *
     * @param model
     * @param manufacturer
     * @param price
     * @param owner
     * @param battery
     * @param display
     */

    public GSM(String model, String manufacturer, int price, String owner, Battery battery, Display display) {
        Model = model;
        Manufacturer = manufacturer;
        Price = price;
        Owner = owner;
        this.battery = battery;
        this.display = display;
    }

    /**
     * Get model
     *
     * @return
     */
    public String getModel() {
        return Model;
    }

    /**
     * Set model
     *
     * @param model
     */
    public void setModel(String model) {
        Model = model;
    }

    /**
     * Get manufacturer
     *
     * @return
     */
    public String getManufacturer() {
        return Manufacturer;
    }

    /**
     * Set manufacturer
     *
     * @param manufacturer
     */
    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    /**
     * Get price
     *
     * @return
     */
    public int getPrice() {
        return Price;
    }

    /**
     * Set price
     *
     * @param price
     */
    public void setPrice(int price) {
        Price = price;
    }

    /**
     * Get Owner
     *
     * @return
     */
    public String getOwner() {
        return Owner;
    }

    /**
     * Set Owner
     *
     * @param owner
     */
    public void setOwner(String owner) {
        Owner = owner;
    }

    /**
     * Get GsmBattery
     *
     * @return
     */
    public Battery getGsmBattery() {
        return gsmBattery;
    }

    /**
     * Set GsmBattery
     *
     * @param gsmBattery
     */
    public void setGsmBattery(Battery gsmBattery) {
        this.gsmBattery = gsmBattery;
    }

    /**
     * Get GsmDisplay
     *
     * @return
     */
    public Display getGsmDisplay() {
        return gsmDisplay;
    }

    /**
     * Set GsmDisplay
     *
     * @param gsmDisplay
     */
    public void setGsmDisplay(Display gsmDisplay) {
        this.gsmDisplay = gsmDisplay;
    }

    /**
     * Get Battery
     *
     * @return
     */
    public Battery getBattery() {
        return battery;
    }

    /**
     * Set Battery
     *
     * @param battery
     */
    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    /**
     * Get Display
     *
     * @return
     */
    public Display getDisplay() {
        return display;
    }

    /**
     * Set Display
     *
     * @param display
     */
    public void setDisplay(Display display) {
        this.display = display;
    }

    /**
     * method toString of GSM
     *
     * @return
     */
    @Override
    public String toString() {
        String result = "Model: " + this.getModel();
        result += "\nManufacturer: " + this.getManufacturer();
        result += "\nPrice: " + this.getPrice();
        result += "\nOwner: " + this.getOwner();
        result += this.display.toString();
        result += this.battery.toString();
        return result;
    }

    // Add a property CallHistory to hold a list of the performed calls.
    private List<Call> callHistory = new ArrayList<>();

    /**
     * Get Call history
     *
     * @return
     */
    public List<Call> getCallHistory() {
        return callHistory;
    }

    /**
     * Set Call History
     *
     * @param callHistory
     */
    public void setCallHistory(List<Call> callHistory) {
        this.callHistory = callHistory;
    }

    /**
     * Adding Calls
     *
     * @param call
     */
    public void addingCalls(Call call) {
        callHistory.add(call);
    }

    /**
     * Deleting Calls
     *
     * @param call
     */
    public void deletingCalls(int call) {
        callHistory.remove(call);
    }

    /**
     * Clearing Calls
     *
     * @param
     * @param
     */
    public void clearingCalls() {
        this.callHistory.clear();
    }


    //  method that calculates the total price of the calls in the call history
    public double calculatesTotalPrice(double pricePerMinute) {
        double result = 0;
        int minute = 60;
        for (Call call : callHistory) {
            result += call.getDuration();
        }
        return (result / minute) * pricePerMinute;
    }
}
