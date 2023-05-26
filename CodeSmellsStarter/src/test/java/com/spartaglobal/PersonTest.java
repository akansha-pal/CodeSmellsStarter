package com.spartaglobal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    @DisplayName("getFullName returns correct name")
    public void getFullNameTest() {
        // create a new BaseClass object, which represents a person
        var subject = new Person("Cathy", "French");
        var result = subject.getFullName();
        Assertions.assertEquals("Cathy French", result);
    }

    @Test
    public
    void getAddressTest() {
        var subject = new Person("Cathy", "French", 4, "High Street", "Stafford");
        subject.setAge(22);
        var result = subject.getAddress();
        Assertions.assertEquals("Address: 4 High Street, Stafford", result);
    }

    @Test
    @DisplayName("getFullName returns blank String when name is blank")
    public void getFullNameTestBlank() {
        // create a new BaseClass object, which represents a person
        var subject = new Person("", "");
        var result = subject.getFullName();
        Assertions.assertEquals(" ", result);
    }

    @Test
    @DisplayName("getAge and setAge methods work correctly")
    public void ageTest() {
        var subject = new Person("A", "B");
        subject.setAge(35);
        Assertions.assertEquals(35, subject.getAge());
    }

    @Test
    @DisplayName("toString returns correct information")
    public void toStringTest() {
        var subject = new Person("Cathy", "French", 4, "High Street", "Stafford");
        subject.setAge(22);
        var result = subject.toString();
        System.out.println(result);
        Assertions.assertTrue(result.contains("Name: Cathy French Age: 22. Address: 4 High Street, Stafford"));

    }
}