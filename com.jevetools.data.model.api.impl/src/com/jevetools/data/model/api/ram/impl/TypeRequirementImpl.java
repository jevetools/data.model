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
package com.jevetools.data.model.api.ram.impl;

import com.jevetools.data.model.api.impl.AbstractEntity;
import com.jevetools.data.model.api.ram.TypeRequirement;

/**
 * Copyright (c) 2013, jEVETools.
 * 
 * All rights reserved.
 * 
 * @version 0.0.1
 * @since 0.0.1
 */
public final class TypeRequirementImpl
    extends AbstractEntity
    implements TypeRequirement
{
  /**
   * The activityID.
   */
  private final int mActivityID;

  /**
   * The damagePerJob.
   */
  private final double mDamagePerJob;

  /**
   * The quantity.
   */
  private final int mQuantity;

  /**
   * The requiredTypeID.
   */
  private final int mRequiredTypeID;

  /**
   * The typeID.
   */
  private final int mTypeID;

  /**
   * The recycle.
   */
  private final boolean mRecycle;

  /**
   * Copyright (c) 2013, jEVETools.
   * 
   * All rights reserved.
   * 
   * @version 0.0.1
   * @since 0.0.1
   */
  public static final class Builder
      implements com.jevetools.data.model.api.Builder<TypeRequirement>
  {
    /**
     * The activityID.
     */
    private int mActivityID;

    /**
     * The damagePerJob.
     */
    private double mDamagePerJob;

    /**
     * The quantity.
     */
    private int mQuantity;

    /**
     * The requiredTypeID.
     */
    private int mRequiredTypeID;

    /**
     * The typeID.
     */
    private int mTypeID;

    /**
     * The recycle.
     */
    private boolean mRecycle;

    /**
     * @param aActivityID the activityID
     */
    public void activityID(final int aActivityID)
    {
      mActivityID = aActivityID;
    }

    /**
     * @param aDamagePerJob the damagePerJob
     */
    public void damagePerJob(final double aDamagePerJob)
    {
      mDamagePerJob = aDamagePerJob;
    }

    /**
     * @param aQuantity the quantity
     */
    public void quantity(final int aQuantity)
    {
      mQuantity = aQuantity;
    }

    /**
     * @param aRequiredTypeID the requiredTypeID
     */
    public void requiredTypeID(final int aRequiredTypeID)
    {
      mRequiredTypeID = aRequiredTypeID;
    }

    /**
     * @param aTypeID the typeID
     */
    public void typeID(final int aTypeID)
    {
      mTypeID = aTypeID;
    }

    /**
     * @param aRecycle the recycle
     */
    public void recycle(final boolean aRecycle)
    {
      mRecycle = aRecycle;
    }

    @Override
    public TypeRequirement build()
    {
      return new TypeRequirementImpl(this);
    }
  };

  /**
   * @param aBuilder {@link Builder}
   */
  TypeRequirementImpl(final Builder aBuilder)
  {
    super();

    mActivityID = aBuilder.mActivityID;
    mDamagePerJob = aBuilder.mDamagePerJob;
    mQuantity = aBuilder.mQuantity;
    mRequiredTypeID = aBuilder.mRequiredTypeID;
    mTypeID = aBuilder.mTypeID;
    mRecycle = aBuilder.mRecycle;
  }

  @Override
  public int getActivityID()
  {
    return mActivityID;
  }

  @Override
  public double getDamagePerJob()
  {
    return mDamagePerJob;
  }

  @Override
  public int getQuantity()
  {
    return mQuantity;
  }

  @Override
  public int getRequiredTypeID()
  {
    return mRequiredTypeID;
  }

  @Override
  public int getTypeID()
  {
    return mTypeID;
  }

  @Override
  public boolean isRecycle()
  {
    return mRecycle;
  }

  @Override
  public int hashCode()
  {
    return HASHCODE_PRIME
        * (HASHCODE_PRIME * (HASHCODE_PRIME * 1 + mActivityID) 
            + mRequiredTypeID) + mTypeID;
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

    final TypeRequirementImpl other = (TypeRequirementImpl) aOther;

    if (mActivityID != other.mActivityID)
    {
      return false;
    }

    if (mRequiredTypeID != other.mRequiredTypeID)
    {
      return false;
    }

    if (mTypeID != other.mTypeID)
    {
      return false;
    }

    return true;
  }

}
