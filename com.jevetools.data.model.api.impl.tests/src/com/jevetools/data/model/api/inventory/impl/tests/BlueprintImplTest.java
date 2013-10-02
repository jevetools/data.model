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
import com.jevetools.data.model.api.inventory.Blueprint;
import com.jevetools.data.model.api.inventory.impl.BlueprintImpl;

/**
 * Copyright (c) 2013, jEVETools.
 * 
 * All rights reserved.
 * 
 * @version 0.0.1
 * @since 0.0.1
 */
public final class BlueprintImplTest
    extends AbstractTest
{ // NOPMD
  /**
   * Default values test.
   */
  @Test
  public void testDefault()
  {
    final BlueprintImpl.Builder builder = new BlueprintImpl.Builder();

    final Blueprint testSubject = builder.build();

    assertThat(testSubject.getBlueprintTypeID(), equalTo(0));
    assertThat(testSubject.getChanceOfReverseEngineering(), equalTo(0.0));
    assertThat(testSubject.getMaterialModifier(), equalTo(0));
    assertThat(testSubject.getMaxProductionLimit(), equalTo(0));
    assertThat(testSubject.getParentBlueprintTypeID(), equalTo(0));
    assertThat(testSubject.getProductTypeID(), equalTo(0));
    assertThat(testSubject.getProductionTime(), equalTo(0));
    assertThat(testSubject.getProductivityModifier(), equalTo(0));
    assertThat(testSubject.getResearchCopyTime(), equalTo(0));
    assertThat(testSubject.getResearchMaterialTime(), equalTo(0));
    assertThat(testSubject.getResearchProductivityTime(), equalTo(0));
    assertThat(testSubject.getResearchTechTime(), equalTo(0));
    assertThat(testSubject.getTechLevel(), equalTo(0));
    assertThat(testSubject.getWasteFactor(), equalTo(0));
  }

  /**
   * BlueprintTypeID test.
   */
  @Test
  public void testBlueprintID()
  {
    final BlueprintImpl.Builder builder = new BlueprintImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.blueprintTypeID(expected);

    final Blueprint testSubject = builder.build();

    assertThat(testSubject.getBlueprintTypeID(), equalTo(expected));
    assertThat(testSubject.getChanceOfReverseEngineering(), equalTo(0.0));
    assertThat(testSubject.getMaterialModifier(), equalTo(0));
    assertThat(testSubject.getMaxProductionLimit(), equalTo(0));
    assertThat(testSubject.getParentBlueprintTypeID(), equalTo(0));
    assertThat(testSubject.getProductTypeID(), equalTo(0));
    assertThat(testSubject.getProductionTime(), equalTo(0));
    assertThat(testSubject.getProductivityModifier(), equalTo(0));
    assertThat(testSubject.getResearchCopyTime(), equalTo(0));
    assertThat(testSubject.getResearchMaterialTime(), equalTo(0));
    assertThat(testSubject.getResearchProductivityTime(), equalTo(0));
    assertThat(testSubject.getResearchTechTime(), equalTo(0));
    assertThat(testSubject.getTechLevel(), equalTo(0));
    assertThat(testSubject.getWasteFactor(), equalTo(0));
  }

  /**
   * ChanceOfReverseEngineering test.
   */
  @Test
  public void testChanceOfReverseEngineering()
  {
    final BlueprintImpl.Builder builder = new BlueprintImpl.Builder();

    final double expected = randomDouble(0, Double.MAX_VALUE - 1);

    builder.chanceOfReverseEngineering(expected);

    final Blueprint testSubject = builder.build();

    assertThat(testSubject.getBlueprintTypeID(), equalTo(0));
    assertThat(testSubject.getChanceOfReverseEngineering(), equalTo(expected));
    assertThat(testSubject.getMaterialModifier(), equalTo(0));
    assertThat(testSubject.getMaxProductionLimit(), equalTo(0));
    assertThat(testSubject.getParentBlueprintTypeID(), equalTo(0));
    assertThat(testSubject.getProductTypeID(), equalTo(0));
    assertThat(testSubject.getProductionTime(), equalTo(0));
    assertThat(testSubject.getProductivityModifier(), equalTo(0));
    assertThat(testSubject.getResearchCopyTime(), equalTo(0));
    assertThat(testSubject.getResearchMaterialTime(), equalTo(0));
    assertThat(testSubject.getResearchProductivityTime(), equalTo(0));
    assertThat(testSubject.getResearchTechTime(), equalTo(0));
    assertThat(testSubject.getTechLevel(), equalTo(0));
    assertThat(testSubject.getWasteFactor(), equalTo(0));
  }

  /**
   * MaterialModifier test.
   */
  @Test
  public void testMaterialModifier()
  {
    final BlueprintImpl.Builder builder = new BlueprintImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.materialModifier(expected);

    final Blueprint testSubject = builder.build();

    assertThat(testSubject.getBlueprintTypeID(), equalTo(0));
    assertThat(testSubject.getChanceOfReverseEngineering(), equalTo(0.0));
    assertThat(testSubject.getMaterialModifier(), equalTo(expected));
    assertThat(testSubject.getMaxProductionLimit(), equalTo(0));
    assertThat(testSubject.getParentBlueprintTypeID(), equalTo(0));
    assertThat(testSubject.getProductTypeID(), equalTo(0));
    assertThat(testSubject.getProductionTime(), equalTo(0));
    assertThat(testSubject.getProductivityModifier(), equalTo(0));
    assertThat(testSubject.getResearchCopyTime(), equalTo(0));
    assertThat(testSubject.getResearchMaterialTime(), equalTo(0));
    assertThat(testSubject.getResearchProductivityTime(), equalTo(0));
    assertThat(testSubject.getResearchTechTime(), equalTo(0));
    assertThat(testSubject.getTechLevel(), equalTo(0));
    assertThat(testSubject.getWasteFactor(), equalTo(0));
  }

  /**
   * MaxProductionLimit test.
   */
  @Test
  public void testMaxProductionLimit()
  {
    final BlueprintImpl.Builder builder = new BlueprintImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.maxProductionLimit(expected);

    final Blueprint testSubject = builder.build();

    assertThat(testSubject.getBlueprintTypeID(), equalTo(0));
    assertThat(testSubject.getChanceOfReverseEngineering(), equalTo(0.0));
    assertThat(testSubject.getMaterialModifier(), equalTo(0));
    assertThat(testSubject.getMaxProductionLimit(), equalTo(expected));
    assertThat(testSubject.getParentBlueprintTypeID(), equalTo(0));
    assertThat(testSubject.getProductTypeID(), equalTo(0));
    assertThat(testSubject.getProductionTime(), equalTo(0));
    assertThat(testSubject.getProductivityModifier(), equalTo(0));
    assertThat(testSubject.getResearchCopyTime(), equalTo(0));
    assertThat(testSubject.getResearchMaterialTime(), equalTo(0));
    assertThat(testSubject.getResearchProductivityTime(), equalTo(0));
    assertThat(testSubject.getResearchTechTime(), equalTo(0));
    assertThat(testSubject.getTechLevel(), equalTo(0));
    assertThat(testSubject.getWasteFactor(), equalTo(0));
  }

  /**
   * ParentBlueprintTypeID test.
   */
  @Test
  public void testParentBlueprintTypeID()
  {
    final BlueprintImpl.Builder builder = new BlueprintImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.parentBlueprintTypeID(expected);

    final Blueprint testSubject = builder.build();

    assertThat(testSubject.getBlueprintTypeID(), equalTo(0));
    assertThat(testSubject.getChanceOfReverseEngineering(), equalTo(0.0));
    assertThat(testSubject.getMaterialModifier(), equalTo(0));
    assertThat(testSubject.getMaxProductionLimit(), equalTo(0));
    assertThat(testSubject.getParentBlueprintTypeID(), equalTo(expected));
    assertThat(testSubject.getProductTypeID(), equalTo(0));
    assertThat(testSubject.getProductionTime(), equalTo(0));
    assertThat(testSubject.getProductivityModifier(), equalTo(0));
    assertThat(testSubject.getResearchCopyTime(), equalTo(0));
    assertThat(testSubject.getResearchMaterialTime(), equalTo(0));
    assertThat(testSubject.getResearchProductivityTime(), equalTo(0));
    assertThat(testSubject.getResearchTechTime(), equalTo(0));
    assertThat(testSubject.getTechLevel(), equalTo(0));
    assertThat(testSubject.getWasteFactor(), equalTo(0));
  }

  /**
   * ProductTypeID test.
   */
  @Test
  public void testProductTypeID()
  {
    final BlueprintImpl.Builder builder = new BlueprintImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.productTypeID(expected);

    final Blueprint testSubject = builder.build();

    assertThat(testSubject.getBlueprintTypeID(), equalTo(0));
    assertThat(testSubject.getChanceOfReverseEngineering(), equalTo(0.0));
    assertThat(testSubject.getMaterialModifier(), equalTo(0));
    assertThat(testSubject.getMaxProductionLimit(), equalTo(0));
    assertThat(testSubject.getParentBlueprintTypeID(), equalTo(0));
    assertThat(testSubject.getProductTypeID(), equalTo(expected));
    assertThat(testSubject.getProductionTime(), equalTo(0));
    assertThat(testSubject.getProductivityModifier(), equalTo(0));
    assertThat(testSubject.getResearchCopyTime(), equalTo(0));
    assertThat(testSubject.getResearchMaterialTime(), equalTo(0));
    assertThat(testSubject.getResearchProductivityTime(), equalTo(0));
    assertThat(testSubject.getResearchTechTime(), equalTo(0));
    assertThat(testSubject.getTechLevel(), equalTo(0));
    assertThat(testSubject.getWasteFactor(), equalTo(0));
  }

  /**ProductionTime
   * MaterialModifier test.
   */
  @Test
  public void testProductionTime()
  {
    final BlueprintImpl.Builder builder = new BlueprintImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.productionTime(expected);

    final Blueprint testSubject = builder.build();

    assertThat(testSubject.getBlueprintTypeID(), equalTo(0));
    assertThat(testSubject.getChanceOfReverseEngineering(), equalTo(0.0));
    assertThat(testSubject.getMaterialModifier(), equalTo(0));
    assertThat(testSubject.getMaxProductionLimit(), equalTo(0));
    assertThat(testSubject.getParentBlueprintTypeID(), equalTo(0));
    assertThat(testSubject.getProductTypeID(), equalTo(0));
    assertThat(testSubject.getProductionTime(), equalTo(expected));
    assertThat(testSubject.getProductivityModifier(), equalTo(0));
    assertThat(testSubject.getResearchCopyTime(), equalTo(0));
    assertThat(testSubject.getResearchMaterialTime(), equalTo(0));
    assertThat(testSubject.getResearchProductivityTime(), equalTo(0));
    assertThat(testSubject.getResearchTechTime(), equalTo(0));
    assertThat(testSubject.getTechLevel(), equalTo(0));
    assertThat(testSubject.getWasteFactor(), equalTo(0));
  }

  /**
   * ProductivityModifier test.
   */
  @Test
  public void testProductivityModifier()
  {
    final BlueprintImpl.Builder builder = new BlueprintImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.productivityModifier(expected);

    final Blueprint testSubject = builder.build();

    assertThat(testSubject.getBlueprintTypeID(), equalTo(0));
    assertThat(testSubject.getChanceOfReverseEngineering(), equalTo(0.0));
    assertThat(testSubject.getMaterialModifier(), equalTo(0));
    assertThat(testSubject.getMaxProductionLimit(), equalTo(0));
    assertThat(testSubject.getParentBlueprintTypeID(), equalTo(0));
    assertThat(testSubject.getProductTypeID(), equalTo(0));
    assertThat(testSubject.getProductionTime(), equalTo(0));
    assertThat(testSubject.getProductivityModifier(), equalTo(expected));
    assertThat(testSubject.getResearchCopyTime(), equalTo(0));
    assertThat(testSubject.getResearchMaterialTime(), equalTo(0));
    assertThat(testSubject.getResearchProductivityTime(), equalTo(0));
    assertThat(testSubject.getResearchTechTime(), equalTo(0));
    assertThat(testSubject.getTechLevel(), equalTo(0));
    assertThat(testSubject.getWasteFactor(), equalTo(0));
  }

  /**
   * ResearchCopyTime test.
   */
  @Test
  public void testResearchCopyTime()
  {
    final BlueprintImpl.Builder builder = new BlueprintImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.researchCopyTime(expected);

    final Blueprint testSubject = builder.build();

    assertThat(testSubject.getBlueprintTypeID(), equalTo(0));
    assertThat(testSubject.getChanceOfReverseEngineering(), equalTo(0.0));
    assertThat(testSubject.getMaterialModifier(), equalTo(0));
    assertThat(testSubject.getMaxProductionLimit(), equalTo(0));
    assertThat(testSubject.getParentBlueprintTypeID(), equalTo(0));
    assertThat(testSubject.getProductTypeID(), equalTo(0));
    assertThat(testSubject.getProductionTime(), equalTo(0));
    assertThat(testSubject.getProductivityModifier(), equalTo(0));
    assertThat(testSubject.getResearchCopyTime(), equalTo(expected));
    assertThat(testSubject.getResearchMaterialTime(), equalTo(0));
    assertThat(testSubject.getResearchProductivityTime(), equalTo(0));
    assertThat(testSubject.getResearchTechTime(), equalTo(0));
    assertThat(testSubject.getTechLevel(), equalTo(0));
    assertThat(testSubject.getWasteFactor(), equalTo(0));
  }

  /**
   * ResearchMaterialTime test.
   */
  @Test
  public void testResearchMaterialTime()
  {
    final BlueprintImpl.Builder builder = new BlueprintImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.researchMaterialTime(expected);

    final Blueprint testSubject = builder.build();

    assertThat(testSubject.getBlueprintTypeID(), equalTo(0));
    assertThat(testSubject.getChanceOfReverseEngineering(), equalTo(0.0));
    assertThat(testSubject.getMaterialModifier(), equalTo(0));
    assertThat(testSubject.getMaxProductionLimit(), equalTo(0));
    assertThat(testSubject.getParentBlueprintTypeID(), equalTo(0));
    assertThat(testSubject.getProductTypeID(), equalTo(0));
    assertThat(testSubject.getProductionTime(), equalTo(0));
    assertThat(testSubject.getProductivityModifier(), equalTo(0));
    assertThat(testSubject.getResearchCopyTime(), equalTo(0));
    assertThat(testSubject.getResearchMaterialTime(), equalTo(expected));
    assertThat(testSubject.getResearchProductivityTime(), equalTo(0));
    assertThat(testSubject.getResearchTechTime(), equalTo(0));
    assertThat(testSubject.getTechLevel(), equalTo(0));
    assertThat(testSubject.getWasteFactor(), equalTo(0));
  }

  /**
   * ResearchProductivityTime test.
   */
  @Test
  public void testResearchProductivityTime()
  {
    final BlueprintImpl.Builder builder = new BlueprintImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.researchProductivityTime(expected);

    final Blueprint testSubject = builder.build();

    assertThat(testSubject.getBlueprintTypeID(), equalTo(0));
    assertThat(testSubject.getChanceOfReverseEngineering(), equalTo(0.0));
    assertThat(testSubject.getMaterialModifier(), equalTo(0));
    assertThat(testSubject.getMaxProductionLimit(), equalTo(0));
    assertThat(testSubject.getParentBlueprintTypeID(), equalTo(0));
    assertThat(testSubject.getProductTypeID(), equalTo(0));
    assertThat(testSubject.getProductionTime(), equalTo(0));
    assertThat(testSubject.getProductivityModifier(), equalTo(0));
    assertThat(testSubject.getResearchCopyTime(), equalTo(0));
    assertThat(testSubject.getResearchMaterialTime(), equalTo(0));
    assertThat(testSubject.getResearchProductivityTime(), equalTo(expected));
    assertThat(testSubject.getResearchTechTime(), equalTo(0));
    assertThat(testSubject.getTechLevel(), equalTo(0));
    assertThat(testSubject.getWasteFactor(), equalTo(0));
  }

  /**
   * ResearchTechTime test.
   */
  @Test
  public void testResearchTechTime()
  {
    final BlueprintImpl.Builder builder = new BlueprintImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.researchTechTime(expected);

    final Blueprint testSubject = builder.build();

    assertThat(testSubject.getBlueprintTypeID(), equalTo(0));
    assertThat(testSubject.getChanceOfReverseEngineering(), equalTo(0.0));
    assertThat(testSubject.getMaterialModifier(), equalTo(0));
    assertThat(testSubject.getMaxProductionLimit(), equalTo(0));
    assertThat(testSubject.getParentBlueprintTypeID(), equalTo(0));
    assertThat(testSubject.getProductTypeID(), equalTo(0));
    assertThat(testSubject.getProductionTime(), equalTo(0));
    assertThat(testSubject.getProductivityModifier(), equalTo(0));
    assertThat(testSubject.getResearchCopyTime(), equalTo(0));
    assertThat(testSubject.getResearchMaterialTime(), equalTo(0));
    assertThat(testSubject.getResearchProductivityTime(), equalTo(0));
    assertThat(testSubject.getResearchTechTime(), equalTo(expected));
    assertThat(testSubject.getTechLevel(), equalTo(0));
    assertThat(testSubject.getWasteFactor(), equalTo(0));
  }

  /**
   * TechLevel test.
   */
  @Test
  public void testTechLevel()
  {
    final BlueprintImpl.Builder builder = new BlueprintImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.techLevel(expected);

    final Blueprint testSubject = builder.build();

    assertThat(testSubject.getBlueprintTypeID(), equalTo(0));
    assertThat(testSubject.getChanceOfReverseEngineering(), equalTo(0.0));
    assertThat(testSubject.getMaterialModifier(), equalTo(0));
    assertThat(testSubject.getMaxProductionLimit(), equalTo(0));
    assertThat(testSubject.getParentBlueprintTypeID(), equalTo(0));
    assertThat(testSubject.getProductTypeID(), equalTo(0));
    assertThat(testSubject.getProductionTime(), equalTo(0));
    assertThat(testSubject.getProductivityModifier(), equalTo(0));
    assertThat(testSubject.getResearchCopyTime(), equalTo(0));
    assertThat(testSubject.getResearchMaterialTime(), equalTo(0));
    assertThat(testSubject.getResearchProductivityTime(), equalTo(0));
    assertThat(testSubject.getResearchTechTime(), equalTo(0));
    assertThat(testSubject.getTechLevel(), equalTo(expected));
    assertThat(testSubject.getWasteFactor(), equalTo(0));
  }

  /**
   * WasteFactor test.
   */
  @Test
  public void testWasteFactor()
  {
    final BlueprintImpl.Builder builder = new BlueprintImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.wasteFactor(expected);

    final Blueprint testSubject = builder.build();

    assertThat(testSubject.getBlueprintTypeID(), equalTo(0));
    assertThat(testSubject.getChanceOfReverseEngineering(), equalTo(0.0));
    assertThat(testSubject.getMaterialModifier(), equalTo(0));
    assertThat(testSubject.getMaxProductionLimit(), equalTo(0));
    assertThat(testSubject.getParentBlueprintTypeID(), equalTo(0));
    assertThat(testSubject.getProductTypeID(), equalTo(0));
    assertThat(testSubject.getProductionTime(), equalTo(0));
    assertThat(testSubject.getProductivityModifier(), equalTo(0));
    assertThat(testSubject.getResearchCopyTime(), equalTo(0));
    assertThat(testSubject.getResearchMaterialTime(), equalTo(0));
    assertThat(testSubject.getResearchProductivityTime(), equalTo(0));
    assertThat(testSubject.getResearchTechTime(), equalTo(0));
    assertThat(testSubject.getTechLevel(), equalTo(0));
    assertThat(testSubject.getWasteFactor(), equalTo(expected));
  }

  /**
   * HashCode test.
   */
  @Test
  public void testHashCode()
  {
    final BlueprintImpl.Builder builder1 = new BlueprintImpl.Builder();
    final BlueprintImpl.Builder builder2 = new BlueprintImpl.Builder();
    final BlueprintImpl.Builder builder3 = new BlueprintImpl.Builder();

    builder1.blueprintTypeID(0);
    builder2.blueprintTypeID(0);
    builder3.blueprintTypeID(1);

    final Blueprint testSubject1 = builder1.build();
    final Blueprint testSubject2 = builder2.build();
    final Blueprint testSubject3 = builder3.build();

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
    final BlueprintImpl.Builder builder1 = new BlueprintImpl.Builder();
    final BlueprintImpl.Builder builder2 = new BlueprintImpl.Builder();
    final BlueprintImpl.Builder builder3 = new BlueprintImpl.Builder();

    builder1.blueprintTypeID(0);
    builder2.blueprintTypeID(0);
    builder3.blueprintTypeID(1);

    final Blueprint testSubject1 = builder1.build();
    final Blueprint testSubject2 = builder2.build();
    final Blueprint testSubject3 = builder3.build();

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
