package com.exercise1;

public class Display {
    /**
     * This is a class of Display
     */
    private int Size;
    private int numberOfColor;

    /**
     * constructor
     *
     * @param size
     * @param numberOfColor
     */
    public Display(int size, int numberOfColor) {
        Size = size;
        this.numberOfColor = numberOfColor;
    }

    /**
     * Get Size
     *
     * @return
     */
    public int getSize() {
        return Size;
    }

    /**
     * Set Size
     *
     * @param size
     */
    public void setSize(int size) {
        Size = size;
    }

    /**
     * Get Number of color
     *
     * @return
     */
    public int getNumberOfColor() {
        return numberOfColor;
    }

    /**
     * Set Number of color
     *
     * @param numberOfColor
     */
    public void setNumberOfColor(int numberOfColor) {
        this.numberOfColor = numberOfColor;
    }

    /**
     * Method override toString of Display
     *
     * @return
     */
    @Override
    public String toString() {
        return "\n--Display--" +
                "\nSize: " + Size +
                "\nNumberOfColor: " + numberOfColor;
    }
}
