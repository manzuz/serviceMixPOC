package com.conztanz.connect.travel.model;

import com.conztanz.model.AbstractEntity;

/**
 * Created by User on 6/14/2017.
 */
public class SBRWorkingMessage extends AbstractEntity
{
    /**
     *
     */
    private String messageVersion;
    /**
     *
     */
    private String objectId;
//    private In

    @Override
    protected boolean sameContentInternal(Object toBeCompared) {
        return false;
    }

    @Override
    protected boolean sameLinksInternal(Object toBeCompared) {
        return false;
    }
}
