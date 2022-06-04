package com.example.citylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if that city does not exist
     * @param city
     *      This is the city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list of cities
     */
    public List<City> getCities(int param) {
        List<City> cityList = cities;
        if (param==1)
        {
            Collections.sort(cityList);
        }
        else
        {
            Collections.sort(cityList, new Comparator<City>() {
                @Override
                public int compare(City city, City o2) {
                    return city.getProvinceName().compareTo(o2.getProvinceName());
                }
            });
        }

        return cityList;
    }

    /**
     * This is a javadoc for the method "delete"
     * This method removes an element from the list
     * If the desired element to be deleted is not on
     * the list, it will throw an exception
     * @param city
     * This is a void method with a parameter
     */
    public void delete(City city)
    {
        if (!cities.contains(city))
        {
            throw new IllegalArgumentException();
        }
        else
        {
            cities.remove(city);
        }
    }

    /**
     * This is a javadoc for the method "count"
     * @return this method returns the size of "cities" arraylist
     * This is not a void method
     */
    public int count()
    {
        return cities.size();
    }
}
