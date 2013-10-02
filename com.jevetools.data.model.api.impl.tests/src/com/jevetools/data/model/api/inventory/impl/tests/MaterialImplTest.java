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
import com.jevetools.data.model.api.inventory.Material;
import com.jevetools.data.model.api.inventory.impl.MaterialImpl;

/**
 * Copyright (c) 2013, jEVETools.
 * 
 * All rights reserved.
 * 
 * @version 0.0.1
 * @since 0.0.1
 */
public final class MaterialImplTest
    extends AbstractTest
{
  /**
   * Default values test.
   */
  @Test
  public void testDefault()
  {
    final MaterialImpl.Builder builder = new MaterialImpl.Builder();

    final Material testSubject = builder.build();

    assertThat(testSubject.getMaterialTypeID(), equalTo(0));
    assertThat(testSubject.getTypeID(), equalTo(0));
    assertThat(testSubject.getQuantity(), equalTo(0));
  }

  /**
   * MaterialTypeID test.
   */
  @Test
  public void testSchematicID()
  {
    final MaterialImpl.Builder builder = new MaterialImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.materialTypeID(expected);

    final Material testSubject = builder.build();

    assertThat(testSubject.getMaterialTypeID(), equalTo(expected));
    assertThat(testSubject.getTypeID(), equalTo(0));
    assertThat(testSubject.getQuantity(), equalTo(0));
  }

  /**
   * TypeID test.
   */
  @Test
  public void testTypeID()
  {
    final MaterialImpl.Builder builder = new MaterialImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.typeID(expected);

    final Material testSubject = builder.build();

    assertThat(testSubject.getMaterialTypeID(), equalTo(0));
    assertThat(testSubject.getTypeID(), equalTo(expected));
    assertThat(testSubject.getQuantity(), equalTo(0));
  }

  /**
   * Quantity test.
   */
  @Test
  public void testQuantity()
  {
    final MaterialImpl.Builder builder = new MaterialImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.quantity(expected);

    final Material testSubject = builder.build();

    assertThat(testSubject.getMaterialTypeID(), equalTo(0));
    assertThat(testSubject.getTypeID(), equalTo(0));
    assertThat(testSubject.getQuantity(), equalTo(expected));
  }

  /**
   * HashCode test.
   */
  @Test
  public void testHashCode()
  {
    final MaterialImpl.Builder builder1 = new MaterialImpl.Builder();
    final MaterialImpl.Builder builder2 = new MaterialImpl.Builder();
    final MaterialImpl.Builder builder3 = new MaterialImpl.Builder();

    builder1.materialTypeID(0);
    builder1.typeID(0);
    builder2.materialTypeID(0);
    builder2.typeID(1);
    builder3.materialTypeID(1);
    builder3.typeID(0);

    final Material testSubject1 = builder1.build();
    final Material testSubject2 = builder2.build();
    final Material testSubject3 = builder3.build();

    assertThat(testSubject1.hashCode(), equalTo(testSubject1.hashCode()));
    assertThat(testSubject1.hashCode(), not(equalTo(testSubject2.hashCode())));
    assertThat(testSubject1.hashCode(), not(equalTo(testSubject3.hashCode())));

    assertThat(testSubject2.hashCode(), equalTo(testSubject2.hashCode()));
    assertThat(testSubject2.hashCode(), not(equalTo(testSubject1.hashCode())));
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
    final MaterialImpl.Builder builder1 = new MaterialImpl.Builder();
    final MaterialImpl.Builder builder2 = new MaterialImpl.Builder();
    final MaterialImpl.Builder builder3 = new MaterialImpl.Builder();
    final MaterialImpl.Builder builder4 = new MaterialImpl.Builder();

    builder1.materialTypeID(0);
    builder1.typeID(0);

    builder2.materialTypeID(0);
    builder2.typeID(1);

    builder3.materialTypeID(1);
    builder3.typeID(0);

    builder4.materialTypeID(1);
    builder4.typeID(0);

    final Material testSubject1 = builder1.build();
    final Material testSubject2 = builder2.build();
    final Material testSubject3 = builder3.build();
    final Material testSubject4 = builder4.build();

    assertThat(testSubject1, equalTo(testSubject1));
    assertThat(testSubject1, not(equalTo(testSubject2)));
    assertThat(testSubject1, not(equalTo(testSubject3)));
    assertThat(testSubject1, not(equalTo(testSubject4)));

    assertThat(testSubject2, equalTo(testSubject2));
    assertThat(testSubject2, not(equalTo(testSubject1)));
    assertThat(testSubject2, not(equalTo(testSubject3)));
    assertThat(testSubject2, not(equalTo(testSubject4)));

    assertThat(testSubject3, equalTo(testSubject3));
    assertThat(testSubject3, not(equalTo(testSubject1)));
    assertThat(testSubject3, not(equalTo(testSubject2)));
    assertThat(testSubject3, equalTo(testSubject4));

    assertThat(testSubject4, equalTo(testSubject4));
    assertThat(testSubject4, not(equalTo(testSubject1)));
    assertThat(testSubject4, not(equalTo(testSubject2)));
    assertThat(testSubject4, equalTo(testSubject3));

    assertThat(testSubject3, not(equalTo(null)));
    assertThat(testSubject3.equals(Boolean.TRUE), equalTo(false));
  }
}
