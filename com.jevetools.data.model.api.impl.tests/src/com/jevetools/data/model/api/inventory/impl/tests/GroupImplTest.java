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
import com.jevetools.data.model.api.inventory.Group;
import com.jevetools.data.model.api.inventory.impl.GroupImpl;

/**
 * Copyright (c) 2013, jEVETools.
 * 
 * All rights reserved.
 * 
 * @version 0.0.1
 * @since 0.0.1
 */
public final class GroupImplTest
    extends AbstractTest
{ // NOPMD
  /**
   * Default values test.
   */
  @Test
  public void testDefault()
  {
    final GroupImpl.Builder builder = new GroupImpl.Builder();

    final Group testSubject = builder.build();

    assertThat(testSubject.getGroupID(), equalTo(0));
    assertThat(testSubject.getCategoryID(), equalTo(0));
    assertThat(testSubject.getGroupName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getIconID(), equalTo(0));
    assertThat(testSubject.isPublished(), equalTo(false));
    assertThat(testSubject.isUseBasePrice(), equalTo(false));
    assertThat(testSubject.isFittableNonSingleton(), equalTo(false));
    assertThat(testSubject.isAnchored(), equalTo(false));
    assertThat(testSubject.isAnchorable(), equalTo(false));
    assertThat(testSubject.isAllowRecycler(), equalTo(false));
    assertThat(testSubject.isAllowManufacture(), equalTo(false));
    assertThat(testSubject.isAllowManufacture(), equalTo(false));
  }

  /**
   * GroupID test.
   */
  @Test
  public void testGroupID()
  {
    final GroupImpl.Builder builder = new GroupImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.groupID(expected);

    final Group testSubject = builder.build();

    assertThat(testSubject.getGroupID(), equalTo(expected));
    assertThat(testSubject.getCategoryID(), equalTo(0));
    assertThat(testSubject.getGroupName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getIconID(), equalTo(0));
    assertThat(testSubject.isPublished(), equalTo(false));
    assertThat(testSubject.isUseBasePrice(), equalTo(false));
    assertThat(testSubject.isFittableNonSingleton(), equalTo(false));
    assertThat(testSubject.isAnchored(), equalTo(false));
    assertThat(testSubject.isAnchorable(), equalTo(false));
    assertThat(testSubject.isAllowRecycler(), equalTo(false));
    assertThat(testSubject.isAllowManufacture(), equalTo(false));
  }

  /**
   * CategoryID test.
   */
  @Test
  public void testCategoryID()
  {
    final GroupImpl.Builder builder = new GroupImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.categoryID(expected);

    final Group testSubject = builder.build();

    assertThat(testSubject.getGroupID(), equalTo(0));
    assertThat(testSubject.getCategoryID(), equalTo(expected));
    assertThat(testSubject.getGroupName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getIconID(), equalTo(0));
    assertThat(testSubject.isPublished(), equalTo(false));
    assertThat(testSubject.isUseBasePrice(), equalTo(false));
    assertThat(testSubject.isFittableNonSingleton(), equalTo(false));
    assertThat(testSubject.isAnchored(), equalTo(false));
    assertThat(testSubject.isAnchorable(), equalTo(false));
    assertThat(testSubject.isAllowRecycler(), equalTo(false));
    assertThat(testSubject.isAllowManufacture(), equalTo(false));
  }

  /**
   * GroupName test.
   */
  @Test
  public void testGroupName()
  {
    final GroupImpl.Builder builder = new GroupImpl.Builder();

    builder.groupName(TEST_STRING);

    final Group testSubject = builder.build();

    assertThat(testSubject.getGroupID(), equalTo(0));
    assertThat(testSubject.getCategoryID(), equalTo(0));
    assertThat(testSubject.getGroupName(), equalTo(TEST_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getIconID(), equalTo(0));
    assertThat(testSubject.isPublished(), equalTo(false));
    assertThat(testSubject.isUseBasePrice(), equalTo(false));
    assertThat(testSubject.isFittableNonSingleton(), equalTo(false));
    assertThat(testSubject.isAnchored(), equalTo(false));
    assertThat(testSubject.isAnchorable(), equalTo(false));
    assertThat(testSubject.isAllowRecycler(), equalTo(false));
    assertThat(testSubject.isAllowManufacture(), equalTo(false));
  }

  /**
   * Description test.
   */
  @Test
  public void testDescription()
  {
    final GroupImpl.Builder builder = new GroupImpl.Builder();

    builder.description(TEST_STRING);

    final Group testSubject = builder.build();

    assertThat(testSubject.getGroupID(), equalTo(0));
    assertThat(testSubject.getCategoryID(), equalTo(0));
    assertThat(testSubject.getGroupName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(TEST_STRING));
    assertThat(testSubject.getIconID(), equalTo(0));
    assertThat(testSubject.isPublished(), equalTo(false));
    assertThat(testSubject.isUseBasePrice(), equalTo(false));
    assertThat(testSubject.isFittableNonSingleton(), equalTo(false));
    assertThat(testSubject.isAnchored(), equalTo(false));
    assertThat(testSubject.isAnchorable(), equalTo(false));
    assertThat(testSubject.isAllowRecycler(), equalTo(false));
    assertThat(testSubject.isAllowManufacture(), equalTo(false));
  }

  /**
   * IconID test.
   */
  @Test
  public void testIconNo()
  {
    final GroupImpl.Builder builder = new GroupImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.iconID(expected);

    final Group testSubject = builder.build();

    assertThat(testSubject.getGroupID(), equalTo(0));
    assertThat(testSubject.getCategoryID(), equalTo(0));
    assertThat(testSubject.getGroupName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getIconID(), equalTo(expected));
    assertThat(testSubject.isPublished(), equalTo(false));
    assertThat(testSubject.isUseBasePrice(), equalTo(false));
    assertThat(testSubject.isFittableNonSingleton(), equalTo(false));
    assertThat(testSubject.isAnchored(), equalTo(false));
    assertThat(testSubject.isAnchorable(), equalTo(false));
    assertThat(testSubject.isAllowRecycler(), equalTo(false));
    assertThat(testSubject.isAllowManufacture(), equalTo(false));
  }

  /**
   * Published test.
   */
  @Test
  public void testPublished()
  {
    final GroupImpl.Builder builder = new GroupImpl.Builder();

    builder.published(true);

    final Group testSubject = builder.build();

    assertThat(testSubject.getGroupID(), equalTo(0));
    assertThat(testSubject.getCategoryID(), equalTo(0));
    assertThat(testSubject.getGroupName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getIconID(), equalTo(0));
    assertThat(testSubject.isPublished(), equalTo(true));
    assertThat(testSubject.isUseBasePrice(), equalTo(false));
    assertThat(testSubject.isFittableNonSingleton(), equalTo(false));
    assertThat(testSubject.isAnchored(), equalTo(false));
    assertThat(testSubject.isAnchorable(), equalTo(false));
    assertThat(testSubject.isAllowRecycler(), equalTo(false));
    assertThat(testSubject.isAllowManufacture(), equalTo(false));
  }

  /**
   * UseBasePrice test.
   */
  @Test
  public void testUseBasePrice()
  {
    final GroupImpl.Builder builder = new GroupImpl.Builder();

    builder.useBasePrice(true);
    
    final Group testSubject = builder.build();

    assertThat(testSubject.getGroupID(), equalTo(0));
    assertThat(testSubject.getCategoryID(), equalTo(0));
    assertThat(testSubject.getGroupName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getIconID(), equalTo(0));
    assertThat(testSubject.isPublished(), equalTo(false));
    assertThat(testSubject.isUseBasePrice(), equalTo(true));
    assertThat(testSubject.isFittableNonSingleton(), equalTo(false));
    assertThat(testSubject.isAnchored(), equalTo(false));
    assertThat(testSubject.isAnchorable(), equalTo(false));
    assertThat(testSubject.isAllowRecycler(), equalTo(false));
    assertThat(testSubject.isAllowManufacture(), equalTo(false));
  }

  /**
   * FittableNonSingleton test.
   */
  @Test
  public void testFittableNonSingleton()
  {
    final GroupImpl.Builder builder = new GroupImpl.Builder();

    builder.fittableNonSingleton(true);
    
    final Group testSubject = builder.build();

    assertThat(testSubject.getGroupID(), equalTo(0));
    assertThat(testSubject.getCategoryID(), equalTo(0));
    assertThat(testSubject.getGroupName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getIconID(), equalTo(0));
    assertThat(testSubject.isPublished(), equalTo(false));
    assertThat(testSubject.isUseBasePrice(), equalTo(false));
    assertThat(testSubject.isFittableNonSingleton(), equalTo(true));
    assertThat(testSubject.isAnchored(), equalTo(false));
    assertThat(testSubject.isAnchorable(), equalTo(false));
    assertThat(testSubject.isAllowRecycler(), equalTo(false));
    assertThat(testSubject.isAllowManufacture(), equalTo(false));
  }

  /**
   * Anchored test.
   */
  @Test
  public void testAnchored()
  {
    final GroupImpl.Builder builder = new GroupImpl.Builder();

    builder.anchored(true);
    
    final Group testSubject = builder.build();

    assertThat(testSubject.getGroupID(), equalTo(0));
    assertThat(testSubject.getCategoryID(), equalTo(0));
    assertThat(testSubject.getGroupName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getIconID(), equalTo(0));
    assertThat(testSubject.isPublished(), equalTo(false));
    assertThat(testSubject.isUseBasePrice(), equalTo(false));
    assertThat(testSubject.isFittableNonSingleton(), equalTo(false));
    assertThat(testSubject.isAnchored(), equalTo(true));
    assertThat(testSubject.isAnchorable(), equalTo(false));
    assertThat(testSubject.isAllowRecycler(), equalTo(false));
    assertThat(testSubject.isAllowManufacture(), equalTo(false));
  }

  /**
   * Anchorable test.
   */
  @Test
  public void testAnchorable()
  {
    final GroupImpl.Builder builder = new GroupImpl.Builder();

    builder.anchorable(true);
    
    final Group testSubject = builder.build();

    assertThat(testSubject.getGroupID(), equalTo(0));
    assertThat(testSubject.getCategoryID(), equalTo(0));
    assertThat(testSubject.getGroupName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getIconID(), equalTo(0));
    assertThat(testSubject.isPublished(), equalTo(false));
    assertThat(testSubject.isUseBasePrice(), equalTo(false));
    assertThat(testSubject.isFittableNonSingleton(), equalTo(false));
    assertThat(testSubject.isAnchored(), equalTo(false));
    assertThat(testSubject.isAnchorable(), equalTo(true));
    assertThat(testSubject.isAllowRecycler(), equalTo(false));
    assertThat(testSubject.isAllowManufacture(), equalTo(false));
  }

  /**
   * AllowRecycler test.
   */
  @Test
  public void testAllowRecycler()
  {
    final GroupImpl.Builder builder = new GroupImpl.Builder();

    builder.allowRecycler(true);
    
    final Group testSubject = builder.build();

    assertThat(testSubject.getGroupID(), equalTo(0));
    assertThat(testSubject.getCategoryID(), equalTo(0));
    assertThat(testSubject.getGroupName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getIconID(), equalTo(0));
    assertThat(testSubject.isPublished(), equalTo(false));
    assertThat(testSubject.isUseBasePrice(), equalTo(false));
    assertThat(testSubject.isFittableNonSingleton(), equalTo(false));
    assertThat(testSubject.isAnchored(), equalTo(false));
    assertThat(testSubject.isAnchorable(), equalTo(false));
    assertThat(testSubject.isAllowRecycler(), equalTo(true));
    assertThat(testSubject.isAllowManufacture(), equalTo(false));
  }

  /**
   * AllowManufacture test.
   */
  @Test
  public void testAllowManufacture()
  {
    final GroupImpl.Builder builder = new GroupImpl.Builder();

    builder.allowManufacture(true);
    
    final Group testSubject = builder.build();

    assertThat(testSubject.getGroupID(), equalTo(0));
    assertThat(testSubject.getCategoryID(), equalTo(0));
    assertThat(testSubject.getGroupName(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getDescription(), equalTo(EMPTY_STRING));
    assertThat(testSubject.getIconID(), equalTo(0));
    assertThat(testSubject.isPublished(), equalTo(false));
    assertThat(testSubject.isUseBasePrice(), equalTo(false));
    assertThat(testSubject.isFittableNonSingleton(), equalTo(false));
    assertThat(testSubject.isAnchored(), equalTo(false));
    assertThat(testSubject.isAnchorable(), equalTo(false));
    assertThat(testSubject.isAllowRecycler(), equalTo(false));
    assertThat(testSubject.isAllowManufacture(), equalTo(true));
  }

  /**
   * HashCode test.
   */
  @Test
  public void testHashCode()
  {
    final GroupImpl.Builder builder1 = new GroupImpl.Builder();
    final GroupImpl.Builder builder2 = new GroupImpl.Builder();
    final GroupImpl.Builder builder3 = new GroupImpl.Builder();

    builder1.groupID(0);
    builder2.groupID(0);
    builder3.groupID(1);

    final Group testSubject1 = builder1.build();
    final Group testSubject2 = builder2.build();
    final Group testSubject3 = builder3.build();

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
    final GroupImpl.Builder builder1 = new GroupImpl.Builder();
    final GroupImpl.Builder builder2 = new GroupImpl.Builder();
    final GroupImpl.Builder builder3 = new GroupImpl.Builder();

    builder1.groupID(0);
    builder2.groupID(0);
    builder3.groupID(1);

    final Group testSubject1 = builder1.build();
    final Group testSubject2 = builder2.build();
    final Group testSubject3 = builder3.build();

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
