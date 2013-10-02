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
import com.jevetools.data.model.api.ram.Activity;

/**
 * Copyright (c) 2013, jEVETools.
 * 
 * All rights reserved.
 * 
 * @version 0.0.1
 * @since 0.0.1
 */
public final class ActivityImpl
    extends AbstractEntity
    implements Activity
{
  /**
   * The activityID.
   */
  private final int mActivityID;

  /**
   * The activityName.
   */
  private final String mActivityName;

  /**
   * The description.
   */
  private final String mDescription;

  /**
   * The iconNo.
   */
  private final String mIconNo;

  /**
   * The published.
   */
  private final boolean mPublished;

  /**
   * Copyright (c) 2013, jEVETools.
   * 
   * All rights reserved.
   * 
   * @version 0.0.1
   * @since 0.0.1
   */
  public static final class Builder
      implements com.jevetools.data.model.api.Builder<Activity>
  {
    /**
     * The activityID.
     */
    private int mActivityID;

    /**
     * The activityName.
     */
    private String mActivityName;

    /**
     * The description.
     */
    private String mDescription;

    /**
     * The iconNo.
     */
    private String mIconNo;

    /**
     * The published.
     */
    private boolean mPublished;

    /**
     * Default CTor.
     */
    public Builder()
    {
      super();
      mActivityName = "";
      mDescription = "";
      mIconNo = "";
    }

    /**
     * @param aActivityID the activityID
     */
    public void activityID(final int aActivityID)
    {
      mActivityID = aActivityID;
    }

    /**
     * @param aActivityName the activityName
     */
    public void activityName(final String aActivityName)
    {
      mActivityName = aActivityName;
    }

    /**
     * @param aDescription the description
     */
    public void description(final String aDescription)
    {
      mDescription = aDescription;
    }

    /**
     * @param aIconNo the iconNo
     */
    public void iconNo(final String aIconNo)
    {
      mIconNo = aIconNo;
    }

    /**
     * @param aPublished the published
     */
    public void published(final boolean aPublished)
    {
      mPublished = aPublished;
    }

    @Override
    public Activity build()
    {
      return new ActivityImpl(this);
    }
  };

  /**
   * @param aBuilder {@link Builder}
   */
  ActivityImpl(final Builder aBuilder)
  {
    super();

    mActivityID = aBuilder.mActivityID;
    mActivityName = aBuilder.mActivityName;
    mDescription = aBuilder.mDescription;
    mIconNo = aBuilder.mIconNo;
    mPublished = aBuilder.mPublished;
  }

  @Override
  public int getActivityID()
  {
    return mActivityID;
  }

  @Override
  public String getActivityName()
  {
    return mActivityName;
  }

  @Override
  public String getDescription()
  {
    return mDescription;
  }

  @Override
  public String getIconNo()
  {
    return mIconNo;
  }

  @Override
  public boolean isPublished()
  {
    return mPublished;
  }

  @Override
  public int hashCode()
  {
    return HASHCODE_PRIME * 1 + mActivityID;
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

    final Activity other = (Activity) aOther;

    if (mActivityID != other.getActivityID())
    {
      return false;
    }

    return true;
  }
}
