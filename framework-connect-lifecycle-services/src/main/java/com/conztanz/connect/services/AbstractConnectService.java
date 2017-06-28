package com.conztanz.connect.services;

import com.conztanz.exception.ConztanzException;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @param <ELEMENT>
 */
@Transactional(
        readOnly = false,
        rollbackFor = {ConztanzException.class},
        propagation = Propagation.REQUIRED
)
public class AbstractConnectService<ELEMENT> implements IConnectService<ELEMENT>
{
}
