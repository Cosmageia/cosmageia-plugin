/*
 * The MIT License
 * Copyright © 2023 Loïc DUBOIS-TERMOZ (alias Djaytan)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
module cosmageia.core {
  // Spring Boot
  requires transitive spring.core;
  requires transitive spring.beans;
  requires transitive spring.context;
  requires transitive spring.boot;
  requires transitive spring.boot.autoconfigure;

  // Commands
  requires info.picocli;
  requires picocli.spring.boot.starter;

  // Minecraft - Adventure API
  requires net.kyori.adventure;
  requires net.kyori.examination.api;
  requires net.kyori.adventure.text.minimessage;

  // Commons
  requires org.slf4j;
  requires org.apache.commons.lang3;

  // Allows configurations auto-detection by Spring Boot through reflection
  opens fr.cosmageia.plugin.core.config to
      papermc.plugin;

  exports fr.cosmageia.plugin.core.commons to
      papermc.plugin;
}
