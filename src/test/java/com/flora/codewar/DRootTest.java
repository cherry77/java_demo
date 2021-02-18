package com.flora.codewar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DRootTest {

    @Test
    void digitalRoot() {
        assertEquals( 7, DRoot.digitalRoot(16));
        assertEquals( 6, DRoot.digitalRoot(456));
        assertEquals( 6, DRoot.digital_root(456));
    }
}