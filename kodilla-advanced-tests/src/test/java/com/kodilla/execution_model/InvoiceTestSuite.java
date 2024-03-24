package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class InvoiceTestSuite {

    Invoice invoice = new Invoice();
    Item milk = new Item("Milk", 3.50);
    Item eggs = new Item("Eggs", 8.00);
    Item bread = new Item("Bread", 4.15);

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(milk);
        invoice.addItem(eggs);
        invoice.addItem(bread);
    }

    @Test
    public void shouldAddItemToTheList() {

        int numberOfElements = invoice.getSize();
        assertEquals(3, numberOfElements);
    }

    @Test
    public void shouldReturnExistingItem() {

        Item result = invoice.getItem(0);
        assertEquals("Milk", result.getName());
        assertEquals(3.50, result.getPrice());
    }

    @Test
    public void shouldReturnNullWhenIndexIsNegative() {

        Item result = invoice.getItem(-4);
        assertNull(result);
    }

    @Test
    public void shouldReturnNullWhenIndexExceedSizeOfList() {

        Item result = invoice.getItem(50);
        assertNull(result);
    }

    @Test
    public void shouldCheckValidateTheClearFunction() {

        int returnVoiceBeforeClean = invoice.getSize();

        invoice.clear();

        assertEquals(3, returnVoiceBeforeClean);
        assertEquals(0, invoice.getSize());

    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessag() {
        System.out.println("Finish testing..");
    }
}