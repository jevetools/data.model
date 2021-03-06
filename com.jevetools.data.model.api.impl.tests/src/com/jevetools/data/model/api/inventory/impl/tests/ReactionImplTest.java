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
import com.jevetools.data.model.api.inventory.Reaction;
import com.jevetools.data.model.api.inventory.impl.ReactionImpl;

/**
 * Copyright (c) 2013, jEVETools.
 * 
 * All rights reserved.
 * 
 * @version 0.0.1
 * @since 0.0.1
 */
public final class ReactionImplTest
    extends AbstractTest
{
  /**
   * Default values test.
   */
  @Test
  public void testDefault()
  {
    final ReactionImpl.Builder builder = new ReactionImpl.Builder();

    final Reaction testSubject = builder.build();

    assertThat(testSubject.getReactionTypeID(), equalTo(0));
    assertThat(testSubject.getTypeID(), equalTo(0));
    assertThat(testSubject.getQuantity(), equalTo(0));
    assertThat(testSubject.isInput(), equalTo(false));
  }

  /**
   * ReactionTypeID test.
   */
  @Test
  public void testSchematicID()
  {
    final ReactionImpl.Builder builder = new ReactionImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.reactionTypeID(expected);

    final Reaction testSubject = builder.build();

    assertThat(testSubject.getReactionTypeID(), equalTo(expected));
    assertThat(testSubject.getTypeID(), equalTo(0));
    assertThat(testSubject.getQuantity(), equalTo(0));
    assertThat(testSubject.isInput(), equalTo(false));
  }

  /**
   * TypeID test.
   */
  @Test
  public void testTypeID()
  {
    final ReactionImpl.Builder builder = new ReactionImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.typeID(expected);

    final Reaction testSubject = builder.build();

    assertThat(testSubject.getReactionTypeID(), equalTo(0));
    assertThat(testSubject.getTypeID(), equalTo(expected));
    assertThat(testSubject.getQuantity(), equalTo(0));
    assertThat(testSubject.isInput(), equalTo(false));
  }

  /**
   * Quantity test.
   */
  @Test
  public void testQuantity()
  {
    final ReactionImpl.Builder builder = new ReactionImpl.Builder();

    final int expected = randomInteger(0, Integer.MAX_VALUE - 1);

    builder.quantity(expected);

    final Reaction testSubject = builder.build();

    assertThat(testSubject.getReactionTypeID(), equalTo(0));
    assertThat(testSubject.getTypeID(), equalTo(0));
    assertThat(testSubject.getQuantity(), equalTo(expected));
    assertThat(testSubject.isInput(), equalTo(false));
  }

  /**
   * Input test.
   */
  @Test
  public void testInput()
  {
    final ReactionImpl.Builder builder = new ReactionImpl.Builder();

    builder.input(true);

    final Reaction testSubject = builder.build();

    assertThat(testSubject.getReactionTypeID(), equalTo(0));
    assertThat(testSubject.getTypeID(), equalTo(0));
    assertThat(testSubject.getQuantity(), equalTo(0));
    assertThat(testSubject.isInput(), equalTo(true));
  }

  /**
   * HashCode test.
   */
  @Test
  public void testHashCode()
  {
    final ReactionImpl.Builder builder1 = new ReactionImpl.Builder();
    final ReactionImpl.Builder builder2 = new ReactionImpl.Builder();
    final ReactionImpl.Builder builder3 = new ReactionImpl.Builder();
    final ReactionImpl.Builder builder4 = new ReactionImpl.Builder();

    builder1.reactionTypeID(0);
    builder1.typeID(0);

    builder2.reactionTypeID(0);
    builder2.typeID(1);

    builder3.reactionTypeID(1);
    builder3.typeID(0);

    builder4.reactionTypeID(1);
    builder4.typeID(0);
    builder4.input(true);

    final Reaction testSubject1 = builder1.build();
    final Reaction testSubject2 = builder2.build();
    final Reaction testSubject3 = builder3.build();
    final Reaction testSubject4 = builder4.build();

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
    final ReactionImpl.Builder builder1 = new ReactionImpl.Builder();
    final ReactionImpl.Builder builder2 = new ReactionImpl.Builder();
    final ReactionImpl.Builder builder3 = new ReactionImpl.Builder();
    final ReactionImpl.Builder builder4 = new ReactionImpl.Builder();
    final ReactionImpl.Builder builder5 = new ReactionImpl.Builder();

    builder1.reactionTypeID(0);
    builder1.typeID(0);

    builder2.reactionTypeID(0);
    builder2.typeID(1);

    builder3.reactionTypeID(1);
    builder3.typeID(0);

    builder4.reactionTypeID(1);
    builder4.typeID(0);

    builder5.reactionTypeID(1);
    builder5.typeID(0);
    builder5.input(true);

    final Reaction testSubject1 = builder1.build();
    final Reaction testSubject2 = builder2.build();
    final Reaction testSubject3 = builder3.build();
    final Reaction testSubject4 = builder4.build();
    final Reaction testSubject5 = builder5.build();

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
