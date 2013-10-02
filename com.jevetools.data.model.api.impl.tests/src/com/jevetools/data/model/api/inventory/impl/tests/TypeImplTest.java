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
package com.jevetools.data.model.api.inventory.impl.tests;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.jevetools.data.model.api.impl.internal.tests.AbstractTest;
import com.jevetools.data.model.api.inventory.Type;
import com.jevetools.data.model.api.inventory.impl.TypeImpl;

/**
 * Copyright (c) 2013, jEVETools.
 * 
 * All rights reserved.
 * 
 * @version 0.0.1
 * @since 0.0.1
 */
public final class TypeImplTest
    extends AbstractTest
{ // NOPMD
  /**
   * Default values test.
   */
  @Test
  public void testDefault()
  {
    final TypeImpl.Builder builder = new TypeImpl.Builder();

    final Type testSubject = builder.build();

    assertThat(testSubject.getTypeID(), equalTo(0));
    assertThat(testSubject.getGroupID(), equalTo(0));
    assertThat(testSubject.getTypeName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getGraphicID(), equalTo(0));
    assertThat(testSubject.getRadius(), equalTo(0.0));
    assertThat(testSubject.getMass(), equalTo(0.0));
    assertThat(testSubject.getVolume(), equalTo(0.0));
    assertThat(testSubject.getCapacity(), equalTo(0.0));
    assertThat(testSubject.getPortionSize(), equalTo(0));
    assertThat(testSubject.getRaceID(), equalTo(0));
    assertThat(testSubject.getBasePrice(), equalTo(0L));
    assertThat(testSubject.isPublished(), equalTo(false));
    assertThat(testSubject.getMarketGroupID(), equalTo(0));
    assertThat(testSubject.getChanceOfDuplicating(), equalTo(0.0));
    assertThat(testSubject.getSoundID(), equalTo(0));
    assertThat(testSubject.getIconID(), equalTo(0));
  }

  /**
   * TypeID test.
   */
  @Test
  public void testTypeID()
  {
    final TypeImpl.Builder builder = new TypeImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.typeID(expected);

    final Type testSubject = builder.build();

    assertThat(testSubject.getTypeID(), equalTo(expected));
    assertThat(testSubject.getGroupID(), equalTo(0));
    assertThat(testSubject.getTypeName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getGraphicID(), equalTo(0));
    assertThat(testSubject.getRadius(), equalTo(0.0));
    assertThat(testSubject.getMass(), equalTo(0.0));
    assertThat(testSubject.getVolume(), equalTo(0.0));
    assertThat(testSubject.getCapacity(), equalTo(0.0));
    assertThat(testSubject.getPortionSize(), equalTo(0));
    assertThat(testSubject.getRaceID(), equalTo(0));
    assertThat(testSubject.getBasePrice(), equalTo(0L));
    assertThat(testSubject.isPublished(), equalTo(false));
    assertThat(testSubject.getMarketGroupID(), equalTo(0));
    assertThat(testSubject.getChanceOfDuplicating(), equalTo(0.0));
    assertThat(testSubject.getSoundID(), equalTo(0));
    assertThat(testSubject.getIconID(), equalTo(0));
  }

  /**
   * GroupID test.
   */
  @Test
  public void testGroupID()
  {
    final TypeImpl.Builder builder = new TypeImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.groupID(expected);

    final Type testSubject = builder.build();

    assertThat(testSubject.getTypeID(), equalTo(0));
    assertThat(testSubject.getGroupID(), equalTo(expected));
    assertThat(testSubject.getTypeName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getGraphicID(), equalTo(0));
    assertThat(testSubject.getRadius(), equalTo(0.0));
    assertThat(testSubject.getMass(), equalTo(0.0));
    assertThat(testSubject.getVolume(), equalTo(0.0));
    assertThat(testSubject.getCapacity(), equalTo(0.0));
    assertThat(testSubject.getPortionSize(), equalTo(0));
    assertThat(testSubject.getRaceID(), equalTo(0));
    assertThat(testSubject.getBasePrice(), equalTo(0L));
    assertThat(testSubject.isPublished(), equalTo(false));
    assertThat(testSubject.getMarketGroupID(), equalTo(0));
    assertThat(testSubject.getChanceOfDuplicating(), equalTo(0.0));
    assertThat(testSubject.getSoundID(), equalTo(0));
    assertThat(testSubject.getIconID(), equalTo(0));
  }

  /**
   * TypeName test.
   */
  @Test
  public void testTypeName()
  {
    final TypeImpl.Builder builder = new TypeImpl.Builder();

    builder.typeName(TEST_STRING);

    final Type testSubject = builder.build();

    assertThat(testSubject.getTypeID(), equalTo(0));
    assertThat(testSubject.getGroupID(), equalTo(0));
    assertThat(testSubject.getTypeName(), equalTo(TEST_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getGraphicID(), equalTo(0));
    assertThat(testSubject.getRadius(), equalTo(0.0));
    assertThat(testSubject.getMass(), equalTo(0.0));
    assertThat(testSubject.getVolume(), equalTo(0.0));
    assertThat(testSubject.getCapacity(), equalTo(0.0));
    assertThat(testSubject.getPortionSize(), equalTo(0));
    assertThat(testSubject.getRaceID(), equalTo(0));
    assertThat(testSubject.getBasePrice(), equalTo(0L));
    assertThat(testSubject.isPublished(), equalTo(false));
    assertThat(testSubject.getMarketGroupID(), equalTo(0));
    assertThat(testSubject.getChanceOfDuplicating(), equalTo(0.0));
    assertThat(testSubject.getSoundID(), equalTo(0));
    assertThat(testSubject.getIconID(), equalTo(0));
  }

  /**
   * Description test.
   */
  @Test
  public void testDescription()
  {
    final TypeImpl.Builder builder = new TypeImpl.Builder();

    builder.description(TEST_STRING);

    final Type testSubject = builder.build();

    assertThat(testSubject.getTypeID(), equalTo(0));
    assertThat(testSubject.getGroupID(), equalTo(0));
    assertThat(testSubject.getTypeName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(TEST_STRING));
    assertThat(testSubject.getGraphicID(), equalTo(0));
    assertThat(testSubject.getRadius(), equalTo(0.0));
    assertThat(testSubject.getMass(), equalTo(0.0));
    assertThat(testSubject.getVolume(), equalTo(0.0));
    assertThat(testSubject.getCapacity(), equalTo(0.0));
    assertThat(testSubject.getPortionSize(), equalTo(0));
    assertThat(testSubject.getRaceID(), equalTo(0));
    assertThat(testSubject.getBasePrice(), equalTo(0L));
    assertThat(testSubject.isPublished(), equalTo(false));
    assertThat(testSubject.getMarketGroupID(), equalTo(0));
    assertThat(testSubject.getChanceOfDuplicating(), equalTo(0.0));
    assertThat(testSubject.getSoundID(), equalTo(0));
    assertThat(testSubject.getIconID(), equalTo(0));
  }

  /**
   * GraphicID test.
   */
  @Test
  public void testGraphicID()
  {
    final TypeImpl.Builder builder = new TypeImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.graphicID(expected);

    final Type testSubject = builder.build();

    assertThat(testSubject.getTypeID(), equalTo(0));
    assertThat(testSubject.getGroupID(), equalTo(0));
    assertThat(testSubject.getTypeName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getGraphicID(), equalTo(expected));
    assertThat(testSubject.getRadius(), equalTo(0.0));
    assertThat(testSubject.getMass(), equalTo(0.0));
    assertThat(testSubject.getVolume(), equalTo(0.0));
    assertThat(testSubject.getCapacity(), equalTo(0.0));
    assertThat(testSubject.getPortionSize(), equalTo(0));
    assertThat(testSubject.getRaceID(), equalTo(0));
    assertThat(testSubject.getBasePrice(), equalTo(0L));
    assertThat(testSubject.isPublished(), equalTo(false));
    assertThat(testSubject.getMarketGroupID(), equalTo(0));
    assertThat(testSubject.getChanceOfDuplicating(), equalTo(0.0));
    assertThat(testSubject.getSoundID(), equalTo(0));
    assertThat(testSubject.getIconID(), equalTo(0));
  }

  /**
   * Radius test.
   */
  @Test
  public void testRadius()
  {
    final TypeImpl.Builder builder = new TypeImpl.Builder();

    final double expected = randomDouble(0, Double.MAX_VALUE - 1);

    builder.radius(expected);

    final Type testSubject = builder.build();

    assertThat(testSubject.getTypeID(), equalTo(0));
    assertThat(testSubject.getGroupID(), equalTo(0));
    assertThat(testSubject.getTypeName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getGraphicID(), equalTo(0));
    assertThat(testSubject.getRadius(), equalTo(expected));
    assertThat(testSubject.getMass(), equalTo(0.0));
    assertThat(testSubject.getVolume(), equalTo(0.0));
    assertThat(testSubject.getCapacity(), equalTo(0.0));
    assertThat(testSubject.getPortionSize(), equalTo(0));
    assertThat(testSubject.getRaceID(), equalTo(0));
    assertThat(testSubject.getBasePrice(), equalTo(0L));
    assertThat(testSubject.isPublished(), equalTo(false));
    assertThat(testSubject.getMarketGroupID(), equalTo(0));
    assertThat(testSubject.getChanceOfDuplicating(), equalTo(0.0));
    assertThat(testSubject.getSoundID(), equalTo(0));
    assertThat(testSubject.getIconID(), equalTo(0));
  }

  /**
   * Mass test.
   */
  @Test
  public void testMass()
  {
    final TypeImpl.Builder builder = new TypeImpl.Builder();

    final double expected = randomDouble(0, Double.MAX_VALUE - 1);

    builder.mass(expected);

    final Type testSubject = builder.build();

    assertThat(testSubject.getTypeID(), equalTo(0));
    assertThat(testSubject.getGroupID(), equalTo(0));
    assertThat(testSubject.getTypeName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getGraphicID(), equalTo(0));
    assertThat(testSubject.getRadius(), equalTo(0.0));
    assertThat(testSubject.getMass(), equalTo(expected));
    assertThat(testSubject.getVolume(), equalTo(0.0));
    assertThat(testSubject.getCapacity(), equalTo(0.0));
    assertThat(testSubject.getPortionSize(), equalTo(0));
    assertThat(testSubject.getRaceID(), equalTo(0));
    assertThat(testSubject.getBasePrice(), equalTo(0L));
    assertThat(testSubject.isPublished(), equalTo(false));
    assertThat(testSubject.getMarketGroupID(), equalTo(0));
    assertThat(testSubject.getChanceOfDuplicating(), equalTo(0.0));
    assertThat(testSubject.getSoundID(), equalTo(0));
    assertThat(testSubject.getIconID(), equalTo(0));
  }

  /**
   * Volume test.
   */
  @Test
  public void testVolume()
  {
    final TypeImpl.Builder builder = new TypeImpl.Builder();

    final double expected = randomDouble(0, Double.MAX_VALUE - 1);

    builder.volume(expected);

    final Type testSubject = builder.build();

    assertThat(testSubject.getTypeID(), equalTo(0));
    assertThat(testSubject.getGroupID(), equalTo(0));
    assertThat(testSubject.getTypeName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getGraphicID(), equalTo(0));
    assertThat(testSubject.getRadius(), equalTo(0.0));
    assertThat(testSubject.getMass(), equalTo(0.0));
    assertThat(testSubject.getVolume(), equalTo(expected));
    assertThat(testSubject.getCapacity(), equalTo(0.0));
    assertThat(testSubject.getPortionSize(), equalTo(0));
    assertThat(testSubject.getRaceID(), equalTo(0));
    assertThat(testSubject.getBasePrice(), equalTo(0L));
    assertThat(testSubject.isPublished(), equalTo(false));
    assertThat(testSubject.getMarketGroupID(), equalTo(0));
    assertThat(testSubject.getChanceOfDuplicating(), equalTo(0.0));
    assertThat(testSubject.getSoundID(), equalTo(0));
    assertThat(testSubject.getIconID(), equalTo(0));
  }

  /**
   * Capacity test.
   */
  @Test
  public void testCapacity()
  {
    final TypeImpl.Builder builder = new TypeImpl.Builder();

    final double expected = randomDouble(0, Double.MAX_VALUE - 1);

    builder.capacity(expected);

    final Type testSubject = builder.build();

    assertThat(testSubject.getTypeID(), equalTo(0));
    assertThat(testSubject.getGroupID(), equalTo(0));
    assertThat(testSubject.getTypeName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getGraphicID(), equalTo(0));
    assertThat(testSubject.getRadius(), equalTo(0.0));
    assertThat(testSubject.getMass(), equalTo(0.0));
    assertThat(testSubject.getVolume(), equalTo(0.0));
    assertThat(testSubject.getCapacity(), equalTo(expected));
    assertThat(testSubject.getPortionSize(), equalTo(0));
    assertThat(testSubject.getRaceID(), equalTo(0));
    assertThat(testSubject.getBasePrice(), equalTo(0L));
    assertThat(testSubject.isPublished(), equalTo(false));
    assertThat(testSubject.getMarketGroupID(), equalTo(0));
    assertThat(testSubject.getChanceOfDuplicating(), equalTo(0.0));
    assertThat(testSubject.getSoundID(), equalTo(0));
    assertThat(testSubject.getIconID(), equalTo(0));
  }

  /**
   * PortionSize test.
   */
  @Test
  public void testPortionSize()
  {
    final TypeImpl.Builder builder = new TypeImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.portionSize(expected);

    final Type testSubject = builder.build();

    assertThat(testSubject.getTypeID(), equalTo(0));
    assertThat(testSubject.getGroupID(), equalTo(0));
    assertThat(testSubject.getTypeName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getGraphicID(), equalTo(0));
    assertThat(testSubject.getRadius(), equalTo(0.0));
    assertThat(testSubject.getMass(), equalTo(0.0));
    assertThat(testSubject.getVolume(), equalTo(0.0));
    assertThat(testSubject.getCapacity(), equalTo(0.0));
    assertThat(testSubject.getPortionSize(), equalTo(expected));
    assertThat(testSubject.getRaceID(), equalTo(0));
    assertThat(testSubject.getBasePrice(), equalTo(0L));
    assertThat(testSubject.isPublished(), equalTo(false));
    assertThat(testSubject.getMarketGroupID(), equalTo(0));
    assertThat(testSubject.getChanceOfDuplicating(), equalTo(0.0));
    assertThat(testSubject.getSoundID(), equalTo(0));
    assertThat(testSubject.getIconID(), equalTo(0));
  }

  /**
   * RaceID test.
   */
  @Test
  public void testRaceID()
  {
    final TypeImpl.Builder builder = new TypeImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.raceID(expected);

    final Type testSubject = builder.build();

    assertThat(testSubject.getTypeID(), equalTo(0));
    assertThat(testSubject.getGroupID(), equalTo(0));
    assertThat(testSubject.getTypeName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getGraphicID(), equalTo(0));
    assertThat(testSubject.getRadius(), equalTo(0.0));
    assertThat(testSubject.getMass(), equalTo(0.0));
    assertThat(testSubject.getVolume(), equalTo(0.0));
    assertThat(testSubject.getCapacity(), equalTo(0.0));
    assertThat(testSubject.getPortionSize(), equalTo(0));
    assertThat(testSubject.getRaceID(), equalTo(expected));
    assertThat(testSubject.getBasePrice(), equalTo(0L));
    assertThat(testSubject.isPublished(), equalTo(false));
    assertThat(testSubject.getMarketGroupID(), equalTo(0));
    assertThat(testSubject.getChanceOfDuplicating(), equalTo(0.0));
    assertThat(testSubject.getSoundID(), equalTo(0));
    assertThat(testSubject.getIconID(), equalTo(0));
  }

  /**
   * BasePrice test.
   */
  @Test
  public void testBasePrice()
  {
    final TypeImpl.Builder builder = new TypeImpl.Builder();

    final long expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.basePrice(expected);

    final Type testSubject = builder.build();

    assertThat(testSubject.getTypeID(), equalTo(0));
    assertThat(testSubject.getGroupID(), equalTo(0));
    assertThat(testSubject.getTypeName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getGraphicID(), equalTo(0));
    assertThat(testSubject.getRadius(), equalTo(0.0));
    assertThat(testSubject.getMass(), equalTo(0.0));
    assertThat(testSubject.getVolume(), equalTo(0.0));
    assertThat(testSubject.getCapacity(), equalTo(0.0));
    assertThat(testSubject.getPortionSize(), equalTo(0));
    assertThat(testSubject.getRaceID(), equalTo(0));
    assertThat(testSubject.getBasePrice(), equalTo(expected));
    assertThat(testSubject.isPublished(), equalTo(false));
    assertThat(testSubject.getMarketGroupID(), equalTo(0));
    assertThat(testSubject.getChanceOfDuplicating(), equalTo(0.0));
    assertThat(testSubject.getSoundID(), equalTo(0));
    assertThat(testSubject.getIconID(), equalTo(0));
  }

  /**
   * Published test.
   */
  @Test
  public void testPublished()
  {
    final TypeImpl.Builder builder = new TypeImpl.Builder();

    builder.published(true);

    final Type testSubject = builder.build();

    assertThat(testSubject.getTypeID(), equalTo(0));
    assertThat(testSubject.getGroupID(), equalTo(0));
    assertThat(testSubject.getTypeName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getGraphicID(), equalTo(0));
    assertThat(testSubject.getRadius(), equalTo(0.0));
    assertThat(testSubject.getMass(), equalTo(0.0));
    assertThat(testSubject.getVolume(), equalTo(0.0));
    assertThat(testSubject.getCapacity(), equalTo(0.0));
    assertThat(testSubject.getPortionSize(), equalTo(0));
    assertThat(testSubject.getRaceID(), equalTo(0));
    assertThat(testSubject.getBasePrice(), equalTo(0L));
    assertThat(testSubject.isPublished(), equalTo(true));
    assertThat(testSubject.getMarketGroupID(), equalTo(0));
    assertThat(testSubject.getChanceOfDuplicating(), equalTo(0.0));
    assertThat(testSubject.getSoundID(), equalTo(0));
    assertThat(testSubject.getIconID(), equalTo(0));
  }

  /**
   * MarketGroupID test.
   */
  @Test
  public void testMarketGroupID()
  {
    final TypeImpl.Builder builder = new TypeImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.marketGroupID(expected);

    final Type testSubject = builder.build();

    assertThat(testSubject.getTypeID(), equalTo(0));
    assertThat(testSubject.getGroupID(), equalTo(0));
    assertThat(testSubject.getTypeName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getGraphicID(), equalTo(0));
    assertThat(testSubject.getRadius(), equalTo(0.0));
    assertThat(testSubject.getMass(), equalTo(0.0));
    assertThat(testSubject.getVolume(), equalTo(0.0));
    assertThat(testSubject.getCapacity(), equalTo(0.0));
    assertThat(testSubject.getPortionSize(), equalTo(0));
    assertThat(testSubject.getRaceID(), equalTo(0));
    assertThat(testSubject.getBasePrice(), equalTo(0L));
    assertThat(testSubject.isPublished(), equalTo(false));
    assertThat(testSubject.getMarketGroupID(), equalTo(expected));
    assertThat(testSubject.getChanceOfDuplicating(), equalTo(0.0));
    assertThat(testSubject.getSoundID(), equalTo(0));
    assertThat(testSubject.getIconID(), equalTo(0));
  }

  /**
   * ChanceOfDuplicating test.
   */
  @Test
  public void testChanceOfDuplicating()
  {
    final TypeImpl.Builder builder = new TypeImpl.Builder();

    final double expected = randomDouble(0, Double.MAX_VALUE - 1);

    builder.chanceOfDuplicating(expected);

    final Type testSubject = builder.build();

    assertThat(testSubject.getTypeID(), equalTo(0));
    assertThat(testSubject.getGroupID(), equalTo(0));
    assertThat(testSubject.getTypeName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getGraphicID(), equalTo(0));
    assertThat(testSubject.getRadius(), equalTo(0.0));
    assertThat(testSubject.getMass(), equalTo(0.0));
    assertThat(testSubject.getVolume(), equalTo(0.0));
    assertThat(testSubject.getCapacity(), equalTo(0.0));
    assertThat(testSubject.getPortionSize(), equalTo(0));
    assertThat(testSubject.getRaceID(), equalTo(0));
    assertThat(testSubject.getBasePrice(), equalTo(0L));
    assertThat(testSubject.isPublished(), equalTo(false));
    assertThat(testSubject.getMarketGroupID(), equalTo(0));
    assertThat(testSubject.getChanceOfDuplicating(), equalTo(expected));
    assertThat(testSubject.getSoundID(), equalTo(0));
    assertThat(testSubject.getIconID(), equalTo(0));
  }

  /**
   * SoundID test.
   */
  @Test
  public void testSoundID()
  {
    final TypeImpl.Builder builder = new TypeImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.soundID(expected);

    final Type testSubject = builder.build();

    assertThat(testSubject.getTypeID(), equalTo(0));
    assertThat(testSubject.getGroupID(), equalTo(0));
    assertThat(testSubject.getTypeName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getGraphicID(), equalTo(0));
    assertThat(testSubject.getRadius(), equalTo(0.0));
    assertThat(testSubject.getMass(), equalTo(0.0));
    assertThat(testSubject.getVolume(), equalTo(0.0));
    assertThat(testSubject.getCapacity(), equalTo(0.0));
    assertThat(testSubject.getPortionSize(), equalTo(0));
    assertThat(testSubject.getRaceID(), equalTo(0));
    assertThat(testSubject.getBasePrice(), equalTo(0L));
    assertThat(testSubject.isPublished(), equalTo(false));
    assertThat(testSubject.getMarketGroupID(), equalTo(0));
    assertThat(testSubject.getChanceOfDuplicating(), equalTo(0.0));
    assertThat(testSubject.getSoundID(), equalTo(expected));
    assertThat(testSubject.getIconID(), equalTo(0));
  }

  /**
   * IconID test.
   */
  @Test
  public void testIconID()
  {
    final TypeImpl.Builder builder = new TypeImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.iconID(expected);

    final Type testSubject = builder.build();

    assertThat(testSubject.getTypeID(), equalTo(0));
    assertThat(testSubject.getGroupID(), equalTo(0));
    assertThat(testSubject.getTypeName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getGraphicID(), equalTo(0));
    assertThat(testSubject.getRadius(), equalTo(0.0));
    assertThat(testSubject.getMass(), equalTo(0.0));
    assertThat(testSubject.getVolume(), equalTo(0.0));
    assertThat(testSubject.getCapacity(), equalTo(0.0));
    assertThat(testSubject.getPortionSize(), equalTo(0));
    assertThat(testSubject.getRaceID(), equalTo(0));
    assertThat(testSubject.getBasePrice(), equalTo(0L));
    assertThat(testSubject.isPublished(), equalTo(false));
    assertThat(testSubject.getMarketGroupID(), equalTo(0));
    assertThat(testSubject.getChanceOfDuplicating(), equalTo(0.0));
    assertThat(testSubject.getSoundID(), equalTo(0));
    assertThat(testSubject.getIconID(), equalTo(expected));
  }

  /**
   * HashCode test.
   */
  @Test
  public void testHashCode()
  {
    final TypeImpl.Builder builder1 = new TypeImpl.Builder();
    final TypeImpl.Builder builder2 = new TypeImpl.Builder();
    final TypeImpl.Builder builder3 = new TypeImpl.Builder();

    builder1.typeID(0);
    builder2.typeID(0);
    builder3.typeID(1);

    final Type testSubject1 = builder1.build();
    final Type testSubject2 = builder2.build();
    final Type testSubject3 = builder3.build();

    assertThat(testSubject1.hashCode(), equalTo(testSubject1.hashCode()));
    assertThat(testSubject1.hashCode(), equalTo(testSubject2.hashCode()));
    assertThat(testSubject1.hashCode(), not(equalTo(testSubject3.hashCode())));

    assertThat(testSubject2.hashCode(), equalTo(testSubject2.hashCode()));
    assertThat(testSubject2.hashCode(), equalTo(testSubject1.hashCode()));
    assertThat(testSubject2.hashCode(), not(equalTo(testSubject3.hashCode())));

    assertThat(testSubject3.hashCode(), equalTo(testSubject3.hashCode()));
    assertThat(testSubject3.hashCode(), not(equalTo(testSubject1.hashCode())));
    assertThat(testSubject3.hashCode(), not(equalTo(testSubject2.hashCode())));
  }

  /**
   * Equals test.
   */
  @Test
  public void testEquals()
  {
    final TypeImpl.Builder builder1 = new TypeImpl.Builder();
    final TypeImpl.Builder builder2 = new TypeImpl.Builder();
    final TypeImpl.Builder builder3 = new TypeImpl.Builder();

    builder1.typeID(0);
    builder2.typeID(0);
    builder3.typeID(1);

    final Type testSubject1 = builder1.build();
    final Type testSubject2 = builder2.build();
    final Type testSubject3 = builder3.build();

    assertThat(testSubject1, equalTo(testSubject1));
    assertThat(testSubject1, equalTo(testSubject2));
    assertThat(testSubject1, not(equalTo(testSubject3)));

    assertThat(testSubject2, equalTo(testSubject2));
    assertThat(testSubject2, equalTo(testSubject1));
    assertThat(testSubject2, not(equalTo(testSubject3)));

    assertThat(testSubject3, equalTo(testSubject3));
    assertThat(testSubject3, not(equalTo(testSubject1)));
    assertThat(testSubject3, not(equalTo(testSubject2)));

    assertThat(testSubject3, not(equalTo(null)));
    assertThat(testSubject3.equals(Boolean.TRUE), equalTo(false));
  }
}
