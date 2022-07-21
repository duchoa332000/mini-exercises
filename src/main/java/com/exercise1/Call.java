package com.exercise1;

import java.util.Date;

public class Call {
    /**
     * This is a class of Call
     */
    private Date date;
    private String dialedPhoneNumber;
    private int duration;

    /**
     * Constructor of Call
     *
     * @param date
     * @param dialedPhoneNumber
     * @param duration
     */
    public Call(Date date, String dialedPhoneNumber, int duration) {
        this.date = date;
        this.dialedPhoneNumber = dialedPhoneNumber;
        this.duration = duration;
    }

    /**
     * Get Date
     *
     * @return
     */
    public Date getDate() {
        return date;
    }

    /**
     * Set Date
     *
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Get Dialed phone number
     *
     * @return
     */
    public String getDialedPhoneNumber() {
        return dialedPhoneNumber;
    }

    /**
     * Set Dialed phone number
     *
     * @param dialedPhoneNumber
     */
    public void setDialedPhoneNumber(String dialedPhoneNumber) {
        this.dialedPhoneNumber = dialedPhoneNumber;
    }

    /**
     * Get duration
     *
     * @return
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Set duration
     *
     * @param duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }
}
