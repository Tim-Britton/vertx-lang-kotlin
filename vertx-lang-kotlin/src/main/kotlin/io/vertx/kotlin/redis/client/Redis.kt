/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.kotlin.redis.client

import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.redis.client.Redis
import io.vertx.redis.client.RedisConnection

/**
 * Suspending version of method [io.vertx.redis.client.Redis.connect]
 *
 * @return [RedisConnection]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.Redis] using Vert.x codegen.
 */
suspend fun Redis.connectAwait(): RedisConnection {
  return awaitResult {
    this.connect(it)
  }
}

