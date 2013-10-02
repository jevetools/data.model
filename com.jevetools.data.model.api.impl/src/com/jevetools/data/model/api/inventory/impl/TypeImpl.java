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
import com.jevetools.data.model.api.inventory.Type;

/**
 * Copyright (c) 2013, jEVETools.
 * 
 * All rights reserved.
 * 
 * @version 0.0.1
 * @since 0.0.1
 */
public final class TypeImpl // NOPMD
    extends AbstractEntity
    implements Type
{ // NOPMD
  /**
   * The typeID.
   */
  private final int mTypeID;

  /**
   * The groupID.
   */
  private final int mGroupID;

  /**
   * The typeName.
   */
  private final String mTypeName;

  /**
   * The description.
   */
  private final String mDescription;

  /**
   * The graphicID.
   */
  private final int mGraphicID;

  /**
   * The radius.
   */
  private final double mRadius;

  /**
   * The mass.
   */
  private final double mMass;

  /**
   * The volume.
   */
  private final double mVolume;

  /**
   * The capacity.
   */
  private final double mCapacity;

  /**
   * The portionSize.
   */
  private final int mPortionSize;

  /**
   * The raceID.
   */
  private final int mRaceID;

  /**
   * The basePrice.
   */
  private final long mBasePrice;

  /**
   * The published.
   */
  private final boolean mPublished;

  /**
   * The marketGroupID.
   */
  private final int mMarketGroupID;

  /**
   * The chanceOfDuplicating.
   */
  private final double mChanceOfDuplicating; // NOPMD

  /**
   * The soundID.
   */
  private final int mSoundID;

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
  /**
   * @author developer
   *
   */
  public static final class Builder // NOPMD
      implements com.jevetools.data.model.api.Builder<Type>
  { // NOPMD
    /**
     * The typeID.
     */
    private int mTypeID;

    /**
     * The groupID.
     */
    private int mGroupID;

    /**
     * The typeName.
     */
    private String mTypeName;

    /**
     * The description.
     */
    private String mDescription;

    /**
     * The graphicID.
     */
    private int mGraphicID;

    /**
     * The radius.
     */
    private double mRadius;

    /**
     * The mass.
     */
    private double mMass;

    /**
     * The volume.
     */
    private double mVolume;

    /**
     * The capacity.
     */
    private double mCapacity;

    /**
     * The portionSize.
     */
    private int mPortionSize;

    /**
     * The raceID.
     */
    private int mRaceID;

    /**
     * The basePrice.
     */
    private long mBasePrice;

    /**
     * The published.
     */
    private boolean mPublished;

    /**
     * The marketGroupID.
     */
    private int mMarketGroupID;

    /**
     * The chanceOfDuplicating.
     */
    private double mChanceOfDuplicating; // NOPMD

    /**
     * The soundID.
     */
    private int mSoundID;

    /**
     * The iconID.
     */
    private int mIconID;

    /**
     * Default CTor.
     */
    public Builder()
    {
      mTypeName = "";
      mDescription = "";
    }

    /**
     * @param aTypeID the typeID
     */
    public void typeID(final int aTypeID)
    {
      mTypeID = aTypeID;
    }

    /**
     * @param aGroupID the groupID
     */
    public void groupID(final int aGroupID)
    {
      mGroupID = aGroupID;
    }

    /**
     * @param aTypeName the typeName
     */
    public void typeName(final String aTypeName)
    {
      mTypeName = aTypeName;
    }

    /**
     * @param aDescription the description
     */
    public void description(final String aDescription)
    {
      mDescription = aDescription;
    }

    /**
     * @param aGraphicID the graphicID
     */
    public void graphicID(final int aGraphicID)
    {
      mGraphicID = aGraphicID;
    }

    /**
     * @param aRadius the radius
     */
    public void radius(final double aRadius)
    {
      mRadius = aRadius;
    }

    /**
     * @param aMass the mass
     */
    public void mass(final double aMass)
    {
      mMass = aMass;
    }

    /**
     * @param aVolume the volume
     */
    public void volume(final double aVolume)
    {
      mVolume = aVolume;
    }

    /**
     * @param aCapacity the capacity
     */
    public void capacity(final double aCapacity)
    {
      mCapacity = aCapacity;
    }

    /**
     * @param aPortionSize the portionSize
     */
    public void portionSize(final int aPortionSize)
    {
      mPortionSize = aPortionSize;
    }

    /**
     * @param aRaceID the raceID
     */
    public void raceID(final int aRaceID)
    {
      mRaceID = aRaceID;
    }

    /**
     * @param aBasePrice the basePrice
     */
    public void basePrice(final long aBasePrice)
    {
      mBasePrice = aBasePrice;
    }

    /**
     * @param aPublished the published
     */
    public void published(final boolean aPublished)
    {
      mPublished = aPublished;
    }

    /**
     * @param aMarketGroupID the marketGroupID
     */
    public void marketGroupID(final int aMarketGroupID)
    {
      mMarketGroupID = aMarketGroupID;
    }

    /**
     * @param aChanceOfDuplicating the chanceOfDuplicating
     */
    public void chanceOfDuplicating(final double aChanceOfDuplicating)
    {
      mChanceOfDuplicating = aChanceOfDuplicating;
    }

    /**
     * @param aSoundID the soundID
     */
    public void soundID(final int aSoundID)
    {
      mSoundID = aSoundID;
    }

    /**
     * @param aIconID the iconID
     */
    public void iconID(final int aIconID)
    {
      mIconID = aIconID;
    }

    @Override
    public Type build()
    {
      return new TypeImpl(this);
    }
  };

  /**
   * @param aBuilder {@link Builder}
   */
  TypeImpl(final Builder aBuilder)
  {
    super();

    mTypeID = aBuilder.mTypeID;
    mGroupID = aBuilder.mGroupID;
    mTypeName = aBuilder.mTypeName;
    mDescription = aBuilder.mDescription;
    mGraphicID = aBuilder.mGraphicID;
    mRadius = aBuilder.mRadius;
    mMass = aBuilder.mMass;
    mVolume = aBuilder.mVolume;
    mCapacity = aBuilder.mCapacity;
    mPortionSize = aBuilder.mPortionSize;
    mRaceID = aBuilder.mRaceID;
    mBasePrice = aBuilder.mBasePrice;
    mPublished = aBuilder.mPublished;
    mMarketGroupID = aBuilder.mMarketGroupID;
    mChanceOfDuplicating = aBuilder.mChanceOfDuplicating;
    mSoundID = aBuilder.mSoundID;
    mIconID = aBuilder.mIconID;
  }

  @Override
  public int getTypeID()
  {
    return mTypeID;
  }

  @Override
  public int getGroupID()
  {
    return mGroupID;
  }

  @Override
  public String getTypeName()
  {
    return mTypeName;
  }

  @Override
  public String getDescription()
  {
    return mDescription;
  }

  @Override
  public int getGraphicID()
  {
    return mGraphicID;
  }

  @Override
  public double getRadius()
  {
    return mRadius;
  }

  @Override
  public double getMass()
  {
    return mMass;
  }

  @Override
  public double getVolume()
  {
    return mVolume;
  }

  @Override
  public double getCapacity()
  {
    return mCapacity;
  }

  @Override
  public int getPortionSize()
  {
    return mPortionSize;
  }

  @Override
  public int getRaceID()
  {
    return mRaceID;
  }

  @Override
  public long getBasePrice()
  {
    return mBasePrice;
  }

  @Override
  public boolean isPublished()
  {
    return mPublished;
  }

  @Override
  public int getMarketGroupID()
  {
    return mMarketGroupID;
  }

  @Override
  public double getChanceOfDuplicating()
  {
    return mChanceOfDuplicating;
  }

  @Override
  public int getSoundID()
  {
    return mSoundID;
  }

  @Override
  public int getIconID()
  {
    return mIconID;
  }

  @Override
  public int hashCode()
  {
    return HASHCODE_PRIME * 1 + mTypeID;
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

    final Type other = (Type) aOther;

    if (mTypeID != other.getTypeID())
    {
      return false;
    }

    return true;
  }
}
