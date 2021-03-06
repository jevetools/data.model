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
import com.jevetools.data.model.api.inventory.Category;

/**
 * Copyright (c) 2013, jEVETools.
 * 
 * All rights reserved.
 * 
 * @version 0.0.1
 * @since 0.0.1
 */
public final class CategoryImpl
    extends AbstractEntity
    implements Category
{
  /**
   * The categoryID.
   */
  private final int mCategoryID;

  /**
   * The categoryName.
   */
  private final String mCategoryName;

  /**
   * The description.
   */
  private final String mDescription;

  /**
   * The published.
   */
  private final boolean mPublished;

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
      implements com.jevetools.data.model.api.Builder<Category>
  {
    /**
     * The categoryID.
     */
    private int mCategoryID;

    /**
     * The categoryName.
     */
    private String mCategoryName;

    /**
     * The description.
     */
    private String mDescription;

    /**
     * The published.
     */
    private boolean mPublished;

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
      
      mCategoryName = "";
      mDescription = "";
    }

    /**
     * @param aCategoryID the categoryID
     */
    public void categoryID(final int aCategoryID)
    {
      mCategoryID = aCategoryID;
    }

    /**
     * @param aCategoryName the categoryName
     */
    public void categoryName(final String aCategoryName)
    {
      mCategoryName = aCategoryName;
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
     * @param aIconID the iconID
     */
    public void iconID(final int aIconID)
    {
      mIconID = aIconID;
    }

    @Override
    public Category build()
    {
      return new CategoryImpl(this);
    }
  };

  /**
   * @param aBuilder {@link Builder}
   */
  CategoryImpl(final Builder aBuilder)
  {
    super();

    mCategoryID = aBuilder.mCategoryID;
    mCategoryName = aBuilder.mCategoryName;
    mDescription = aBuilder.mDescription;
    mPublished = aBuilder.mPublished;
    mIconID = aBuilder.mIconID;
  }

  @Override
  public int getCategoryID()
  {
    return mCategoryID;
  }

  @Override
  public String getCategoryName()
  {
    return mCategoryName;
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
  public int getIconID()
  {
    return mIconID;
  }
  
  @Override
  public int hashCode()
  {
    return HASHCODE_PRIME * 1 + mCategoryID;
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

    final Category other = (Category) aOther;

    if (mCategoryID != other.getCategoryID())
    {
      return false;
    }

    return true;
  }
}
