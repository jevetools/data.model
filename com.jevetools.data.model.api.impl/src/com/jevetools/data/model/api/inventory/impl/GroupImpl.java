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
import com.jevetools.data.model.api.inventory.Group;

/**
 * Copyright (c) 2013, jEVETools.
 * 
 * All rights reserved.
 * 
 * @version 0.0.1
 * @since 0.0.1
 */
public final class GroupImpl
    extends AbstractEntity
    implements Group
{ // NOPMD
  /**
   * The groupID.
   */
  private final int mGroupID;

  /**
   * The categoryID.
   */
  private final int mCategoryID;

  /**
   * The groupName.
   */
  private final String mGroupName;

  /**
   * The description.
   */
  private final String mDescription;

  /**
   * The published.
   */
  private final boolean mPublished;

  /**
   * The useBasePrice.
   */
  private final boolean mUseBasePrice;

  /**
   * The fittableNonSingleton.
   */
  private final boolean mFittableNonSingleton;

  /**
   * The anchored.
   */
  private final boolean mAnchored;

  /**
   * The anchorable.
   */
  private final boolean mAnchorable;

  /**
   * The allowRecycler.
   */
  private final boolean mAllowRecycler;

  /**
   * The allowManufacture.
   */
  private final boolean mAllowManufacture;

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
      implements com.jevetools.data.model.api.Builder<Group>
  { // NOPMD
    /**
     * The groupID.
     */
    private int mGroupID;

    /**
     * The categoryID.
     */
    private int mCategoryID;

    /**
     * The groupName.
     */
    private String mGroupName;

    /**
     * The description.
     */
    private String mDescription;

    /**
     * The published.
     */
    private boolean mPublished;

    /**
     * The useBasePrice.
     */
    private boolean mUseBasePrice;

    /**
     * The fittableNonSingleton.
     */
    private boolean mFittableNonSingleton;

    /**
     * The anchored.
     */
    private boolean mAnchored;

    /**
     * The anchorable.
     */
    private boolean mAnchorable;

    /**
     * The allowRecycler.
     */
    private boolean mAllowRecycler;

    /**
     * The allowManufacture.
     */
    private boolean mAllowManufacture;

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

      mGroupName = "";
      mDescription = "";
    }

    /**
     * @param aGroupID the groupID
     */
    public void groupID(final int aGroupID)
    {
      mGroupID = aGroupID;
    }

    /**
     * @param aCategoryID the categoryID
     */
    public void categoryID(final int aCategoryID)
    {
      mCategoryID = aCategoryID;
    }

    /**
     * @param aGroupName the groupName
     */
    public void groupName(final String aGroupName)
    {
      mGroupName = aGroupName;
    }

    /**
     * @param aDescription the description
     */
    public void description(final String aDescription)
    {
      mDescription = aDescription;
    }

    /**
     * @param aPublished the published
     */
    public void published(final boolean aPublished)
    {
      mPublished = aPublished;
    }

    /**
     * @param aUseBasePrice the useBasePrice
     */
    public void useBasePrice(final boolean aUseBasePrice)
    {
      mUseBasePrice = aUseBasePrice;
    }

    /**
     * @param aFittableNonSingleton the fittableNonSingleton
     */
    public void fittableNonSingleton(final boolean aFittableNonSingleton)
    {
      mFittableNonSingleton = aFittableNonSingleton;
    }

    /**
     * @param aAnchored the anchored
     */
    public void anchored(final boolean aAnchored)
    {
      mAnchored = aAnchored;
    }

    /**
     * @param aAnchorable the anchorable
     */
    public void anchorable(final boolean aAnchorable)
    {
      mAnchorable = aAnchorable;
    }

    /**
     * @param aAllowRecycler the allowRecycler
     */
    public void allowRecycler(final boolean aAllowRecycler)
    {
      mAllowRecycler = aAllowRecycler;
    }

    /**
     * @param aAllowManufacture the allowManufacture
     */
    public void allowManufacture(final boolean aAllowManufacture)
    {
      mAllowManufacture = aAllowManufacture;
    }

    /**
     * @param aIconID the iconID
     */
    public void iconID(final int aIconID)
    {
      mIconID = aIconID;
    }

    @Override
    public Group build()
    {
      return new GroupImpl(this);
    }
  };

  /**
   * @param aBuilder {@link Builder}
   */
  GroupImpl(final Builder aBuilder)
  {
    super();

    mGroupID = aBuilder.mGroupID;
    mCategoryID = aBuilder.mCategoryID;
    mGroupName = aBuilder.mGroupName;
    mDescription = aBuilder.mDescription;
    mPublished = aBuilder.mPublished;
    mUseBasePrice = aBuilder.mUseBasePrice;
    mFittableNonSingleton = aBuilder.mFittableNonSingleton;
    mAnchored = aBuilder.mAnchored;
    mAnchorable = aBuilder.mAnchorable;
    mAllowRecycler = aBuilder.mAllowRecycler;
    mAllowManufacture = aBuilder.mAllowManufacture;
    mIconID = aBuilder.mIconID;
  }

  @Override
  public int getGroupID()
  {
    return mGroupID;
  }

  @Override
  public int getCategoryID()
  {
    return mCategoryID;
  }

  @Override
  public String getGroupName()
  {
    return mGroupName;
  }

  @Override
  public String getDescription()
  {
    return mDescription;
  }

  @Override
  public boolean isPublished()
  {
    return mPublished;
  }

  @Override
  public boolean isUseBasePrice()
  {
    return mUseBasePrice;
  }

  @Override
  public boolean isFittableNonSingleton()
  {
    return mFittableNonSingleton;
  }

  @Override
  public boolean isAnchored()
  {
    return mAnchored;
  }

  @Override
  public boolean isAnchorable()
  {
    return mAnchorable;
  }

  @Override
  public boolean isAllowRecycler()
  {
    return mAllowRecycler;
  }

  @Override
  public boolean isAllowManufacture()
  {
    return mAllowManufacture;
  }

  @Override
  public int getIconID()
  {
    return mIconID;
  }
  
  @Override
  public int hashCode()
  {
    return HASHCODE_PRIME * 1 + mGroupID;
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

    final Group other = (Group) aOther;

    if (mGroupID != other.getGroupID())
    {
      return false;
    }

    return true;
  }
}
