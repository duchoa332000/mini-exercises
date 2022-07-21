package com.exercise2;

import java.util.Comparator;

/**
 * Define class Worker derived from Human with new property WeekSalary and WorkHoursPerDay and method MoneyPerHour()
 * that returns money earned by hour by the worker.
 */
public class Worker extends Human {

    public static Comparator<Worker> WorkerComparators = new WorkerComparator();
    private double weekSalary;
    private int workHoursPerDay;

    // number of working day in one week
    private static final int WORKING_DAY_PER_WEEK = 5;
    // number of working hour in one day
    private static final int WORKING_HOUR_PER_DAY = 8;

//    /**
//     * @param firstName
//     * @param lastName
//     */
//    public Worker(String firstName, String lastName) {
//        super(firstName, lastName);
//    }

    /**
     * Constructor
     *
     * @param firstName
     * @param lastName
     * @param weekSalary
     * @param workHoursPerDay
     */
    public Worker(String firstName, String lastName, double weekSalary, int workHoursPerDay) {
        super(firstName, lastName);
        this.weekSalary = weekSalary;
        this.workHoursPerDay = workHoursPerDay;
    }

    /**
     * Get WeekSalary
     */
    public Double getWeekSalary() {
        return weekSalary;
    }

    /**
     * Set WeekSalary
     */
    public void setWeekSalary(Double weekSalary) {
        this.weekSalary = weekSalary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "weekSalary=" + weekSalary +
                ", workHoursPerDay=" + workHoursPerDay +
                "} " + super.toString();
    }

    /**
     * Calculate money per hour
     */
    public double calculateMoneyPerHour() {
        Double moneyPerDay = weekSalary / WORKING_DAY_PER_WEEK;
        return moneyPerDay / WORKING_HOUR_PER_DAY;
    }

}
