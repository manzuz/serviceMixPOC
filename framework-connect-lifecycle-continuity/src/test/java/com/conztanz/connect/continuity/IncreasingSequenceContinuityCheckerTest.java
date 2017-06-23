package com.conztanz.connect.continuity;

import com.conztanz.connect.exception.*;
import com.conztanz.connect.model.MessageStatus;
import com.conztanz.connect.model.SimpleSequencedIncomingMessage;
import com.conztanz.connect.model.SimpleSequencedWorkingMessage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by User on 6/22/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/continuity/applicationContext.xml")
public class IncreasingSequenceContinuityCheckerTest
{
    @Autowired
    private SimpleIncreasingSequenceContinuityChecker checker = null;

    public SimpleIncreasingSequenceContinuityChecker getChecker()
    {
        return checker;
    }


    @Test
    public void testCheckContinuityKO() throws ContinuityException
    {
        String ObjectID = "1234";
        SimpleSequencedIncomingMessage im = new SimpleSequencedIncomingMessage(new byte[10],1);
        SimpleSequencedWorkingMessage  wm = new SimpleSequencedWorkingMessage(ObjectID,2, MessageStatus.KO);
        try
        {
            this.getChecker().checkContinuity(im,wm);
            fail();
        } catch (KOContinuityException e)
        {
//            assertEquals("A message with the same object ID: " + ObjectID +" is in KO state",e.toString());
        }
    }

    @Test
    public void testCheckContinuityWORKING() throws ContinuityException
    {
        SimpleSequencedIncomingMessage im = new SimpleSequencedIncomingMessage(new byte[10],1);
        SimpleSequencedWorkingMessage  wm = new SimpleSequencedWorkingMessage("",2, MessageStatus.WORKING);
        try
        {
            this.getChecker().checkContinuity(im,wm);
            fail();
        } catch (WORKINGContinuityException e)
        {
//            assertEquals("A message with the same object ID: " + ObjectID +" is in KO state",e.toString());
        }
    }
    @Test
    public void testCheckContinuityOKWithOldSequence() throws ContinuityException
    {
        SimpleSequencedIncomingMessage im = new SimpleSequencedIncomingMessage(new byte[10],1);
        SimpleSequencedWorkingMessage  wm = new SimpleSequencedWorkingMessage("",2, MessageStatus.OK);
        try
        {
            this.getChecker().checkContinuity(im,wm);
            fail();

        }
        catch (SequenceContinuityException e)
        {
            assertEquals(e.getSequenceContinuityError(),SequenceContinuityError.OLD_INCOMING_MESSAGE);
        }
    }

    @Test
    public void testCheckContinuityOKWithNewSequence() throws ContinuityException
    {
        SimpleSequencedIncomingMessage im = new SimpleSequencedIncomingMessage(new byte[10],2);
        SimpleSequencedWorkingMessage  wm = new SimpleSequencedWorkingMessage("",1, MessageStatus.OK);
        this.getChecker().checkContinuity(im,wm);

    }
}
