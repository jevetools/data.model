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
package com.jevetools.data.model.api.inventory;

import com.jevetools.data.model.api.Entity;

/**
 * Copyright (c) 2013, jEVETools.
 * 
 * All rights reserved.
 *
 * @version 0.0.1
 * @since 0.0.1
 */
public interface Blueprint
    extends Entity
{
  /**
   * @return the blueprintTypeID
   * @since 0.0.1
   */
  int getBlueprintTypeID();

  /**
   * @return the chanceOfReverseEngineering
   * @since 0.0.1
   */
  double getChanceOfReverseEngineering();

  /**
   * @return the materialModifier
   * @since 0.0.1
   */
  int getMaterialModifier();

  /**
   * @return the maxProductionLimit
   * @since 0.0.1
   */
  int getMaxProductionLimit();

  /**
   * @return the parentBlueprintTypeID
   * @since 0.0.1
   */
  int getParentBlueprintTypeID();

  /**
   * @return the productTypeID
   * @since 0.0.1
   */
  int getProductTypeID();

  /**
   * @return the productionTime
   * @since 0.0.1
   */
  int getProductionTime();

  /**
   * @return the productivityModifier
   * @since 0.0.1
   */
  int getProductivityModifier();

  /**
   * @return the researchCopyTime
   * @since 0.0.1
   */
  int getResearchCopyTime();

  /**
   * @return the researchMaterialTime
   * @since 0.0.1
   */
  int getResearchMaterialTime();

  /**
   * @return the researchProductivityTime
   * @since 0.0.1
   */
  int getResearchProductivityTime();

  /**
   * @return the researchTechTime
   * @since 0.0.1
   */
  int getResearchTechTime();

  /**
   * @return the techLevel
   * @since 0.0.1
   */
  int getTechLevel();

  /**
   * @return the wasteFactor
   * @since 0.0.1
   */
  int getWasteFactor();
}
