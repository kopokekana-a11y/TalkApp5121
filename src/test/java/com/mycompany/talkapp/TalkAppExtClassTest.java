/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.talkapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class TalkAppExtClassTest {
    
    public TalkAppExtClassTest() {
    }

    @Test
    public void testCheckUserName() {
        TalkAppExtClass user =
                new TalkAppExtClass("ab_cd", "Password1!", "+27821234567");

        assertTrue(user.checkUserName());
    }

    // Test invalid username
    @Test
    public void testInvalidUserName() {
        TalkAppExtClass user =
                new TalkAppExtClass("abcdef", "Password1!", "+27821234567");

        assertFalse(user.checkUserName());
    }

    // Test valid password
    @Test
    public void testCheckPasswordComplexity() {
        TalkAppExtClass user =
                new TalkAppExtClass("ab_cd", "Password1!", "+27821234567");

        assertTrue(user.checkPasswordComplexity());
    }

    // Test invalid password
    @Test
    public void testInvalidPassword() {
        TalkAppExtClass user =
                new TalkAppExtClass("ab_cd", "password", "+27821234567");

        assertFalse(user.checkPasswordComplexity());
    }

    // Test valid cell phone number
    @Test
    public void testCheckCellPhoneNumber() {
        TalkAppExtClass user =
                new TalkAppExtClass("ab_cd", "Password1!", "+27821234567");

        assertTrue(user.checkCellPhoneNumber());
    }

    // Test invalid cell phone number
    @Test
    public void testInvalidCellPhoneNumber() {
        TalkAppExtClass user =
                new TalkAppExtClass("ab_cd", "Password1!", "0821234567");

        assertFalse(user.checkCellPhoneNumber());
    }

    // Test successful registration
    @Test
    public void testRegisterUser() {
        TalkAppExtClass user =
                new TalkAppExtClass("ab_cd", "Password1!", "+27821234567");

        assertEquals(
                "User has been registered successfully.",
                user.registerUser()
        );
    }

    // Test successful login
    @Test
    public void testLoginUser() {
        TalkAppExtClass user =
                new TalkAppExtClass("ab_cd", "Password1!", "+27821234567");

        assertTrue(
                user.loginUser("ab_cd", "Password1!")
        );
    }

    // Test unsuccessful login
    @Test
    public void testInvalidLogin() {
        TalkAppExtClass user =
                new TalkAppExtClass("ab_cd", "Password1!", "+27821234567");

        assertFalse(
                user.loginUser("wrong_user", "wrong_password")
        );
    }

    // Test successful login message
    @Test
    public void testReturnLoginStatusSuccessful() {
        TalkAppExtClass user =
                new TalkAppExtClass("ab_cd", "Password1!", "+27821234567");

        assertEquals(
                "Welcome John Smith, it is great to finally meet you again.",
                user.returnLoginStatus(true, "John", "Smith")
        );
    }

    // Test unsuccessful login message
    @Test
    public void testReturnLoginStatusUnsuccessful() {
        TalkAppExtClass user =
                new TalkAppExtClass("ab_cd", "Password1!", "+27821234567");

        assertEquals(
                "Username or password is incorrect, please try again later.",
                user.returnLoginStatus(false, "John", "Smith")
        );
    }
}
    

