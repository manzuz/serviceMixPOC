package com.conztanz.connect.locking;

import com.conztanz.dao.AbstractConnectDaoImpl;

/**
 * Created by User on 6/14/2017.
 */
public abstract  class AbstractConnectLocker<DAO extends AbstractConnectDaoImpl<?>>
{

    /**
     *
     * @return
     */
    public abstract  DAO getDAO();
}
