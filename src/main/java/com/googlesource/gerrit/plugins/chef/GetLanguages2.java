// Copyright (C) 2014 The Android Open Source Project
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.googlesource.gerrit.plugins.chef;

import java.util.List;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.gerrit.extensions.restapi.Response;
import com.google.gerrit.server.change.RevisionResource;
import com.googlesource.gerrit.plugins.cookbook.GetLanguages;

public class GetLanguages2 extends GetLanguages {
  // Languages of the middle east
  protected final static ImmutableList<String> LANGUAGES_MIDDLE_EAST =
      new ImmutableList.Builder<String>()
          .add("Arabic")
          .add("Berber")
          .add("Hebrew")
          .add("Kurdish")
          .add("Persian")
          .add("Turkish")
          .build();

  @Override
  public Response<List<String>> apply(RevisionResource rev) {
    List<String> list = Lists.newArrayList(Iterables.concat(LANGUAGES, LANGUAGES_MIDDLE_EAST));
    return Response.ok(list);
  }
}
