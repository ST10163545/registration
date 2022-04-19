/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package registration.and.loginfeature;

import java.util.Scanner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Muhammed
 */
public class RegistrationAndLoginfeatureTest {
    
    public RegistrationAndLoginfeatureTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class RegistrationAndLoginfeature.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        RegistrationAndLoginfeature.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of username method, of class RegistrationAndLoginfeature.
     */
    @Test
    public void testUsername() {
        System.out.println("username");
        Scanner sc = null;
        String expResult = "";
        String result = RegistrationAndLoginfeature.username(sc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of checkUserName method, of class RegistrationAndLoginfeature.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "";
        boolean expResult = false;
        boolean result = RegistrationAndLoginfeature.checkUserName(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of Password method, of class RegistrationAndLoginfeature.
     */
    @Test
    public void testPassword() {
        System.out.println("Password");
        Scanner sc = null;
        String expResult = "";
        String result = RegistrationAndLoginfeature.Password(sc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of checkPasswordComplexity method, of class RegistrationAndLoginfeature.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "";
        boolean expResult = false;
        boolean result = RegistrationAndLoginfeature.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of firstname method, of class RegistrationAndLoginfeature.
     */
    @Test
    public void testFirstname() {
        System.out.println("firstname");
        Scanner sc = null;
        String expResult = "";
        String result = RegistrationAndLoginfeature.firstname(sc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of lastname method, of class RegistrationAndLoginfeature.
     */
    @Test
    public void testLastname() {
        System.out.println("lastname");
        Scanner sc = null;
        String expResult = "";
        String result = RegistrationAndLoginfeature.lastname(sc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of registerUser method, of class RegistrationAndLoginfeature.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        boolean checkUser = false;
        boolean checkpass = false;
        boolean expResult = false;
        boolean result = RegistrationAndLoginfeature.registerUser(checkUser, checkpass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of loginUsername method, of class RegistrationAndLoginfeature.
     */
    @Test
    public void testLoginUsername() {
        System.out.println("loginUsername");
        Scanner sc = null;
        String expResult = "";
        String result = RegistrationAndLoginfeature.loginUsername(sc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of LoginPassword method, of class RegistrationAndLoginfeature.
     */
    @Test
    public void testLoginPassword() {
        System.out.println("LoginPassword");
        Scanner sc = null;
        String expResult = "";
        String result = RegistrationAndLoginfeature.LoginPassword(sc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of loginUser method, of class RegistrationAndLoginfeature.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String firstname = "";
        String lastname = "";
        String username = "";
        String loginUsername = "";
        String password = "";
        String loginPassword = "";
        boolean expResult = false;
        boolean result = RegistrationAndLoginfeature.loginUser(firstname, lastname, username, loginUsername, password, loginPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of returnLoginStatus method, of class RegistrationAndLoginfeature.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        boolean log = false;
        boolean expResult = false;
        boolean result = RegistrationAndLoginfeature.returnLoginStatus(log);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
