package com.netflix.spinnaker.amos

import com.netflix.spinnaker.amos.AccountCredentialsProvider
import com.netflix.spinnaker.amos.AccountCredentialsRepository
import com.netflix.spinnaker.amos.DefaultAccountCredentialsProvider
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Subject

/*
 * Copyright 2014 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

class DefaultAccountCredentialsProviderSpec extends Specification {

  @Shared AccountCredentialsRepository repo
  @Subject AccountCredentialsProvider provider

  def setup() {
    repo = Mock(AccountCredentialsRepository)
    provider = new DefaultAccountCredentialsProvider(repo)
  }

  void "should call repo to retrieve objects"() {
    when:
      provider.getCredentials(key)

    then:
      1 * repo.getOne(key)

    when:
      provider.getAll()

    then:
      1 * repo.getAll()

    where:
      key = "foo"
  }

}
