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
import com.jevetools.data.model.api.inventory.Blueprint;

/**
 * Copyright (c) 2013, jEVETools.
 * 
 * All rights reserved.
 * 
 * @version 0.0.1
 * @since 0.0.1
 */
public final class BlueprintImpl
    extends AbstractEntity
    implements Blueprint
{ // NOPMD
  /**
   * The blueprintTypeID.
   */
  private final int mBlueprintTypeID;

  /**
   * The chanceOfReverseEngineering.
   */
  private final double mChanceOfReverseEngineering;

  /**
   * The materialModifier.
   */
  private final int mMaterialModifier;

  /**
   * The maxProductionLimit.
   */
  private final int mMaxProductionLimit;

  /**
   * The parentBlueprintTypeID.
   */
  private final int mParentBlueprintTypeID;

  /**
   * The productTypeID.
   */
  private final int mProductTypeID;

  /**
   * The productionTime.
   */
  private final int mProductionTime;

  /**
   * The productivityModifier.
   */
  private final int mProductivityModifier;

  /**
   * The researchCopyTime.
   */
  private final int mResearchCopyTime;

  /**
   * The researchMaterialTime.
   */
  private final int mResearchMaterialTime;

  /**
   * The researchProductivityTime.
   */
  private final int mResearchProductivityTime;

  /**
   * The researchTechTime.
   */
  private final int mResearchTechTime;

  /**
   * The techLevel.
   */
  private final int mTechLevel;

  /**
   * The wasteFactor.
   */
  private final int mWasteFactor;

  /**
   * Copyright (c) 2013, jEVETools.
   * 
   * All rights reserved.
   *
   * @version 0.0.1
   * @since 0.0.1
   */
  public static final class Builder
      implements com.jevetools.data.model.api.Builder<Blueprint>
  { // NOPMD
    /**
     * The blueprintTypeID.
     */
    private int mBlueprintTypeID;

    /**
     * The chanceOfReverseEngineering.
     */
    private double mChanceOfReverseEngineering;

    /**
     * The materialModifier.
     */
    private int mMaterialModifier;

    /**
     * The maxProductionLimit.
     */
    private int mMaxProductionLimit;

    /**
     * The parentBlueprintTypeID.
     */
    private int mParentBlueprintTypeID;

    /**
     * The productTypeID.
     */
    private int mProductTypeID;

    /**
     * The productionTime.
     */
    private int mProductionTime;

    /**
     * The productivityModifier.
     */
    private int mProductivityModifier;

    /**
     * The researchCopyTime.
     */
    private int mResearchCopyTime;

    /**
     * The researchMaterialTime.
     */
    private int mResearchMaterialTime;

    /**
     * The researchProductivityTime.
     */
    private int mResearchProductivityTime;

    /**
     * The researchTechTime.
     */
    private int mResearchTechTime;

    /**
     * The techLevel.
     */
    private int mTechLevel;

    /**
     * The wasteFactor.
     */
    private int mWasteFactor;

    /**
     * @param aBlueprintTypeID the blueprintTypeID
     */
    public void blueprintTypeID(final int aBlueprintTypeID)
    {
      mBlueprintTypeID = aBlueprintTypeID;
    }

    /**
     * @param aChanceOfReverseEngineering the chanceOfReverseEngineering
     */
    public void chanceOfReverseEngineering(
        final double aChanceOfReverseEngineering)
    {
      mChanceOfReverseEngineering = aChanceOfReverseEngineering;
    }

    /**
     * @param aMaterialModifier the materialModifier
     */
    public void materialModifier(final int aMaterialModifier)
    {
      mMaterialModifier = aMaterialModifier;
    }

    /**
     * @param aMaxProductionLimit the maxProductionLimit
     */
    public void maxProductionLimit(final int aMaxProductionLimit)
    {
      mMaxProductionLimit = aMaxProductionLimit;
    }

    /**
     * @param aParentBlueprintTypeID the parentBlueprintTypeID
     */
    public void parentBlueprintTypeID(final int aParentBlueprintTypeID)
    {
      mParentBlueprintTypeID = aParentBlueprintTypeID;
    }

    /**
     * @param aProductTypeID the productTypeID
     */
    public void productTypeID(final int aProductTypeID)
    {
      mProductTypeID = aProductTypeID;
    }

    /**
     * @param aProductionTime the productionTime
     */
    public void productionTime(final int aProductionTime)
    {
      mProductionTime = aProductionTime;
    }

    /**
     * @param aProductivityModifier the productivityModifier
     */
    public void productivityModifier(final int aProductivityModifier)
    {
      mProductivityModifier = aProductivityModifier;
    }

    /**
     * @param aResearchCopyTime the researchCopyTime
     */
    public void researchCopyTime(final int aResearchCopyTime)
    {
      mResearchCopyTime = aResearchCopyTime;
    }

    /**
     * @param aResearchMaterialTime the researchMaterialTime
     */
    public void researchMaterialTime(final int aResearchMaterialTime)
    {
      mResearchMaterialTime = aResearchMaterialTime;
    }

    /**
     * @param aResearchProductivityTime the researchProductivityTime
     */
    public void researchProductivityTime(final int aResearchProductivityTime)
    {
      mResearchProductivityTime = aResearchProductivityTime;
    }

    /**
     * @param aResearchTechTime the researchTechTime
     */
    public void researchTechTime(final int aResearchTechTime)
    {
      mResearchTechTime = aResearchTechTime;
    }

    /**
     * @param aTechLevel the techLevel
     */
    public void techLevel(final int aTechLevel)
    {
      mTechLevel = aTechLevel;
    }

    /**
     * @param aWasteFactor the wasteFactor
     */
    public void wasteFactor(final int aWasteFactor)
    {
      mWasteFactor = aWasteFactor;
    }

    @Override
    public Blueprint build()
    {
      return new BlueprintImpl(this);
    }
  };

  /**
   * @param aBuilder {@link Builder}
   */
  BlueprintImpl(final Builder aBuilder)
  {
    super();

    mBlueprintTypeID = aBuilder.mBlueprintTypeID;
    mChanceOfReverseEngineering = aBuilder.mChanceOfReverseEngineering;
    mMaterialModifier = aBuilder.mMaterialModifier;
    mMaxProductionLimit = aBuilder.mMaxProductionLimit;
    mParentBlueprintTypeID = aBuilder.mParentBlueprintTypeID;
    mProductTypeID = aBuilder.mProductTypeID;
    mProductionTime = aBuilder.mProductionTime;
    mProductivityModifier = aBuilder.mProductivityModifier;
    mResearchCopyTime = aBuilder.mResearchCopyTime;
    mResearchMaterialTime = aBuilder.mResearchMaterialTime;
    mResearchProductivityTime = aBuilder.mResearchProductivityTime;
    mResearchTechTime = aBuilder.mResearchTechTime;
    mTechLevel = aBuilder.mTechLevel;
    mWasteFactor = aBuilder.mWasteFactor;
  }

  @Override
  public int getBlueprintTypeID()
  {
    return mBlueprintTypeID;
  }

  @Override
  public double getChanceOfReverseEngineering()
  {
    return mChanceOfReverseEngineering;
  }

  @Override
  public int getMaterialModifier()
  {
    return mMaterialModifier;
  }

  @Override
  public int getMaxProductionLimit()
  {
    return mMaxProductionLimit;
  }

  @Override
  public int getParentBlueprintTypeID()
  {
    return mParentBlueprintTypeID;
  }

  @Override
  public int getProductTypeID()
  {
    return mProductTypeID;
  }

  @Override
  public int getProductionTime()
  {
    return mProductionTime;
  }

  @Override
  public int getProductivityModifier()
  {
    return mProductivityModifier;
  }

  @Override
  public int getResearchCopyTime()
  {
    return mResearchCopyTime;
  }

  @Override
  public int getResearchMaterialTime()
  {
    return mResearchMaterialTime;
  }

  @Override
  public int getResearchProductivityTime()
  {
    return mResearchProductivityTime;
  }

  @Override
  public int getResearchTechTime()
  {
    return mResearchTechTime;
  }

  @Override
  public int getTechLevel()
  {
    return mTechLevel;
  }

  @Override
  public int getWasteFactor()
  {
    return mWasteFactor;
  }

  @Override
  public int hashCode()
  {
    return HASHCODE_PRIME * 1 + mBlueprintTypeID;
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

    final Blueprint other = (Blueprint) aOther;

    if (mBlueprintTypeID != other.getBlueprintTypeID())
    {
      return false;
    }

    return true;
  }
}
