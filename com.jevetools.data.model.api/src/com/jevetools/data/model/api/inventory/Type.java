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
public interface Type
    extends Entity
{
  /**
   * @return the typeID
   * @since 0.0.1
   */
  int getTypeID();

  /**
   * @return the groupID
   * @since 0.0.1
   */
  int getGroupID();

  /**
   * @return the typeName
   * @since 0.0.1
   */
  String getTypeName();

  /**
   * @return the description
   * @since 0.0.1
   */
  String getDescription();

  /**
   * @return the graphicID
   * @since 0.0.1
   */
  int getGraphicID();

  /**
   * @return the radius
   * @since 0.0.1
   */
  double getRadius();

  /**
   * @return the mass
   * @since 0.0.1
   */
  double getMass();

  /**
   * @return the capacity
   * @since 0.0.1
   */
  double getCapacity();

  /**
   * @return the volume
   * @since 0.0.1
   */
  double getVolume();

  /**
   * @return the portionSize
   * @since 0.0.1
   */
  int getPortionSize();

  /**
   * @return the raceID
   * @since 0.0.1
   */
  int getRaceID();

  /**
   * @return the basePrice
   * @since 0.0.1
   */
  long getBasePrice();

  /**
   * @return the published
   * @since 0.0.1
   */
  boolean isPublished();

  /**
   * @return the marketGroupID
   * @since 0.0.1
   */
  int getMarketGroupID();

  /**
   * @return the chanceOfDuplicating
   * @since 0.0.1
   */
  double getChanceOfDuplicating();

  /**
   * @return the soundID
   * @since 0.0.1
   */
  int getSoundID();

  /**
   * @return the iconID
   * @since 0.0.1
   */
  int getIconID();
}
