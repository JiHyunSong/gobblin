/*
 * Copyright (C) 2014-2015 LinkedIn Corp. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.
 */

package gobblin.data.management.copy;

import lombok.AllArgsConstructor;
import lombok.Getter;

import org.apache.hadoop.fs.FSDataInputStream;


/**
 * A wrapper to {@link FSDataInputStream} that represents an entity to be copied. The enclosed {@link CopyableFile} instance
 * contains file Metadata like permission, destination path etc. required by the writers and converters.
 */
@AllArgsConstructor
@Getter
public class FileAwareInputStream {

  private CopyableFile file;
  private FSDataInputStream inputStream;

  @Override
  public String toString() {
    return this.file.toString();
  }
}
