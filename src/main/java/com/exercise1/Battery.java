package com.exercise1;

public class Battery {
    /**
     * This is a class Battery
     */
    private String Model;
    private int hoursIdle;
    private int hoursTalk;
    private BatteryType.batteryType Type;

    /**
     * Constructor
     *
     * @param model
     * @param hoursIdle
     * @param hoursTalk
     */
    public Battery(String model, int hoursIdle, int hoursTalk) {
        Model = model;
        this.hoursIdle = hoursIdle;
        this.hoursTalk = hoursTalk;
    }

    public Battery(String model, int hoursIdle, int hoursTalk, BatteryType.batteryType type) {
        Model = model;
        this.hoursIdle = hoursIdle;
        this.hoursTalk = hoursTalk;
        Type = type;
    }

    /**
     * Get Model
     *
     * @return
     */
    public String getModel() {
        return Model;
    }

    /**
     * Set Model
     *
     * @param model
     */
    public void setModel(String model) {
        Model = model;
    }

    /**
     * Get Hours Idle
     *
     * @return
     */
    public int getHoursIdle() {
        return hoursIdle;
    }

    /**
     * Set Hours Idle
     *
     * @param hoursIdle
     */
    public void setHoursIdle(int hoursIdle) {
        this.hoursIdle = hoursIdle;
    }

    /**
     * Get Hours Talk
     *
     * @return
     */
    public int getHoursTalk() {
        return hoursTalk;
    }

    /**
     * Set Hours Talk
     *
     * @param hoursTalk
     */
    public void setHoursTalk(int hoursTalk) {
        this.hoursTalk = hoursTalk;
    }

    /**
     * Get Type
     *
     * @return
     */
    public BatteryType.batteryType getType() {
        return Type;
    }

    /**
     * Set Type
     *
     * @param type
     */
    public void setType(BatteryType.batteryType type) {
        Type = type;
    }

    /**
     * Method override toString of Battery
     *
     * @return
     */
    @Override
    public String toString() {
        return "\n--Battery-- " +
                "\nModel: " + Model + '\'' +
                "\nHoursIdle: " + hoursIdle +
                "\nHoursTalk: " + hoursTalk +
                "\nType: " + Type;
    }
}
