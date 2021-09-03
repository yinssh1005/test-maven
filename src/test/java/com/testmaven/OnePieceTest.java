package com.testmaven;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OnePieceTest {

    OnePiece onePiece;

    @Test
    public void getTestInt() {
        onePiece = new OnePiece(10);
        Assert.assertEquals(10, onePiece.getTestInt());
    }

    @Test
    public void setTestInt() {
        onePiece = new OnePiece(10);
        onePiece.setTestInt(11);
        Assert.assertEquals(11, onePiece.getTestInt());
    }

    @Test
    public void testToString() {
        onePiece = new OnePiece(10);
        Assert.assertNotNull(onePiece.toString());
    }
}