/*
 * Copyright Vulcan Inc. 2021
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * 1. Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 *
 * 3. Neither the name of the copyright holder nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.vulcan.vmlci.orca.event;

import com.vulcan.vmlci.orca.LastActiveImage;

import java.util.EventObject;

public class ActiveImageChangeEvent extends EventObject {
  private final String oldImage;
  private final String newImage;

  /**
   * Constructs an ActiveImageChange event.
   *
   * @param source The object on which the Event initially occurred.
   * @param oldImage The previously active image.
   * @param newImage The newly active image.
   * @throws IllegalArgumentException if source is null.
   */
  public ActiveImageChangeEvent(LastActiveImage source, String oldImage, String newImage) {
    super(source);
    this.oldImage = oldImage;
    this.newImage = newImage;
  }

  /**
   * Provides the previous image name
   *
   * @return filename associated with previous ImagePlus
   */
  public String getOldImage() {
    return oldImage;
  }

  /**
   * Provides the new image name
   *
   * @return filename associated with latest ImagePlus
   */
  public String getNewImage() {
    return newImage;
  }
}
