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
import com.jevetools.data.model.api.inventory.MetaGroup;

/**
 * Copyright (c) 2013, jEVETools.
 * 
 * All rights reserved.
 *
 * @version 0.0.1
 * @since 0.0.1
 */
public final class MetaGroupImpl
    extends AbstractEntity
    implements MetaGroup
{
  /**
   * The metaGroupID.
   */
  private final int mMetaGroupID;

  /**
   * The metaGroupName.
   */
  private final String mMetaGroupName;

  /**
   * The description.
   */
  private final String mDescription;

  /**
   * The iconID.
   */
  private final int mIconID;

  /**
   * Copyright (c) 2013, jEVETools.
   * 
   * All rights reserved.
   *
   * @version 0.0.1
   * @since 0.0.1
   */
  public static final class Builder
      implements com.jevetools.data.model.api.Builder<MetaGroup>
  {
    /**
     * The metaGroupID.
     */
    private int mMetaGroupID;

    /**
     * The metaGroupName.
     */
    private String mMetaGroupName;

    /**
     * The description.
     */
    private String mDescription;

    /**
     * The iconID.
     */
    private int mIconID;

    /**
     * Default CTor.
     */
    public Builder()
    {
      super();
      mMetaGroupName = "";
      mDescription = "";
    }

    /**
     * @param aMetaGroupID the metaGroupID
     */
    public void metaGroupID(final int aMetaGroupID)
    {
      mMetaGroupID = aMetaGroupID;
    }

    /**
     * @param aMetaGroupName the metaGroupName
     */
    public void metaGroupName(final String aMetaGroupName)
    {
      mMetaGroupName = aMetaGroupName;
    }

    /**
     * @param aDescription the description
     */
    public void description(final String aDescription)
    {
      mDescription = aDescription;
    }

    /**
     * @param aIconID the iconID
     */
    public void iconID(final int aIconID)
    {
      mIconID = aIconID;
    }

    @Override
    public MetaGroup build()
    {
      return new MetaGroupImpl(this);
    }
  };

  /**
   * @param aBuilder {@link Builder}
   */
  MetaGroupImpl(final Builder aBuilder)
  {
    super();

    mMetaGroupID = aBuilder.mMetaGroupID;
    mMetaGroupName = aBuilder.mMetaGroupName;
    mDescription = aBuilder.mDescription;
    mIconID = aBuilder.mIconID;
  }

  @Override
  public int getMetaGroupID()
  {
    return mMetaGroupID;
  }

  @Override
  public String getMetaGroupName()
  {
    return mMetaGroupName;
  }

  @Override
  public String getDescription()
  {
    return mDescription;
  }

  @Override
  public int getIconID()
  {
    return mIconID;
  }

  @Override
  public int hashCode()
  {
    return HASHCODE_PRIME * 1 + mMetaGroupID;
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

    final MetaGroup other = (MetaGroup) aOther;

    if (mMetaGroupID != other.getMetaGroupID())
    {
      return false;
    }

    return true;
  }
}
