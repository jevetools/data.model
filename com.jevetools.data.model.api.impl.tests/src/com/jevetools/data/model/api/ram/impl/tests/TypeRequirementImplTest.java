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
package com.jevetools.data.model.api.ram.impl.tests;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.jevetools.data.model.api.impl.internal.tests.AbstractTest;
import com.jevetools.data.model.api.ram.TypeRequirement;
import com.jevetools.data.model.api.ram.impl.TypeRequirementImpl;
import com.jevetools.data.model.api.ram.impl.TypeRequirementImpl.Builder;

/**
 * Copyright (c) 2013, jEVETools.
 * 
 * All rights reserved.
 * 
 * @version 0.0.1
 * @since 0.0.1
 */
public final class TypeRequirementImplTest
    extends AbstractTest
{
  /**
   * Default values test.
   */
  @Test
  public void testDefault()
  {
    final TypeRequirementImpl.Builder builder = getBuilder();

    final TypeRequirement testSubject = builder.build();

    assertThat(testSubject.getActivityID(), equalTo(0));
    assertThat(testSubject.getDamagePerJob(), equalTo(0.0));
    assertThat(testSubject.getQuantity(), equalTo(0));
    assertThat(testSubject.getRequiredTypeID(), equalTo(0));
    assertThat(testSubject.getTypeID(), equalTo(0));
    assertThat(testSubject.isRecycle(), equalTo(false));
  }

  /**
   * ActivityID values test.
   */
  @Test
  public void testActivityID()
  {
    final TypeRequirementImpl.Builder builder = getBuilder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.activityID(expected);

    final TypeRequirement testSubject = builder.build();

    assertThat(testSubject.getActivityID(), equalTo(expected));
    assertThat(testSubject.getDamagePerJob(), equalTo(0.0));
    assertThat(testSubject.getQuantity(), equalTo(0));
    assertThat(testSubject.getRequiredTypeID(), equalTo(0));
    assertThat(testSubject.getTypeID(), equalTo(0));
    assertThat(testSubject.isRecycle(), equalTo(false));
  }

  /**
   * DamagePerJob values test.
   */
  @Test
  public void testDamagePerJob()
  {
    final TypeRequirementImpl.Builder builder = getBuilder();

    final double expected = randomDouble(0, Double.MAX_VALUE);

    builder.damagePerJob(expected);

    final TypeRequirement testSubject = builder.build();

    assertThat(testSubject.getActivityID(), equalTo(0));
    assertThat(testSubject.getDamagePerJob(), equalTo(expected));
    assertThat(testSubject.getQuantity(), equalTo(0));
    assertThat(testSubject.getRequiredTypeID(), equalTo(0));
    assertThat(testSubject.getTypeID(), equalTo(0));
    assertThat(testSubject.isRecycle(), equalTo(false));
  }

  /**
   * Quantity values test.
   */
  @Test
  public void testQuantity()
  {
    final TypeRequirementImpl.Builder builder = getBuilder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.quantity(expected);

    final TypeRequirement testSubject = builder.build();

    assertThat(testSubject.getActivityID(), equalTo(0));
    assertThat(testSubject.getDamagePerJob(), equalTo(0.0));
    assertThat(testSubject.getQuantity(), equalTo(expected));
    assertThat(testSubject.getRequiredTypeID(), equalTo(0));
    assertThat(testSubject.getTypeID(), equalTo(0));
    assertThat(testSubject.isRecycle(), equalTo(false));
  }

  /**
   * RequiredTypeID values test.
   */
  @Test
  public void testRequiredTypeID()
  {
    final TypeRequirementImpl.Builder builder = getBuilder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.requiredTypeID(expected);

    final TypeRequirement testSubject = builder.build();

    assertThat(testSubject.getActivityID(), equalTo(0));
    assertThat(testSubject.getDamagePerJob(), equalTo(0.0));
    assertThat(testSubject.getQuantity(), equalTo(0));
    assertThat(testSubject.getRequiredTypeID(), equalTo(expected));
    assertThat(testSubject.getTypeID(), equalTo(0));
    assertThat(testSubject.isRecycle(), equalTo(false));
  }

  /**
   * TypeID values test.
   */
  @Test
  public void testTypeID()
  {
    final TypeRequirementImpl.Builder builder = getBuilder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.typeID(expected);

    final TypeRequirement testSubject = builder.build();

    assertThat(testSubject.getActivityID(), equalTo(0));
    assertThat(testSubject.getDamagePerJob(), equalTo(0.0));
    assertThat(testSubject.getQuantity(), equalTo(0));
    assertThat(testSubject.getRequiredTypeID(), equalTo(0));
    assertThat(testSubject.getTypeID(), equalTo(expected));
    assertThat(testSubject.isRecycle(), equalTo(false));
  }

  /**
   * Recycle values test.
   */
  @Test
  public void testRecycle()
  {
    final TypeRequirementImpl.Builder builder = getBuilder();

    builder.recycle(true);

    final TypeRequirement testSubject = builder.build();

    assertThat(testSubject.getActivityID(), equalTo(0));
    assertThat(testSubject.getDamagePerJob(), equalTo(0.0));
    assertThat(testSubject.getQuantity(), equalTo(0));
    assertThat(testSubject.getRequiredTypeID(), equalTo(0));
    assertThat(testSubject.getTypeID(), equalTo(0));
    assertThat(testSubject.isRecycle(), equalTo(true));
  }

  /**
   * @return (@link TypeRequirementImpl.Builder}
   */
  private Builder getBuilder()
  {
    return new TypeRequirementImpl.Builder();
  }

  /**
   * HashCode test.
   */
  @Test
  public void testHashCode()
  {
    final TypeRequirementImpl.Builder builder1 = getBuilder();
    final TypeRequirementImpl.Builder builder2 = getBuilder();
    final TypeRequirementImpl.Builder builder3 = getBuilder();
    final TypeRequirementImpl.Builder builder4 = getBuilder();

    builder1.activityID(0);
    builder1.requiredTypeID(0);
    
    builder2.activityID(0);
    builder2.requiredTypeID(1);
    
    builder3.activityID(1);
    builder3.requiredTypeID(0);
    
    builder4.activityID(1);
    builder4.requiredTypeID(0);
    builder4.typeID(1);
    
    final TypeRequirement testSubject1 = builder1.build();
    final TypeRequirement testSubject2 = builder2.build();
    final TypeRequirement testSubject3 = builder3.build();
    final TypeRequirement testSubject4 = builder4.build();

    assertThat(testSubject1.hashCode(), equalTo(testSubject1.hashCode()));
    assertThat(testSubject1.hashCode(), not(equalTo(testSubject2.hashCode())));
    assertThat(testSubject1.hashCode(), not(equalTo(testSubject3.hashCode())));
    assertThat(testSubject1.hashCode(), not(equalTo(testSubject4.hashCode())));
    
    assertThat(testSubject2.hashCode(), equalTo(testSubject2.hashCode()));
    assertThat(testSubject2.hashCode(), not(equalTo(testSubject1.hashCode())));
    assertThat(testSubject2.hashCode(), not(equalTo(testSubject3.hashCode())));
    assertThat(testSubject2.hashCode(), not(equalTo(testSubject4.hashCode())));

    assertThat(testSubject3.hashCode(), equalTo(testSubject3.hashCode()));
    assertThat(testSubject3.hashCode(), not(equalTo(testSubject1.hashCode())));
    assertThat(testSubject3.hashCode(), not(equalTo(testSubject2.hashCode())));
    assertThat(testSubject3.hashCode(), not(equalTo(testSubject4.hashCode())));

    assertThat(testSubject4.hashCode(), equalTo(testSubject4.hashCode()));
    assertThat(testSubject4.hashCode(), not(equalTo(testSubject1.hashCode())));
    assertThat(testSubject4.hashCode(), not(equalTo(testSubject2.hashCode())));
    assertThat(testSubject4.hashCode(), not(equalTo(testSubject3.hashCode())));
  }

  /**
   * Equals test.
   */
  @Test
  public void testEquals()
  {
    final TypeRequirementImpl.Builder builder1 = getBuilder();
    final TypeRequirementImpl.Builder builder2 = getBuilder();
    final TypeRequirementImpl.Builder builder3 = getBuilder();
    final TypeRequirementImpl.Builder builder4 = getBuilder();
    final TypeRequirementImpl.Builder builder5 = getBuilder();

    builder1.activityID(0);
    builder1.requiredTypeID(0);
    
    builder2.activityID(0);
    builder2.requiredTypeID(1);
    
    builder3.activityID(1);
    builder3.requiredTypeID(0);
    
    builder4.activityID(1);
    builder4.requiredTypeID(0);

    builder5.activityID(1);
    builder5.requiredTypeID(0);
    builder5.typeID(1);

    final TypeRequirement testSubject1 = builder1.build();
    final TypeRequirement testSubject2 = builder2.build();
    final TypeRequirement testSubject3 = builder3.build();
    final TypeRequirement testSubject4 = builder4.build();
    final TypeRequirement testSubject5 = builder5.build();

    assertThat(testSubject1, equalTo(testSubject1));
    assertThat(testSubject1, not(equalTo(testSubject2)));
    assertThat(testSubject1, not(equalTo(testSubject3)));
    assertThat(testSubject1, not(equalTo(testSubject4)));
    assertThat(testSubject1, not(equalTo(testSubject5)));
    
    assertThat(testSubject2, equalTo(testSubject2));
    assertThat(testSubject2, not(equalTo(testSubject1)));
    assertThat(testSubject2, not(equalTo(testSubject3)));
    assertThat(testSubject2, not(equalTo(testSubject4)));
    assertThat(testSubject2, not(equalTo(testSubject5)));
    
    assertThat(testSubject3, equalTo(testSubject3));
    assertThat(testSubject3, not(equalTo(testSubject1)));
    assertThat(testSubject3, not(equalTo(testSubject2)));
    assertThat(testSubject3, equalTo(testSubject4));
    assertThat(testSubject3, not(equalTo(testSubject5)));

    assertThat(testSubject4, equalTo(testSubject4));
    assertThat(testSubject4, not(equalTo(testSubject1)));
    assertThat(testSubject4, not(equalTo(testSubject2)));
    assertThat(testSubject4, equalTo(testSubject3));
    assertThat(testSubject4, not(equalTo(testSubject5)));

    assertThat(testSubject5, equalTo(testSubject5));
    assertThat(testSubject5, not(equalTo(testSubject1)));
    assertThat(testSubject5, not(equalTo(testSubject2)));
    assertThat(testSubject5, not(equalTo(testSubject3)));
    assertThat(testSubject5, not(equalTo(testSubject4)));

    assertThat(testSubject3, not(equalTo(null)));
    assertThat(testSubject3.equals(Boolean.TRUE), equalTo(false));
  }
}
