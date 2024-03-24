package com.kodilla.execution_model.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MobilePhoneTestSuite {
    MobilePhone myMobile = Mockito.mock(MobilePhone.class);

    @Test
    public void testExpectation() {
        Assertions.assertFalse(myMobile.needsCharging());
        Mockito.when(myMobile.needsCharging()).thenReturn(true);
        Assertions.assertTrue(myMobile.needsCharging());
    }
    @Test
    public void shouldCallLaunchApplication(){
        myMobile.launchApplication("Testris4D"); // wywołujemy określoną metodę, przekazując argument.
        Mockito.verify(myMobile).launchApplication("Testris4D"); //sprawdzamy, czy odpowiednia metoda została wywołana
    }

    @Test
    public void testVerificationFailure() {
        myMobile.needsCharging();
        Mockito.verify(myMobile).needsCharging();
    }
}
