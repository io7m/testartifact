/*
 * Copyright © 2019 Mark Raynsford <code@io7m.com> http://io7m.com
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY
 * SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR
 * IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package com.io7m.testartifact.alpha;

import org.apache.commons.io.HexDump;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.SecureRandom;

/**
 * Main class.
 */

public final class Main
{
  private Main()
  {

  }

  /**
   * Command-line entry point.
   *
   * @param args The command-line arguments
   *
   * @throws IOException On errors
   */

  public static void main(final String[] args)
    throws IOException
  {
    final var rng = new SecureRandom();
    final var data = new byte[8];
    rng.nextBytes(data);

    try (var out = new ByteArrayOutputStream()) {
      HexDump.dump(data, 0L, out, 0);
      System.out.println("Hello: " + out.toString());
    }
  }
}
