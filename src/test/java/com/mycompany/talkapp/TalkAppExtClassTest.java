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
        @Test
        public void testCheckUserName() { 
            TalkAppExtClass user =new TalkAppExtClass("kyl_1", "Ch&&set@ke99!", "+27838968976");
    }       assertTrue(user.checkUserName()); } 

        @Test
        public void testInvalidUserName() { 
        TalkAppExtClass user = new TalkAppExtClass("kyle !!!!!!!", "Ch&&set@ke99!", "+27838968976"); 
        assertFalse(user.checkUserName()); }
        
        @Test 
        public void testCheckPasswordComplexity() { 
            TalkAppExtClass user = new TalkAppExtClass("kyl_1", "Ch&&set@ke99!", "+27838968976"); 
            assertTrue(user.checkPasswordComplexity()); }
        
        @Test 
        public void testInvalidPassword() { 
            TalkAppExtClass user = new TalkAppExtClass("kyl_1", "password", "+27838968976"); 
            assertFalse(user.checkPasswordComplexity()); }
        
        @Test 
        public void testCheckCellPhoneNumber() { 
            TalkAppExtClass user = new TalkAppExtClass("kyl_1", "Ch&&set@ke99!", "+27838968976"); 
            assertTrue(user.checkCellPhoneNumber()); }
        
        @Test 
        public void testInvalidCellPhoneNumber() { 
            TalkAppExtClass user = new TalkAppExtClass("kyl_1", "Ch&&set@ke99!", "08966553"); 
            assertFalse(user.checkCellPhoneNumber()); }
        
        @Test 
        public void testRegisterUser() { 
            TalkAppExtClass user = new TalkAppExtClass("kyl_1", "Ch&&set@ke99!", "+27838968976"); 
            assertEquals( "User has been registered successfully.", user.registerUser() ); 
        }
        
        @Test 
        public void testRegisterUserInvalidUsername() { 
            TalkAppExtClass user = new TalkAppExtClass("kyle !!!!!!!", "Ch&&set@ke99!", "+27838968976"); 
            assertEquals( "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.", user.registerUser() ); 
        }
        
