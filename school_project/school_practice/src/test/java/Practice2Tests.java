/*
 * @(#)Practice2Tests.java
 *
 * Copyright  Andris Adumans Riga, Latvia. All rights reserved.
 */

import static javax.security.auth.callback.ConfirmationCallback.YES;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Practice2Tests {

    Practice2 proga = new Practice2();

    String[] vowels = {"a", "A", "E", "e", "I", "i", "O", "o", "U", "u"};
    @ParameterizedTest
    @ValueSource(strings = { "a", "A", "E", "e", "I", "i", "O", "o", "U", "u" })

    @Test
    public void positiveSmall() {
//        assertEquals( YES, proga.main(vowels));
    }

}
