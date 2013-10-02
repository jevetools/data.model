/*
 * Copyright (c) 2013, jEVETools
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the author nor the names of the contributors
 *       may be used to endorse or promote products derived from this software
 *       without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package com.jevetools.data.model.api.pi.impl;

import com.jevetools.data.model.api.impl.AbstractEntity;
import com.jevetools.data.model.api.pi.PiPinType;

/**
 * Copyright (c) 2013, jEVETools.
 * 
 * All rights reserved.
 *
 * @version 0.0.1
 * @since 0.0.1
 */
public final class PiPinTypeImpl
    extends AbstractEntity
    implements PiPinType
{
  /**
   * The schematicID.
   */
  private final int mSchematicID;

  /**
   * The pinTypeID.
   */
  private final int mPinTypeID;

  /**
   * Copyright (c) 2013, jEVETools.
   * 
   * All rights reserved.
   * 
   * @version 0.0.1
   * @since 0.0.1
   */
  public static final class Builder
      implements com.jevetools.data.model.api.Builder<PiPinType>
  {
    /**
     * The schematicID.
     */
    private int mSchematicID;

    /**
     * The pinTypeID.
     */
    private int mPinTypeID;

    /**
     * @param aSchematicID the schematicID
     */
    public void schematicID(final int aSchematicID)
    {
      mSchematicID = aSchematicID;
    }

    /**
     * @param aPinTypeID the pinTypeID
     */
    public void pinTypeID(final int aPinTypeID)
    {
      mPinTypeID = aPinTypeID;
    }

    @Override
    public PiPinType build()
    {
      return new PiPinTypeImpl(this);
    }
  };

  /**
   * @param aBuilder {@link Builder}
   */
  PiPinTypeImpl(final Builder aBuilder)
  {
    super();

    mSchematicID = aBuilder.mSchematicID;
    mPinTypeID = aBuilder.mPinTypeID;
  }

  /**
   * @return the pinTypeID
   * @since 0.0.1
   */
  @Override
  public int getPinTypeID()
  {
    return mPinTypeID;
  }

  /**
   * @return the schematicID
   * @since 0.0.1
   */
  @Override
  public int getSchematicID()
  {
    return mSchematicID;
  }

  @Override
  public int hashCode()
  {
    return HASHCODE_PRIME * (HASHCODE_PRIME * 1 + mPinTypeID) + mSchematicID;
  }

  @Override
  public boolean equals(final Object aOther)
  {
    if (this == aOther)
    {
      return true;
    }

    if (aOther == null)
    {
      return false;
    }

    if (getClass() != aOther.getClass())
    {
      return false;
    }
    
    final PiPinType other = (PiPinTypeImpl) aOther;

    if (mPinTypeID != other.getPinTypeID())
    {
      return false;
    }

    if (mSchematicID != other.getSchematicID())
    {
      return false;
    }
    
    return true;
  }
}
