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
import com.jevetools.data.model.api.inventory.MetaGroup;
import com.jevetools.data.model.api.inventory.impl.MetaGroupImpl;

/**
 * Copyright (c) 2013, jEVETools.
 * 
 * All rights reserved.
 * 
 * @version 0.0.1
 * @since 0.0.1
 */
public final class MetaGroupImplTest
    extends AbstractTest
{
  /**
   * Default values test.
   */
  @Test
  public void testDefault()
  {
    final MetaGroupImpl.Builder builder = new MetaGroupImpl.Builder();

    final MetaGroup testSubject = builder.build();

    assertThat(testSubject.getMetaGroupID(), equalTo(0));
    assertThat(testSubject.getMetaGroupName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getIconID(), equalTo(0));
  }

  /**
   * MetaGroupID test.
   */
  @Test
  public void testMetaGroupID()
  {
    final MetaGroupImpl.Builder builder = new MetaGroupImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.metaGroupID(expected);

    final MetaGroup testSubject = builder.build();

    assertThat(testSubject.getMetaGroupID(), equalTo(expected));
    assertThat(testSubject.getMetaGroupName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getIconID(), equalTo(0));
  }

  /**
   * MetaGroupName test.
   */
  @Test
  public void testMetaGroupName()
  {
    final MetaGroupImpl.Builder builder = new MetaGroupImpl.Builder();

    builder.metaGroupName(TEST_STRING);

    final MetaGroup testSubject = builder.build();

    assertThat(testSubject.getMetaGroupID(), equalTo(0));
    assertThat(testSubject.getMetaGroupName(), equalTo(TEST_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getIconID(), equalTo(0));
  }

  /**
   * Description test.
   */
  @Test
  public void testDescription()
  {
    final MetaGroupImpl.Builder builder = new MetaGroupImpl.Builder();

    builder.description(TEST_STRING);

    final MetaGroup testSubject = builder.build();

    assertThat(testSubject.getMetaGroupID(), equalTo(0));
    assertThat(testSubject.getMetaGroupName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(TEST_STRING));
    assertThat(testSubject.getIconID(), equalTo(0));
  }

  /**
   * IconID test.
   */
  @Test
  public void testIconNo()
  {
    final MetaGroupImpl.Builder builder = new MetaGroupImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.iconID(expected);

    final MetaGroup testSubject = builder.build();

    assertThat(testSubject.getMetaGroupID(), equalTo(0));
    assertThat(testSubject.getMetaGroupName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getIconID(), equalTo(expected));
  }

  /**
   * HashCode test.
   */
  @Test
  public void testHashCode()
  {
    final MetaGroupImpl.Builder builder1 = new MetaGroupImpl.Builder();
    final MetaGroupImpl.Builder builder2 = new MetaGroupImpl.Builder();
    final MetaGroupImpl.Builder builder3 = new MetaGroupImpl.Builder();

    builder1.metaGroupID(0);
    builder2.metaGroupID(0);
    builder3.metaGroupID(1);

    final MetaGroup testSubject1 = builder1.build();
    final MetaGroup testSubject2 = builder2.build();
    final MetaGroup testSubject3 = builder3.build();

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
    final MetaGroupImpl.Builder builder1 = new MetaGroupImpl.Builder();
    final MetaGroupImpl.Builder builder2 = new MetaGroupImpl.Builder();
    final MetaGroupImpl.Builder builder3 = new MetaGroupImpl.Builder();

    builder1.metaGroupID(0);
    builder2.metaGroupID(0);
    builder3.metaGroupID(1);

    final MetaGroup testSubject1 = builder1.build();
    final MetaGroup testSubject2 = builder2.build();
    final MetaGroup testSubject3 = builder3.build();

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
