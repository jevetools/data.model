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
package com.jevetools.data.model.api.impl.internal.tests;

import java.util.Random;

/**
 * Copyright (c) 2013, jEVETools.
 * 
 * All rights reserved.
 *
 * @version 0.0.1
 * @since 0.0.1
 */
public class AbstractTest
{

  /**
   * Empty String.
   */
  protected static final String EMPTY_STRING = "";

  /**
   * Empty String.
   */
  protected static final String TEST_STRING = "test";

  /**
   * Default CTor.
   */
  protected AbstractTest()
  {
    super();
  }

  /**
   * @param aMin Minimum value
   * @param aMax Maximum value
   * @return Random integer between aMin and aMax inclusive
   */
  protected final int randomInteger(final int aMin, final int aMax)
  {
    final Random random = new Random();
    
    return random.nextInt(aMax - aMin + 1) + aMin;
  }

  /**
   * @param aMin Minimum value
   * @param aMax Maximum value
   * @return Random double between aMin and aMax inclusive
   */
  protected final double randomDouble(final double aMin, final double aMax)
  {
    final Random random = new Random();
    
    return  aMin + random.nextDouble() * (aMax - aMin);
  }

}