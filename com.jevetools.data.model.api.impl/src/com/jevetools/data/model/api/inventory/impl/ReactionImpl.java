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
package com.jevetools.data.model.api.inventory.impl;

import com.jevetools.data.model.api.impl.AbstractEntity;
import com.jevetools.data.model.api.inventory.Reaction;

/**
 * Copyright (c) 2013, jEVETools.
 * 
 * All rights reserved.
 *
 * @version 0.0.1
 * @since 0.0.1
 */
public final class ReactionImpl
    extends AbstractEntity
    implements Reaction
{
  /**
   * The reactionTypeID.
   */
  private final int mReactionTypeID;

  /**
   * The typeID.
   */
  private final int mTypeID;

  /**
   * The quantity.
   */
  private final int mQuantity;

  /**
   * The input.
   */
  private final boolean mInput;

  /**
   * Copyright (c) 2013, jEVETools.
   * 
   * All rights reserved.
   *
   * @version 0.0.1
   * @since 0.0.1
   */
  public static final class Builder
      implements com.jevetools.data.model.api.Builder<Reaction>
  {
    /**
     * The reactionTypeID.
     */
    private int mReactionTypeID;

    /**
     * The typeID.
     */
    private int mTypeID;

    /**
     * The quantity.
     */
    private int mQuantity;

    /**
     * The input.
     */
    private boolean mInput;

    /**
     * @param aReactionTypeID the reactionTypeID
     */
    public void reactionTypeID(final int aReactionTypeID)
    {
      mReactionTypeID = aReactionTypeID;
    }

    /**
     * @param aTypeID the typeID
     */
    public void typeID(final int aTypeID)
    {
      mTypeID = aTypeID;
    }

    /**
     * @param aQuantity the quantity
     */
    public void quantity(final int aQuantity)
    {
      mQuantity = aQuantity;
    }

    /**
     * @param aInput the input
     */
    public void input(final boolean aInput)
    {
      mInput = aInput;
    }

    @Override
    public Reaction build()
    {
      return new ReactionImpl(this);
    }
  };

  /**
   * @param aBuilder {@link Builder}
   */
  ReactionImpl(final Builder aBuilder)
  {
    super();

    mReactionTypeID = aBuilder.mReactionTypeID;
    mTypeID = aBuilder.mTypeID;
    mQuantity = aBuilder.mQuantity;
    mInput = aBuilder.mInput;
  }

  @Override
  public int getReactionTypeID()
  {
    return mReactionTypeID;
  }

  @Override
  public int getTypeID()
  {
    return mTypeID;
  }

  @Override
  public int getQuantity()
  {
    return mQuantity;
  }

  @Override
  public boolean isInput()
  {
    return mInput;
  }

  @Override
  public int hashCode()
  {
    return HASHCODE_PRIME
        * (HASHCODE_PRIME * (HASHCODE_PRIME * 1 + mReactionTypeID) + mTypeID)
        + hashCode(mInput);
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

    final Reaction other = (Reaction) aOther;

    if (mReactionTypeID != other.getReactionTypeID())
    {
      return false;
    }

    if (mTypeID != other.getTypeID())
    {
      return false;
    }

    if (mInput != other.isInput())
    {
      return false;
    }

    return true;
  }
}
