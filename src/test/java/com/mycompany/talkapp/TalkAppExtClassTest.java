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
@Test public void testCheckUserName() { 
    TalkAppExtClass user = new TalkAppExtClass("kyl_1", "Ch&&set@ke99!", "+27838968976"); 
    assertTrue(user.checkUserName()); }
}
    

